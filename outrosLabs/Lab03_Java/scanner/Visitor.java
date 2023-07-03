//package scanner;

import parser.scannerBaseVisitor;
import parser.scannerParser;
import tables.VarTable;
import tables.StrTable;

import typing.Type;

public class Visitor extends scannerBaseVisitor<Void> {

    StrTable strTable = new StrTable();
    VarTable varTable = new VarTable();
    Type type;

    public Void checkVar(String token) {
        int isNewVar = varTable.lookupVar(token);

        if (isNewVar == -1) {
            System.out.println("A variavel nao existe. Sobre: " + token);
            // System.exit(1);
        } 

        return null;
    }

	@Override public Void visitExpStr(scannerParser.ExpStrContext ctx) {
        strTable.add(ctx.STR_VAL().getText());
        return null;
    }

    @Override public Void visitExpId(scannerParser.ExpIdContext ctx) { 
        checkVar(ctx.ID().getText());

        return null;
    }

    @Override public Void visitVardecl(scannerParser.VardeclContext ctx) { 
        visit(ctx.typespec());
        int isNewVar = varTable.lookupVar(ctx.ID().getText());

        if (isNewVar == -1) {
            varTable.addVar(ctx.ID().getText(), ctx.getStart().getLine(), type);
        } else {
            System.out.println("Nao eh possivel declarar duas variaveis com o mesmo nome. Declarando: " + ctx.ID().getText());
            // System.exit(1);
        }

        return null; 
    }

    @Override public Void visitAssignstmt(scannerParser.AssignstmtContext ctx) { 
        checkVar(ctx.ID().getText());
        
        return null;
    }

    @Override public Void visitReadstmt(scannerParser.ReadstmtContext ctx) {
        checkVar(ctx.ID().getText());

        return null;
    }

    @Override public Void visitTypeBool(scannerParser.TypeBoolContext ctx) {
        type = Type.BOOL_TYPE;
        return null;
    }

	@Override public Void visitTypeInt(scannerParser.TypeIntContext ctx) { 
        type = Type.INT_TYPE;
        return null;
    }

	@Override public Void visitTypeReal(scannerParser.TypeRealContext ctx) {
        type = Type.REAL_TYPE;
        return null;
    }

	@Override public Void visitTypeStr(scannerParser.TypeStrContext ctx) { 
        type = Type.STR_TYPE;
        return null;
    }

}