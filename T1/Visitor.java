import tables.FuncTable;
import tables.VarTable;
import tables.StrTable;

import typing.Type;

public class Visitor extends golangramBaseVisitor<Void> {

    FuncTable funcTable = new FuncTable();
    StrTable strTable = new StrTable();
    VarTable varTable;
    String funcName;
    Type type;

    @Override public Void visitFunctionDecl(golangramParser.FunctionDeclContext ctx) {
        funcName = ctx.ID().getText();
        varTable = new VarTable();

        visit(ctx.block());
        visit(ctx.parameters());
        int isNewFunc = funcTable.containsFunction(ctx.ID().getText());

        if (isNewFunc == -1) {

            funcTable.addFunction(ctx.ID().getText(), varTable);

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

     @Override public Void visitParameterDecl(golangramParser.ParameterDeclContext ctx) { 
        visit(ctx.type_());
        varTable.addVar(ctx.ID().getText(), ctx.getStart().getLine(), type);
        return null;
     }
	
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