package checker;

import static typing.Type.BOOL_TYPE;
import static typing.Type.INT_TYPE;
import static typing.Type.NO_TYPE;
import static typing.Type.REAL_TYPE;
import static typing.Type.STR_TYPE;

import ast.NodeKind;
import ast.AST;
import typing.Conv;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.EZParser;
import parser.EZParser.Assign_stmtContext;
import parser.EZParser.EqLtContext;
import parser.EZParser.ExprFalseContext;
import parser.EZParser.ExprIdContext;
import parser.EZParser.ExprIntValContext;
import parser.EZParser.ExprParContext;
import parser.EZParser.ExprRealValContext;
import parser.EZParser.ExprStrValContext;
import parser.EZParser.ExprTrueContext;
import parser.EZParser.If_stmtContext;
import parser.EZParser.PlusMinusContext;
import parser.EZParser.Read_stmtContext;
import parser.EZParser.Repeat_stmtContext;
import parser.EZParser.TimesOverContext;
import parser.EZParserBaseVisitor;
import parser.EZParser.ProgramContext;
import tables.StrTable;
import tables.VarTable;
import typing.Type;
import typing.Conv.Unif;

/*
 * Analisador semântico de EZLang implementado como um visitor
 * da ParseTree do ANTLR. A classe EZParserBaseVisitor é gerada
 * automaticamente e já possui métodos padrão aonde o comportamento
 * é só visitar todos os filhos. Por conta disto, basta sobreescrever
 * os métodos que a gente quer alterar.
 *
 * Lembre que em um 'visitor' você é responsável por definir o
 * caminhamento nos filhos de um nó da ParseTree através da chamada
 * recursiva da função 'visit'. Ao contrário do 'listener' que
 * caminha automaticamente em profundidade pela ParseTree, se
 * você não chamar 'visit' nos métodos de visitação, o caminhamento
 * para no nó que você estiver, deixando toda a subárvore do nó atual
 * sem visitar. Tome cuidado neste ponto pois isto é uma fonte
 * muito comum de erros. Veja o método visitAssign_stmt abaixo para
 * ter um exemplo.
 *
 * No laboratório anterior, foi usado Void no tipo genérico do
 * EZParserBaseVisitor porque a gente só estava fazendo uma verificação
 * simples das variáveis usando a tabela de símbolos. Mas agora a
 * gente precisa fazer verificação e inferência dos tipos primitivos
 * nas expressões e demais comandos da linguagem. Isto deve ser feito de
 * forma recursiva, caminhando pela árvore. Assim, ao visitar um nó,
 * propagamos para cima o tipo associado a ele, através do valor de retorno
 * da função de visitação. Desta forma, ao terminar o caminhamento todos
 * os nós foram analisados. Por isso que o tipo declarado agora é Type.
 *
 * Note que a EZLang faz uma diferenciação entre comandos e expressões.
 * Só estas últimas possuem tipos. Como todas as funções do visitador
 * agora precisam retornar um tipo, para os comandos que não possuem tipos,
 * retornamos NO_TYPE. Esse mesmo valor de retorno é usado para indicar
 * erros de tipos.
 */
public class SemanticChecker extends EZParserBaseVisitor<AST> {

	private StrTable st = new StrTable();   // Tabela de strings.
    private VarTable vt = new VarTable();   // Tabela de variáveis.

	AST root;

    Type lastDeclType;  // Variável "global" com o último tipo declarado.

    public void printAST() {
    	AST.printDot(root, vt);
    }

    // Testa se o dado token foi declarado antes.
    AST checkVar(Token token) {
    	String text = token.getText();
    	int line = token.getLine();
   		int idx = vt.lookupVar(text);
    	if (idx == -1) {
    		System.err.printf("SEMANTIC ERROR (%d): variable '%s' was not declared.\n", line, text);
    		System.exit(1);
            return null; // Never reached.
        }
		return new AST(NodeKind.VAR_USE_NODE, idx, vt.getType(idx));    
	}

    // Cria uma nova variável a partir do dado token.
    AST newVar(Token token) {
    	String text = token.getText();
    	int line = token.getLine();
   		int idx = vt.lookupVar(text);
        if (idx != -1) {
        	System.err.printf("SEMANTIC ERROR (%d): variable '%s' already declared at line %d.\n", line, text, vt.getLine(idx));
        	System.exit(1);
			return null; // Never reached.
        }
        idx = vt.addVar(text, line, lastDeclType);
        return new AST(NodeKind.VAR_DECL_NODE, idx, lastDeclType);
    }

    // ----------------------------------------------------------------------------
    // Type checking and inference.

    private void typeError(int lineNo, String op, Type t1, Type t2) {
    	System.out.printf("SEMANTIC ERROR (%d): incompatible types for operator '%s', LHS is '%s' and RHS is '%s'.\n",
    			lineNo, op, t1.toString(), t2.toString());
        System.exit(1);
    }

    // Essa função também poderia virar uma tabela de unificação dos tipos,
    // igual às que estão em Type, mas fica aqui como uma outra forma de implementar
    // a verificação de tipos.
    private AST checkAssign(int lineNo, AST l, AST r) {
		Type lt = l.type;
    	Type rt = r.type;

		if (lt == BOOL_TYPE && rt != BOOL_TYPE) typeError(lineNo, ":=", lt, rt);
        if (lt == STR_TYPE  && rt != STR_TYPE)  typeError(lineNo, ":=", lt, rt);
        if (lt == INT_TYPE  && rt != INT_TYPE)  typeError(lineNo, ":=", lt, rt);

        if (lt == REAL_TYPE) {
        	if (rt == INT_TYPE) {
        		r = Conv.createConvNode(Conv.I2R, r);
        	} else if (rt != REAL_TYPE) {
        		typeError(lineNo, ":=", lt, rt);
            }
        }

        return AST.newSubtree(NodeKind.ASSIGN_NODE, NO_TYPE, l, r);
    }

    private void checkBoolExpr(int lineNo, String cmd, Type t) {
        if (t != BOOL_TYPE) {
            System.out.printf("SEMANTIC ERROR (%d): conditional expression in '%s' is '%s' instead of '%s'.\n",
               lineNo, cmd, t.toString(), BOOL_TYPE.toString());
            System.exit(1);
        }
    }

    // ----------------------------------------------------------------------------

    // Exibe o conteúdo das tabelas em stdout.
    public void printTables() {
        System.out.print("\n\n");
        System.out.print(st);
        System.out.print("\n\n");
    	System.out.print(vt);
    	System.out.print("\n\n");
    }

	@Override
	public AST visitProgram(ProgramContext ctx) {
    	// Visita recursivamente os filhos para construir a AST.
    	AST varsSect = visit(ctx.vars_sect());
    	AST stmtSect = visit(ctx.stmt_sect());
    	// Como esta é a regra inicial, chegamos na raiz da AST.
    	this.root = AST.newSubtree(NodeKind.PROGRAM_NODE, NO_TYPE, varsSect, stmtSect);
		return this.root;
	}

    // Visita a regra type_spec: BOOL
    @Override
    public AST visitBoolType(EZParser.BoolTypeContext ctx) {
    	this.lastDeclType = Type.BOOL_TYPE;
    	return null;
    }

    // Visita a regra type_spec: INT
	@Override
	public AST visitIntType(EZParser.IntTypeContext ctx) {
		this.lastDeclType = Type.INT_TYPE;
		return null;
	}

	// Visita a regra type_spec: REAL
	@Override
	public AST visitRealType(EZParser.RealTypeContext ctx) {
		this.lastDeclType = Type.REAL_TYPE;
		return null;
    }

	// Visita a regra type_spec: STRING
	@Override
	public AST visitStrType(EZParser.StrTypeContext ctx) {
		this.lastDeclType = Type.STR_TYPE;
		return null;
	}

    // Visita a regra var_decl: type_spec ID SEMI
    @Override
    public AST visitVar_decl(EZParser.Var_declContext ctx) {
    	// Visita a declaração de tipo para definir a variável lastDeclType.
    	visit(ctx.type_spec());
    	// Agora testa se a variável foi redeclarada.
    	return newVar(ctx.ID().getSymbol());
    }

    // Visita a regra assign_stmt: ID ASSIGN expr SEMI
	@Override
	public AST visitAssign_stmt(Assign_stmtContext ctx) {
		// Visita recursivamente a expressão da direita para procurar erros.
		AST exprType = visit(ctx.expr());
		// Verifica se a variável a ser atribuída foi declarada.
		Token idToken = ctx.ID().getSymbol();
		AST idType = checkVar(idToken);
		
		return checkAssign(idToken.getLine(), idType, exprType);
	}

	// Visita a regra if_stmt: IF expr THEN stmt+ (ELSE stmt+)? END
	@Override
	public AST visitIf_stmt(If_stmtContext ctx) {
		// Visita recursivamente a expressão de teste para ver se
		// ela tem o tipo Booleano.
		// Analisa a expressão booleana.
		AST exprNode = visit(ctx.expr());
		checkBoolExpr(ctx.IF().getSymbol().getLine(), "if", exprNode.type);

		// Vamos dividir o código em duas partes, um IF sem ou com ELSE.
		// Para saber se um símbolo opcional está presente, basta chamar o
		// seu método. Se for retornado nulo, o símbolo não existe.
		if (ctx.ELSE() == null) {
			// Caso em que não existe um bloco de ELSE. Aí fica simples
			// porque todos os comandos pertencem ao bloco do THEN.
			AST thenNode = AST.newSubtree(NodeKind.BLOCK_NODE, NO_TYPE);
			for (int i = 0; i < ctx.stmt().size(); i++) {
	    		AST child = visit(ctx.stmt(i));
	    		thenNode.addChild(child);
			}
			return AST.newSubtree(NodeKind.IF_NODE, NO_TYPE, exprNode, thenNode);
		} else {
			// Caso em que existe um bloco de ELSE. Aí precisamos separar
			// os 'stmt' entre os blocos de THEN e ELSE. Vamos usar o
			// Token do ELSE para fazer essa separação. Mas para isso
			// precisamos identificar o índice do ELSE na lista de todos
			// os filhos da Parse Tree.

			// Faz uma busca pelo token na lista de filhos.
			TerminalNode elseToken = ctx.ELSE();
			int elseIdx = -1;
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.children.get(i).equals(elseToken)) {
					elseIdx = i;
					break;
				}
			}

			// Temos que elseIdx é o índice na lista de todos os filhos.
			// Por outro lado, a lista de 'stmts' começa do índice zero.
			// O offset entre as duas listas é 3 porque a regra começa com
			// IF expr THEN
			// ou seja, há 3 símbolos antes do primeiro bloco de 'stmt+'.
			int thenEnd = elseIdx - 3;

			// Cria o nó com o bloco de comandos do THEN.
			AST thenNode = AST.newSubtree(NodeKind.BLOCK_NODE, NO_TYPE);
			for (int i = 0; i < thenEnd; i++) {
	    		AST child = visit(ctx.stmt(i));
	    		thenNode.addChild(child);
			}

			// Cria o nó com o bloco de comandos do ELSE.
			AST elseNode = AST.newSubtree(NodeKind.BLOCK_NODE, NO_TYPE);
			for (int i = thenEnd; i < ctx.stmt().size(); i++) {
	    		AST child = visit(ctx.stmt(i));
	    		elseNode.addChild(child);
			}

			return AST.newSubtree(NodeKind.IF_NODE, NO_TYPE, exprNode, thenNode, elseNode);
		}
	}

	// Visita a regra read_stmt: READ ID SEMI
	@Override
	public AST visitRead_stmt(Read_stmtContext ctx) {
		// Verifica se a variável que vai receber o valor lido foi declarada.
		
		return checkVar(ctx.ID().getSymbol());
	}

	// Visita a regra repeat-stmt: REPEAT stmt-list UNTIL expr
	@Override
	public AST visitRepeat_stmt(Repeat_stmtContext ctx) {
		// Visita recursivamente a expressão de teste para ver se
		// ela tem o tipo Booleano.
		AST exprType = visit(ctx.expr());
		checkBoolExpr(ctx.UNTIL().getSymbol().getLine(), "repeat", exprType.type);
		
		AST blockNode = AST.newSubtree(NodeKind.BLOCK_NODE, NO_TYPE);
    	for (int i = 0; i < ctx.stmt().size(); i++) {
    		AST child = visit(ctx.stmt(i));
    		blockNode.addChild(child);
    	}

    	return AST.newSubtree(NodeKind.REPEAT_NODE, NO_TYPE, blockNode, exprType);
	}

	// Visita a regra expr: expr op=(TIMES | OVER) expr
	@Override
	public AST visitTimesOver(TimesOverContext ctx) {
		// Visita recursivamente as expressões da esquerda e direita
		// para determinar os seus tipos.
		AST l = visit(ctx.expr(0));
		AST r = visit(ctx.expr(1));

		// Unifica os tipos para saber o tipo final da expressão.
		Type lt = l.type;
		Type rt = r.type;
		Unif unif = lt.unifyOtherArith(rt);

		if (unif.type == NO_TYPE) {
			typeError(ctx.op.getLine(), ctx.op.getText(), lt, rt);
		}

		if (ctx.op.getType() == EZParser.TIMES) {
			return AST.newSubtree(NodeKind.TIMES_NODE, unif.type, Conv.createConvNode(unif.lc, l), Conv.createConvNode(unif.rc, r));
		} else { // OVER
			return AST.newSubtree(NodeKind.OVER_NODE, unif.type, Conv.createConvNode(unif.lc, l), Conv.createConvNode(unif.rc, r));
		}
		
		// Retorna o tipo unificado para que ele possa ser usado na
		// volta da visita dos nós.
	}

	// Visita a regra expr: expr op=(PLUS | MINUS) expr
	@Override
	public AST visitPlusMinus(PlusMinusContext ctx) {
		AST l = visit(ctx.expr(0));
		AST r = visit(ctx.expr(1));

		Type lt = l.type;
		Type rt = r.type;
		Unif unif;
		// É preciso diferenciar '+' e '-' na unificação por conta da semântica.
		if (ctx.op.getType() == EZParser.PLUS) {
			unif = lt.unifyPlus(rt);
		} else {
			unif = lt.unifyOtherArith(rt);
		}

		if (unif.type == NO_TYPE) {
			typeError(ctx.op.getLine(), ctx.op.getText(), lt, rt);
		}

		// Cria os nós de conversão que forem necessários segundo a
		// estrutura de conversão.
		l = Conv.createConvNode(unif.lc, l);
		r = Conv.createConvNode(unif.rc, r);

		// Olha qual é o operador e cria o nó correspondente na AST.
		if (ctx.op.getType() == EZParser.PLUS) {
			return AST.newSubtree(NodeKind.PLUS_NODE, unif.type, l, r);
		} else { // MINUS
			return AST.newSubtree(NodeKind.MINUS_NODE, unif.type, l, r);
		}
	}

	// Visita a regra expr: expr op=(EQ | LT) expr
	@Override
	public AST visitEqLt(EqLtContext ctx) {
		AST l = visit(ctx.expr(0));
		AST r = visit(ctx.expr(1));

		Type lt = l.type;
		Type rt = r.type;
		Unif unif;

		if (ctx.op.getType() == EZParser.EQ) {
			unif = lt.unifyComp(rt);
		} else {
			unif = lt.unifyComp(rt);
		}

		if (unif.type == NO_TYPE) {
			typeError(ctx.op.getLine(), ctx.op.getText(), lt, rt);
		}

		// Cria os nós de conversão que forem necessários segundo a
		// estrutura de conversão.
		l = Conv.createConvNode(unif.lc, l);
		r = Conv.createConvNode(unif.rc, r);

		// Olha qual é o operador e cria o nó correspondente na AST.
		if (ctx.op.getType() == EZParser.EQ) {
			return AST.newSubtree(NodeKind.EQ_NODE, unif.type, l, r);
		} else {
			return AST.newSubtree(NodeKind.LT_NODE, unif.type, l, r);
		}
	}

	// Visita a regra expr: LPAR expr RPAR
	@Override
	public AST visitExprPar(ExprParContext ctx) {
		// Propaga o tipo da expressão entre parênteses para cima.
		return visit(ctx.expr());
	}

	// Visita a regra expr: TRUE
	@Override
	public AST visitExprTrue(ExprTrueContext ctx) {
		return new AST(NodeKind.BOOL_VAL_NODE, 1, BOOL_TYPE);
	}

	// Visita a regra expr: FALSE
	@Override
	public AST visitExprFalse(ExprFalseContext ctx) {
		return new AST(NodeKind.BOOL_VAL_NODE, 0, BOOL_TYPE);
	}

	// Visita a regra expr: INT_VAL
	@Override
	public AST visitExprIntVal(ExprIntValContext ctx) {

		return new AST(NodeKind.INT_VAL_NODE, Integer.parseInt(ctx.getText()), INT_TYPE);
	}

	// Visita a regra expr: REAL_VAL
	@Override
	public AST visitExprRealVal(ExprRealValContext ctx) {
		return new AST(NodeKind.REAL_VAL_NODE, Float.valueOf(ctx.getText()).floatValue(), REAL_TYPE);
	}

	@Override
	// Visita a regra expr: STR_VAL
	public AST visitExprStrVal(ExprStrValContext ctx) {
		// Adiciona a string na tabela de strings.
		int indice = st.addStr(ctx.STR_VAL().getText());
		return new AST(NodeKind.STR_VAL_NODE, indice, STR_TYPE);
	}

	@Override
	// Visita a regra expr: ID
	public AST visitExprId(ExprIdContext ctx) {
		// Verifica se a variável usada na expressão foi declarada.
		AST type = checkVar(ctx.ID().getSymbol());
		int indice = vt.lookupVar(ctx.ID().getText());
		return new AST(NodeKind.VAR_USE_NODE, indice, type.type);
	}

}
