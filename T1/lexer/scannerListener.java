// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link scannerParser}.
 */
public interface scannerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link scannerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(scannerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(scannerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(scannerParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(scannerParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void enterConstSpec(scannerParser.ConstSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#constSpec}.
	 * @param ctx the parse tree
	 */
	void exitConstSpec(scannerParser.ConstSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(scannerParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(scannerParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDecl(scannerParser.TypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#typeDecl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDecl(scannerParser.TypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(scannerParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(scannerParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(scannerParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(scannerParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(scannerParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(scannerParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(scannerParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(scannerParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(scannerParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(scannerParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void enterVarSpec(scannerParser.VarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void exitVarSpec(scannerParser.VarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(scannerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(scannerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(scannerParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(scannerParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(scannerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(scannerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(scannerParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(scannerParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(scannerParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(scannerParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(scannerParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(scannerParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdent(scannerParser.QualifiedIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdent(scannerParser.QualifiedIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(scannerParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(scannerParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStmt(scannerParser.IncDecStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#incDecStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStmt(scannerParser.IncDecStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(scannerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(scannerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(scannerParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(scannerParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(scannerParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(scannerParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#labeledStmt}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStmt(scannerParser.LabeledStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#labeledStmt}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStmt(scannerParser.LabeledStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(scannerParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(scannerParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(scannerParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(scannerParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(scannerParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(scannerParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void enterGotoStmt(scannerParser.GotoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#gotoStmt}.
	 * @param ctx the parse tree
	 */
	void exitGotoStmt(scannerParser.GotoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 */
	void enterFallthroughStmt(scannerParser.FallthroughStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#fallthroughStmt}.
	 * @param ctx the parse tree
	 */
	void exitFallthroughStmt(scannerParser.FallthroughStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeferStmt(scannerParser.DeferStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeferStmt(scannerParser.DeferStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(scannerParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(scannerParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmt(scannerParser.SwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#switchStmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmt(scannerParser.SwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprSwitchStmt(scannerParser.ExprSwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#exprSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprSwitchStmt(scannerParser.ExprSwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#exprCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterExprCaseClause(scannerParser.ExprCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#exprCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitExprCaseClause(scannerParser.ExprCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterExprSwitchCase(scannerParser.ExprSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#exprSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitExprSwitchCase(scannerParser.ExprSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchStmt(scannerParser.TypeSwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#typeSwitchStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchStmt(scannerParser.TypeSwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchGuard(scannerParser.TypeSwitchGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#typeSwitchGuard}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchGuard(scannerParser.TypeSwitchGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeCaseClause(scannerParser.TypeCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#typeCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeCaseClause(scannerParser.TypeCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterTypeSwitchCase(scannerParser.TypeSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#typeSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitTypeSwitchCase(scannerParser.TypeSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(scannerParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(scannerParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(scannerParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(scannerParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(scannerParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(scannerParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void enterRangeClause(scannerParser.RangeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#rangeClause}.
	 * @param ctx the parse tree
	 */
	void exitRangeClause(scannerParser.RangeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(scannerParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(scannerParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(scannerParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(scannerParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#elementType}.
	 * @param ctx the parse tree
	 */
	void enterElementType(scannerParser.ElementTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#elementType}.
	 * @param ctx the parse tree
	 */
	void exitElementType(scannerParser.ElementTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void enterMethodSpec(scannerParser.MethodSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#methodSpec}.
	 * @param ctx the parse tree
	 */
	void exitMethodSpec(scannerParser.MethodSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(scannerParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(scannerParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(scannerParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(scannerParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(scannerParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(scannerParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(scannerParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(scannerParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterDecl(scannerParser.ParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterDecl(scannerParser.ParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(scannerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(scannerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(scannerParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(scannerParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#embeddedField}.
	 * @param ctx the parse tree
	 */
	void enterEmbeddedField(scannerParser.EmbeddedFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#embeddedField}.
	 * @param ctx the parse tree
	 */
	void exitEmbeddedField(scannerParser.EmbeddedFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void enterTypeLit(scannerParser.TypeLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#typeLit}.
	 * @param ctx the parse tree
	 */
	void exitTypeLit(scannerParser.TypeLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(scannerParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(scannerParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link scannerParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(scannerParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link scannerParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(scannerParser.EosContext ctx);
}