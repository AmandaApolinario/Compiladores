import javax.print.DocFlavor.STRING;

import tables.FuncTable;
import tables.VarTable;
import tables.StrTable;

import typing.Type;

public class Visitor extends golangramBaseVisitor<Type> {

    FuncTable funcTable = new FuncTable();
    StrTable strTable = new StrTable();
    VarTable varTable;
    String funcName;
    Type type;

    @Override public Type visitFunctionDecl(golangramParser.FunctionDeclContext ctx) {
        funcName = ctx.ID().getText();
        varTable = new VarTable();

        visit(ctx.parameters());
        visit(ctx.block());
        
        int isNewFunc = funcTable.containsFunction(ctx.ID().getText());
        if (isNewFunc == -1) {

            funcTable.addFunction(ctx.ID().getText(), varTable);

        } else {
            System.out.println("Nao eh possivel declarar duas funcoes com o mesmo nome. Declarando: " + ctx.ID().getText());
            System.exit(1);
        }

        return null; 
    }


    @Override public Type visitSimpleDeclareAssignment(golangramParser.SimpleDeclareAssignmentContext ctx) { 
        int isNewVar = varTable.lookupVar(ctx.toString());
        
        if (isNewVar == -1) {
            varTable.addVar(ctx.declareAssignment().ID().getText(), ctx.getStart().getLine(), Type.INT_TYPE);
        } else {
            System.out.println("Nao eh possivel declarar duas variaveis com o mesmo nome. Declarando: " + ctx.declareAssignment().ID().getText());
            System.exit(1);
        }
        return null;
    }

    @Override public Type visitVarSpec(golangramParser.VarSpecContext ctx) { 
        visit(ctx.type_());
        visit(ctx.expressionList());
        String t = ctx.type_().ID().getText();

        if(t.equals("string")) {
            type = Type.STR_TYPE;
        } else if (t.equals("int")){
            type = Type.INT_TYPE;
        } else if (t.equals("float32")){
            type = Type.REAL_TYPE;
        }

        int isNewVar = varTable.lookupVar(ctx.idList().ID(0).getText());
        if (isNewVar == -1) {
            varTable.addVar(ctx.idList().ID(0).getText(), ctx.getStart().getLine(), type);
        } else {
            System.out.println("Nao eh possivel declarar duas variaveis com o mesmo nome. Declarando: " + ctx.idList().ID(0).getText());
            System.exit(1);
        }
        return null;      
    }

    @Override public Type visitParameterDecl(golangramParser.ParameterDeclContext ctx) { 

        int isNewVar = varTable.lookupVar(ctx.ID().getText());
        if (isNewVar == -1) {
            varTable.addVar(ctx.ID().getText(), ctx.getStart().getLine(), type);
        } else {
            System.out.println("Nao eh possivel declarar duas variaveis com o mesmo nome. Declarando: " + ctx.ID().getText());
            System.exit(1);
        }
        return null;
    }
	
    @Override public Type visitStrVal(golangramParser.StrValContext ctx) { 
        strTable.add(ctx.STR_VAL().getText());
        type = Type.STR_TYPE;
        return Type.STR_TYPE; 
    }

    @Override public Type visitIntVal(golangramParser.IntValContext ctx) { 
        type = Type.INT_TYPE;
        return Type.INT_TYPE;
    }


	@Override public Type visitRealVal(golangramParser.RealValContext ctx) { 
        type = Type.REAL_TYPE;
        return Type.REAL_TYPE;
    }

    @Override public Type visitBoolVal(golangramParser.BoolValContext ctx) { 
        type = Type.BOOL_TYPE;
        return Type.BOOL_TYPE;
    }
	

	@Override public Type visitAdd_opExpression(golangramParser.Add_opExpressionContext ctx) { 
        Type esq = visit(ctx.expression(0));
        Type dir = visit(ctx.expression(1));

        if (ctx.PLUS() != null) {
            if (esq.equals(dir) && !esq.equals(Type.BOOL_TYPE)){
                System.out.println(dir);
                return dir;
            } else if (esq.equals(Type.INT_TYPE) && dir.equals(Type.REAL_TYPE)){
                System.out.println(Type.REAL_TYPE);
                return Type.REAL_TYPE;
            } else if (esq.equals(Type.REAL_TYPE) && dir.equals(Type.INT_TYPE)){
                System.out.println(Type.REAL_TYPE);
                return Type.REAL_TYPE;
            }
        }
        System.out.println("null");
        return null;
    }
	
	
}