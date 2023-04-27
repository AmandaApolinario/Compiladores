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
public class scannerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDList=1, BREAK=2, CASE=3, CHAN=4, CONST=5, CONTINUE=6, DEFAULT=7, DEFER=8, 
		ELSE=9, FALLTHROUGH=10, FOR=11, FUNC=12, GO=13, GOTO=14, IF=15, IMPORT=16, 
		INTERFACE=17, MAP=18, PACKAGE=19, RANGE=20, RETURN=21, SELECT=22, STRUCT=23, 
		SWITCH=24, TYPE=25, VAR=26, FLOAT32=27, FLOAT64=28, STRING=29, TRUE=30, 
		FALSE=31, PLUS=32, MINUS=33, TIMES=34, OVER=35, MOD=36, PLUSEQ=37, MINUSEQ=38, 
		TIMESEQ=39, OVEREQ=40, MODEQ=41, AND=42, OR=43, PLUSONE=44, MINUSONE=45, 
		ISEQUAL=46, LESSTHAN=47, MORETHAN=48, EQUAL=49, NOT=50, NOTEQUAL=51, LESSEQTHAN=52, 
		MOREEQTHAN=53, ASSIGN=54, LPAR=55, RPAR=56, LBRACK=57, RBRACK=58, LCURLYBRACES=59, 
		RCURLYBRACES=60, COMMA=61, DOT=62, SEMI=63, COLON=64, ID=65, REAL_VAL=66, 
		INT_VAL=67, STR_VAL=68, COMMENT=69, BLOCK_COMMENT=70, WHITESPACE=71, UNKNOWN=72;
	public static final int
		RULE_declaration = 0, RULE_constDecl = 1, RULE_constSpec = 2, RULE_expressionList = 3, 
		RULE_typeDecl = 4, RULE_typeSpec = 5, RULE_functionDecl = 6, RULE_methodDecl = 7, 
		RULE_receiver = 8, RULE_varDecl = 9, RULE_varSpec = 10, RULE_block = 11, 
		RULE_statementList = 12, RULE_statement = 13, RULE_simpleStmt = 14, RULE_type_ = 15, 
		RULE_typeName = 16, RULE_qualifiedIdent = 17, RULE_expressionStmt = 18, 
		RULE_incDecStmt = 19, RULE_assignment = 20, RULE_assign_op = 21, RULE_emptyStmt = 22, 
		RULE_labeledStmt = 23, RULE_returnStmt = 24, RULE_breakStmt = 25, RULE_continueStmt = 26, 
		RULE_gotoStmt = 27, RULE_fallthroughStmt = 28, RULE_deferStmt = 29, RULE_ifStmt = 30, 
		RULE_switchStmt = 31, RULE_exprSwitchStmt = 32, RULE_exprCaseClause = 33, 
		RULE_exprSwitchCase = 34, RULE_typeSwitchStmt = 35, RULE_typeSwitchGuard = 36, 
		RULE_typeCaseClause = 37, RULE_typeSwitchCase = 38, RULE_typeList = 39, 
		RULE_forStmt = 40, RULE_forClause = 41, RULE_rangeClause = 42, RULE_arrayType = 43, 
		RULE_arrayLength = 44, RULE_elementType = 45, RULE_methodSpec = 46, RULE_functionType = 47, 
		RULE_signature = 48, RULE_result = 49, RULE_parameters = 50, RULE_parameterDecl = 51, 
		RULE_expression = 52, RULE_identifierList = 53, RULE_embeddedField = 54, 
		RULE_typeLit = 55, RULE_operand = 56, RULE_eos = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"declaration", "constDecl", "constSpec", "expressionList", "typeDecl", 
			"typeSpec", "functionDecl", "methodDecl", "receiver", "varDecl", "varSpec", 
			"block", "statementList", "statement", "simpleStmt", "type_", "typeName", 
			"qualifiedIdent", "expressionStmt", "incDecStmt", "assignment", "assign_op", 
			"emptyStmt", "labeledStmt", "returnStmt", "breakStmt", "continueStmt", 
			"gotoStmt", "fallthroughStmt", "deferStmt", "ifStmt", "switchStmt", "exprSwitchStmt", 
			"exprCaseClause", "exprSwitchCase", "typeSwitchStmt", "typeSwitchGuard", 
			"typeCaseClause", "typeSwitchCase", "typeList", "forStmt", "forClause", 
			"rangeClause", "arrayType", "arrayLength", "elementType", "methodSpec", 
			"functionType", "signature", "result", "parameters", "parameterDecl", 
			"expression", "identifierList", "embeddedField", "typeLit", "operand", 
			"eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'break'", "'case'", "'chan'", "'const'", "'continue'", "'default'", 
			"'defer'", "'else'", "'fallthrough'", "'for'", "'func'", "'go'", "'goto'", 
			"'if'", null, "'interface'", "'map'", null, "'range'", "'return'", "'select'", 
			"'struct'", "'switch'", "'type'", "'var'", "'float32'", "'float64'", 
			"'string'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'&&'", "'||'", "'++'", "'--'", "'=='", 
			"'<'", "'>'", "'='", "'!'", "'!='", "'<='", "'>='", "':='", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "','", "'.'", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDList", "BREAK", "CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", 
			"DEFER", "ELSE", "FALLTHROUGH", "FOR", "FUNC", "GO", "GOTO", "IF", "IMPORT", 
			"INTERFACE", "MAP", "PACKAGE", "RANGE", "RETURN", "SELECT", "STRUCT", 
			"SWITCH", "TYPE", "VAR", "FLOAT32", "FLOAT64", "STRING", "TRUE", "FALSE", 
			"PLUS", "MINUS", "TIMES", "OVER", "MOD", "PLUSEQ", "MINUSEQ", "TIMESEQ", 
			"OVEREQ", "MODEQ", "AND", "OR", "PLUSONE", "MINUSONE", "ISEQUAL", "LESSTHAN", 
			"MORETHAN", "EQUAL", "NOT", "NOTEQUAL", "LESSEQTHAN", "MOREEQTHAN", "ASSIGN", 
			"LPAR", "RPAR", "LBRACK", "RBRACK", "LCURLYBRACES", "RCURLYBRACES", "COMMA", 
			"DOT", "SEMI", "COLON", "ID", "REAL_VAL", "INT_VAL", "STR_VAL", "COMMENT", 
			"BLOCK_COMMENT", "WHITESPACE", "UNKNOWN"
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

	public scannerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_declaration);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				constDecl();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				typeDecl();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				varDecl();
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
	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(scannerParser.CONST, 0); }
		public List<ConstSpecContext> constSpec() {
			return getRuleContexts(ConstSpecContext.class);
		}
		public ConstSpecContext constSpec(int i) {
			return getRuleContext(ConstSpecContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(scannerParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(scannerParser.RPAR, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(CONST);
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDList:
				{
				setState(122);
				constSpec();
				}
				break;
			case LPAR:
				{
				setState(123);
				match(LPAR);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDList) {
					{
					{
					setState(124);
					constSpec();
					setState(125);
					eos();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
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
		public TerminalNode IDList() { return getToken(scannerParser.IDList, 0); }
		public TerminalNode ASSIGN() { return getToken(scannerParser.ASSIGN, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterConstSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitConstSpec(this);
		}
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IDList);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 2051L) != 0) {
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR || _la==ID) {
					{
					setState(136);
					type_();
					}
				}

				setState(139);
				match(ASSIGN);
				setState(140);
				expressionList();
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(scannerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(scannerParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			expression(0);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				expression(0);
				}
				}
				setState(150);
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
	public static class TypeDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(scannerParser.TYPE, 0); }
		public List<TypeSpecContext> typeSpec() {
			return getRuleContexts(TypeSpecContext.class);
		}
		public TypeSpecContext typeSpec(int i) {
			return getRuleContext(TypeSpecContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(scannerParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(scannerParser.RPAR, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterTypeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitTypeDecl(this);
		}
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(TYPE);
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(152);
				typeSpec();
				}
				break;
			case LPAR:
				{
				setState(153);
				match(LPAR);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(154);
					typeSpec();
					setState(155);
					eos();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
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
	public static class TypeSpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(scannerParser.ASSIGN, 0); }
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitTypeSpec(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ID);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(166);
				match(ASSIGN);
				}
			}

			setState(169);
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
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(scannerParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(FUNC);
			setState(172);
			match(ID);
			{
			setState(173);
			signature();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLYBRACES) {
				{
				setState(174);
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
	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(scannerParser.FUNC, 0); }
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(FUNC);
			setState(178);
			receiver();
			setState(179);
			match(ID);
			{
			setState(180);
			signature();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLYBRACES) {
				{
				setState(181);
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
	public static class ReceiverContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(scannerParser.VAR, 0); }
		public List<VarSpecContext> varSpec() {
			return getRuleContexts(VarSpecContext.class);
		}
		public VarSpecContext varSpec(int i) {
			return getRuleContext(VarSpecContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(scannerParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(scannerParser.RPAR, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(VAR);
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDList:
				{
				setState(187);
				varSpec();
				}
				break;
			case LPAR:
				{
				setState(188);
				match(LPAR);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDList) {
					{
					{
					setState(189);
					varSpec();
					setState(190);
					eos();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
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
	public static class VarSpecContext extends ParserRuleContext {
		public TerminalNode IDList() { return getToken(scannerParser.IDList, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(scannerParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitVarSpec(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(IDList);
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case ID:
				{
				setState(201);
				type_();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(202);
					match(ASSIGN);
					setState(203);
					expressionList();
					}
				}

				}
				break;
			case ASSIGN:
				{
				setState(206);
				match(ASSIGN);
				setState(207);
				expressionList();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACES() { return getToken(scannerParser.LCURLYBRACES, 0); }
		public TerminalNode RCURLYBRACES() { return getToken(scannerParser.RCURLYBRACES, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LCURLYBRACES);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -6764125157787688167L) != 0) {
				{
				setState(211);
				statementList();
				}
			}

			setState(214);
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
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(scannerParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(scannerParser.SEMI, i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(216);
					match(SEMI);
					}
				}

				}
				setState(219);
				statement();
				setState(220);
				eos();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -6764125157787688167L) != 0 );
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
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				returnStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				breakStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				continueStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				fallthroughStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(233);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(234);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(235);
				switchStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(236);
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
		public IncDecStmtContext incDecStmt() {
			return getRuleContext(IncDecStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitSimpleStmt(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simpleStmt);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				incDecStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
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
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(scannerParser.LPAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode RPAR() { return getToken(scannerParser.RPAR, 0); }
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitType_(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_type_);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				typeName();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(LPAR);
				setState(246);
				type_();
				setState(247);
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
	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeName);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				qualifiedIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(ID);
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
	public static class QualifiedIdentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(scannerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(scannerParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(scannerParser.DOT, 0); }
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterQualifiedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitQualifiedIdent(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(ID);
			setState(256);
			match(DOT);
			setState(257);
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
	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitExpressionStmt(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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
		public TerminalNode PLUSONE() { return getToken(scannerParser.PLUSONE, 0); }
		public TerminalNode MINUSONE() { return getToken(scannerParser.MINUSONE, 0); }
		public IncDecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterIncDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitIncDecStmt(this);
		}
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			expression(0);
			setState(262);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			expressionList();
			setState(265);
			assign_op();
			setState(266);
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
		public TerminalNode ASSIGN() { return getToken(scannerParser.ASSIGN, 0); }
		public TerminalNode PLUS() { return getToken(scannerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(scannerParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(scannerParser.OR, 0); }
		public TerminalNode TIMES() { return getToken(scannerParser.TIMES, 0); }
		public TerminalNode OVER() { return getToken(scannerParser.OVER, 0); }
		public TerminalNode MOD() { return getToken(scannerParser.MOD, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8929237008384L) != 0) {
				{
				setState(268);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8929237008384L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(271);
			match(ASSIGN);
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
		public TerminalNode SEMI() { return getToken(scannerParser.SEMI, 0); }
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitEmptyStmt(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public TerminalNode COLON() { return getToken(scannerParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterLabeledStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitLabeledStmt(this);
		}
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_labeledStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ID);
			setState(276);
			match(COLON);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -9069968167001382119L) != 0) {
				{
				setState(277);
				statement();
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
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(scannerParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(RETURN);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
				{
				setState(281);
				expressionList();
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
	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(scannerParser.BREAK, 0); }
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitBreakStmt(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_breakStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(BREAK);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(285);
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
		public TerminalNode CONTINUE() { return getToken(scannerParser.CONTINUE, 0); }
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitContinueStmt(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(CONTINUE);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(289);
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
	public static class GotoStmtContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(scannerParser.GOTO, 0); }
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterGotoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitGotoStmt(this);
		}
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(GOTO);
			setState(293);
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
	public static class FallthroughStmtContext extends ParserRuleContext {
		public TerminalNode FALLTHROUGH() { return getToken(scannerParser.FALLTHROUGH, 0); }
		public FallthroughStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterFallthroughStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitFallthroughStmt(this);
		}
	}

	public final FallthroughStmtContext fallthroughStmt() throws RecognitionException {
		FallthroughStmtContext _localctx = new FallthroughStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		public TerminalNode DEFER() { return getToken(scannerParser.DEFER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeferStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterDeferStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitDeferStmt(this);
		}
	}

	public final DeferStmtContext deferStmt() throws RecognitionException {
		DeferStmtContext _localctx = new DeferStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(DEFER);
			setState(298);
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
		public TerminalNode IF() { return getToken(scannerParser.IF, 0); }
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
		public TerminalNode ELSE() { return getToken(scannerParser.ELSE, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(IF);
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(301);
				expression(0);
				}
				break;
			case 2:
				{
				setState(302);
				eos();
				setState(303);
				expression(0);
				}
				break;
			case 3:
				{
				setState(305);
				simpleStmt();
				setState(306);
				eos();
				setState(307);
				expression(0);
				}
				break;
			}
			setState(311);
			block();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(312);
				match(ELSE);
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(313);
					ifStmt();
					}
					break;
				case LCURLYBRACES:
					{
					setState(314);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitSwitchStmt(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switchStmt);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
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
		public TerminalNode SWITCH() { return getToken(scannerParser.SWITCH, 0); }
		public TerminalNode LCURLYBRACES() { return getToken(scannerParser.LCURLYBRACES, 0); }
		public TerminalNode RCURLYBRACES() { return getToken(scannerParser.RCURLYBRACES, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterExprSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitExprSwitchStmt(this);
		}
	}

	public final ExprSwitchStmtContext exprSwitchStmt() throws RecognitionException {
		ExprSwitchStmtContext _localctx = new ExprSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(SWITCH);
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
					{
					setState(324);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
					{
					setState(327);
					simpleStmt();
					}
				}

				setState(330);
				eos();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
					{
					setState(331);
					expression(0);
					}
				}

				}
				break;
			}
			setState(336);
			match(LCURLYBRACES);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(337);
				exprCaseClause();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
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
		public TerminalNode COLON() { return getToken(scannerParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExprCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterExprCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitExprCaseClause(this);
		}
	}

	public final ExprCaseClauseContext exprCaseClause() throws RecognitionException {
		ExprCaseClauseContext _localctx = new ExprCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exprCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			exprSwitchCase();
			setState(346);
			match(COLON);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -6764125157787688167L) != 0) {
				{
				setState(347);
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
		public TerminalNode CASE() { return getToken(scannerParser.CASE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(scannerParser.DEFAULT, 0); }
		public ExprSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterExprSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitExprSwitchCase(this);
		}
	}

	public final ExprSwitchCaseContext exprSwitchCase() throws RecognitionException {
		ExprSwitchCaseContext _localctx = new ExprSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_exprSwitchCase);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(CASE);
				setState(351);
				expressionList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
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
		public TerminalNode SWITCH() { return getToken(scannerParser.SWITCH, 0); }
		public TerminalNode LCURLYBRACES() { return getToken(scannerParser.LCURLYBRACES, 0); }
		public TerminalNode RCURLYBRACES() { return getToken(scannerParser.RCURLYBRACES, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterTypeSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitTypeSwitchStmt(this);
		}
	}

	public final TypeSwitchStmtContext typeSwitchStmt() throws RecognitionException {
		TypeSwitchStmtContext _localctx = new TypeSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(SWITCH);
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(356);
				typeSwitchGuard();
				}
				break;
			case 2:
				{
				setState(357);
				eos();
				setState(358);
				typeSwitchGuard();
				}
				break;
			case 3:
				{
				setState(360);
				simpleStmt();
				setState(361);
				eos();
				setState(362);
				typeSwitchGuard();
				}
				break;
			}
			setState(366);
			match(LCURLYBRACES);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(367);
				typeCaseClause();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
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
		public TerminalNode DOT() { return getToken(scannerParser.DOT, 0); }
		public TerminalNode LPAR() { return getToken(scannerParser.LPAR, 0); }
		public TerminalNode TYPE() { return getToken(scannerParser.TYPE, 0); }
		public TerminalNode RPAR() { return getToken(scannerParser.RPAR, 0); }
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(scannerParser.ASSIGN, 0); }
		public TypeSwitchGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterTypeSwitchGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitTypeSwitchGuard(this);
		}
	}

	public final TypeSwitchGuardContext typeSwitchGuard() throws RecognitionException {
		TypeSwitchGuardContext _localctx = new TypeSwitchGuardContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(375);
				match(ID);
				setState(376);
				match(ASSIGN);
				}
				break;
			}
			setState(379);
			operand();
			setState(380);
			match(DOT);
			setState(381);
			match(LPAR);
			setState(382);
			match(TYPE);
			setState(383);
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
		public TerminalNode COLON() { return getToken(scannerParser.COLON, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TypeCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterTypeCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitTypeCaseClause(this);
		}
	}

	public final TypeCaseClauseContext typeCaseClause() throws RecognitionException {
		TypeCaseClauseContext _localctx = new TypeCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			typeSwitchCase();
			setState(386);
			match(COLON);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -6764125157787688167L) != 0) {
				{
				setState(387);
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
		public TerminalNode CASE() { return getToken(scannerParser.CASE, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(scannerParser.DEFAULT, 0); }
		public TypeSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterTypeSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitTypeSwitchCase(this);
		}
	}

	public final TypeSwitchCaseContext typeSwitchCase() throws RecognitionException {
		TypeSwitchCaseContext _localctx = new TypeSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeSwitchCase);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(CASE);
				setState(391);
				typeList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
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
		public List<TerminalNode> COMMA() { return getTokens(scannerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(scannerParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitTypeList(this);
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
			setState(395);
			type_();
			}
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(396);
				match(COMMA);
				{
				setState(397);
				type_();
				}
				}
				}
				setState(402);
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
		public TerminalNode FOR() { return getToken(scannerParser.FOR, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitForStmt(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(FOR);
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
					{
					setState(404);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(407);
				forClause();
				}
				break;
			case 3:
				{
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 37154726991626242L) != 0 || _la==ID) {
					{
					setState(408);
					rangeClause();
					}
				}

				}
				break;
			}
			setState(413);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitForClause(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
				{
				setState(415);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
			}

			setState(418);
			eos();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
				{
				setState(419);
				expression(0);
				}
			}

			setState(422);
			eos();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
				{
				setState(423);
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
		public TerminalNode RANGE() { return getToken(scannerParser.RANGE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(scannerParser.ASSIGN, 0); }
		public TerminalNode IDList() { return getToken(scannerParser.IDList, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterRangeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitRangeClause(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case TIMES:
			case NOT:
			case LPAR:
			case ID:
				{
				setState(426);
				expressionList();
				setState(427);
				match(ASSIGN);
				}
				break;
			case IDList:
				{
				setState(429);
				match(IDList);
				setState(430);
				match(ASSIGN);
				}
				break;
			case RANGE:
				break;
			default:
				break;
			}
			setState(433);
			match(RANGE);
			setState(434);
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
		public TerminalNode LBRACK() { return getToken(scannerParser.LBRACK, 0); }
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(scannerParser.RBRACK, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(LBRACK);
			setState(437);
			arrayLength();
			setState(438);
			match(RBRACK);
			setState(439);
			elementType();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitArrayLength(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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
	public static class ElementTypeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ElementTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitElementType(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
	public static class MethodSpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterMethodSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitMethodSpec(this);
		}
	}

	public final MethodSpecContext methodSpec() throws RecognitionException {
		MethodSpecContext _localctx = new MethodSpecContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_methodSpec);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(ID);
				setState(446);
				parameters();
				setState(447);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(ID);
				setState(450);
				parameters();
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
	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(scannerParser.FUNC, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(FUNC);
			setState(454);
			signature();
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
	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitSignature(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_signature);
		try {
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				parameters();
				setState(457);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				parameters();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_result);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
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
		public TerminalNode LPAR() { return getToken(scannerParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(scannerParser.RPAR, 0); }
		public List<ParameterDeclContext> parameterDecl() {
			return getRuleContexts(ParameterDeclContext.class);
		}
		public ParameterDeclContext parameterDecl(int i) {
			return getRuleContext(ParameterDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(scannerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(scannerParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(LPAR);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDList || _la==LPAR || _la==ID) {
				{
				setState(467);
				parameterDecl();
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(468);
						match(COMMA);
						setState(469);
						parameterDecl();
						}
						} 
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(475);
					match(COMMA);
					}
				}

				}
			}

			setState(480);
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
		public TerminalNode IDList() { return getToken(scannerParser.IDList, 0); }
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitParameterDecl(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDList) {
				{
				setState(482);
				match(IDList);
				}
			}

			setState(485);
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
		public Token unary_op;
		public Token add_op;
		public Token rel_op;
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(scannerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(scannerParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(scannerParser.NOT, 0); }
		public TerminalNode TIMES() { return getToken(scannerParser.TIMES, 0); }
		public TerminalNode OR() { return getToken(scannerParser.OR, 0); }
		public TerminalNode ISEQUAL() { return getToken(scannerParser.ISEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(scannerParser.NOTEQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(scannerParser.LESSTHAN, 0); }
		public TerminalNode LESSEQTHAN() { return getToken(scannerParser.LESSEQTHAN, 0); }
		public TerminalNode MORETHAN() { return getToken(scannerParser.MORETHAN, 0); }
		public TerminalNode MOREEQTHAN() { return getToken(scannerParser.MOREEQTHAN, 0); }
		public TerminalNode AND() { return getToken(scannerParser.AND, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitExpression(this);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case ID:
				{
				setState(488);
				operand();
				}
				break;
			case PLUS:
			case MINUS:
			case TIMES:
			case NOT:
				{
				setState(489);
				((ExpressionContext)_localctx).unary_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1125929971613696L) != 0) ) {
					((ExpressionContext)_localctx).unary_op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(490);
				expression(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(505);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(493);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(494);
						((ExpressionContext)_localctx).add_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8808977924096L) != 0) ) {
							((ExpressionContext)_localctx).add_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(495);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(496);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(497);
						((ExpressionContext)_localctx).rel_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 16255179905040384L) != 0) ) {
							((ExpressionContext)_localctx).rel_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(498);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(499);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(500);
						match(AND);
						setState(501);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(502);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(503);
						match(OR);
						setState(504);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		public List<TerminalNode> ID() { return getTokens(scannerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(scannerParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(scannerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(scannerParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(ID);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(511);
				match(COMMA);
				setState(512);
				match(ID);
				}
				}
				setState(517);
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
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(scannerParser.TIMES, 0); }
		public EmbeddedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embeddedField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterEmbeddedField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitEmbeddedField(this);
		}
	}

	public final EmbeddedFieldContext embeddedField() throws RecognitionException {
		EmbeddedFieldContext _localctx = new EmbeddedFieldContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_embeddedField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES) {
				{
				setState(518);
				match(TIMES);
				}
			}

			setState(521);
			typeName();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterTypeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitTypeLit(this);
		}
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeLit);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				arrayType();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
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
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(scannerParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(scannerParser.RPAR, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_operand);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(ID);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				match(LPAR);
				setState(529);
				expression(0);
				setState(530);
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
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(scannerParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(scannerParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof scannerListener ) ((scannerListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SEMI) ) {
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
		case 52:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u0219\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000x\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u0080\b\u0001\n\u0001\f\u0001\u0083"+
		"\t\u0001\u0001\u0001\u0003\u0001\u0086\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u008a\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008e\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0093\b\u0003\n"+
		"\u0003\f\u0003\u0096\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u009e\b\u0004\n\u0004\f\u0004"+
		"\u00a1\t\u0004\u0001\u0004\u0003\u0004\u00a4\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00a8\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b0\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b7\b\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00c1"+
		"\b\t\n\t\f\t\u00c4\t\t\u0001\t\u0003\t\u00c7\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00cd\b\n\u0001\n\u0001\n\u0003\n\u00d1\b\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00d5\b\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0003\f\u00da\b\f\u0001\f\u0001\f\u0001\f\u0004\f\u00df\b\f\u000b\f\f"+
		"\f\u00e0\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ee\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00f3\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00fa\b\u000f\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00fe\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u010e\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0117\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u011b"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u011f\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0123\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0136\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u013c\b\u001e\u0003\u001e\u013e\b"+
		"\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0142\b\u001f\u0001 \u0001"+
		" \u0003 \u0146\b \u0001 \u0003 \u0149\b \u0001 \u0001 \u0003 \u014d\b"+
		" \u0003 \u014f\b \u0001 \u0001 \u0005 \u0153\b \n \f \u0156\t \u0001 "+
		"\u0001 \u0001!\u0001!\u0001!\u0003!\u015d\b!\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u0162\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u016d\b#\u0001#\u0001#\u0005#\u0171\b#\n#\f#\u0174\t#\u0001#"+
		"\u0001#\u0001$\u0001$\u0003$\u017a\b$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0003%\u0185\b%\u0001&\u0001&\u0001&\u0003"+
		"&\u018a\b&\u0001\'\u0001\'\u0001\'\u0005\'\u018f\b\'\n\'\f\'\u0192\t\'"+
		"\u0001(\u0001(\u0003(\u0196\b(\u0001(\u0001(\u0003(\u019a\b(\u0003(\u019c"+
		"\b(\u0001(\u0001(\u0001)\u0003)\u01a1\b)\u0001)\u0001)\u0003)\u01a5\b"+
		")\u0001)\u0001)\u0003)\u01a9\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u01b0\b*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u01c4\b.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00030\u01cd"+
		"\b0\u00011\u00011\u00031\u01d1\b1\u00012\u00012\u00012\u00012\u00052\u01d7"+
		"\b2\n2\f2\u01da\t2\u00012\u00032\u01dd\b2\u00032\u01df\b2\u00012\u0001"+
		"2\u00013\u00033\u01e4\b3\u00013\u00013\u00014\u00014\u00014\u00014\u0003"+
		"4\u01ec\b4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00054\u01fa\b4\n4\f4\u01fd\t4\u00015\u00015\u0001"+
		"5\u00055\u0202\b5\n5\f5\u0205\t5\u00016\u00036\u0208\b6\u00016\u00016"+
		"\u00017\u00017\u00037\u020e\b7\u00018\u00018\u00018\u00018\u00018\u0003"+
		"8\u0215\b8\u00019\u00019\u00019\u0000\u0001h:\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\u0000\u0006\u0001\u0000,-\u0002\u0000"+
		" $++\u0002\u0000 \"22\u0002\u0000 !++\u0002\u0000.035\u0001\u0001??\u0230"+
		"\u0000w\u0001\u0000\u0000\u0000\u0002y\u0001\u0000\u0000\u0000\u0004\u0087"+
		"\u0001\u0000\u0000\u0000\u0006\u008f\u0001\u0000\u0000\u0000\b\u0097\u0001"+
		"\u0000\u0000\u0000\n\u00a5\u0001\u0000\u0000\u0000\f\u00ab\u0001\u0000"+
		"\u0000\u0000\u000e\u00b1\u0001\u0000\u0000\u0000\u0010\u00b8\u0001\u0000"+
		"\u0000\u0000\u0012\u00ba\u0001\u0000\u0000\u0000\u0014\u00c8\u0001\u0000"+
		"\u0000\u0000\u0016\u00d2\u0001\u0000\u0000\u0000\u0018\u00de\u0001\u0000"+
		"\u0000\u0000\u001a\u00ed\u0001\u0000\u0000\u0000\u001c\u00f2\u0001\u0000"+
		"\u0000\u0000\u001e\u00f9\u0001\u0000\u0000\u0000 \u00fd\u0001\u0000\u0000"+
		"\u0000\"\u00ff\u0001\u0000\u0000\u0000$\u0103\u0001\u0000\u0000\u0000"+
		"&\u0105\u0001\u0000\u0000\u0000(\u0108\u0001\u0000\u0000\u0000*\u010d"+
		"\u0001\u0000\u0000\u0000,\u0111\u0001\u0000\u0000\u0000.\u0113\u0001\u0000"+
		"\u0000\u00000\u0118\u0001\u0000\u0000\u00002\u011c\u0001\u0000\u0000\u0000"+
		"4\u0120\u0001\u0000\u0000\u00006\u0124\u0001\u0000\u0000\u00008\u0127"+
		"\u0001\u0000\u0000\u0000:\u0129\u0001\u0000\u0000\u0000<\u012c\u0001\u0000"+
		"\u0000\u0000>\u0141\u0001\u0000\u0000\u0000@\u0143\u0001\u0000\u0000\u0000"+
		"B\u0159\u0001\u0000\u0000\u0000D\u0161\u0001\u0000\u0000\u0000F\u0163"+
		"\u0001\u0000\u0000\u0000H\u0179\u0001\u0000\u0000\u0000J\u0181\u0001\u0000"+
		"\u0000\u0000L\u0189\u0001\u0000\u0000\u0000N\u018b\u0001\u0000\u0000\u0000"+
		"P\u0193\u0001\u0000\u0000\u0000R\u01a0\u0001\u0000\u0000\u0000T\u01af"+
		"\u0001\u0000\u0000\u0000V\u01b4\u0001\u0000\u0000\u0000X\u01b9\u0001\u0000"+
		"\u0000\u0000Z\u01bb\u0001\u0000\u0000\u0000\\\u01c3\u0001\u0000\u0000"+
		"\u0000^\u01c5\u0001\u0000\u0000\u0000`\u01cc\u0001\u0000\u0000\u0000b"+
		"\u01d0\u0001\u0000\u0000\u0000d\u01d2\u0001\u0000\u0000\u0000f\u01e3\u0001"+
		"\u0000\u0000\u0000h\u01eb\u0001\u0000\u0000\u0000j\u01fe\u0001\u0000\u0000"+
		"\u0000l\u0207\u0001\u0000\u0000\u0000n\u020d\u0001\u0000\u0000\u0000p"+
		"\u0214\u0001\u0000\u0000\u0000r\u0216\u0001\u0000\u0000\u0000tx\u0003"+
		"\u0002\u0001\u0000ux\u0003\b\u0004\u0000vx\u0003\u0012\t\u0000wt\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x\u0001\u0001\u0000\u0000\u0000y\u0085\u0005\u0005\u0000\u0000z\u0086"+
		"\u0003\u0004\u0002\u0000{\u0081\u00057\u0000\u0000|}\u0003\u0004\u0002"+
		"\u0000}~\u0003r9\u0000~\u0080\u0001\u0000\u0000\u0000\u007f|\u0001\u0000"+
		"\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0086\u00058\u0000"+
		"\u0000\u0085z\u0001\u0000\u0000\u0000\u0085{\u0001\u0000\u0000\u0000\u0086"+
		"\u0003\u0001\u0000\u0000\u0000\u0087\u008d\u0005\u0001\u0000\u0000\u0088"+
		"\u008a\u0003\u001e\u000f\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u00056\u0000\u0000\u008c\u008e\u0003\u0006\u0003\u0000\u008d\u0089"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0005"+
		"\u0001\u0000\u0000\u0000\u008f\u0094\u0003h4\u0000\u0090\u0091\u0005="+
		"\u0000\u0000\u0091\u0093\u0003h4\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0007\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u00a3\u0005\u0019\u0000\u0000"+
		"\u0098\u00a4\u0003\n\u0005\u0000\u0099\u009f\u00057\u0000\u0000\u009a"+
		"\u009b\u0003\n\u0005\u0000\u009b\u009c\u0003r9\u0000\u009c\u009e\u0001"+
		"\u0000\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009e\u00a1\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a4\u00058\u0000\u0000\u00a3\u0098\u0001\u0000"+
		"\u0000\u0000\u00a3\u0099\u0001\u0000\u0000\u0000\u00a4\t\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0005A\u0000\u0000\u00a6\u00a8\u00056\u0000\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003\u001e\u000f\u0000\u00aa"+
		"\u000b\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\f\u0000\u0000\u00ac\u00ad"+
		"\u0005A\u0000\u0000\u00ad\u00af\u0003`0\u0000\u00ae\u00b0\u0003\u0016"+
		"\u000b\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\r\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\f\u0000"+
		"\u0000\u00b2\u00b3\u0003\u0010\b\u0000\u00b3\u00b4\u0005A\u0000\u0000"+
		"\u00b4\u00b6\u0003`0\u0000\u00b5\u00b7\u0003\u0016\u000b\u0000\u00b6\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u000f"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003d2\u0000\u00b9\u0011\u0001\u0000"+
		"\u0000\u0000\u00ba\u00c6\u0005\u001a\u0000\u0000\u00bb\u00c7\u0003\u0014"+
		"\n\u0000\u00bc\u00c2\u00057\u0000\u0000\u00bd\u00be\u0003\u0014\n\u0000"+
		"\u00be\u00bf\u0003r9\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c7"+
		"\u00058\u0000\u0000\u00c6\u00bb\u0001\u0000\u0000\u0000\u00c6\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c7\u0013\u0001\u0000\u0000\u0000\u00c8\u00d0\u0005"+
		"\u0001\u0000\u0000\u00c9\u00cc\u0003\u001e\u000f\u0000\u00ca\u00cb\u0005"+
		"6\u0000\u0000\u00cb\u00cd\u0003\u0006\u0003\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d1\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u00056\u0000\u0000\u00cf\u00d1\u0003\u0006\u0003"+
		"\u0000\u00d0\u00c9\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d1\u0015\u0001\u0000\u0000\u0000\u00d2\u00d4\u0005;\u0000\u0000"+
		"\u00d3\u00d5\u0003\u0018\f\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005<\u0000\u0000\u00d7\u0017\u0001\u0000\u0000\u0000\u00d8\u00da"+
		"\u0005?\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0003"+
		"\u001a\r\u0000\u00dc\u00dd\u0003r9\u0000\u00dd\u00df\u0001\u0000\u0000"+
		"\u0000\u00de\u00d9\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u0019\u0001\u0000\u0000\u0000\u00e2\u00ee\u0003\u0000\u0000"+
		"\u0000\u00e3\u00ee\u0003.\u0017\u0000\u00e4\u00ee\u0003\u001c\u000e\u0000"+
		"\u00e5\u00ee\u00030\u0018\u0000\u00e6\u00ee\u00032\u0019\u0000\u00e7\u00ee"+
		"\u00034\u001a\u0000\u00e8\u00ee\u00038\u001c\u0000\u00e9\u00ee\u0003\u0016"+
		"\u000b\u0000\u00ea\u00ee\u0003<\u001e\u0000\u00eb\u00ee\u0003>\u001f\u0000"+
		"\u00ec\u00ee\u0003P(\u0000\u00ed\u00e2\u0001\u0000\u0000\u0000\u00ed\u00e3"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e4\u0001\u0000\u0000\u0000\u00ed\u00e5"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e6\u0001\u0000\u0000\u0000\u00ed\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ed\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u001b"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f3\u0003&\u0013\u0000\u00f0\u00f3\u0003"+
		"(\u0014\u0000\u00f1\u00f3\u0003$\u0012\u0000\u00f2\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u001d\u0001\u0000\u0000\u0000\u00f4\u00fa\u0003 \u0010\u0000"+
		"\u00f5\u00f6\u00057\u0000\u0000\u00f6\u00f7\u0003\u001e\u000f\u0000\u00f7"+
		"\u00f8\u00058\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00fa\u001f"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fe\u0003\"\u0011\u0000\u00fc\u00fe\u0005"+
		"A\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe!\u0001\u0000\u0000\u0000\u00ff\u0100\u0005A\u0000\u0000"+
		"\u0100\u0101\u0005>\u0000\u0000\u0101\u0102\u0005A\u0000\u0000\u0102#"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0003h4\u0000\u0104%\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0003h4\u0000\u0106\u0107\u0007\u0000\u0000\u0000"+
		"\u0107\'\u0001\u0000\u0000\u0000\u0108\u0109\u0003\u0006\u0003\u0000\u0109"+
		"\u010a\u0003*\u0015\u0000\u010a\u010b\u0003\u0006\u0003\u0000\u010b)\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u0007\u0001\u0000\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u00056\u0000\u0000\u0110+\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005?\u0000\u0000\u0112-\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0005A\u0000\u0000\u0114\u0116\u0005@\u0000\u0000\u0115\u0117\u0003"+
		"\u001a\r\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000"+
		"\u0000\u0000\u0117/\u0001\u0000\u0000\u0000\u0118\u011a\u0005\u0015\u0000"+
		"\u0000\u0119\u011b\u0003\u0006\u0003\u0000\u011a\u0119\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b1\u0001\u0000\u0000\u0000"+
		"\u011c\u011e\u0005\u0002\u0000\u0000\u011d\u011f\u0005A\u0000\u0000\u011e"+
		"\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"3\u0001\u0000\u0000\u0000\u0120\u0122\u0005\u0006\u0000\u0000\u0121\u0123"+
		"\u0005A\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001"+
		"\u0000\u0000\u0000\u01235\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u000e"+
		"\u0000\u0000\u0125\u0126\u0005A\u0000\u0000\u01267\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0005\n\u0000\u0000\u01289\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005\b\u0000\u0000\u012a\u012b\u0003h4\u0000\u012b;\u0001\u0000"+
		"\u0000\u0000\u012c\u0135\u0005\u000f\u0000\u0000\u012d\u0136\u0003h4\u0000"+
		"\u012e\u012f\u0003r9\u0000\u012f\u0130\u0003h4\u0000\u0130\u0136\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0003\u001c\u000e\u0000\u0132\u0133\u0003"+
		"r9\u0000\u0133\u0134\u0003h4\u0000\u0134\u0136\u0001\u0000\u0000\u0000"+
		"\u0135\u012d\u0001\u0000\u0000\u0000\u0135\u012e\u0001\u0000\u0000\u0000"+
		"\u0135\u0131\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u013d\u0003\u0016\u000b\u0000\u0138\u013b\u0005\t\u0000\u0000\u0139"+
		"\u013c\u0003<\u001e\u0000\u013a\u013c\u0003\u0016\u000b\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u013e"+
		"\u0001\u0000\u0000\u0000\u013d\u0138\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e=\u0001\u0000\u0000\u0000\u013f\u0142\u0003"+
		"@ \u0000\u0140\u0142\u0003F#\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0142?\u0001\u0000\u0000\u0000\u0143"+
		"\u014e\u0005\u0018\u0000\u0000\u0144\u0146\u0003h4\u0000\u0145\u0144\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u014f\u0001"+
		"\u0000\u0000\u0000\u0147\u0149\u0003\u001c\u000e\u0000\u0148\u0147\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001"+
		"\u0000\u0000\u0000\u014a\u014c\u0003r9\u0000\u014b\u014d\u0003h4\u0000"+
		"\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u0145\u0001\u0000\u0000\u0000"+
		"\u014e\u0148\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u0154\u0005;\u0000\u0000\u0151\u0153\u0003B!\u0000\u0152\u0151"+
		"\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0157"+
		"\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0005<\u0000\u0000\u0158A\u0001\u0000\u0000\u0000\u0159\u015a\u0003D"+
		"\"\u0000\u015a\u015c\u0005@\u0000\u0000\u015b\u015d\u0003\u0018\f\u0000"+
		"\u015c\u015b\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000"+
		"\u015dC\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0003\u0000\u0000\u015f"+
		"\u0162\u0003\u0006\u0003\u0000\u0160\u0162\u0005\u0007\u0000\u0000\u0161"+
		"\u015e\u0001\u0000\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162"+
		"E\u0001\u0000\u0000\u0000\u0163\u016c\u0005\u0018\u0000\u0000\u0164\u016d"+
		"\u0003H$\u0000\u0165\u0166\u0003r9\u0000\u0166\u0167\u0003H$\u0000\u0167"+
		"\u016d\u0001\u0000\u0000\u0000\u0168\u0169\u0003\u001c\u000e\u0000\u0169"+
		"\u016a\u0003r9\u0000\u016a\u016b\u0003H$\u0000\u016b\u016d\u0001\u0000"+
		"\u0000\u0000\u016c\u0164\u0001\u0000\u0000\u0000\u016c\u0165\u0001\u0000"+
		"\u0000\u0000\u016c\u0168\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u0172\u0005;\u0000\u0000\u016f\u0171\u0003J%\u0000"+
		"\u0170\u016f\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000"+
		"\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0005<\u0000\u0000\u0176G\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0005A\u0000\u0000\u0178\u017a\u00056\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0003p8\u0000\u017c\u017d\u0005>\u0000\u0000"+
		"\u017d\u017e\u00057\u0000\u0000\u017e\u017f\u0005\u0019\u0000\u0000\u017f"+
		"\u0180\u00058\u0000\u0000\u0180I\u0001\u0000\u0000\u0000\u0181\u0182\u0003"+
		"L&\u0000\u0182\u0184\u0005@\u0000\u0000\u0183\u0185\u0003\u0018\f\u0000"+
		"\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185K\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u0003\u0000\u0000\u0187"+
		"\u018a\u0003N\'\u0000\u0188\u018a\u0005\u0007\u0000\u0000\u0189\u0186"+
		"\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018aM\u0001"+
		"\u0000\u0000\u0000\u018b\u0190\u0003\u001e\u000f\u0000\u018c\u018d\u0005"+
		"=\u0000\u0000\u018d\u018f\u0003\u001e\u000f\u0000\u018e\u018c\u0001\u0000"+
		"\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191O\u0001\u0000\u0000"+
		"\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u019b\u0005\u000b\u0000"+
		"\u0000\u0194\u0196\u0003h4\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0001\u0000\u0000\u0000\u0196\u019c\u0001\u0000\u0000\u0000\u0197"+
		"\u019c\u0003R)\u0000\u0198\u019a\u0003T*\u0000\u0199\u0198\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c\u0001\u0000"+
		"\u0000\u0000\u019b\u0195\u0001\u0000\u0000\u0000\u019b\u0197\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0003\u0016\u000b\u0000\u019eQ\u0001\u0000\u0000"+
		"\u0000\u019f\u01a1\u0003\u001c\u000e\u0000\u01a0\u019f\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a4\u0003r9\u0000\u01a3\u01a5\u0003h4\u0000\u01a4\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a8\u0003r9\u0000\u01a7\u01a9\u0003\u001c"+
		"\u000e\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a9S\u0001\u0000\u0000\u0000\u01aa\u01ab\u0003\u0006\u0003"+
		"\u0000\u01ab\u01ac\u00056\u0000\u0000\u01ac\u01b0\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0005\u0001\u0000\u0000\u01ae\u01b0\u00056\u0000\u0000\u01af"+
		"\u01aa\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u0005\u0014\u0000\u0000\u01b2\u01b3\u0003h4\u0000\u01b3U\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u00059\u0000\u0000\u01b5\u01b6\u0003X,"+
		"\u0000\u01b6\u01b7\u0005:\u0000\u0000\u01b7\u01b8\u0003Z-\u0000\u01b8"+
		"W\u0001\u0000\u0000\u0000\u01b9\u01ba\u0003h4\u0000\u01baY\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0003\u001e\u000f\u0000\u01bc[\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0005A\u0000\u0000\u01be\u01bf\u0003d2\u0000\u01bf"+
		"\u01c0\u0003b1\u0000\u01c0\u01c4\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005"+
		"A\u0000\u0000\u01c2\u01c4\u0003d2\u0000\u01c3\u01bd\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4]\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c6\u0005\f\u0000\u0000\u01c6\u01c7\u0003`0\u0000\u01c7_\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0003d2\u0000\u01c9\u01ca\u0003b1\u0000"+
		"\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01cd\u0003d2\u0000\u01cc\u01c8"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cda\u0001"+
		"\u0000\u0000\u0000\u01ce\u01d1\u0003d2\u0000\u01cf\u01d1\u0003\u001e\u000f"+
		"\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d1c\u0001\u0000\u0000\u0000\u01d2\u01de\u00057\u0000\u0000\u01d3"+
		"\u01d8\u0003f3\u0000\u01d4\u01d5\u0005=\u0000\u0000\u01d5\u01d7\u0003"+
		"f3\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000"+
		"\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000"+
		"\u0000\u01db\u01dd\u0005=\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000\u0000"+
		"\u01de\u01d3\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000"+
		"\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u00058\u0000\u0000\u01e1"+
		"e\u0001\u0000\u0000\u0000\u01e2\u01e4\u0005\u0001\u0000\u0000\u01e3\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0003\u001e\u000f\u0000\u01e6g\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u00064\uffff\uffff\u0000\u01e8\u01ec\u0003"+
		"p8\u0000\u01e9\u01ea\u0007\u0002\u0000\u0000\u01ea\u01ec\u0003h4\u0005"+
		"\u01eb\u01e7\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000"+
		"\u01ec\u01fb\u0001\u0000\u0000\u0000\u01ed\u01ee\n\u0004\u0000\u0000\u01ee"+
		"\u01ef\u0007\u0003\u0000\u0000\u01ef\u01fa\u0003h4\u0005\u01f0\u01f1\n"+
		"\u0003\u0000\u0000\u01f1\u01f2\u0007\u0004\u0000\u0000\u01f2\u01fa\u0003"+
		"h4\u0004\u01f3\u01f4\n\u0002\u0000\u0000\u01f4\u01f5\u0005*\u0000\u0000"+
		"\u01f5\u01fa\u0003h4\u0003\u01f6\u01f7\n\u0001\u0000\u0000\u01f7\u01f8"+
		"\u0005+\u0000\u0000\u01f8\u01fa\u0003h4\u0002\u01f9\u01ed\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f0\u0001\u0000\u0000\u0000\u01f9\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f6\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fci\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fe\u0203\u0005A\u0000\u0000\u01ff\u0200\u0005=\u0000\u0000\u0200"+
		"\u0202\u0005A\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0205"+
		"\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0204k\u0001\u0000\u0000\u0000\u0205\u0203\u0001"+
		"\u0000\u0000\u0000\u0206\u0208\u0005\"\u0000\u0000\u0207\u0206\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0003 \u0010\u0000\u020am\u0001\u0000\u0000\u0000"+
		"\u020b\u020e\u0003V+\u0000\u020c\u020e\u0003^/\u0000\u020d\u020b\u0001"+
		"\u0000\u0000\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020eo\u0001\u0000"+
		"\u0000\u0000\u020f\u0215\u0005A\u0000\u0000\u0210\u0211\u00057\u0000\u0000"+
		"\u0211\u0212\u0003h4\u0000\u0212\u0213\u00058\u0000\u0000\u0213\u0215"+
		"\u0001\u0000\u0000\u0000\u0214\u020f\u0001\u0000\u0000\u0000\u0214\u0210"+
		"\u0001\u0000\u0000\u0000\u0215q\u0001\u0000\u0000\u0000\u0216\u0217\u0007"+
		"\u0005\u0000\u0000\u0217s\u0001\u0000\u0000\u0000Aw\u0081\u0085\u0089"+
		"\u008d\u0094\u009f\u00a3\u00a7\u00af\u00b6\u00c2\u00c6\u00cc\u00d0\u00d4"+
		"\u00d9\u00e0\u00ed\u00f2\u00f9\u00fd\u010d\u0116\u011a\u011e\u0122\u0135"+
		"\u013b\u013d\u0141\u0145\u0148\u014c\u014e\u0154\u015c\u0161\u016c\u0172"+
		"\u0179\u0184\u0189\u0190\u0195\u0199\u019b\u01a0\u01a4\u01a8\u01af\u01c3"+
		"\u01cc\u01d0\u01d8\u01dc\u01de\u01e3\u01eb\u01f9\u01fb\u0203\u0207\u020d"+
		"\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}