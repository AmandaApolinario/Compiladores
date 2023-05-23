package checker;

import org.antlr.v4.runtime.Token;

import parser.EZParser;
import parser.EZParser.Assign_stmtContext;
import parser.EZParser.ExprIdContext;
import parser.EZParser.ExprStrValContext;
import parser.EZParser.Read_stmtContext;
import parser.EZParserBaseVisitor;
import tables.StrTable;
import tables.VarTable;
import typing.Type;

/*
 * Analisador semântico de EZLang implementado como um visitor
 * da ParseTree do ANTLR. A classe EZParserBaseVisitor é gerada
 * automaticamente e já possui métodos padrão aonde o comportamento
 * é visitar todos os filhos. Por conta disto, basta sobreescrever
 * os métodos que a gente quer alterar.
 * 
 * Por enquanto só há uma verificação simples de declaração de
 * variáveis usando uma tabela de símbolos. Funcionalidades adicionais
 * como análise de tipos serão incluídas no próximo laboratório.
 * 
 * O tipo Type indicado na super classe define o valor de retorno dos
 * métodos do visitador. Depois vamos alterar isso para poder construir
 * a AST.
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
 */
public class SemanticChecker extends EZParserBaseVisitor<Type> {

	private StrTable st = new StrTable();   // Tabela de strings.
    private VarTable vt = new VarTable();   // Tabela de variáveis.
    
    private Type lastDeclType;  // Variável "global" com o último tipo declarado.

    // Testa se o dado token foi declarado antes.
    private Type checkVar(Token token) {
    	String text = token.getText();
    	int line = token.getLine();
   		int idx = vt.lookupVar(text);
    	if (idx == -1) {
    		System.err.printf("SEMANTIC ERROR (%d): variable '%s' was not declared.\n", line, text);
    		System.exit(1);
            return null; // Never reached.
        }
		return vt.getType(idx);
    }
    
    // Cria uma nova variável a partir do dado token.
    private Type newVar(Token token) {
    	String text = token.getText();
    	int line = token.getLine();
   		int idx = vt.lookupVar(text);
        if (idx != -1) {
        	System.err.printf("SEMANTIC ERROR (%d): variable '%s' already declared at line %d.\n", line, text, vt.getLine(idx));
        	System.exit(1);
            return null; // Never reached.
        }
        vt.addVar(text, line, lastDeclType);
		return null;
    }

    // Exibe o conteúdo das tabelas em stdout.
    public Type printTables() {
        System.out.print("\n\n");
        System.out.print(st);
        System.out.print("\n\n");
    	System.out.print(vt);
    	System.out.print("\n\n");
		return null;
    }
    
    // Visita a regra type_spec: BOOL
    // Note que esse método só foi criado pelo ANTLR porque a regra da
    // linha 29 de EZParser.g foi marcada com o identificador # boolType.
    // O mesmo vale para as demais regras de type_spec.
    @Override
    public Type visitBoolType(EZParser.BoolTypeContext ctx) {
    	this.lastDeclType = Type.BOOL_TYPE;
    	return Type.BOOL_TYPE; // Java says must return something even when Type
    }
	
    // Visita a regra type_spec: INT
	@Override
	public Type visitIntType(EZParser.IntTypeContext ctx) {
		this.lastDeclType = Type.INT_TYPE;
		return Type.INT_TYPE; // Java says must return something even when Type
	}
	
	// Visita a regra type_spec: REAL
	@Override
	public Type visitRealType(EZParser.RealTypeContext ctx) {
		this.lastDeclType = Type.REAL_TYPE;
		return Type.REAL_TYPE; // Java says must return something even when Type
    }
	
	// Visita a regra type_spec: STRING
	@Override
	public Type visitStrType(EZParser.StrTypeContext ctx) {
		this.lastDeclType = Type.STR_TYPE;
		return Type.STR_TYPE; // Java says must return something even when Type
	}
    
    // Visita a regra var_decl: type_spec ID SEMI
    @Override
    public Type visitVar_decl(EZParser.Var_declContext ctx) {
    	// Visita a declaração de tipo para definir a variável lastDeclType.
    	visit(ctx.type_spec());
    	// Agora testa se a variável foi redeclarada.
    	newVar(ctx.ID().getSymbol());
    	return null; // Java says must return something even when Type
    }

    // Visita a regra assign_stmt: ID ASSIGN expr SEMI
	@Override
	public Type visitAssign_stmt(Assign_stmtContext ctx) {
		// Visita recursivamente a expressão da direita para procurar erros. 
		visit(ctx.expr());
		// Verifica se a variável a ser atribuída foi declarada.
		checkVar(ctx.ID().getSymbol());
		return null; // Java says must return something even when Type
	}

	// Visita a regra read_stmt: READ ID SEMI
	@Override
	public Type visitRead_stmt(Read_stmtContext ctx) {
		// Verifica se a variável que vai receber o valor lido foi declarada.
		checkVar(ctx.ID().getSymbol());
		return null; // Java says must return something even when Type
	}

	@Override
	// Visita a regra expr: STR_VAL
	// Valem os mesmos comentários do método visitBoolType.
	public Type visitExprStrVal(ExprStrValContext ctx) {
		// Adiciona a string na tabela de strings.
		st.add(ctx.STR_VAL().getText());
		return Type.STR_TYPE; // Java says must return something even when Type
	}

	@Override
	// Visita a regra expr: ID
	// Valem os mesmos comentários do método visitBoolType.
	public Type visitExprId(ExprIdContext ctx) {
		// Verifica se a variável usada na expressão foi declarada.
		return checkVar(ctx.ID().getSymbol()); // Java says must return something even when Type
	}

	@Override public Type visitExprIntVal(EZParser.ExprIntValContext ctx) { return Type.INT_TYPE; }
	
	@Override public Type visitExprRealVal(EZParser.ExprRealValContext ctx) { return Type.REAL_TYPE; }
	
	@Override public Type visitExprTrue(EZParser.ExprTrueContext ctx) { return Type.BOOL_TYPE; }

	@Override public Type visitExprFalse(EZParser.ExprFalseContext ctx) { return Type.BOOL_TYPE; }
	

	@Override public Type visitPlusMinus(EZParser.PlusMinusContext ctx) {
		Type esq = visit(ctx.expr(0));
		Type dir = visit(ctx.expr(1));
		
		if (ctx.PLUS().getText().equals("+")) {
			if (esq.equals(dir)){
				System.out.println(esq);
				return esq;
			} else if (esq.equals(Type.STR_TYPE) || dir.equals(Type.STR_TYPE)) {
				System.out.println(Type.STR_TYPE);
				return Type.STR_TYPE;
			} else if (esq.equals(Type.BOOL_TYPE)) {
				System.out.println(dir);
				return dir;
			} else if (dir.equals(Type.BOOL_TYPE)) {
				System.out.println(esq);
				return esq;
			} else if (esq.equals(Type.REAL_TYPE) || dir.equals(Type.REAL_TYPE)) {
				System.out.println(Type.BOOL_TYPE);
				return Type.BOOL_TYPE;
			}  
		} else {
			if (esq.equals(Type.INT_TYPE) && dir.equals(Type.INT_TYPE)){
				return Type.INT_TYPE;
			} else if (esq.equals(Type.INT_TYPE) && dir.equals(Type.BOOL_TYPE)){
				return Type.BOOL_TYPE;
			} else if (esq.equals(Type.BOOL_TYPE) && dir.equals(Type.INT_TYPE)){
				return Type.BOOL_TYPE;
			} else if (esq.equals(Type.BOOL_TYPE) && dir.equals(Type.BOOL_TYPE)){
				return Type.BOOL_TYPE;
			} else {
				return null;
				//errooooooooo
			}
		}

		return null;
	 }

	@Override public Type visitTimesOver(EZParser.TimesOverContext ctx) { 
		Type esq = visit(ctx.expr(0));
		Type dir = visit(ctx.expr(1));
		
		if (esq.equals(Type.INT_TYPE) && dir.equals(Type.INT_TYPE)){
			return Type.INT_TYPE;
		} else if (esq.equals(Type.INT_TYPE) && dir.equals(Type.BOOL_TYPE)){
			return Type.BOOL_TYPE;
		} else if (esq.equals(Type.BOOL_TYPE) && dir.equals(Type.INT_TYPE)){
			return Type.BOOL_TYPE;
		} else if (esq.equals(Type.BOOL_TYPE) && dir.equals(Type.BOOL_TYPE)){
			return Type.BOOL_TYPE;
		} else {
			return null;
			//errooooooooo
		}

		return null;
	}

	@Override public Type visitEqLt(EZParser.EqLtContext ctx) {
		Type esq = visit(ctx.expr(0));
		Type dir = visit(ctx.expr(1));
		

		return null;
	 }
	
	
	
}
