// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link scannerParser}.
 */
public interface scannerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link scannerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(scannerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(scannerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#varssect}.
	 * @param ctx the parse tree
	 */
	void enterVarssect(scannerParser.VarssectContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#varssect}.
	 * @param ctx the parse tree
	 */
	void exitVarssect(scannerParser.VarssectContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(scannerParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(scannerParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#typespec}.
	 * @param ctx the parse tree
	 */
	void enterTypespec(scannerParser.TypespecContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#typespec}.
	 * @param ctx the parse tree
	 */
	void exitTypespec(scannerParser.TypespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#stmtsect}.
	 * @param ctx the parse tree
	 */
	void enterStmtsect(scannerParser.StmtsectContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#stmtsect}.
	 * @param ctx the parse tree
	 */
	void exitStmtsect(scannerParser.StmtsectContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(scannerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(scannerParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(scannerParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(scannerParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(scannerParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(scannerParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#readstmt}.
	 * @param ctx the parse tree
	 */
	void enterReadstmt(scannerParser.ReadstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#readstmt}.
	 * @param ctx the parse tree
	 */
	void exitReadstmt(scannerParser.ReadstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#repeatstmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeatstmt(scannerParser.RepeatstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#repeatstmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeatstmt(scannerParser.RepeatstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#writestmt}.
	 * @param ctx the parse tree
	 */
	void enterWritestmt(scannerParser.WritestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#writestmt}.
	 * @param ctx the parse tree
	 */
	void exitWritestmt(scannerParser.WritestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(scannerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(scannerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(scannerParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(scannerParser.OpContext ctx);
}