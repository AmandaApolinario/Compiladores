import tables.FuncTable;
import tables.VarTable;
import tables.StrTable;

import typing.Type;

public class Visitor extends golangramBaseVisitor<Void> {

    FuncTable funcTable = new FuncTable();
    StrTable strTable;
    VarTable varTable;
    String funcName;
    Type type;

    @Override public Void visitFunctionDecl(golangramParser.FunctionDeclContext ctx) {
        funcName = ctx.ID().getText();
        strTable = new StrTable();
        varTable = new VarTable();

        visit(ctx.block());
        int isNewFunc = funcTable.containsFunction(ctx.ID().getText());

        if (isNewFunc == -1) {

            funcTable.addFunction(ctx.ID().getText(), strTable, varTable);

        } else {
            System.out.println("Nao eh possivel declarar duas funcoes com o mesmo nome. Declarando: " + ctx.ID().getText());
            System.exit(1);
        }

        return null; 
    }

    // typeSpec: ID ASSIGN? type_;
    @Override public Void visitTypeSpec(golangramParser.TypeSpecContext ctx) {
        int isNewVar = varTable.lookupVar(ctx.ID().getText());
        if (isNewVar == -1) {
            varTable.addVar(ctx.ID().getText(), ctx.getStart().getLine(), type);
        } else {
            System.out.println("Nao eh possivel declarar duas variaveis com o mesmo nome. Declarando: " + ctx.ID().getText());
            System.exit(1);
        }
        return null;
     }

     /*@Override public Void visitAssignment(golangramParser.AssignmentContext ctx) { 
        String leftExpressionValue = visitExpressionList(ctx.expressionList(0));
        System.out.println(leftExpressionValue);
        return null; 
    }

    @Override public String visitExpressionList(golangramParser.ExpressionListContext ctx) { 
        String leftExpressionValue = visitExpressionList(ctx.expression(0));
        return leftExpressionValue;
    }
	
    @Override public String visitExpression(golangramParser.ExpressionContext ctx) { 
        return visitChildren(ctx); 
    }
	
	@Override public String visitPrimaryExpr(golangramParser.PrimaryExprContext ctx) { 
        return "teste"; 
    }*/
	
    /*@Override public String operandID(golangramParser.PrimaryExprContext ctx) { 
        return visitChildren(ctx); 
    }*/

    //idList: ID (COMMA ID)*;

    // typeName: qualifiedIdent | ID;

    //qualifiedIdent: ID DOT ID;

    //labeledStmt: ID COLON statement;

    //breakStmt: BREAK ID?;

    //continueStmt: CONTINUE ID?;

    //gotoStmt: GOTO ID;

    //typeSwitchGuard: (ID ASSIGN)? operand DOT LPAR TYPE RPAR;

    //primaryExpr:
	/*operand
	| primaryExpr (
		(DOT ID)
		| index
		| slice_
		| arguments
	);*/

    //identifierList: ID (COMMA ID)*;

    //operand: basicLit | ID | LPAR expression RPAR;

    @Override public Void visitStrVal(golangramParser.StrValContext ctx) { 
        strTable.add(ctx.STR_VAL().getText());
        type = Type.STR_TYPE;
        return null; 
    }

    @Override public Void visitIntVal(golangramParser.IntValContext ctx) { 
        type = Type.INT_TYPE;
        return null;
    }


	@Override public Void visitRealVal(golangramParser.RealValContext ctx) { 
        type = Type.REAL_TYPE;
        return null;
    }

	
	
}