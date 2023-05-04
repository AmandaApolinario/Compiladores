package scanner;

import parser.scannerBaseVisitor;
import parser.scannerParser;
import tables.VarTable;

public class Visitor extends scannerBaseVisitor<Integer> {

    

	@Override public T visitProgram(scannerParser.ProgramContext ctx) { 
        return visitChildren(ctx); 
    }

	@Override public T visitVarssect(scannerParser.VarssectContext ctx) { 
        return visitChildren(ctx);
    }

	@Override public T visitVardecl(scannerParser.VardeclContext ctx) {
        String algo = visit(ctx)
    }

	@Override public T visitTypespec(scannerParser.TypespecContext ctx) { 
        return visitChildren(ctx); 
    }

	@Override public T visitStmtsect(scannerParser.StmtsectContext ctx) { 
        return visitChildren(ctx); 
    }

	@Override public T visitStmt(scannerParser.StmtContext ctx) { 
        return visitChildren(ctx); 
    }

	@Override public T visitAssignstmt(scannerParser.AssignstmtContext ctx) { 
        return visitChildren(ctx); 
    }

	@Override public T visitIfstmt(scannerParser.IfstmtContext ctx) { 
        return visitChildren(ctx); 
    }

	@Override public T visitReadstmt(scannerParser.ReadstmtContext ctx) { 
        return visitChildren(ctx); 
    }

	@Override public T visitRepeatstmt(scannerParser.RepeatstmtContext ctx) { 
        return visitChildren(ctx); 
    }

	@Override public T visitWritestmt(scannerParser.WritestmtContext ctx) { 
        return visitChildren(ctx); 
    }

	@Override public T visitExpr(scannerParser.ExprContext ctx) { 
        return visitChildren(ctx); 
    }

	@Override public T visitOp(scannerParser.OpContext ctx) { 
        return visitChildren(ctx); 
    }
}