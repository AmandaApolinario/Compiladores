import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

import tables.FuncTable;
import tables.VarTable;
import tables.StrTable;

import org.antlr.v4.runtime.Token;

import typing.Type;
import typing.Conv;
import typing.Conv.Unif;

import ast.NodeKind;
import ast.AST;

public class Visitor extends golangramBaseVisitor<AST> {

    FuncTable funcTable = new FuncTable();
    StrTable strTable = new StrTable();
    VarTable varTable;
    List<VarTable> allVarTables = new ArrayList<VarTable>();
    String funcName;
    Type type;
    int parametersCount = 0;
    int argumentsCount = 0;

    AST root;

    //cria as funcoes de stdin e stdout
    void createStdInOut() {
        VarTable varTableGen = new VarTable();
        AST astGen = new AST(null, 0, Type.BOOL_TYPE);
        funcTable.addFunction("fmt.Scanf", varTableGen, null, 2, astGen);
        funcTable.addFunction("fmt.Println", varTableGen, null, 1, astGen);
    }

    AST checkVar(Token token) {
    	String text = token.getText();
    	int line = token.getLine();
   		int idx = varTable.lookupVar(text);
    	if (idx == -1) {
    		System.err.printf("SEMANTIC ERROR (%d): variable '%s' was not declared.\n", line, text);
    		System.exit(1);
            return null; // Never reached.
        }
    	return new AST(NodeKind.VAR_USE_NODE, idx, varTable.getType(idx));
    }

    AST newVar(Token token) {
    	String text = token.getText();
    	int line = token.getLine();
   		int idx = varTable.lookupVar(text);
        if (idx != -1) {
        	System.err.printf("SEMANTIC ERROR (%d): variable '%s' already declared at line %d.\n", line, text, varTable.getLine(idx));
        	System.exit(1);
            return null; // Never reached.
        }
        idx = varTable.addVar(text, line, type);
        return new AST(NodeKind.VAR_DECL_NODE, idx, type);
    }

    public AST getAST() {
    	return this.root;
    }

    //primeira regra
    @Override public AST visitBegin(golangramParser.BeginContext ctx) {
        this.createStdInOut();
        this.root = new AST(NodeKind.PROGRAM_NODE, 0, Type.NO_TYPE);
            for (int i = 0; i < ctx.functionDecl().size(); i++) {
                AST func = visit(ctx.functionDecl(i));
                root.addChild(func);
            }
        return this.root;
    }

    // TODO ???
    @Override public AST visitFunctionDecl(golangramParser.FunctionDeclContext ctx) {
        varTable = new VarTable();
        allVarTables.add(varTable);
        AST tree = new AST(NodeKind.FUNCDEC_NODE, 0, Type.NO_TYPE);
        
        AST params = visit(ctx.parameters());
        AST blockAST = visit(ctx.block());
        if (params != null) {
            tree.addChild(params);
        }
        if (blockAST != null) {
            tree.addChild(blockAST);
        }

        int isNewFunc = funcTable.containsFunction(ctx.ID().getText());
        if (isNewFunc == -1) {
            if (ctx.type_() != null) {
                Type t2 = null;

                String t = ctx.type_().ID().getText();

                if(t.equals("string")) {
                    t2 = Type.STR_TYPE;
                } else if (t.equals("int")){
                    t2 = Type.INT_TYPE;
                } else if (t.equals("float32")){
                    t2 = Type.REAL_TYPE;
                } else if (t.equals("bool")){
                    t2 = Type.BOOL_TYPE;
                }

                funcTable.addFunction(ctx.ID().getText(), varTable, t2, parametersCount, tree);
            } else {
                funcTable.addFunction(ctx.ID().getText(), varTable, null, parametersCount, tree);
            }

        } else {
            System.out.println("Nao eh possivel declarar duas funcoes com o mesmo nome. Declarando: " + ctx.ID().getText());
            System.exit(1);
        }

        return tree;
    }

	@Override public AST visitBlock(golangramParser.BlockContext ctx) {
        AST block = new AST(NodeKind.BLOCK_NODE, 0, Type.NO_TYPE);
        if (ctx.statementList() != null) {
            // retorna direto o block criado no filho para não ter de copiar.
            return visit(ctx.statementList());
        }
        return block; // bloco vazio
    }

	@Override public AST visitStatementList(golangramParser.StatementListContext ctx) {
        AST node = new AST(NodeKind.BLOCK_NODE, 0, Type.NO_TYPE);

        for (int i = 0; i < ctx.statement().size(); i++) {
            AST stmt = visit(ctx.statement(i));
            node.addChild(stmt);
        }

        return node;
    }

    //VAI SER WHILE EM VEZ DE FOR
    @Override public AST visitForStmt(golangramParser.ForStmtContext ctx) {
        AST whileAST = new AST(NodeKind.REPEAT_NODE, 0, Type.NO_TYPE);

        whileAST.addChild(visit(ctx.expression()));
        whileAST.addChild(visit(ctx.block()));

        return whileAST;
    }

    @Override public AST visitSimpleAssignment(golangramParser.SimpleAssignmentContext ctx) {
        return visit(ctx.assignment());
    }

    // TODO ???
    @Override public AST visitDeclaration(golangramParser.DeclarationContext ctx) {
        AST stmt = visit(ctx.varDecl());

        if ((stmt)!= null) {
            // node.addChild(stmt);
            return stmt;
        }

        return null;
     }

// ifStmt:
// 	IF ( expression
// 			| eos expression
// 			| simpleStmt eos expression
// 			) block (
// 		ELSE (ifStmt | block)
// 	)?;

    @Override public AST visitIfStmt(golangramParser.IfStmtContext ctx) {
        AST ifNode = new AST(NodeKind.IF_NODE, 0, Type.NO_TYPE);

        ifNode.addChild(visit(ctx.expression()));
        ifNode.addChild(visit(ctx.block(0)));
        if (ctx.ELSE() != null) {
            if ((ctx.block(1)) != null) {
                ifNode.addChild(visit(ctx.block(1)));
            } else if ((ctx.ifStmt()) != null) {
                AST elseAST = new AST(NodeKind.BLOCK_NODE, 0, Type.NO_TYPE);
                elseAST.addChild(visit(ctx.ifStmt()));
                ifNode.addChild(elseAST);
            } else {
                System.out.println("ERRO ao construir IF-ELSE!");
                System.exit(1);
            }
        }

        return ifNode;
    }


     @Override public AST visitFuncCallExpression(golangramParser.FuncCallExpressionContext ctx) {
        return visit(ctx.funcCall());
    }

    // TODO ???
     @Override public AST visitVarDecl(golangramParser.VarDeclContext ctx) {
        AST stmt = visit(ctx.varSpec());

        if ((stmt)!= null) {
            return(stmt);
        }

        return null;
      }

    @Override public AST visitParameters(golangramParser.ParametersContext ctx) {
        parametersCount = ctx.parameterDecl().size();
        AST params = new AST(NodeKind.PARAMLIST_NODE, 0, Type.NO_TYPE);
        for (int i =0; i < ctx.parameterDecl().size(); i++) {
            AST param = visit(ctx.parameterDecl(i));
            params.addChild(param);
        }
        return params;
    }

    // TODO ???
    @Override public AST visitSimpleDeclareAssignment(golangramParser.SimpleDeclareAssignmentContext ctx) {
        //consertar o tipo
        AST node = new AST(NodeKind.VAR_DECL_NODE, 0, Type.NO_TYPE);
        // node.addChild(newVar(ctx.declareAssignment().ID().getSymbol()));
        return node;
    }

    /* varSpec:
	idList (
		arrayType (ASSIGN expressionList)?
		| type_ (ASSIGN expressionList)?
		| ASSIGN expressionList
    ); */
    // TODO Não entendi nada... :P
    @Override public AST visitVarSpec(golangramParser.VarSpecContext ctx) {
        AST returnAST;

        AST astExp = null;
        Type typeFinal = Type.NO_TYPE;

        if (ctx.expressionList() != null){
            astExp = visit(ctx.expressionList());
            typeFinal = astExp.type;
        }

        String t;

        if(ctx.type_() != null){

            visit(ctx.type_());
            t = ctx.type_().ID().getText();

            if(t.equals("string")) {
                type = Type.STR_TYPE;
            } else if (t.equals("int")){
                type = Type.INT_TYPE;
            } else if (t.equals("float32")){
                type = Type.REAL_TYPE;
            } else if (t.equals("bool")){
                type = Type.BOOL_TYPE;
            }


            if (astExp != null){
                if (type.equals(typeFinal)){
                    typeFinal = type;

                } else if (type.equals(Type.INT_TYPE) && type.equals(Type.REAL_TYPE)) {
                    typeFinal = Type.REAL_TYPE;

                } else {
                    System.out.println("null var spec");
                    return null;
                }
            } else {
                typeFinal = type;
            }
        } else if (ctx.arrayType() != null) {
            String s = ctx.arrayType().type_().getText();

            if(s.equals("string")) {
                typeFinal = Type.STR_TYPE;
            } else if (s.equals("int")){
                typeFinal = Type.INT_TYPE;
            } else if (s.equals("float32")){
                typeFinal = Type.REAL_TYPE;
            } else if (s.equals("bool")){
                typeFinal = Type.BOOL_TYPE;
            }

        }

        String text = ctx.idList().ID(0).getText();
    	int line = ctx.getStart().getLine();
   		int idx = varTable.lookupVar(text);

        if (idx != -1) {
        	System.err.printf("SEMANTIC ERROR (%d): variable '%s' already declared at line %d.\n", line, text, varTable.getLine(idx));
        	System.exit(1);
            return null; // Never reached.
        }

        idx = varTable.addVar(text, line, typeFinal);

        if (ctx.ASSIGN() != null) {
            returnAST = new AST(NodeKind.ASSIGN_NODE, 0, Type.NO_TYPE);
            AST varDeclAST = new AST(NodeKind.VAR_DECL_NODE, idx, typeFinal);
            returnAST.addChild(varDeclAST);

        } else {
            returnAST = new AST(NodeKind.VAR_DECL_NODE, idx, typeFinal);
        }


        if (astExp != null) {
            returnAST.addChild(astExp);
        }


        return returnAST;
    }

    @Override public AST visitParameterDecl(golangramParser.ParameterDeclContext ctx) {
        String text = ctx.ID().getText();
    	int line = ctx.getStart().getLine();
   		int idx = varTable.lookupVar(text);
        if (idx != -1) {
        	System.err.printf("SEMANTIC ERROR (%d): variable '%s' already declared at line %d.\n", line, text, varTable.getLine(idx));
        	System.exit(1);
            return null; // Never reached.
        }

        String t = ctx.type_().ID().getText();
        Type realType = Type.NO_TYPE;
        if(t.equals("string")) {
            realType = Type.STR_TYPE;
        } else if (t.equals("int")){
            realType = Type.INT_TYPE;
        } else if (t.equals("float32")){
            realType = Type.REAL_TYPE;
        } else if (t.equals("bool")){
            realType = Type.BOOL_TYPE;
        }

        idx = varTable.addVar(text, line, realType);
        return new AST(NodeKind.VAR_DECL_NODE, idx, realType);
    }

    // assignment: expressionList assign_op expressionList;
    @Override public AST visitAssignment(golangramParser.AssignmentContext ctx) {
        AST assignment = new AST(NodeKind.ASSIGN_NODE, 0, Type.NO_TYPE);

        AST esq = visit(ctx.expressionList(0));
        AST dir = visit(ctx.expressionList(1));

        assignment.addChild(esq);
        assignment.addChild(dir);
        return assignment;
    }

	@Override public AST visitAdd_opExpression(golangramParser.Add_opExpressionContext ctx) {
        AST esq = visit(ctx.expression(0));
        AST dir = visit(ctx.expression(1));

        Type lt = esq.type;
        Type rt = dir.type;
        Unif unif;

        if (ctx.PLUS() != null) {
           unif = lt.unifyPlus(rt);
        } else if (ctx.MINUS() != null) {
			unif = lt.unifyOtherArith(rt);
        } else {
            unif = lt.unifyPlus(rt);
			typeError(ctx.add_op.getLine(), ctx.add_op.getText(), lt, rt);
        }

        esq = Conv.createConvNode(unif.lc,esq);
		dir = Conv.createConvNode(unif.rc, dir);
        AST returnAST = null;

        if (ctx.add_op.getType() == golangramLexer.PLUS) {
			returnAST = new AST(NodeKind.PLUS_NODE, 0, unif.type);
		} else if (ctx.add_op.getType() == golangramLexer.MINUS) {
			returnAST = new AST(NodeKind.MINUS_NODE, 0, unif.type);
		}

        returnAST.addChild(esq);
        returnAST.addChild(dir);
        return returnAST;
    }

    @Override public AST visitMul_opExpression(golangramParser.Mul_opExpressionContext ctx) {
        AST esq = visit(ctx.expression(0));
        AST dir = visit(ctx.expression(1));

        Type lt = esq.type;
		Type rt = dir.type;
		Unif unif = lt.unifyOtherArith(rt);

        if (unif.type == Type.NO_TYPE) {
			typeError(ctx.mul_op.getLine(), ctx.mul_op.getText(), lt, rt);
		}

        esq = Conv.createConvNode(unif.lc, esq);
        dir = Conv.createConvNode(unif.rc, dir);
        AST returnAST = null;

        if (ctx.mul_op.getType() == golangramLexer.TIMES) {
			returnAST = new AST(NodeKind.TIMES_NODE, 0, unif.type);
		} else if (ctx.mul_op.getType() == golangramLexer.OVER) {
			returnAST = new AST(NodeKind.OVER_NODE, 0, unif.type);
		}

        returnAST.addChild(esq);
        returnAST.addChild(dir);
        return returnAST;
    }

    @Override public AST visitRel_opExpression(golangramParser.Rel_opExpressionContext ctx) {
        AST esq = visit(ctx.expression(0));
        AST dir = visit(ctx.expression(1));

        Type lt = esq.type;
		Type rt = dir.type;
		Unif unif = lt.unifyComp(rt);

        if (unif.type == Type.NO_TYPE) {
			typeError(ctx.rel_op.getLine(), ctx.rel_op.getText(), lt, rt);
		}

        esq = Conv.createConvNode(unif.lc, esq);
		dir = Conv.createConvNode(unif.rc, dir);
		AST tree = null;

		switch(ctx.rel_op.getType()) {
            case golangramLexer.ISEQUAL:    tree = new AST(NodeKind.EQ_NODE, 0, Type.NO_TYPE);    break;
            case golangramLexer.NOTEQUAL:   tree = new AST(NodeKind.NOTEQ_NODE, 0, Type.NO_TYPE); break;
            case golangramLexer.LESSTHAN:   tree = new AST(NodeKind.LT_NODE, 0, Type.NO_TYPE);    break;
            case golangramLexer.LESSEQTHAN: tree = new AST(NodeKind.LEQT_NODE, 0, Type.NO_TYPE);  break;
            case golangramLexer.MORETHAN:   tree = new AST(NodeKind.MT_NODE, 0, Type.NO_TYPE);    break;
            case golangramLexer.MOREEQTHAN: tree = new AST(NodeKind.MEQT_NODE, 0, Type.NO_TYPE);  break;
            default:
                System.out.println("ERROR: rel_op type not covered!");
                System.exit(1);
		}

        tree.addChild(esq);
        tree.addChild(dir);
        return tree;
    }

	@Override public AST visitIncDecStmt(golangramParser.IncDecStmtContext ctx) {
        AST exp = visit(ctx.expression());

        return null;
    }

    @Override public AST visitUnary_opExpression(golangramParser.Unary_opExpressionContext ctx) {
        AST exp = visit(ctx.expression());

        return null;
    }

    @Override public AST visitOperandLRPAR(golangramParser.OperandLRPARContext ctx) {
        return visit(ctx.expression());
    }

    @Override public AST visitOperandID(golangramParser.OperandIDContext ctx) {
        return checkVar(ctx.ID().getSymbol());
    }

    @Override public AST visitExpressionList(golangramParser.ExpressionListContext ctx) {
        return visit(ctx.expression(0));
    }

	@Override public AST visitFuncCall(golangramParser.FuncCallContext ctx) {
        AST funcCall = null;

        int funcIndex = funcTable.containsFunction(ctx.ID().getText());
        if (funcIndex != -1) {
            // int parameters = funcTable.getQtdParams(funcIndex);
            // visit(ctx.arguments());
            // if (parameters == argumentsCount) {
            // TODO: concertar o teste acima porque claramente estava incompleto.
            // No momento eu só pulei a verificação.
                funcCall = new AST(NodeKind.FUNCTION_CALL_NODE, funcIndex, Type.NO_TYPE);
                AST arg = null;
                if (ctx.arguments() != null) {
                    arg = visit(ctx.arguments());
                } else {
                    // Não tem argumentos mas é bom criar o nó mesmo assim sem filhos porque uniformiza a AST.
                    arg = new AST(NodeKind.ARGS_NODE, 0, Type.NO_TYPE);
                }
                funcCall.addChild(arg);

            // } else {
            //     System.out.printf("A quantidade correta de parametros da função %s é %d, você digitou %d!",ctx.ID().getText(), parameters, argumentsCount);
            //     System.exit(1);
            // }
        } else {
            System.out.println("Nao eh possivel chamar uma função não declarada. Erro em: " + ctx.ID().getText());
            System.exit(1);
        }

        return funcCall;
    }

    @Override public AST visitArguments(golangramParser.ArgumentsContext ctx) {
        AST arguments = new AST(NodeKind.ARGS_NODE, 0, Type.NO_TYPE);

        if (ctx.expressionList(0) != null) {
            for (int i =0; i < ctx.expressionList(0).expression().size(); i++) {
                arguments.addChild(visit(ctx.expressionList(0).expression(i)));
            }
        }

        return arguments;
     }


    @Override public AST visitStrVal(golangramParser.StrValContext ctx) {
        type = Type.STR_TYPE;
        int value = strTable.addStr(ctx.STR_VAL().getText());
        AST ast = new AST(NodeKind.STR_VAL_NODE, value, type);
        return ast;
    }

    @Override public AST visitIntVal(golangramParser.IntValContext ctx) {
        type = Type.INT_TYPE;
        int value = Integer.parseInt(ctx.INT_VAL().getText());
        AST ast = new AST(NodeKind.INT_VAL_NODE, value, type);
        return ast;
    }

	@Override public AST visitRealVal(golangramParser.RealValContext ctx) {
        type = Type.REAL_TYPE;
        float value = Float.parseFloat(ctx.REAL_VAL().getText());
        AST ast = new AST(NodeKind.REAL_VAL_NODE, value, type);
        return ast;
    }

    @Override public AST visitBoolVal(golangramParser.BoolValContext ctx) {
        type = Type.BOOL_TYPE;
        int value = Integer.parseInt(ctx.bool().getText());
        AST ast = new AST(NodeKind.BOOL_VAL_NODE, value, type);

        return ast;
    }

    private static void typeError(int lineNo, String op, Type t1, Type t2) {
    	System.out.printf("SEMANTIC ERROR (%d): incompatible types for operator '%s', LHS is '%s' and RHS is '%s'.\n",
    			lineNo, op, t1.toString(), t2.toString());
    	System.exit(1);
    }

    public void printTables() {
        System.out.print("\n\n");
        System.out.print(strTable);
        System.out.print("\n\n");
    	System.out.print(funcTable.toString());
    	System.out.print("\n\n");
    }

    // Exibe a AST no formato DOT em stderr.
    public void printAST() {
    	AST.printDot(root, allVarTables, funcTable);
    }

}