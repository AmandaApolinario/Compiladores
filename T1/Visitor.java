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
    
    String funcName;
    Type type;
    int parametersCount = 0;
    int argumentsCount = 0;

    AST root;

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

    @Override public AST visitBegin(golangramParser.BeginContext ctx) { 
       this.root = new AST(NodeKind.PROGRAM_NODE, 0, Type.NO_TYPE);
        for (int i = 0; i < ctx.functionDecl().size(); i++) {
            AST func = visit(ctx.functionDecl(i));
            root.addChild(func);
        }
        
        return this.root;
    }

    @Override public AST visitFunctionDecl(golangramParser.FunctionDeclContext ctx) {
        funcName = ctx.ID().getText();
        varTable = new VarTable();

        AST tree = new AST(NodeKind.FUNCDEC_NODE, 0, Type.NO_TYPE);

        AST params = visit(ctx.parameters());
        AST blockAST = visit(ctx.block());
        tree.addChild(params);
        tree.addChild(blockAST);
        
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

                funcTable.addFunction(ctx.ID().getText(), varTable, t2, parametersCount);
            } else {
                funcTable.addFunction(ctx.ID().getText(), varTable, null, parametersCount);
            }

        } else {
            System.out.println("Nao eh possivel declarar duas funcoes com o mesmo nome. Declarando: " + ctx.ID().getText());
            System.exit(1);
        }

        
        return tree; 
    }

	@Override public AST visitBlock(golangramParser.BlockContext ctx) { 
        AST node = new AST(NodeKind.BLOCK_NODE, 0, Type.NO_TYPE);
        //add resto da funcao
        if (ctx.statementList() != null) {
            AST nodeChild = visit(ctx.statementList());
            node.addChild(nodeChild);
        }

        return node; 
    }

	@Override public AST visitStatementList(golangramParser.StatementListContext ctx) { 
        AST node = new AST(NodeKind.BLOCK_NODE, 0, Type.NO_TYPE);

        for (int i = 0; i < ctx.statement().size(); i++) {
            AST stmt = visit(ctx.statement(i));
            node.addChild(stmt);
        }

        return node; 
    }

	@Override public AST visitStatement(golangramParser.StatementContext ctx) { 
        AST node = new AST(NodeKind.BLOCK_NODE, 0, Type.NO_TYPE);

        // if (visit(ctx.simpleStmt()) != null) {
        //     AST stmt = visit(ctx.simpleStmt());
        //     node.addChild(stmt);
        // }
        
        AST stmt = visit(ctx.declaration());
        if (stmt != null) {
            return stmt;
            //node.addChild(stmt);
        }

        // if (visit(ctx.labeledStmt()) != null) {
        //     System.out.println("2");
        // }

        // if (visit(ctx.simpleStmt()) != null) {
        //     System.out.println("3");
        // }

        // if (visit(ctx.returnStmt()) != null) {
        //     System.out.println("4");
        // }

        // if (visit(ctx.fallthroughStmt()) != null) {
        //     System.out.println("5");
        // }

        // if (visit(ctx.block()) != null) {
        //     System.out.println("6");
        // }

        // if (visit(ctx.ifStmt()) != null) {
        //     System.out.println("7");
        // }

        // if (visit(ctx.switchStmt()) != null) {
        //     System.out.println("8");
        // }

        // if (visit(ctx.forStmt()) != null) {
        //     System.out.println("9");
        // }
        return null; 
    }

    @Override public AST visitDeclaration(golangramParser.DeclarationContext ctx) { 
        AST node = new AST(NodeKind.BLOCK_NODE, 0, Type.NO_TYPE);
        AST stmt = visit(ctx.varDecl());

        if ((stmt)!= null) {
            // node.addChild(stmt);
            return stmt;
        }

        return null; 
     }
	
     @Override public AST visitVarDecl(golangramParser.VarDeclContext ctx) { 
        AST node = new AST(NodeKind.VAR_DECL_NODE, 0, Type.NO_TYPE);
        AST stmt = visit(ctx.varSpec());

        if ((stmt)!= null) {
            node.addChild(stmt);
        }

        return node; 
      }
	

    @Override public AST visitParameters(golangramParser.ParametersContext ctx) {
        // parametersCount = ctx.parameterDecl().size();
        AST params = new AST(NodeKind.PARAMLIST_NODE, 0, Type.NO_TYPE);
        //add resto da funcao
        return params;   
    }
	

    @Override public AST visitSimpleDeclareAssignment(golangramParser.SimpleDeclareAssignmentContext ctx) { 
    

        AST node = new AST(NodeKind.VAR_DECL_NODE, 0, type);
        // node.addChild(newVar(ctx.declareAssignment().ID().getSymbol()));
        return node;
    }

    @Override public AST visitVarSpec(golangramParser.VarSpecContext ctx) { 
        AST astExp = null;
        Type typeFinal = Type.NO_TYPE;
        
        if (ctx.expressionList() != null){
            astExp = visit(ctx.expressionList());
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
                
                } else if (typeFinal.equals(Type.INT_TYPE) && type.equals(Type.REAL_TYPE)) {
                    typeFinal = Type.REAL_TYPE;
              
                } else {
                    System.out.println("null var spec");
                    return null;
                }
            } else {
                System.out.println(type);
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
        idx = varTable.addVar(text, line, type);
        return new AST(NodeKind.VAR_DECL_NODE, idx, typeFinal);
    }

    @Override public AST visitSimpleArrayStmt(golangramParser.SimpleArrayStmtContext ctx) { 

        AST array = visit(ctx.arrayStmt().operand());
        AST stmt = visit(ctx.arrayStmt().basicLit());

        Type arrayType = array.type;
		Type stmtType = stmt.type;
		Unif unif = arrayType.unifyComp(stmtType);

        if (arrayType.equals(stmtType)) {
            // NAO PRECISA FAZER TALVEZ ?

        }

        return null;
    }
	

    @Override public AST visitParameterDecl(golangramParser.ParameterDeclContext ctx) { 

        int isNewVar = varTable.lookupVar(ctx.ID().getText());
        if (isNewVar == -1) {
            varTable.addVar(ctx.ID().getText(), ctx.getStart().getLine(), type);
        } else {
            System.out.println("Nao eh possivel declarar duas variaveis com o mesmo nome. Declarando: " + ctx.ID().getText());
            System.exit(1);
        }
        return null;
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

        if (ctx.add_op.getType() == golangramLexer.PLUS) {
			return AST.newSubtree(NodeKind.PLUS_NODE, unif.type, esq,dir);
		} else { // MINUS
			return AST.newSubtree(NodeKind.MINUS_NODE, unif.type, esq,dir);
		}

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

        if (ctx.TIMES() != null || ctx.OVER() != null) {
			return AST.newSubtree(NodeKind.TIMES_NODE, unif.type, esq, dir);
        } else {
			return AST.newSubtree(NodeKind.OVER_NODE, unif.type, esq, dir);
        }
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

        if (ctx.rel_op.getType() == golangramLexer.ISEQUAL) {
			return AST.newSubtree(NodeKind.EQ_NODE, unif.type, esq, dir);

		} else if (ctx.rel_op.getType() == golangramLexer.LESSTHAN) {
			return AST.newSubtree(NodeKind.LT_NODE, unif.type, esq, dir);

		} else if (ctx.rel_op.getType() == golangramLexer.NOTEQUAL) {
			return AST.newSubtree(NodeKind.NOTEQ_NODE, unif.type, esq, dir);

        } else if (ctx.rel_op.getType() == golangramLexer.MORETHAN) {
			return AST.newSubtree(NodeKind.MT_NODE, unif.type, esq, dir);

        } else if (ctx.rel_op.getType() == golangramLexer.LESSEQTHAN) {
			return AST.newSubtree(NodeKind.LEQT_NODE, unif.type, esq, dir);

        } else {
			return AST.newSubtree(NodeKind.MEQT_NODE, unif.type, esq, dir);
        }
        
        // COMENTADO PQ A LINGUAGEM DO LAB SÓ TEM EQ E LT, TEM QUE ALTERAR NA TABELA
    }
	
	@Override public AST visitIncDecStmt(golangramParser.IncDecStmtContext ctx) {
        AST exp = visit(ctx.expression());

        // TABELAAAAAAAAAAAAAAAA

        // if (exp.equals(Type.INT_TYPE) || exp.equals(Type.REAL_TYPE)) {
        //     System.out.println(exp);
        //     return exp;
        // }

        // System.out.println("Tipo de variavel errado em inc dec");
        // System.exit(1);
        return null;
    }

    @Override public AST visitUnary_opExpression(golangramParser.Unary_opExpressionContext ctx) { 
        AST exp = visit(ctx.expression());

        //TABELAAAAAAAAAAAAAAAAAAA

        // if (ctx.NOT() != null) {
        //     if(exp.equals(Type.BOOL_TYPE)){
        //         System.out.printf("ta em unary: %s\n",Type.BOOL_TYPE);
        //         return Type.BOOL_TYPE;
        //     }
        // }

        // System.out.println("Tipo de variavel errado em unary op");
        // System.exit(1);
        return null;
    }

    @Override public AST visitOperandID(golangramParser.OperandIDContext ctx) { 
        return checkVar(ctx.ID().getSymbol());
    }

    @Override public AST visitExpressionList(golangramParser.ExpressionListContext ctx) {
        argumentsCount = ctx.expression().size();
        
        return visitChildren(ctx);
    }
	
	@Override public AST visitFuncCall(golangramParser.FuncCallContext ctx) { 

        // NAO SEI TEM Q FAZER 
        
        // funcName = ctx.ID().getText();

        // argumentsCount = 0;
        // visit(ctx.arguments());
        
        // int isDeclaredFunc = funcTable.containsFunction(ctx.ID().getText());
        // if (isDeclaredFunc != -1) {
        //     int parameters = funcTable.getQtdParams(isDeclaredFunc);
        //     if (parameters == argumentsCount) {
        //         System.out.println("quantidade certa de parametros");
        //         Type typeReturn = funcTable.getReturn(isDeclaredFunc);
        //         if(typeReturn != null) {
        //             //System.out.println(typeReturn);
        //             return typeReturn;
        //         }
        //     } else {
        //         System.out.printf("A quantidade correta de parametros da função %s é %d, você digitou %d!",ctx.ID().getText(), parameters, argumentsCount);
        //         System.exit(1);
        //     }

        // } else {
        //     System.out.println("Nao eh possivel chamar uma função não declarada. Erro em: " + ctx.ID().getText());
        //     System.exit(1);
        // }

        return null;
    }

    @Override public AST visitStrVal(golangramParser.StrValContext ctx) { 
        strTable.add(ctx.STR_VAL().getText());
        type = Type.STR_TYPE;
        return null; 
    }

    @Override public AST visitIntVal(golangramParser.IntValContext ctx) { 
        type = Type.INT_TYPE;
        return null;
    }

	@Override public AST visitRealVal(golangramParser.RealValContext ctx) { 
        type = Type.REAL_TYPE;
        return null;
    }

    @Override public AST visitBoolVal(golangramParser.BoolValContext ctx) { 
        type = Type.BOOL_TYPE;
        return null;
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

        //trocar pra aceitar func table, e ai na printDot sao os comentarios la
        //vai ter q printar as funcs e dps as var tables
    	AST.printDot(root, varTable);
    }

	
}