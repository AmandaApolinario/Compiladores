// Generated from java-escape by ANTLR 4.11.1

    package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link scannerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface scannerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link scannerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(scannerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#varssect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarssect(scannerParser.VarssectContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(scannerParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#typespec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypespec(scannerParser.TypespecContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#stmtsect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtsect(scannerParser.StmtsectContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(scannerParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#assignstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstmt(scannerParser.AssignstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(scannerParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#readstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadstmt(scannerParser.ReadstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#repeatstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatstmt(scannerParser.RepeatstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#writestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritestmt(scannerParser.WritestmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link scannerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTrue(scannerParser.BoolTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expOperation}
	 * labeled alternative in {@link scannerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOperation(scannerParser.ExpOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link scannerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFalse(scannerParser.BoolFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expReal}
	 * labeled alternative in {@link scannerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpReal(scannerParser.ExpRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expInt}
	 * labeled alternative in {@link scannerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpInt(scannerParser.ExpIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link scannerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPar(scannerParser.ExpParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expStr}
	 * labeled alternative in {@link scannerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpStr(scannerParser.ExpStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expId}
	 * labeled alternative in {@link scannerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpId(scannerParser.ExpIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link scannerParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(scannerParser.OpContext ctx);
}