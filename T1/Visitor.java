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
            return nodeChild;
        }

        return null; 
    }

	@Override public AST visitStatementList(golangramParser.StatementListContext ctx) { 
        AST node = new AST(NodeKind.BLOCK_NODE, 0, Type.NO_TYPE);

        for (int i = 0; i < ctx.statement().size(); i++) {
            AST stmt = visit(ctx.statement(i));
            node.addChild(stmt);
        }

        return node; 
    }

	// @Override public AST visitStatement(golangramParser.StatementContext ctx) { 
        
    
    //     /*System.out.println("show");
    //     AST simple = visit(ctx.simpleStmt());
    //     if (visit(ctx.simpleStmt()) != null) {
    //         System.out.println("show");
    //         node.addChild(simple);
    //         return node;
    //     }*/
        
    //     /*AST stmt = visit(ctx.declaration());
    //     if (stmt != null) {
    //         return stmt;
    //         //node.addChild(stmt);
    //     }*/

    //     // if (visit(ctx.labeledStmt()) != null) {
    //     //     System.out.println("2");
    //     // }

    //     // if (visit(ctx.simpleStmt()) != null) {
    //     //     System.out.println("3");
    //     // }

    //     // if (visit(ctx.returnStmt()) != null) {
    //     //     System.out.println("4");
    //     // }

    //     // if (visit(ctx.fallthroughStmt()) != null) {
    //     //     System.out.println("5");
    //     // }

    //     // if (visit(ctx.block()) != null) {
    //     //     System.out.println("6");
    //     // }

    //    /*  if (visit(ctx.ifStmt()) != null) {
            
    //         System.out.println("7");
    //         return visit(ctx.ifStmt());
    //     }*/

    //     // if (visit(ctx.switchStmt()) != null) {
    //     //     System.out.println("8");
    //     // }
    //     System.out.println("AAA");
    //     if (visit(ctx.forStmt()) != null) {
    //         System.out.println("9");
    //     }
    //     return null; 
    // }

    //VAI SER WHILE EM VEZ DE FOR
    @Override public AST visitForStmt(golangramParser.ForStmtContext ctx) { 
        AST whileAST = new AST(NodeKind.WHILE_NODE, 0, Type.NO_TYPE);

        whileAST.addChild(visit(ctx.expression()));
        whileAST.addChild(visit(ctx.block()));

        return whileAST;
    }
	

    @Override public AST visitSimpleAssignment(golangramParser.SimpleAssignmentContext ctx) { 
        System.out.println("assignment simple");
        AST exprNode = visit(ctx.assignment());
        return visit(ctx.assignment());
    }
     
    @Override public AST visitDeclaration(golangramParser.DeclarationContext ctx) { 
        AST stmt = visit(ctx.varDecl());

        if ((stmt)!= null) {
            // node.addChild(stmt);
            return stmt;
        }

        return null; 
     }

     @Override public AST visitIfStmt(golangramParser.IfStmtContext ctx) { 
        AST ifNode = new AST(NodeKind.IF_NODE, 0, Type.NO_TYPE);
        AST exprNode = null;
        if ((ctx.expression()) != null){
            ifNode.addChild(visit(ctx.expression()));
        }
        
        if ((ctx.block(0)) != null) {
            System.out.println("b");
            ifNode.addChild(visit(ctx.block(0)));
        }
        if (ctx.ELSE() != null) {
            AST elseAST = new AST(NodeKind.ELSE_NODE, 0, Type.NO_TYPE);
            if ((ctx.ifStmt()) != null) {
                elseAST.addChild(visit(ctx.ifStmt()));
            }
            if ((ctx.block(1)) != null) {
                elseAST.addChild(visit(ctx.block(1)));
            }

            ifNode.addChild(elseAST);
        }
        
        return ifNode;
      }
	

     @Override public AST visitFuncCallExpression(golangramParser.FuncCallExpressionContext ctx) { 
        AST returnAST = new AST(NodeKind.FUNCTION_CALL_NODE, 0, Type.NO_TYPE);    
        //e o nome da função kk
        return returnAST;
      }
	
	
     @Override public AST visitVarDecl(golangramParser.VarDeclContext ctx) { 
        AST stmt = visit(ctx.varSpec());

        if ((stmt)!= null) {
            return(stmt);
        }

        return null; 
      }
	

    @Override public AST visitParameters(golangramParser.ParametersContext ctx) {
        // parametersCount = ctx.parameterDecl().size();
        AST params = new AST(NodeKind.PARAMLIST_NODE, 0, Type.NO_TYPE);
        for (int i =0; i < ctx.parameterDecl().size(); i++) {
            AST param = visit(ctx.parameterDecl(i));
            System.out.println("parametros");
            params.addChild(param);
        }
        return params;   
    }
	

    @Override public AST visitSimpleDeclareAssignment(golangramParser.SimpleDeclareAssignmentContext ctx) { 
    
        System.out.println("assignment declare");
        //consertar o tipo
        AST node = new AST(NodeKind.VAR_DECL_NODE, 0, Type.NO_TYPE);
        // node.addChild(newVar(ctx.declareAssignment().ID().getSymbol()));
        return node;
    }

    @Override public AST visitVarSpec(golangramParser.VarSpecContext ctx) { 
        AST returnAST;

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

        //deveria ser uma var decl?
        idx = varTable.addVar(text, line, realType);
        return new AST(NodeKind.VAR_DECL_NODE, idx, realType);
    }

    @Override public AST visitAssignment(golangramParser.AssignmentContext ctx) { 
        AST assignment = new AST(NodeKind.ASSIGN_NODE, 0, Type.NO_TYPE);

        System.out.println("assignment");
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
            System.out.println("minus");
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
            returnAST.addChild(esq);
            returnAST.addChild(dir);
		} else if (ctx.add_op.getType() == golangramLexer.MINUS) { // MINUS
			returnAST = new AST(NodeKind.MINUS_NODE, 0, unif.type);
            returnAST.addChild(esq);
            returnAST.addChild(dir);
		}

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
            returnAST.addChild(esq);
            returnAST.addChild(dir);
		} else if (ctx.mul_op.getType() == golangramLexer.OVER) { // MINUS
			returnAST = new AST(NodeKind.OVER_NODE, 0, unif.type);
            returnAST.addChild(esq);
            returnAST.addChild(dir);
		}

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

        if (ctx.rel_op.getType() == golangramLexer.ISEQUAL) {
            AST tree = new AST(NodeKind.EQ_NODE, 0, Type.NO_TYPE);
            tree.addChild(esq);
            tree.addChild(dir);
            System.out.println("equal if");
			return tree;

		} else if (ctx.rel_op.getType() == golangramLexer.LESSTHAN) {
			AST tree = new AST(NodeKind.LT_NODE, 0, Type.NO_TYPE);
            tree.addChild(esq);
            tree.addChild(dir);            
			return tree;

		} else if (ctx.rel_op.getType() == golangramLexer.NOTEQUAL) {
			AST tree = new AST(NodeKind.NOTEQ_NODE, 0, Type.NO_TYPE);
            tree.addChild(esq);
            tree.addChild(dir);            
			return tree;

        } else if (ctx.rel_op.getType() == golangramLexer.MORETHAN) {
            AST tree = new AST(NodeKind.MT_NODE, 0, Type.NO_TYPE);
            tree.addChild(esq);
            tree.addChild(dir);            
			return tree;

        } else if (ctx.rel_op.getType() == golangramLexer.LESSEQTHAN) {
			AST tree = new AST(NodeKind.LEQT_NODE, 0, Type.NO_TYPE);
            tree.addChild(esq);
            tree.addChild(dir);            
			return tree;

        } else {
            AST tree = new AST(NodeKind.EQ_NODE, 0, Type.NO_TYPE);
            tree.addChild(esq);
            tree.addChild(dir);
            return tree;
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

    @Override public AST visitSimpleExpressionStmt(golangramParser.SimpleExpressionStmtContext ctx) { 
        System.out.println("aaaaaaa");
        return null;
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
        int value = Integer.parseInt(ctx.INT_VAL().getText());
        AST ast = new AST(NodeKind.INT_VAL_NODE, value, Type.INT_TYPE);
        return ast;
    }

	@Override public AST visitRealVal(golangramParser.RealValContext ctx) { 
        type = Type.REAL_TYPE;
        float value = Float.parseFloat(ctx.REAL_VAL().getText());
        AST ast = new AST(NodeKind.REAL_VAL_NODE, value, type);
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
    	AST.printDot(root, allVarTables, funcTable);
    }

	
}