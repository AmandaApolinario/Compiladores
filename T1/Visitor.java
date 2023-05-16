//import parser.golangramBaseVisitor;
//import parser.golangramParser;
import tables.FuncTable;
import tables.VarTable;
import tables.StrTable;

import typing.Type;

public class Visitor extends golangramBaseVisitor<Void> {

    FuncTable funcTable = new FuncTable();
    StrTable strTable;
    String funcName;
    Type type;

    @Override public Void visitFunctionDecl(golangramParser.FunctionDeclContext ctx) {
        funcName = ctx.ID().getText();
        strTable = new StrTable();
        visit(ctx.block());
        int isNewFunc = funcTable.containsFunction(ctx.ID().getText());

        if (isNewFunc == -1) {

            funcTable.addFunction(ctx.ID().getText(), strTable);
            //make the strTable null
        } else {
            System.out.println("Nao eh possivel declarar duas funcoes com o mesmo nome. Declarando: " + ctx.ID().getText());
            System.exit(1);
        }

        return null; 
    }

    @Override public Void visitTypeSpec(golangramParser.TypeSpecContext ctx) {
        
        return null;
     }

    @Override public Void visitStrVal(golangramParser.StrValContext ctx) { 
        strTable.add(ctx.STR_VAL().getText());
        return null; 
    }
	
	
}