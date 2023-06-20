// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class golangramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, CASE=2, CHAN=3, CONST=4, CONTINUE=5, DEFAULT=6, DEFER=7, ELSE=8, 
		TRUE=9, FALSE=10, FALLTHROUGH=11, FOR=12, FUNC=13, GO=14, GOTO=15, IF=16, 
		IMPORT=17, INTERFACE=18, MAP=19, PACKAGE=20, RANGE=21, RETURN=22, SELECT=23, 
		STRUCT=24, SWITCH=25, TYPE=26, VAR=27, PLUS=28, MINUS=29, TIMES=30, OVER=31, 
		MOD=32, PLUSEQ=33, MINUSEQ=34, TIMESEQ=35, OVEREQ=36, MODEQ=37, AND=38, 
		OR=39, PLUSONE=40, MINUSONE=41, ISEQUAL=42, LESSTHAN=43, MORETHAN=44, 
		ASSIGN=45, NOT=46, NOTEQUAL=47, LESSEQTHAN=48, MOREEQTHAN=49, DECLARE_ASSIGN=50, 
		LPAR=51, RPAR=52, LBRACK=53, RBRACK=54, LCURLYBRACES=55, RCURLYBRACES=56, 
		COMMA=57, DOT=58, SEMI=59, COLON=60, ID=61, REAL_VAL=62, INT_VAL=63, STR_VAL=64, 
		COMMENT=65, BLOCK_COMMENT=66, WHITESPACE=67, UNKNOWN=68, EOS=69;
	public static final int
		RULE_begin = 0, RULE_functionDecl = 1, RULE_arrayStmt = 2, RULE_declaration = 3, 
		RULE_typeSpec = 4, RULE_constDecl = 5, RULE_constSpec = 6, RULE_declareAssignment = 7, 
		RULE_idList = 8, RULE_expressionList = 9, RULE_funcCall = 10, RULE_typeDecl = 11, 
		RULE_varDecl = 12, RULE_varSpec = 13, RULE_block = 14, RULE_statementList = 15, 
		RULE_statement = 16, RULE_simpleStmt = 17, RULE_type_ = 18, RULE_expressionStmt = 19, 
		RULE_incDecStmt = 20, RULE_assignment = 21, RULE_assign_op = 22, RULE_emptyStmt = 23, 
		RULE_labeledStmt = 24, RULE_returnStmt = 25, RULE_breakStmt = 26, RULE_continueStmt = 27, 
		RULE_fallthroughStmt = 28, RULE_deferStmt = 29, RULE_ifStmt = 30, RULE_switchStmt = 31, 
		RULE_exprSwitchStmt = 32, RULE_exprCaseClause = 33, RULE_exprSwitchCase = 34, 
		RULE_typeSwitchStmt = 35, RULE_typeSwitchGuard = 36, RULE_typeCaseClause = 37, 
		RULE_typeSwitchCase = 38, RULE_typeList = 39, RULE_forStmt = 40, RULE_forClause = 41, 
		RULE_rangeClause = 42, RULE_arrayType = 43, RULE_arrayLength = 44, RULE_functionType = 45, 
		RULE_result = 46, RULE_parameters = 47, RULE_parameterDecl = 48, RULE_expression = 49, 
		RULE_primaryExpr = 50, RULE_identifierList = 51, RULE_embeddedField = 52, 
		RULE_typeLit = 53, RULE_operand = 54, RULE_basicLit = 55, RULE_index = 56, 
		RULE_bool = 57, RULE_arguments = 58, RULE_eos = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "functionDecl", "arrayStmt", "declaration", "typeSpec", "constDecl", 
			"constSpec", "declareAssignment", "idList", "expressionList", "funcCall", 
			"typeDecl", "varDecl", "varSpec", "block", "statementList", "statement", 
			"simpleStmt", "type_", "expressionStmt", "incDecStmt", "assignment", 
			"assign_op", "emptyStmt", "labeledStmt", "returnStmt", "breakStmt", "continueStmt", 
			"fallthroughStmt", "deferStmt", "ifStmt", "switchStmt", "exprSwitchStmt", 
			"exprCaseClause", "exprSwitchCase", "typeSwitchStmt", "typeSwitchGuard", 
			"typeCaseClause", "typeSwitchCase", "typeList", "forStmt", "forClause", 
			"rangeClause", "arrayType", "arrayLength", "functionType", "result", 
			"parameters", "parameterDecl", "expression", "primaryExpr", "identifierList", 
			"embeddedField", "typeLit", "operand", "basicLit", "index", "bool", "arguments", 
			"eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'case'", "'chan'", "'const'", "'continue'", "'default'", 
			"'defer'", "'else'", "'true'", "'false'", "'fallthrough'", "'for'", "'func'", 
			"'go'", "'goto'", "'if'", null, "'interface'", "'map'", null, "'range'", 
			"'return'", "'select'", "'struct'", "'switch'", "'type'", "'var'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&&'", 
			"'||'", "'++'", "'--'", "'=='", "'<'", "'>'", "'='", "'!'", "'!='", "'<='", 
			"'>='", "':='", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "'.'", 
			"';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", "DEFER", 
			"ELSE", "TRUE", "FALSE", "FALLTHROUGH", "FOR", "FUNC", "GO", "GOTO", 
			"IF", "IMPORT", "INTERFACE", "MAP", "PACKAGE", "RANGE", "RETURN", "SELECT", 
			"STRUCT", "SWITCH", "TYPE", "VAR", "PLUS", "MINUS", "TIMES", "OVER", 
			"MOD", "PLUSEQ", "MINUSEQ", "TIMESEQ", "OVEREQ", "MODEQ", "AND", "OR", 
			"PLUSONE", "MINUSONE", "ISEQUAL", "LESSTHAN", "MORETHAN", "ASSIGN", "NOT", 
			"NOTEQUAL", "LESSEQTHAN", "MOREEQTHAN", "DECLARE_ASSIGN", "LPAR", "RPAR", 
			"LBRACK", "RBRACK", "LCURLYBRACES", "RCURLYBRACES", "COMMA", "DOT", "SEMI", 
			"COLON", "ID", "REAL_VAL", "INT_VAL", "STR_VAL", "COMMENT", "BLOCK_COMMENT", 
			"WHITESPACE", "UNKNOWN", "EOS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public golangramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BeginContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(golangramParser.EOF, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 201334800L) != 0) {
				{
				{
				setState(122);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
					{
					setState(120);
					functionDecl();
					}
					break;
				case CONST:
				case TYPE:
				case VAR:
					{
					setState(121);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(124);
				eos();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(golangramParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(FUNC);
			setState(134);
			match(ID);
			{
			setState(135);
			parameters();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2317102008282128384L) != 0) {
				{
				setState(136);
				type_();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLYBRACES) {
				{
				setState(139);
				block();
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayStmtContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(golangramParser.ASSIGN, 0); }
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public ArrayStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitArrayStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayStmtContext arrayStmt() throws RecognitionException {
		ArrayStmtContext _localctx = new ArrayStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arrayStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			operand();
			setState(143);
			index();
			setState(144);
			match(ASSIGN);
			setState(145);
			basicLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public TypeDeclContext typeDecl() {
			return getRuleContext(TypeDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(147);
				constDecl();
				}
				break;
			case TYPE:
				{
				setState(148);
				typeDecl();
				}
				break;
			case VAR:
				{
				setState(149);
				varDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(golangramParser.ASSIGN, 0); }
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(153);
				match(ASSIGN);
				}
			}

			setState(156);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(golangramParser.CONST, 0); }
		public List<ConstSpecContext> constSpec() {
			return getRuleContexts(ConstSpecContext.class);
		}
		public ConstSpecContext constSpec(int i) {
			return getRuleContext(ConstSpecContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(golangramParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(golangramParser.RPAR, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(CONST);
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(159);
				constSpec();
				}
				break;
			case LPAR:
				{
				setState(160);
				match(LPAR);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(161);
					constSpec();
					setState(162);
					eos();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstSpecContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(golangramParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ConstSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitConstSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			idList();
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2317102008282128384L) != 0) {
					{
					setState(173);
					type_();
					}
				}

				setState(176);
				match(ASSIGN);
				setState(177);
				expressionList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public TerminalNode DECLARE_ASSIGN() { return getToken(golangramParser.DECLARE_ASSIGN, 0); }
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public DeclareAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitDeclareAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareAssignmentContext declareAssignment() throws RecognitionException {
		DeclareAssignmentContext _localctx = new DeclareAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declareAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(181);
			match(DECLARE_ASSIGN);
			setState(182);
			basicLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(golangramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(golangramParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(golangramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(golangramParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(185);
				match(COMMA);
				setState(186);
				match(ID);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(golangramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(golangramParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expression(0);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					match(COMMA);
					setState(194);
					expression(0);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
			setState(201);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(golangramParser.TYPE, 0); }
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(golangramParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(golangramParser.RPAR, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public TypeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitTypeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(TYPE);
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(204);
				typeSpec();
				}
				break;
			case LPAR:
				{
				setState(205);
				match(LPAR);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(206);
					typeSpec();
					setState(207);
					eos();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(golangramParser.VAR, 0); }
		public VarSpecContext varSpec() {
			return getRuleContext(VarSpecContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(VAR);
			setState(218);
			varSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarSpecContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(golangramParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitVarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			idList();
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(221);
				arrayType();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(222);
					match(ASSIGN);
					setState(223);
					expressionList();
					}
				}

				}
				break;
			case 2:
				{
				setState(226);
				type_();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(227);
					match(ASSIGN);
					setState(228);
					expressionList();
					}
				}

				}
				break;
			case 3:
				{
				setState(231);
				match(ASSIGN);
				setState(232);
				expressionList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACES() { return getToken(golangramParser.LCURLYBRACES, 0); }
		public TerminalNode RCURLYBRACES() { return getToken(golangramParser.RCURLYBRACES, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(LCURLYBRACES);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -845515643533881575L) != 0) {
				{
				setState(236);
				statementList();
				}
			}

			setState(239);
			match(RCURLYBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(golangramParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(golangramParser.SEMI, i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(241);
					match(SEMI);
					}
				}

				}
				setState(244);
				statement();
				{
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(245);
					match(SEMI);
					}
					break;
				}
				}
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -845515643533881575L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LabeledStmtContext labeledStmt() {
			return getRuleContext(LabeledStmtContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(golangramParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(golangramParser.CONTINUE, 0); }
		public FallthroughStmtContext fallthroughStmt() {
			return getRuleContext(FallthroughStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				returnStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				match(BREAK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				match(CONTINUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				fallthroughStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(260);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(261);
				switchStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(262);
				forStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStmtContext extends ParserRuleContext {
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
	 
		public SimpleStmtContext() { }
		public void copyFrom(SimpleStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleIncDecStmtContext extends SimpleStmtContext {
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public SimpleIncDecStmtContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitSimpleIncDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleDeclareAssignmentContext extends SimpleStmtContext {
		public DeclareAssignmentContext declareAssignment() {
			return getRuleContext(DeclareAssignmentContext.class,0);
		}
		public SimpleDeclareAssignmentContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitSimpleDeclareAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleArrayStmtContext extends SimpleStmtContext {
		public ArrayStmtContext arrayStmt() {
			return getRuleContext(ArrayStmtContext.class,0);
		}
		public SimpleArrayStmtContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitSimpleArrayStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAssignmentContext extends SimpleStmtContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SimpleAssignmentContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitSimpleAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionStmtContext extends SimpleStmtContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public SimpleExpressionStmtContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitSimpleExpressionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simpleStmt);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new SimpleArrayStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				arrayStmt();
				}
				break;
			case 2:
				_localctx = new SimpleIncDecStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				incDecStmt();
				}
				break;
			case 3:
				_localctx = new SimpleDeclareAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				declareAssignment();
				}
				break;
			case 4:
				_localctx = new SimpleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				assignment();
				}
				break;
			case 5:
				_localctx = new SimpleExpressionStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
				expressionStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(golangramParser.LPAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode RPAR() { return getToken(golangramParser.RPAR, 0); }
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_type_);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(ID);
				}
				break;
			case FUNC:
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				typeLit();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(LPAR);
				setState(275);
				type_();
				setState(276);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitExpressionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncDecStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUSONE() { return getToken(golangramParser.PLUSONE, 0); }
		public TerminalNode MINUSONE() { return getToken(golangramParser.MINUSONE, 0); }
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitIncDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expression(0);
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==PLUSONE || _la==MINUSONE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			expressionList();
			setState(286);
			assign_op();
			setState(287);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(golangramParser.ASSIGN, 0); }
		public TerminalNode DECLARE_ASSIGN() { return getToken(golangramParser.DECLARE_ASSIGN, 0); }
		public TerminalNode PLUS() { return getToken(golangramParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(golangramParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(golangramParser.OR, 0); }
		public TerminalNode TIMES() { return getToken(golangramParser.TIMES, 0); }
		public TerminalNode OVER() { return getToken(golangramParser.OVER, 0); }
		public TerminalNode MOD() { return getToken(golangramParser.MOD, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitAssign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 558077313024L) != 0) {
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 558077313024L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(292);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==DECLARE_ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStmtContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(golangramParser.SEMI, 0); }
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabeledStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public TerminalNode COLON() { return getToken(golangramParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitLabeledStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
			setState(297);
			match(COLON);
			setState(298);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(golangramParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(RETURN);
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(301);
				expressionList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(golangramParser.BREAK, 0); }
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_breakStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(BREAK);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(305);
				match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(golangramParser.CONTINUE, 0); }
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(CONTINUE);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(309);
				match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FallthroughStmtContext extends ParserRuleContext {
		public TerminalNode FALLTHROUGH() { return getToken(golangramParser.FALLTHROUGH, 0); }
		public FallthroughStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitFallthroughStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FallthroughStmtContext fallthroughStmt() throws RecognitionException {
		FallthroughStmtContext _localctx = new FallthroughStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(FALLTHROUGH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeferStmtContext extends ParserRuleContext {
		public TerminalNode DEFER() { return getToken(golangramParser.DEFER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeferStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitDeferStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeferStmtContext deferStmt() throws RecognitionException {
		DeferStmtContext _localctx = new DeferStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(DEFER);
			setState(315);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(golangramParser.IF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(golangramParser.ELSE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(IF);
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(318);
				expression(0);
				}
				break;
			case 2:
				{
				setState(319);
				eos();
				setState(320);
				expression(0);
				}
				break;
			case 3:
				{
				setState(322);
				simpleStmt();
				setState(323);
				eos();
				setState(324);
				expression(0);
				}
				break;
			}
			setState(328);
			block();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(329);
				match(ELSE);
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(330);
					ifStmt();
					}
					break;
				case LCURLYBRACES:
					{
					setState(331);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStmtContext extends ParserRuleContext {
		public ExprSwitchStmtContext exprSwitchStmt() {
			return getRuleContext(ExprSwitchStmtContext.class,0);
		}
		public TypeSwitchStmtContext typeSwitchStmt() {
			return getRuleContext(TypeSwitchStmtContext.class,0);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switchStmt);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				typeSwitchStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprSwitchStmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(golangramParser.SWITCH, 0); }
		public TerminalNode LCURLYBRACES() { return getToken(golangramParser.LCURLYBRACES, 0); }
		public TerminalNode RCURLYBRACES() { return getToken(golangramParser.RCURLYBRACES, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<ExprCaseClauseContext> exprCaseClause() {
			return getRuleContexts(ExprCaseClauseContext.class);
		}
		public ExprCaseClauseContext exprCaseClause(int i) {
			return getRuleContext(ExprCaseClauseContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public ExprSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitExprSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSwitchStmtContext exprSwitchStmt() throws RecognitionException {
		ExprSwitchStmtContext _localctx = new ExprSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(SWITCH);
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
					{
					setState(341);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
					{
					setState(344);
					simpleStmt();
					}
				}

				setState(347);
				eos();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
					{
					setState(348);
					expression(0);
					}
				}

				}
				break;
			}
			setState(353);
			match(LCURLYBRACES);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(354);
				exprCaseClause();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360);
			match(RCURLYBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprCaseClauseContext extends ParserRuleContext {
		public ExprSwitchCaseContext exprSwitchCase() {
			return getRuleContext(ExprSwitchCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(golangramParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExprCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCaseClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitExprCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseClauseContext exprCaseClause() throws RecognitionException {
		ExprCaseClauseContext _localctx = new ExprCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exprCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			exprSwitchCase();
			setState(363);
			match(COLON);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -845515643533881575L) != 0) {
				{
				setState(364);
				statementList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprSwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(golangramParser.CASE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(golangramParser.DEFAULT, 0); }
		public ExprSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchCase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitExprSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSwitchCaseContext exprSwitchCase() throws RecognitionException {
		ExprSwitchCaseContext _localctx = new ExprSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_exprSwitchCase);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(CASE);
				setState(368);
				expressionList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSwitchStmtContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(golangramParser.SWITCH, 0); }
		public TerminalNode LCURLYBRACES() { return getToken(golangramParser.LCURLYBRACES, 0); }
		public TerminalNode RCURLYBRACES() { return getToken(golangramParser.RCURLYBRACES, 0); }
		public TypeSwitchGuardContext typeSwitchGuard() {
			return getRuleContext(TypeSwitchGuardContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public List<TypeCaseClauseContext> typeCaseClause() {
			return getRuleContexts(TypeCaseClauseContext.class);
		}
		public TypeCaseClauseContext typeCaseClause(int i) {
			return getRuleContext(TypeCaseClauseContext.class,i);
		}
		public TypeSwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitTypeSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSwitchStmtContext typeSwitchStmt() throws RecognitionException {
		TypeSwitchStmtContext _localctx = new TypeSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(SWITCH);
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(373);
				typeSwitchGuard();
				}
				break;
			case 2:
				{
				setState(374);
				eos();
				setState(375);
				typeSwitchGuard();
				}
				break;
			case 3:
				{
				setState(377);
				simpleStmt();
				setState(378);
				eos();
				setState(379);
				typeSwitchGuard();
				}
				break;
			}
			setState(383);
			match(LCURLYBRACES);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(384);
				typeCaseClause();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			match(RCURLYBRACES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSwitchGuardContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode DOT() { return getToken(golangramParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(golangramParser.LPAR, 0); }
		public TerminalNode TYPE() { return getToken(golangramParser.TYPE, 0); }
		public TerminalNode RPAR() { return getToken(golangramParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(golangramParser.ASSIGN, 0); }
		public TypeSwitchGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchGuard; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitTypeSwitchGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSwitchGuardContext typeSwitchGuard() throws RecognitionException {
		TypeSwitchGuardContext _localctx = new TypeSwitchGuardContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(392);
				match(ID);
				setState(393);
				match(ASSIGN);
				}
				break;
			}
			setState(396);
			operand();
			setState(397);
			match(DOT);
			setState(398);
			match(LPAR);
			setState(399);
			match(TYPE);
			setState(400);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeCaseClauseContext extends ParserRuleContext {
		public TypeSwitchCaseContext typeSwitchCase() {
			return getRuleContext(TypeSwitchCaseContext.class,0);
		}
		public TerminalNode COLON() { return getToken(golangramParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TypeCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCaseClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitTypeCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCaseClauseContext typeCaseClause() throws RecognitionException {
		TypeCaseClauseContext _localctx = new TypeCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			typeSwitchCase();
			setState(403);
			match(COLON);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -845515643533881575L) != 0) {
				{
				setState(404);
				statementList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(golangramParser.CASE, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(golangramParser.DEFAULT, 0); }
		public TypeSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchCase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitTypeSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSwitchCaseContext typeSwitchCase() throws RecognitionException {
		TypeSwitchCaseContext _localctx = new TypeSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeSwitchCase);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(CASE);
				setState(408);
				typeList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeListContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(golangramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(golangramParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(412);
			type_();
			}
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(413);
				match(COMMA);
				{
				setState(414);
				type_();
				}
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(golangramParser.FOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(FOR);
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
					{
					setState(421);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(424);
				forClause();
				}
				break;
			case 3:
				{
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903890435L) != 0) {
					{
					setState(425);
					rangeClause();
					}
				}

				}
				break;
			}
			setState(430);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForClauseContext extends ParserRuleContext {
		public SimpleStmtContext initStmt;
		public SimpleStmtContext postStmt;
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SimpleStmtContext> simpleStmt() {
			return getRuleContexts(SimpleStmtContext.class);
		}
		public SimpleStmtContext simpleStmt(int i) {
			return getRuleContext(SimpleStmtContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
				{
				setState(432);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
			}

			setState(435);
			eos();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
				{
				setState(436);
				expression(0);
				}
			}

			setState(439);
			eos();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
				{
				setState(440);
				((ForClauseContext)_localctx).postStmt = simpleStmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeClauseContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(golangramParser.RANGE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(golangramParser.ASSIGN, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(golangramParser.DECLARE_ASSIGN, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(443);
				expressionList();
				setState(444);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(446);
				idList();
				setState(447);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(451);
			match(RANGE);
			setState(452);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(golangramParser.LBRACK, 0); }
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(golangramParser.RBRACK, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(LBRACK);
			setState(455);
			arrayLength();
			setState(456);
			match(RBRACK);
			setState(457);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(golangramParser.FUNC, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(FUNC);
			setState(462);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResultContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_result);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				type_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(golangramParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(golangramParser.RPAR, 0); }
		public List<ParameterDeclContext> parameterDecl() {
			return getRuleContexts(ParameterDeclContext.class);
		}
		public ParameterDeclContext parameterDecl(int i) {
			return getRuleContext(ParameterDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(golangramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(golangramParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(LPAR);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2317102008282128384L) != 0) {
				{
				setState(469);
				parameterDecl();
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(470);
						match(COMMA);
						setState(471);
						parameterDecl();
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(477);
					match(COMMA);
					}
				}

				}
			}

			setState(482);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitParameterDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_parameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(484);
				match(ID);
				}
				break;
			}
			setState(487);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(golangramParser.OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mul_opExpressionContext extends ExpressionContext {
		public Token mul_op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(golangramParser.TIMES, 0); }
		public TerminalNode OVER() { return getToken(golangramParser.OVER, 0); }
		public TerminalNode MOD() { return getToken(golangramParser.MOD, 0); }
		public Mul_opExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitMul_opExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(golangramParser.AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unary_opExpressionContext extends ExpressionContext {
		public Token unary_op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(golangramParser.PLUS, 0); }
		public TerminalNode TIMES() { return getToken(golangramParser.TIMES, 0); }
		public TerminalNode MINUS() { return getToken(golangramParser.MINUS, 0); }
		public TerminalNode OVER() { return getToken(golangramParser.OVER, 0); }
		public TerminalNode NOT() { return getToken(golangramParser.NOT, 0); }
		public Unary_opExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitUnary_opExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Rel_opExpressionContext extends ExpressionContext {
		public Token rel_op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ISEQUAL() { return getToken(golangramParser.ISEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(golangramParser.NOTEQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(golangramParser.LESSTHAN, 0); }
		public TerminalNode LESSEQTHAN() { return getToken(golangramParser.LESSEQTHAN, 0); }
		public TerminalNode MORETHAN() { return getToken(golangramParser.MORETHAN, 0); }
		public TerminalNode MOREEQTHAN() { return getToken(golangramParser.MOREEQTHAN, 0); }
		public Rel_opExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitRel_opExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Add_opExpressionContext extends ExpressionContext {
		public Token add_op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(golangramParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(golangramParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(golangramParser.OR, 0); }
		public Add_opExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitAdd_opExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandExpressionContext extends ExpressionContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OperandExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitOperandExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprExpressionContext extends ExpressionContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public PrimaryExprExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitPrimaryExprExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallExpressionContext extends ExpressionContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitFuncCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				_localctx = new FuncCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(490);
				funcCall();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryExprExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(491);
				primaryExpr(0);
				}
				break;
			case 3:
				{
				_localctx = new OperandExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(492);
				operand();
				}
				break;
			case 4:
				{
				_localctx = new Unary_opExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(493);
				((Unary_opExpressionContext)_localctx).unary_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 70372770709504L) != 0) ) {
					((Unary_opExpressionContext)_localctx).unary_op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(494);
				expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(512);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new Mul_opExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(497);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(498);
						((Mul_opExpressionContext)_localctx).mul_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0) ) {
							((Mul_opExpressionContext)_localctx).mul_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(499);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Add_opExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(500);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(501);
						((Add_opExpressionContext)_localctx).add_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 550561120256L) != 0) ) {
							((Add_opExpressionContext)_localctx).add_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(502);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new Rel_opExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(503);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(504);
						((Rel_opExpressionContext)_localctx).rel_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1015948744065024L) != 0) ) {
							((Rel_opExpressionContext)_localctx).rel_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(505);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(506);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(507);
						match(AND);
						setState(508);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(509);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(510);
						match(OR);
						setState(511);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(golangramParser.DOT, 0); }
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(518);
			operand();
			}
			_ctx.stop = _input.LT(-1);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(520);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(525);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(521);
						match(DOT);
						setState(522);
						match(ID);
						}
						}
						break;
					case LBRACK:
						{
						setState(523);
						index();
						}
						break;
					case LPAR:
						{
						setState(524);
						arguments();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(golangramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(golangramParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(golangramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(golangramParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(ID);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(533);
				match(COMMA);
				setState(534);
				match(ID);
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmbeddedFieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public TerminalNode TIMES() { return getToken(golangramParser.TIMES, 0); }
		public EmbeddedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embeddedField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitEmbeddedField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmbeddedFieldContext embeddedField() throws RecognitionException {
		EmbeddedFieldContext _localctx = new EmbeddedFieldContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_embeddedField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES) {
				{
				setState(540);
				match(TIMES);
				}
			}

			setState(543);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeLitContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TypeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitTypeLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_typeLit);
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				arrayType();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				functionType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandLRPARContext extends OperandContext {
		public TerminalNode LPAR() { return getToken(golangramParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(golangramParser.RPAR, 0); }
		public OperandLRPARContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitOperandLRPAR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandBasicLitContext extends OperandContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public OperandBasicLitContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitOperandBasicLit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandIDContext extends OperandContext {
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public OperandIDContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitOperandID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_operand);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case REAL_VAL:
			case INT_VAL:
			case STR_VAL:
				_localctx = new OperandBasicLitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				basicLit();
				}
				break;
			case ID:
				_localctx = new OperandIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(ID);
				}
				break;
			case LPAR:
				_localctx = new OperandLRPARContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				match(LPAR);
				setState(552);
				expression(0);
				setState(553);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BasicLitContext extends ParserRuleContext {
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
	 
		public BasicLitContext() { }
		public void copyFrom(BasicLitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntValContext extends BasicLitContext {
		public TerminalNode INT_VAL() { return getToken(golangramParser.INT_VAL, 0); }
		public IntValContext(BasicLitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitIntVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrValContext extends BasicLitContext {
		public TerminalNode STR_VAL() { return getToken(golangramParser.STR_VAL, 0); }
		public StrValContext(BasicLitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitStrVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealValContext extends BasicLitContext {
		public TerminalNode REAL_VAL() { return getToken(golangramParser.REAL_VAL, 0); }
		public RealValContext(BasicLitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitRealVal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolValContext extends BasicLitContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolValContext(BasicLitContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitBoolVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_basicLit);
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
				_localctx = new IntValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(INT_VAL);
				}
				break;
			case STR_VAL:
				_localctx = new StrValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(STR_VAL);
				}
				break;
			case REAL_VAL:
				_localctx = new RealValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				match(REAL_VAL);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(560);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(golangramParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(golangramParser.RBRACK, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(LBRACK);
			setState(564);
			expression(0);
			setState(565);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(golangramParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(golangramParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(golangramParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(golangramParser.RPAR, 0); }
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(golangramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(golangramParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LPAR);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
				{
				{
				setState(570);
				expressionList();
				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(571);
					match(COMMA);
					setState(572);
					expressionList();
					}
					break;
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(575);
					match(COMMA);
					}
				}

				}
			}

			setState(580);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(golangramParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(golangramParser.EOF, 0); }
		public TerminalNode EOS() { return getToken(golangramParser.EOS, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SEMI || _la==EOS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 49:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 50:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001E\u0249\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0001"+
		"\u0000\u0001\u0000\u0003\u0000{\b\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u007f\b\u0000\n\u0000\f\u0000\u0082\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u008a\b\u0001"+
		"\u0001\u0001\u0003\u0001\u008d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0097\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u009b\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00a5\b\u0005\n\u0005\f\u0005\u00a8\t\u0005"+
		"\u0001\u0005\u0003\u0005\u00ab\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00af\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b3\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00bc\b\b\n\b\f\b\u00bf\t\b\u0001\t\u0001\t\u0001\t\u0005\t\u00c4\b"+
		"\t\n\t\f\t\u00c7\t\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d2\b\u000b\n"+
		"\u000b\f\u000b\u00d5\t\u000b\u0001\u000b\u0003\u000b\u00d8\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00e1\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00e6\b\r\u0001\r\u0001\r\u0003\r\u00ea\b\r"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00ee\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0003\u000f\u00f3\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00f7\b\u000f\u0004\u000f\u00f9\b\u000f\u000b\u000f\f\u000f\u00fa\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0108"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u010f\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0117\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0003\u0016\u0123\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u012f\b\u0019\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0133\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0137\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0147\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u014d\b\u001e\u0003\u001e\u014f\b"+
		"\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0153\b\u001f\u0001 \u0001"+
		" \u0003 \u0157\b \u0001 \u0003 \u015a\b \u0001 \u0001 \u0003 \u015e\b"+
		" \u0003 \u0160\b \u0001 \u0001 \u0005 \u0164\b \n \f \u0167\t \u0001 "+
		"\u0001 \u0001!\u0001!\u0001!\u0003!\u016e\b!\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u0173\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u017e\b#\u0001#\u0001#\u0005#\u0182\b#\n#\f#\u0185\t#\u0001#"+
		"\u0001#\u0001$\u0001$\u0003$\u018b\b$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0003%\u0196\b%\u0001&\u0001&\u0001&\u0003"+
		"&\u019b\b&\u0001\'\u0001\'\u0001\'\u0005\'\u01a0\b\'\n\'\f\'\u01a3\t\'"+
		"\u0001(\u0001(\u0003(\u01a7\b(\u0001(\u0001(\u0003(\u01ab\b(\u0003(\u01ad"+
		"\b(\u0001(\u0001(\u0001)\u0003)\u01b2\b)\u0001)\u0001)\u0003)\u01b6\b"+
		")\u0001)\u0001)\u0003)\u01ba\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u01c2\b*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0003.\u01d3\b.\u0001"+
		"/\u0001/\u0001/\u0001/\u0005/\u01d9\b/\n/\f/\u01dc\t/\u0001/\u0003/\u01df"+
		"\b/\u0003/\u01e1\b/\u0001/\u0001/\u00010\u00030\u01e6\b0\u00010\u0001"+
		"0\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u01f0\b1\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00051\u0201\b1\n1\f1\u0204\t1\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00032\u020e\b2\u00052\u0210\b2\n"+
		"2\f2\u0213\t2\u00013\u00013\u00013\u00053\u0218\b3\n3\f3\u021b\t3\u0001"+
		"4\u00034\u021e\b4\u00014\u00014\u00015\u00015\u00035\u0224\b5\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00036\u022c\b6\u00017\u00017\u00017\u0001"+
		"7\u00037\u0232\b7\u00018\u00018\u00018\u00018\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001:\u0003:\u023e\b:\u0001:\u0003:\u0241\b:\u0003:\u0243\b"+
		":\u0001:\u0001:\u0001;\u0001;\u0001;\u0000\u0002bd<\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\u0000\t\u0001\u0000()\u0002"+
		"\u0000\u001c \'\'\u0002\u0000--22\u0002\u0000\u001c\u001f..\u0001\u0000"+
		"\u001e \u0002\u0000\u001c\u001d\'\'\u0002\u0000*,/1\u0001\u0000\t\n\u0002"+
		"\u0001;;EE\u026e\u0000\u0080\u0001\u0000\u0000\u0000\u0002\u0085\u0001"+
		"\u0000\u0000\u0000\u0004\u008e\u0001\u0000\u0000\u0000\u0006\u0096\u0001"+
		"\u0000\u0000\u0000\b\u0098\u0001\u0000\u0000\u0000\n\u009e\u0001\u0000"+
		"\u0000\u0000\f\u00ac\u0001\u0000\u0000\u0000\u000e\u00b4\u0001\u0000\u0000"+
		"\u0000\u0010\u00b8\u0001\u0000\u0000\u0000\u0012\u00c0\u0001\u0000\u0000"+
		"\u0000\u0014\u00c8\u0001\u0000\u0000\u0000\u0016\u00cb\u0001\u0000\u0000"+
		"\u0000\u0018\u00d9\u0001\u0000\u0000\u0000\u001a\u00dc\u0001\u0000\u0000"+
		"\u0000\u001c\u00eb\u0001\u0000\u0000\u0000\u001e\u00f8\u0001\u0000\u0000"+
		"\u0000 \u0107\u0001\u0000\u0000\u0000\"\u010e\u0001\u0000\u0000\u0000"+
		"$\u0116\u0001\u0000\u0000\u0000&\u0118\u0001\u0000\u0000\u0000(\u011a"+
		"\u0001\u0000\u0000\u0000*\u011d\u0001\u0000\u0000\u0000,\u0122\u0001\u0000"+
		"\u0000\u0000.\u0126\u0001\u0000\u0000\u00000\u0128\u0001\u0000\u0000\u0000"+
		"2\u012c\u0001\u0000\u0000\u00004\u0130\u0001\u0000\u0000\u00006\u0134"+
		"\u0001\u0000\u0000\u00008\u0138\u0001\u0000\u0000\u0000:\u013a\u0001\u0000"+
		"\u0000\u0000<\u013d\u0001\u0000\u0000\u0000>\u0152\u0001\u0000\u0000\u0000"+
		"@\u0154\u0001\u0000\u0000\u0000B\u016a\u0001\u0000\u0000\u0000D\u0172"+
		"\u0001\u0000\u0000\u0000F\u0174\u0001\u0000\u0000\u0000H\u018a\u0001\u0000"+
		"\u0000\u0000J\u0192\u0001\u0000\u0000\u0000L\u019a\u0001\u0000\u0000\u0000"+
		"N\u019c\u0001\u0000\u0000\u0000P\u01a4\u0001\u0000\u0000\u0000R\u01b1"+
		"\u0001\u0000\u0000\u0000T\u01c1\u0001\u0000\u0000\u0000V\u01c6\u0001\u0000"+
		"\u0000\u0000X\u01cb\u0001\u0000\u0000\u0000Z\u01cd\u0001\u0000\u0000\u0000"+
		"\\\u01d2\u0001\u0000\u0000\u0000^\u01d4\u0001\u0000\u0000\u0000`\u01e5"+
		"\u0001\u0000\u0000\u0000b\u01ef\u0001\u0000\u0000\u0000d\u0205\u0001\u0000"+
		"\u0000\u0000f\u0214\u0001\u0000\u0000\u0000h\u021d\u0001\u0000\u0000\u0000"+
		"j\u0223\u0001\u0000\u0000\u0000l\u022b\u0001\u0000\u0000\u0000n\u0231"+
		"\u0001\u0000\u0000\u0000p\u0233\u0001\u0000\u0000\u0000r\u0237\u0001\u0000"+
		"\u0000\u0000t\u0239\u0001\u0000\u0000\u0000v\u0246\u0001\u0000\u0000\u0000"+
		"x{\u0003\u0002\u0001\u0000y{\u0003\u0006\u0003\u0000zx\u0001\u0000\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0003v;\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0000\u0000\u0001\u0084\u0001\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\r\u0000\u0000\u0086\u0087\u0005="+
		"\u0000\u0000\u0087\u0089\u0003^/\u0000\u0088\u008a\u0003$\u0012\u0000"+
		"\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u008d\u0003\u001c\u000e\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u0003\u0001\u0000\u0000\u0000\u008e\u008f\u0003l6\u0000\u008f\u0090"+
		"\u0003p8\u0000\u0090\u0091\u0005-\u0000\u0000\u0091\u0092\u0003n7\u0000"+
		"\u0092\u0005\u0001\u0000\u0000\u0000\u0093\u0097\u0003\n\u0005\u0000\u0094"+
		"\u0097\u0003\u0016\u000b\u0000\u0095\u0097\u0003\u0018\f\u0000\u0096\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u0007\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0005=\u0000\u0000\u0099\u009b\u0005-\u0000\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0003$\u0012\u0000\u009d\t\u0001\u0000\u0000"+
		"\u0000\u009e\u00aa\u0005\u0004\u0000\u0000\u009f\u00ab\u0003\f\u0006\u0000"+
		"\u00a0\u00a6\u00053\u0000\u0000\u00a1\u00a2\u0003\f\u0006\u0000\u00a2"+
		"\u00a3\u0003v;\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005"+
		"4\u0000\u0000\u00aa\u009f\u0001\u0000\u0000\u0000\u00aa\u00a0\u0001\u0000"+
		"\u0000\u0000\u00ab\u000b\u0001\u0000\u0000\u0000\u00ac\u00b2\u0003\u0010"+
		"\b\u0000\u00ad\u00af\u0003$\u0012\u0000\u00ae\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005-\u0000\u0000\u00b1\u00b3\u0003\u0012\t\u0000"+
		"\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\r\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005=\u0000\u0000\u00b5"+
		"\u00b6\u00052\u0000\u0000\u00b6\u00b7\u0003n7\u0000\u00b7\u000f\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bd\u0005=\u0000\u0000\u00b9\u00ba\u00059\u0000"+
		"\u0000\u00ba\u00bc\u0005=\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u0011\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c5\u0003b1\u0000\u00c1\u00c2"+
		"\u00059\u0000\u0000\u00c2\u00c4\u0003b1\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u0013\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005=\u0000"+
		"\u0000\u00c9\u00ca\u0003t:\u0000\u00ca\u0015\u0001\u0000\u0000\u0000\u00cb"+
		"\u00d7\u0005\u001a\u0000\u0000\u00cc\u00d8\u0003\b\u0004\u0000\u00cd\u00d3"+
		"\u00053\u0000\u0000\u00ce\u00cf\u0003\b\u0004\u0000\u00cf\u00d0\u0003"+
		"v;\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8\u00054\u0000\u0000"+
		"\u00d7\u00cc\u0001\u0000\u0000\u0000\u00d7\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d8\u0017\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u001b\u0000\u0000"+
		"\u00da\u00db\u0003\u001a\r\u0000\u00db\u0019\u0001\u0000\u0000\u0000\u00dc"+
		"\u00e9\u0003\u0010\b\u0000\u00dd\u00e0\u0003V+\u0000\u00de\u00df\u0005"+
		"-\u0000\u0000\u00df\u00e1\u0003\u0012\t\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e5\u0003$\u0012\u0000\u00e3\u00e4\u0005-\u0000\u0000"+
		"\u00e4\u00e6\u0003\u0012\t\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00ea\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005-\u0000\u0000\u00e8\u00ea\u0003\u0012\t\u0000\u00e9\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e2\u0001\u0000\u0000\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ea\u001b\u0001\u0000\u0000\u0000\u00eb\u00ed"+
		"\u00057\u0000\u0000\u00ec\u00ee\u0003\u001e\u000f\u0000\u00ed\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u00058\u0000\u0000\u00f0\u001d\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f3\u0005;\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f6\u0003 \u0010\u0000\u00f5\u00f7\u0005;\u0000\u0000\u00f6"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f2\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u001f\u0001\u0000\u0000\u0000\u00fc"+
		"\u0108\u0003\u0006\u0003\u0000\u00fd\u0108\u00030\u0018\u0000\u00fe\u0108"+
		"\u0003\"\u0011\u0000\u00ff\u0108\u00032\u0019\u0000\u0100\u0108\u0005"+
		"\u0001\u0000\u0000\u0101\u0108\u0005\u0005\u0000\u0000\u0102\u0108\u0003"+
		"8\u001c\u0000\u0103\u0108\u0003\u001c\u000e\u0000\u0104\u0108\u0003<\u001e"+
		"\u0000\u0105\u0108\u0003>\u001f\u0000\u0106\u0108\u0003P(\u0000\u0107"+
		"\u00fc\u0001\u0000\u0000\u0000\u0107\u00fd\u0001\u0000\u0000\u0000\u0107"+
		"\u00fe\u0001\u0000\u0000\u0000\u0107\u00ff\u0001\u0000\u0000\u0000\u0107"+
		"\u0100\u0001\u0000\u0000\u0000\u0107\u0101\u0001\u0000\u0000\u0000\u0107"+
		"\u0102\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0107"+
		"\u0104\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0106\u0001\u0000\u0000\u0000\u0108!\u0001\u0000\u0000\u0000\u0109\u010f"+
		"\u0003\u0004\u0002\u0000\u010a\u010f\u0003(\u0014\u0000\u010b\u010f\u0003"+
		"\u000e\u0007\u0000\u010c\u010f\u0003*\u0015\u0000\u010d\u010f\u0003&\u0013"+
		"\u0000\u010e\u0109\u0001\u0000\u0000\u0000\u010e\u010a\u0001\u0000\u0000"+
		"\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f#\u0001\u0000\u0000\u0000"+
		"\u0110\u0117\u0005=\u0000\u0000\u0111\u0117\u0003j5\u0000\u0112\u0113"+
		"\u00053\u0000\u0000\u0113\u0114\u0003$\u0012\u0000\u0114\u0115\u00054"+
		"\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0110\u0001\u0000"+
		"\u0000\u0000\u0116\u0111\u0001\u0000\u0000\u0000\u0116\u0112\u0001\u0000"+
		"\u0000\u0000\u0117%\u0001\u0000\u0000\u0000\u0118\u0119\u0003b1\u0000"+
		"\u0119\'\u0001\u0000\u0000\u0000\u011a\u011b\u0003b1\u0000\u011b\u011c"+
		"\u0007\u0000\u0000\u0000\u011c)\u0001\u0000\u0000\u0000\u011d\u011e\u0003"+
		"\u0012\t\u0000\u011e\u011f\u0003,\u0016\u0000\u011f\u0120\u0003\u0012"+
		"\t\u0000\u0120+\u0001\u0000\u0000\u0000\u0121\u0123\u0007\u0001\u0000"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0007\u0002\u0000"+
		"\u0000\u0125-\u0001\u0000\u0000\u0000\u0126\u0127\u0005;\u0000\u0000\u0127"+
		"/\u0001\u0000\u0000\u0000\u0128\u0129\u0005=\u0000\u0000\u0129\u012a\u0005"+
		"<\u0000\u0000\u012a\u012b\u0003 \u0010\u0000\u012b1\u0001\u0000\u0000"+
		"\u0000\u012c\u012e\u0005\u0016\u0000\u0000\u012d\u012f\u0003\u0012\t\u0000"+
		"\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f3\u0001\u0000\u0000\u0000\u0130\u0132\u0005\u0001\u0000\u0000\u0131"+
		"\u0133\u0005=\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0001\u0000\u0000\u0000\u01335\u0001\u0000\u0000\u0000\u0134\u0136\u0005"+
		"\u0005\u0000\u0000\u0135\u0137\u0005=\u0000\u0000\u0136\u0135\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u01377\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005\u000b\u0000\u0000\u01399\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0005\u0007\u0000\u0000\u013b\u013c\u0003b1\u0000\u013c;"+
		"\u0001\u0000\u0000\u0000\u013d\u0146\u0005\u0010\u0000\u0000\u013e\u0147"+
		"\u0003b1\u0000\u013f\u0140\u0003v;\u0000\u0140\u0141\u0003b1\u0000\u0141"+
		"\u0147\u0001\u0000\u0000\u0000\u0142\u0143\u0003\"\u0011\u0000\u0143\u0144"+
		"\u0003v;\u0000\u0144\u0145\u0003b1\u0000\u0145\u0147\u0001\u0000\u0000"+
		"\u0000\u0146\u013e\u0001\u0000\u0000\u0000\u0146\u013f\u0001\u0000\u0000"+
		"\u0000\u0146\u0142\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148\u014e\u0003\u001c\u000e\u0000\u0149\u014c\u0005\b\u0000\u0000"+
		"\u014a\u014d\u0003<\u001e\u0000\u014b\u014d\u0003\u001c\u000e\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d"+
		"\u014f\u0001\u0000\u0000\u0000\u014e\u0149\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0001\u0000\u0000\u0000\u014f=\u0001\u0000\u0000\u0000\u0150\u0153"+
		"\u0003@ \u0000\u0151\u0153\u0003F#\u0000\u0152\u0150\u0001\u0000\u0000"+
		"\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153?\u0001\u0000\u0000\u0000"+
		"\u0154\u015f\u0005\u0019\u0000\u0000\u0155\u0157\u0003b1\u0000\u0156\u0155"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0160"+
		"\u0001\u0000\u0000\u0000\u0158\u015a\u0003\"\u0011\u0000\u0159\u0158\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0001"+
		"\u0000\u0000\u0000\u015b\u015d\u0003v;\u0000\u015c\u015e\u0003b1\u0000"+
		"\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u0156\u0001\u0000\u0000\u0000"+
		"\u015f\u0159\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161\u0165\u00057\u0000\u0000\u0162\u0164\u0003B!\u0000\u0163\u0162"+
		"\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u0169"+
		"\u00058\u0000\u0000\u0169A\u0001\u0000\u0000\u0000\u016a\u016b\u0003D"+
		"\"\u0000\u016b\u016d\u0005<\u0000\u0000\u016c\u016e\u0003\u001e\u000f"+
		"\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016eC\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u0002\u0000\u0000"+
		"\u0170\u0173\u0003\u0012\t\u0000\u0171\u0173\u0005\u0006\u0000\u0000\u0172"+
		"\u016f\u0001\u0000\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173"+
		"E\u0001\u0000\u0000\u0000\u0174\u017d\u0005\u0019\u0000\u0000\u0175\u017e"+
		"\u0003H$\u0000\u0176\u0177\u0003v;\u0000\u0177\u0178\u0003H$\u0000\u0178"+
		"\u017e\u0001\u0000\u0000\u0000\u0179\u017a\u0003\"\u0011\u0000\u017a\u017b"+
		"\u0003v;\u0000\u017b\u017c\u0003H$\u0000\u017c\u017e\u0001\u0000\u0000"+
		"\u0000\u017d\u0175\u0001\u0000\u0000\u0000\u017d\u0176\u0001\u0000\u0000"+
		"\u0000\u017d\u0179\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000"+
		"\u0000\u017f\u0183\u00057\u0000\u0000\u0180\u0182\u0003J%\u0000\u0181"+
		"\u0180\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183"+
		"\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"\u0186\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u00058\u0000\u0000\u0187G\u0001\u0000\u0000\u0000\u0188\u0189\u0005"+
		"=\u0000\u0000\u0189\u018b\u0005-\u0000\u0000\u018a\u0188\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0003l6\u0000\u018d\u018e\u0005:\u0000\u0000\u018e"+
		"\u018f\u00053\u0000\u0000\u018f\u0190\u0005\u001a\u0000\u0000\u0190\u0191"+
		"\u00054\u0000\u0000\u0191I\u0001\u0000\u0000\u0000\u0192\u0193\u0003L"+
		"&\u0000\u0193\u0195\u0005<\u0000\u0000\u0194\u0196\u0003\u001e\u000f\u0000"+
		"\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000"+
		"\u0196K\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u0002\u0000\u0000\u0198"+
		"\u019b\u0003N\'\u0000\u0199\u019b\u0005\u0006\u0000\u0000\u019a\u0197"+
		"\u0001\u0000\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019bM\u0001"+
		"\u0000\u0000\u0000\u019c\u01a1\u0003$\u0012\u0000\u019d\u019e\u00059\u0000"+
		"\u0000\u019e\u01a0\u0003$\u0012\u0000\u019f\u019d\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2O\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a4\u01ac\u0005\f\u0000\u0000\u01a5\u01a7"+
		"\u0003b1\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a7\u01ad\u0001\u0000\u0000\u0000\u01a8\u01ad\u0003R)\u0000"+
		"\u01a9\u01ab\u0003T*\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01a6"+
		"\u0001\u0000\u0000\u0000\u01ac\u01a8\u0001\u0000\u0000\u0000\u01ac\u01aa"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0003\u001c\u000e\u0000\u01afQ\u0001\u0000\u0000\u0000\u01b0\u01b2\u0003"+
		"\"\u0011\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5\u0003v;\u0000"+
		"\u01b4\u01b6\u0003b1\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9"+
		"\u0003v;\u0000\u01b8\u01ba\u0003\"\u0011\u0000\u01b9\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01baS\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0003\u0012\t\u0000\u01bc\u01bd\u0005-\u0000\u0000"+
		"\u01bd\u01c2\u0001\u0000\u0000\u0000\u01be\u01bf\u0003\u0010\b\u0000\u01bf"+
		"\u01c0\u00052\u0000\u0000\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bb"+
		"\u0001\u0000\u0000\u0000\u01c1\u01be\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c4"+
		"\u0005\u0015\u0000\u0000\u01c4\u01c5\u0003b1\u0000\u01c5U\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c7\u00055\u0000\u0000\u01c7\u01c8\u0003X,\u0000"+
		"\u01c8\u01c9\u00056\u0000\u0000\u01c9\u01ca\u0003$\u0012\u0000\u01caW"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cc\u0003b1\u0000\u01ccY\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0005\r\u0000\u0000\u01ce\u01cf\u0003^/\u0000"+
		"\u01cf[\u0001\u0000\u0000\u0000\u01d0\u01d3\u0003^/\u0000\u01d1\u01d3"+
		"\u0003$\u0012\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d3]\u0001\u0000\u0000\u0000\u01d4\u01e0\u00053\u0000"+
		"\u0000\u01d5\u01da\u0003`0\u0000\u01d6\u01d7\u00059\u0000\u0000\u01d7"+
		"\u01d9\u0003`0\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001"+
		"\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001"+
		"\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001"+
		"\u0000\u0000\u0000\u01dd\u01df\u00059\u0000\u0000\u01de\u01dd\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e0\u01d5\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u00054\u0000"+
		"\u0000\u01e3_\u0001\u0000\u0000\u0000\u01e4\u01e6\u0005=\u0000\u0000\u01e5"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8\u0003$\u0012\u0000\u01e8a\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u00061\uffff\uffff\u0000\u01ea\u01f0\u0003"+
		"\u0014\n\u0000\u01eb\u01f0\u0003d2\u0000\u01ec\u01f0\u0003l6\u0000\u01ed"+
		"\u01ee\u0007\u0003\u0000\u0000\u01ee\u01f0\u0003b1\u0006\u01ef\u01e9\u0001"+
		"\u0000\u0000\u0000\u01ef\u01eb\u0001\u0000\u0000\u0000\u01ef\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u0202\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f2\n\u0005\u0000\u0000\u01f2\u01f3\u0007\u0004"+
		"\u0000\u0000\u01f3\u0201\u0003b1\u0006\u01f4\u01f5\n\u0004\u0000\u0000"+
		"\u01f5\u01f6\u0007\u0005\u0000\u0000\u01f6\u0201\u0003b1\u0005\u01f7\u01f8"+
		"\n\u0003\u0000\u0000\u01f8\u01f9\u0007\u0006\u0000\u0000\u01f9\u0201\u0003"+
		"b1\u0004\u01fa\u01fb\n\u0002\u0000\u0000\u01fb\u01fc\u0005&\u0000\u0000"+
		"\u01fc\u0201\u0003b1\u0003\u01fd\u01fe\n\u0001\u0000\u0000\u01fe\u01ff"+
		"\u0005\'\u0000\u0000\u01ff\u0201\u0003b1\u0002\u0200\u01f1\u0001\u0000"+
		"\u0000\u0000\u0200\u01f4\u0001\u0000\u0000\u0000\u0200\u01f7\u0001\u0000"+
		"\u0000\u0000\u0200\u01fa\u0001\u0000\u0000\u0000\u0200\u01fd\u0001\u0000"+
		"\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203c\u0001\u0000\u0000"+
		"\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0206\u00062\uffff\uffff"+
		"\u0000\u0206\u0207\u0003l6\u0000\u0207\u0211\u0001\u0000\u0000\u0000\u0208"+
		"\u020d\n\u0001\u0000\u0000\u0209\u020a\u0005:\u0000\u0000\u020a\u020e"+
		"\u0005=\u0000\u0000\u020b\u020e\u0003p8\u0000\u020c\u020e\u0003t:\u0000"+
		"\u020d\u0209\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000"+
		"\u020d\u020c\u0001\u0000\u0000\u0000\u020e\u0210\u0001\u0000\u0000\u0000"+
		"\u020f\u0208\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000"+
		"\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000"+
		"\u0212e\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214"+
		"\u0219\u0005=\u0000\u0000\u0215\u0216\u00059\u0000\u0000\u0216\u0218\u0005"+
		"=\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u021b\u0001\u0000"+
		"\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000"+
		"\u0000\u0000\u021ag\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000"+
		"\u0000\u021c\u021e\u0005\u001e\u0000\u0000\u021d\u021c\u0001\u0000\u0000"+
		"\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000"+
		"\u0000\u021f\u0220\u0005=\u0000\u0000\u0220i\u0001\u0000\u0000\u0000\u0221"+
		"\u0224\u0003V+\u0000\u0222\u0224\u0003Z-\u0000\u0223\u0221\u0001\u0000"+
		"\u0000\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0224k\u0001\u0000\u0000"+
		"\u0000\u0225\u022c\u0003n7\u0000\u0226\u022c\u0005=\u0000\u0000\u0227"+
		"\u0228\u00053\u0000\u0000\u0228\u0229\u0003b1\u0000\u0229\u022a\u0005"+
		"4\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b\u0225\u0001\u0000"+
		"\u0000\u0000\u022b\u0226\u0001\u0000\u0000\u0000\u022b\u0227\u0001\u0000"+
		"\u0000\u0000\u022cm\u0001\u0000\u0000\u0000\u022d\u0232\u0005?\u0000\u0000"+
		"\u022e\u0232\u0005@\u0000\u0000\u022f\u0232\u0005>\u0000\u0000\u0230\u0232"+
		"\u0003r9\u0000\u0231\u022d\u0001\u0000\u0000\u0000\u0231\u022e\u0001\u0000"+
		"\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0230\u0001\u0000"+
		"\u0000\u0000\u0232o\u0001\u0000\u0000\u0000\u0233\u0234\u00055\u0000\u0000"+
		"\u0234\u0235\u0003b1\u0000\u0235\u0236\u00056\u0000\u0000\u0236q\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0007\u0007\u0000\u0000\u0238s\u0001\u0000"+
		"\u0000\u0000\u0239\u0242\u00053\u0000\u0000\u023a\u023d\u0003\u0012\t"+
		"\u0000\u023b\u023c\u00059\u0000\u0000\u023c\u023e\u0003\u0012\t\u0000"+
		"\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000"+
		"\u023e\u0240\u0001\u0000\u0000\u0000\u023f\u0241\u00059\u0000\u0000\u0240"+
		"\u023f\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241"+
		"\u0243\u0001\u0000\u0000\u0000\u0242\u023a\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u00054\u0000\u0000\u0245u\u0001\u0000\u0000\u0000\u0246\u0247\u0007"+
		"\b\u0000\u0000\u0247w\u0001\u0000\u0000\u0000Fz\u0080\u0089\u008c\u0096"+
		"\u009a\u00a6\u00aa\u00ae\u00b2\u00bd\u00c5\u00d3\u00d7\u00e0\u00e5\u00e9"+
		"\u00ed\u00f2\u00f6\u00fa\u0107\u010e\u0116\u0122\u012e\u0132\u0136\u0146"+
		"\u014c\u014e\u0152\u0156\u0159\u015d\u015f\u0165\u016d\u0172\u017d\u0183"+
		"\u018a\u0195\u019a\u01a1\u01a6\u01aa\u01ac\u01b1\u01b5\u01b9\u01c1\u01d2"+
		"\u01da\u01de\u01e0\u01e5\u01ef\u0200\u0202\u020d\u0211\u0219\u021d\u0223"+
		"\u022b\u0231\u023d\u0240\u0242";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}