//package scanner;

import parser.scannerBaseVisitor;
import parser.scannerParser;
import tables.VarTable;
import tables.StrTable;

public class Visitor extends scannerBaseVisitor<Void> {

    StrTable strTable = new StrTable();
    VarTable varTable = new VarTable();

	@Override public Void visitExpStr(scannerParser.ExpStrContext ctx) {
        strTable.add(ctx.STR_VAL().getText());
        return null;
    }
}