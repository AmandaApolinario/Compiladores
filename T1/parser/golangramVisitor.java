// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link golangramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface golangramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link golangramParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(golangramParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(golangramParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(golangramParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(golangramParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(golangramParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#constSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSpec(golangramParser.ConstSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(golangramParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(golangramParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#typeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecl(golangramParser.TypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(golangramParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(golangramParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(golangramParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#varSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpec(golangramParser.VarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(golangramParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(golangramParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(golangramParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmt(golangramParser.SimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#type_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_(golangramParser.Type_Context ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(golangramParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedIdent(golangramParser.QualifiedIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#expressionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStmt(golangramParser.ExpressionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#sendStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendStmt(golangramParser.SendStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#incDecStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStmt(golangramParser.IncDecStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(golangramParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(golangramParser.Assign_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#emptyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(golangramParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#labeledStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStmt(golangramParser.LabeledStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(golangramParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(golangramParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(golangramParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#gotoStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStmt(golangramParser.GotoStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFallthroughStmt(golangramParser.FallthroughStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#deferStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferStmt(golangramParser.DeferStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(golangramParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#switchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(golangramParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSwitchStmt(golangramParser.ExprSwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#exprCaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCaseClause(golangramParser.ExprCaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSwitchCase(golangramParser.ExprSwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchStmt(golangramParser.TypeSwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchGuard(golangramParser.TypeSwitchGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#typeCaseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCaseClause(golangramParser.TypeCaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSwitchCase(golangramParser.TypeSwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(golangramParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(golangramParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(golangramParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#rangeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeClause(golangramParser.RangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(golangramParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(golangramParser.ArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#elementType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementType(golangramParser.ElementTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#sliceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceType(golangramParser.SliceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#methodSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSpec(golangramParser.MethodSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(golangramParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(golangramParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(golangramParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(golangramParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#parameterDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDecl(golangramParser.ParameterDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(golangramParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(golangramParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(golangramParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#embeddedField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbeddedField(golangramParser.EmbeddedFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#typeLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLit(golangramParser.TypeLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operandBasicLit}
	 * labeled alternative in {@link golangramParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandBasicLit(golangramParser.OperandBasicLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operandID}
	 * labeled alternative in {@link golangramParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandID(golangramParser.OperandIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operandLRPAR}
	 * labeled alternative in {@link golangramParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandLRPAR(golangramParser.OperandLRPARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link golangramParser#basicLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVal(golangramParser.IntValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strVal}
	 * labeled alternative in {@link golangramParser#basicLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrVal(golangramParser.StrValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realVal}
	 * labeled alternative in {@link golangramParser#basicLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealVal(golangramParser.RealValContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(golangramParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#slice_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice_(golangramParser.Slice_Context ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(golangramParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link golangramParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(golangramParser.EosContext ctx);
}