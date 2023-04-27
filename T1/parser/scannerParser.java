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
		RULE_begin = 0, RULE_functionDecl = 1, RULE_declaration = 2, RULE_constDecl = 3, 
		RULE_constSpec = 4, RULE_expressionList = 5, RULE_typeDecl = 6, RULE_typeSpec = 7, 
		RULE_methodDecl = 8, RULE_receiver = 9, RULE_varDecl = 10, RULE_varSpec = 11, 
		RULE_block = 12, RULE_statementList = 13, RULE_statement = 14, RULE_simpleStmt = 15, 
		RULE_type_ = 16, RULE_typeName = 17, RULE_qualifiedIdent = 18, RULE_expressionStmt = 19, 
		RULE_incDecStmt = 20, RULE_assignment = 21, RULE_assign_op = 22, RULE_emptyStmt = 23, 
		RULE_labeledStmt = 24, RULE_returnStmt = 25, RULE_breakStmt = 26, RULE_continueStmt = 27, 
		RULE_gotoStmt = 28, RULE_fallthroughStmt = 29, RULE_deferStmt = 30, RULE_ifStmt = 31, 
		RULE_switchStmt = 32, RULE_exprSwitchStmt = 33, RULE_exprCaseClause = 34, 
		RULE_exprSwitchCase = 35, RULE_typeSwitchStmt = 36, RULE_typeSwitchGuard = 37, 
		RULE_typeCaseClause = 38, RULE_typeSwitchCase = 39, RULE_typeList = 40, 
		RULE_forStmt = 41, RULE_forClause = 42, RULE_rangeClause = 43, RULE_arrayType = 44, 
		RULE_arrayLength = 45, RULE_elementType = 46, RULE_methodSpec = 47, RULE_functionType = 48, 
		RULE_signature = 49, RULE_result = 50, RULE_parameters = 51, RULE_parameterDecl = 52, 
		RULE_expression = 53, RULE_identifierList = 54, RULE_embeddedField = 55, 
		RULE_typeLit = 56, RULE_operand = 57, RULE_eos = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "functionDecl", "declaration", "constDecl", "constSpec", "expressionList", 
			"typeDecl", "typeSpec", "methodDecl", "receiver", "varDecl", "varSpec", 
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
	public static class BeginContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(scannerParser.EOF, 0); }
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
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
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
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(118);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(119);
					methodDecl();
					}
					break;
				case 3:
					{
					setState(120);
					declaration();
					}
					break;
				}
				setState(123);
				eos();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 100667424L) != 0 );
			setState(129);
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
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(FUNC);
			setState(132);
			match(ID);
			{
			setState(133);
			signature();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLYBRACES) {
				{
				setState(134);
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
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(137);
				constDecl();
				}
				break;
			case TYPE:
				{
				setState(138);
				typeDecl();
				}
				break;
			case VAR:
				{
				setState(139);
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
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(CONST);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDList:
				{
				setState(143);
				constSpec();
				}
				break;
			case LPAR:
				{
				setState(144);
				match(LPAR);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDList) {
					{
					{
					setState(145);
					constSpec();
					setState(146);
					eos();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
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
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IDList);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 2051L) != 0) {
				{
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR || _la==ID) {
					{
					setState(157);
					type_();
					}
				}

				setState(160);
				match(ASSIGN);
				setState(161);
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
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			expression(0);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				expression(0);
				}
				}
				setState(171);
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
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(TYPE);
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(173);
				typeSpec();
				}
				break;
			case LPAR:
				{
				setState(174);
				match(LPAR);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(175);
					typeSpec();
					setState(176);
					eos();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
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
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ID);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(187);
				match(ASSIGN);
				}
			}

			setState(190);
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
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(FUNC);
			setState(193);
			receiver();
			setState(194);
			match(ID);
			{
			setState(195);
			signature();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLYBRACES) {
				{
				setState(196);
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
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(VAR);
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDList:
				{
				setState(202);
				varSpec();
				}
				break;
			case LPAR:
				{
				setState(203);
				match(LPAR);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDList) {
					{
					{
					setState(204);
					varSpec();
					setState(205);
					eos();
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212);
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
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IDList);
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case ID:
				{
				setState(216);
				type_();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(217);
					match(ASSIGN);
					setState(218);
					expressionList();
					}
				}

				}
				break;
			case ASSIGN:
				{
				setState(221);
				match(ASSIGN);
				setState(222);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LCURLYBRACES);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -6764125157787688167L) != 0) {
				{
				setState(226);
				statementList();
				}
			}

			setState(229);
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
		public List<TerminalNode> SEMI() { return getTokens(scannerParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(scannerParser.SEMI, i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(231);
					match(SEMI);
					}
				}

				}
				setState(234);
				statement();
				setState(235);
				match(SEMI);
				}
				}
				setState(239); 
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				returnStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				breakStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				continueStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				fallthroughStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(250);
				switchStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(251);
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
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simpleStmt);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				incDecStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
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
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_type_);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				typeName();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(LPAR);
				setState(261);
				type_();
				setState(262);
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
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeName);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				qualifiedIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
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
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(271);
			match(DOT);
			setState(272);
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
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			expression(0);
			setState(277);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expressionList();
			setState(280);
			assign_op();
			setState(281);
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
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8929237008384L) != 0) {
				{
				setState(283);
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

			setState(286);
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
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ID);
			setState(291);
			match(COLON);
			setState(292);
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
		public TerminalNode RETURN() { return getToken(scannerParser.RETURN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(RETURN);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
				{
				setState(295);
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
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_breakStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(BREAK);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(299);
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
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CONTINUE);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(303);
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
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(GOTO);
			setState(307);
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
	}

	public final FallthroughStmtContext fallthroughStmt() throws RecognitionException {
		FallthroughStmtContext _localctx = new FallthroughStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
	}

	public final DeferStmtContext deferStmt() throws RecognitionException {
		DeferStmtContext _localctx = new DeferStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(DEFER);
			setState(312);
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
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(IF);
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(315);
				expression(0);
				}
				break;
			case 2:
				{
				setState(316);
				eos();
				setState(317);
				expression(0);
				}
				break;
			case 3:
				{
				setState(319);
				simpleStmt();
				setState(320);
				eos();
				setState(321);
				expression(0);
				}
				break;
			}
			setState(325);
			block();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(326);
				match(ELSE);
				setState(329);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(327);
					ifStmt();
					}
					break;
				case LCURLYBRACES:
					{
					setState(328);
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
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switchStmt);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
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
	}

	public final ExprSwitchStmtContext exprSwitchStmt() throws RecognitionException {
		ExprSwitchStmtContext _localctx = new ExprSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(SWITCH);
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
					{
					setState(338);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
					{
					setState(341);
					simpleStmt();
					}
				}

				setState(344);
				eos();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
					{
					setState(345);
					expression(0);
					}
				}

				}
				break;
			}
			setState(350);
			match(LCURLYBRACES);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(351);
				exprCaseClause();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
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
	}

	public final ExprCaseClauseContext exprCaseClause() throws RecognitionException {
		ExprCaseClauseContext _localctx = new ExprCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_exprCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			exprSwitchCase();
			setState(360);
			match(COLON);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -6764125157787688167L) != 0) {
				{
				setState(361);
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
	}

	public final ExprSwitchCaseContext exprSwitchCase() throws RecognitionException {
		ExprSwitchCaseContext _localctx = new ExprSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exprSwitchCase);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(CASE);
				setState(365);
				expressionList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
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
	}

	public final TypeSwitchStmtContext typeSwitchStmt() throws RecognitionException {
		TypeSwitchStmtContext _localctx = new TypeSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(SWITCH);
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(370);
				typeSwitchGuard();
				}
				break;
			case 2:
				{
				setState(371);
				eos();
				setState(372);
				typeSwitchGuard();
				}
				break;
			case 3:
				{
				setState(374);
				simpleStmt();
				setState(375);
				eos();
				setState(376);
				typeSwitchGuard();
				}
				break;
			}
			setState(380);
			match(LCURLYBRACES);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(381);
				typeCaseClause();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
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
	}

	public final TypeSwitchGuardContext typeSwitchGuard() throws RecognitionException {
		TypeSwitchGuardContext _localctx = new TypeSwitchGuardContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(389);
				match(ID);
				setState(390);
				match(ASSIGN);
				}
				break;
			}
			setState(393);
			operand();
			setState(394);
			match(DOT);
			setState(395);
			match(LPAR);
			setState(396);
			match(TYPE);
			setState(397);
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
	}

	public final TypeCaseClauseContext typeCaseClause() throws RecognitionException {
		TypeCaseClauseContext _localctx = new TypeCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			typeSwitchCase();
			setState(400);
			match(COLON);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -6764125157787688167L) != 0) {
				{
				setState(401);
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
	}

	public final TypeSwitchCaseContext typeSwitchCase() throws RecognitionException {
		TypeSwitchCaseContext _localctx = new TypeSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeSwitchCase);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				match(CASE);
				setState(405);
				typeList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
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
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(409);
			type_();
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(410);
				match(COMMA);
				{
				setState(411);
				type_();
				}
				}
				}
				setState(416);
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
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(FOR);
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
					{
					setState(418);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(421);
				forClause();
				}
				break;
			case 3:
				{
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 37154726991626242L) != 0 || _la==ID) {
					{
					setState(422);
					rangeClause();
					}
				}

				}
				break;
			}
			setState(427);
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
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
				{
				setState(429);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
			}

			setState(432);
			eos();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
				{
				setState(433);
				expression(0);
				}
			}

			setState(436);
			eos();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 8598585351L) != 0) {
				{
				setState(437);
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
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case TIMES:
			case NOT:
			case LPAR:
			case ID:
				{
				setState(440);
				expressionList();
				setState(441);
				match(ASSIGN);
				}
				break;
			case IDList:
				{
				setState(443);
				match(IDList);
				setState(444);
				match(ASSIGN);
				}
				break;
			case RANGE:
				break;
			default:
				break;
			}
			setState(447);
			match(RANGE);
			setState(448);
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
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(LBRACK);
			setState(451);
			arrayLength();
			setState(452);
			match(RBRACK);
			setState(453);
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
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
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
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	}

	public final MethodSpecContext methodSpec() throws RecognitionException {
		MethodSpecContext _localctx = new MethodSpecContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_methodSpec);
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(ID);
				setState(460);
				parameters();
				setState(461);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(ID);
				setState(464);
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
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(FUNC);
			setState(468);
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
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_signature);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				parameters();
				setState(471);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
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
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_result);
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
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
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(LPAR);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDList || _la==LPAR || _la==ID) {
				{
				setState(481);
				parameterDecl();
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(482);
						match(COMMA);
						setState(483);
						parameterDecl();
						}
						} 
					}
					setState(488);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(489);
					match(COMMA);
					}
				}

				}
			}

			setState(494);
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
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDList) {
				{
				setState(496);
				match(IDList);
				}
			}

			setState(499);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case ID:
				{
				setState(502);
				operand();
				}
				break;
			case PLUS:
			case MINUS:
			case TIMES:
			case NOT:
				{
				setState(503);
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
				setState(504);
				expression(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(519);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(507);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(508);
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
						setState(509);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(510);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(511);
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
						setState(512);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(513);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(514);
						match(AND);
						setState(515);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(516);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(517);
						match(OR);
						setState(518);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(523);
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
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(ID);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(525);
				match(COMMA);
				setState(526);
				match(ID);
				}
				}
				setState(531);
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
	}

	public final EmbeddedFieldContext embeddedField() throws RecognitionException {
		EmbeddedFieldContext _localctx = new EmbeddedFieldContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_embeddedField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES) {
				{
				setState(532);
				match(TIMES);
				}
			}

			setState(535);
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
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeLit);
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				arrayType();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
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
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_operand);
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(ID);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(LPAR);
				setState(543);
				expression(0);
				setState(544);
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
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
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
		case 53:
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
		"\u0004\u0001H\u0227\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000z\b\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"~\b\u0000\u000b\u0000\f\u0000\u007f\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0088\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u008d\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0095\b\u0003"+
		"\n\u0003\f\u0003\u0098\t\u0003\u0001\u0003\u0003\u0003\u009b\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u009f\b\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00a3\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a8"+
		"\b\u0005\n\u0005\f\u0005\u00ab\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b3\b\u0006\n\u0006"+
		"\f\u0006\u00b6\t\u0006\u0001\u0006\u0003\u0006\u00b9\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00bd\b\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c6\b\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d0\b\n\n\n\f\n\u00d3"+
		"\t\n\u0001\n\u0003\n\u00d6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00dc\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e0"+
		"\b\u000b\u0001\f\u0001\f\u0003\f\u00e4\b\f\u0001\f\u0001\f\u0001\r\u0003"+
		"\r\u00e9\b\r\u0001\r\u0001\r\u0001\r\u0004\r\u00ee\b\r\u000b\r\f\r\u00ef"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00fd\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0102\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0109\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u010d\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0003\u0016\u011d\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0129\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u012d\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0131\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0144\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u014a\b\u001f\u0003\u001f\u014c\b\u001f\u0001 \u0001 \u0003 \u0150"+
		"\b \u0001!\u0001!\u0003!\u0154\b!\u0001!\u0003!\u0157\b!\u0001!\u0001"+
		"!\u0003!\u015b\b!\u0003!\u015d\b!\u0001!\u0001!\u0005!\u0161\b!\n!\f!"+
		"\u0164\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0003\"\u016b\b\"\u0001"+
		"#\u0001#\u0001#\u0003#\u0170\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u017b\b$\u0001$\u0001$\u0005$\u017f\b$\n"+
		"$\f$\u0182\t$\u0001$\u0001$\u0001%\u0001%\u0003%\u0188\b%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0003&\u0193\b&\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u0198\b\'\u0001(\u0001(\u0001(\u0005(\u019d"+
		"\b(\n(\f(\u01a0\t(\u0001)\u0001)\u0003)\u01a4\b)\u0001)\u0001)\u0003)"+
		"\u01a8\b)\u0003)\u01aa\b)\u0001)\u0001)\u0001*\u0003*\u01af\b*\u0001*"+
		"\u0001*\u0003*\u01b3\b*\u0001*\u0001*\u0003*\u01b7\b*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0003+\u01be\b+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u01d2\b/\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00031\u01db\b1\u00012\u00012\u00032\u01df\b2\u00013\u00013\u0001"+
		"3\u00013\u00053\u01e5\b3\n3\f3\u01e8\t3\u00013\u00033\u01eb\b3\u00033"+
		"\u01ed\b3\u00013\u00013\u00014\u00034\u01f2\b4\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00035\u01fa\b5\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00055\u0208\b5\n5\f5\u020b"+
		"\t5\u00016\u00016\u00016\u00056\u0210\b6\n6\f6\u0213\t6\u00017\u00037"+
		"\u0216\b7\u00017\u00017\u00018\u00018\u00038\u021c\b8\u00019\u00019\u0001"+
		"9\u00019\u00019\u00039\u0223\b9\u0001:\u0001:\u0001:\u0000\u0001j;\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\u0000\u0006\u0001"+
		"\u0000,-\u0002\u0000 $++\u0002\u0000 \"22\u0002\u0000 !++\u0002\u0000"+
		".035\u0001\u0001??\u023f\u0000}\u0001\u0000\u0000\u0000\u0002\u0083\u0001"+
		"\u0000\u0000\u0000\u0004\u008c\u0001\u0000\u0000\u0000\u0006\u008e\u0001"+
		"\u0000\u0000\u0000\b\u009c\u0001\u0000\u0000\u0000\n\u00a4\u0001\u0000"+
		"\u0000\u0000\f\u00ac\u0001\u0000\u0000\u0000\u000e\u00ba\u0001\u0000\u0000"+
		"\u0000\u0010\u00c0\u0001\u0000\u0000\u0000\u0012\u00c7\u0001\u0000\u0000"+
		"\u0000\u0014\u00c9\u0001\u0000\u0000\u0000\u0016\u00d7\u0001\u0000\u0000"+
		"\u0000\u0018\u00e1\u0001\u0000\u0000\u0000\u001a\u00ed\u0001\u0000\u0000"+
		"\u0000\u001c\u00fc\u0001\u0000\u0000\u0000\u001e\u0101\u0001\u0000\u0000"+
		"\u0000 \u0108\u0001\u0000\u0000\u0000\"\u010c\u0001\u0000\u0000\u0000"+
		"$\u010e\u0001\u0000\u0000\u0000&\u0112\u0001\u0000\u0000\u0000(\u0114"+
		"\u0001\u0000\u0000\u0000*\u0117\u0001\u0000\u0000\u0000,\u011c\u0001\u0000"+
		"\u0000\u0000.\u0120\u0001\u0000\u0000\u00000\u0122\u0001\u0000\u0000\u0000"+
		"2\u0126\u0001\u0000\u0000\u00004\u012a\u0001\u0000\u0000\u00006\u012e"+
		"\u0001\u0000\u0000\u00008\u0132\u0001\u0000\u0000\u0000:\u0135\u0001\u0000"+
		"\u0000\u0000<\u0137\u0001\u0000\u0000\u0000>\u013a\u0001\u0000\u0000\u0000"+
		"@\u014f\u0001\u0000\u0000\u0000B\u0151\u0001\u0000\u0000\u0000D\u0167"+
		"\u0001\u0000\u0000\u0000F\u016f\u0001\u0000\u0000\u0000H\u0171\u0001\u0000"+
		"\u0000\u0000J\u0187\u0001\u0000\u0000\u0000L\u018f\u0001\u0000\u0000\u0000"+
		"N\u0197\u0001\u0000\u0000\u0000P\u0199\u0001\u0000\u0000\u0000R\u01a1"+
		"\u0001\u0000\u0000\u0000T\u01ae\u0001\u0000\u0000\u0000V\u01bd\u0001\u0000"+
		"\u0000\u0000X\u01c2\u0001\u0000\u0000\u0000Z\u01c7\u0001\u0000\u0000\u0000"+
		"\\\u01c9\u0001\u0000\u0000\u0000^\u01d1\u0001\u0000\u0000\u0000`\u01d3"+
		"\u0001\u0000\u0000\u0000b\u01da\u0001\u0000\u0000\u0000d\u01de\u0001\u0000"+
		"\u0000\u0000f\u01e0\u0001\u0000\u0000\u0000h\u01f1\u0001\u0000\u0000\u0000"+
		"j\u01f9\u0001\u0000\u0000\u0000l\u020c\u0001\u0000\u0000\u0000n\u0215"+
		"\u0001\u0000\u0000\u0000p\u021b\u0001\u0000\u0000\u0000r\u0222\u0001\u0000"+
		"\u0000\u0000t\u0224\u0001\u0000\u0000\u0000vz\u0003\u0002\u0001\u0000"+
		"wz\u0003\u0010\b\u0000xz\u0003\u0004\u0002\u0000yv\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{|\u0003t:\u0000|~\u0001\u0000\u0000\u0000}y\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\u0000\u0000\u0001\u0082\u0001\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\f\u0000\u0000\u0084\u0085\u0005A\u0000\u0000\u0085\u0087\u0003"+
		"b1\u0000\u0086\u0088\u0003\u0018\f\u0000\u0087\u0086\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0003\u0001\u0000\u0000"+
		"\u0000\u0089\u008d\u0003\u0006\u0003\u0000\u008a\u008d\u0003\f\u0006\u0000"+
		"\u008b\u008d\u0003\u0014\n\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u0005\u0001\u0000\u0000\u0000\u008e\u009a\u0005\u0005\u0000\u0000\u008f"+
		"\u009b\u0003\b\u0004\u0000\u0090\u0096\u00057\u0000\u0000\u0091\u0092"+
		"\u0003\b\u0004\u0000\u0092\u0093\u0003t:\u0000\u0093\u0095\u0001\u0000"+
		"\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u00058\u0000\u0000\u009a\u008f\u0001\u0000\u0000"+
		"\u0000\u009a\u0090\u0001\u0000\u0000\u0000\u009b\u0007\u0001\u0000\u0000"+
		"\u0000\u009c\u00a2\u0005\u0001\u0000\u0000\u009d\u009f\u0003 \u0010\u0000"+
		"\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u00056\u0000\u0000\u00a1"+
		"\u00a3\u0003\n\u0005\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\t\u0001\u0000\u0000\u0000\u00a4\u00a9\u0003"+
		"j5\u0000\u00a5\u00a6\u0005=\u0000\u0000\u00a6\u00a8\u0003j5\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u000b\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac"+
		"\u00b8\u0005\u0019\u0000\u0000\u00ad\u00b9\u0003\u000e\u0007\u0000\u00ae"+
		"\u00b4\u00057\u0000\u0000\u00af\u00b0\u0003\u000e\u0007\u0000\u00b0\u00b1"+
		"\u0003t:\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b9\u00058\u0000"+
		"\u0000\u00b8\u00ad\u0001\u0000\u0000\u0000\u00b8\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b9\r\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005A\u0000\u0000"+
		"\u00bb\u00bd\u00056\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0003 \u0010\u0000\u00bf\u000f\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\f\u0000\u0000\u00c1\u00c2\u0003\u0012\t\u0000\u00c2\u00c3\u0005"+
		"A\u0000\u0000\u00c3\u00c5\u0003b1\u0000\u00c4\u00c6\u0003\u0018\f\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u0011\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003f3\u0000\u00c8\u0013"+
		"\u0001\u0000\u0000\u0000\u00c9\u00d5\u0005\u001a\u0000\u0000\u00ca\u00d6"+
		"\u0003\u0016\u000b\u0000\u00cb\u00d1\u00057\u0000\u0000\u00cc\u00cd\u0003"+
		"\u0016\u000b\u0000\u00cd\u00ce\u0003t:\u0000\u00ce\u00d0\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d6\u00058\u0000\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d5\u00cb\u0001\u0000\u0000\u0000\u00d6\u0015\u0001\u0000\u0000\u0000"+
		"\u00d7\u00df\u0005\u0001\u0000\u0000\u00d8\u00db\u0003 \u0010\u0000\u00d9"+
		"\u00da\u00056\u0000\u0000\u00da\u00dc\u0003\n\u0005\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00e0"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u00056\u0000\u0000\u00de\u00e0\u0003"+
		"\n\u0005\u0000\u00df\u00d8\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u0017\u0001\u0000\u0000\u0000\u00e1\u00e3\u0005;\u0000"+
		"\u0000\u00e2\u00e4\u0003\u001a\r\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0005<\u0000\u0000\u00e6\u0019\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e9\u0005?\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0003\u001c\u000e\u0000\u00eb\u00ec\u0005?\u0000\u0000\u00ec\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u001b\u0001\u0000\u0000\u0000\u00f1\u00fd\u0003"+
		"\u0004\u0002\u0000\u00f2\u00fd\u00030\u0018\u0000\u00f3\u00fd\u0003\u001e"+
		"\u000f\u0000\u00f4\u00fd\u00032\u0019\u0000\u00f5\u00fd\u00034\u001a\u0000"+
		"\u00f6\u00fd\u00036\u001b\u0000\u00f7\u00fd\u0003:\u001d\u0000\u00f8\u00fd"+
		"\u0003\u0018\f\u0000\u00f9\u00fd\u0003>\u001f\u0000\u00fa\u00fd\u0003"+
		"@ \u0000\u00fb\u00fd\u0003R)\u0000\u00fc\u00f1\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f2\u0001\u0000\u0000\u0000\u00fc\u00f3\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f4\u0001\u0000\u0000\u0000\u00fc\u00f5\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f6\u0001\u0000\u0000\u0000\u00fc\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u001d\u0001\u0000\u0000\u0000\u00fe\u0102\u0003(\u0014\u0000\u00ff"+
		"\u0102\u0003*\u0015\u0000\u0100\u0102\u0003&\u0013\u0000\u0101\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001"+
		"\u0000\u0000\u0000\u0102\u001f\u0001\u0000\u0000\u0000\u0103\u0109\u0003"+
		"\"\u0011\u0000\u0104\u0105\u00057\u0000\u0000\u0105\u0106\u0003 \u0010"+
		"\u0000\u0106\u0107\u00058\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000"+
		"\u0108\u0103\u0001\u0000\u0000\u0000\u0108\u0104\u0001\u0000\u0000\u0000"+
		"\u0109!\u0001\u0000\u0000\u0000\u010a\u010d\u0003$\u0012\u0000\u010b\u010d"+
		"\u0005A\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010b\u0001"+
		"\u0000\u0000\u0000\u010d#\u0001\u0000\u0000\u0000\u010e\u010f\u0005A\u0000"+
		"\u0000\u010f\u0110\u0005>\u0000\u0000\u0110\u0111\u0005A\u0000\u0000\u0111"+
		"%\u0001\u0000\u0000\u0000\u0112\u0113\u0003j5\u0000\u0113\'\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0003j5\u0000\u0115\u0116\u0007\u0000\u0000\u0000"+
		"\u0116)\u0001\u0000\u0000\u0000\u0117\u0118\u0003\n\u0005\u0000\u0118"+
		"\u0119\u0003,\u0016\u0000\u0119\u011a\u0003\n\u0005\u0000\u011a+\u0001"+
		"\u0000\u0000\u0000\u011b\u011d\u0007\u0001\u0000\u0000\u011c\u011b\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u00056\u0000\u0000\u011f-\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0005?\u0000\u0000\u0121/\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005A\u0000\u0000\u0123\u0124\u0005@\u0000\u0000\u0124\u0125\u0003"+
		"\u001c\u000e\u0000\u01251\u0001\u0000\u0000\u0000\u0126\u0128\u0005\u0015"+
		"\u0000\u0000\u0127\u0129\u0003\n\u0005\u0000\u0128\u0127\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u01293\u0001\u0000\u0000\u0000"+
		"\u012a\u012c\u0005\u0002\u0000\u0000\u012b\u012d\u0005A\u0000\u0000\u012c"+
		"\u012b\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d"+
		"5\u0001\u0000\u0000\u0000\u012e\u0130\u0005\u0006\u0000\u0000\u012f\u0131"+
		"\u0005A\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u01317\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u000e"+
		"\u0000\u0000\u0133\u0134\u0005A\u0000\u0000\u01349\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0005\n\u0000\u0000\u0136;\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0005\b\u0000\u0000\u0138\u0139\u0003j5\u0000\u0139=\u0001\u0000"+
		"\u0000\u0000\u013a\u0143\u0005\u000f\u0000\u0000\u013b\u0144\u0003j5\u0000"+
		"\u013c\u013d\u0003t:\u0000\u013d\u013e\u0003j5\u0000\u013e\u0144\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0003\u001e\u000f\u0000\u0140\u0141\u0003"+
		"t:\u0000\u0141\u0142\u0003j5\u0000\u0142\u0144\u0001\u0000\u0000\u0000"+
		"\u0143\u013b\u0001\u0000\u0000\u0000\u0143\u013c\u0001\u0000\u0000\u0000"+
		"\u0143\u013f\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u014b\u0003\u0018\f\u0000\u0146\u0149\u0005\t\u0000\u0000\u0147"+
		"\u014a\u0003>\u001f\u0000\u0148\u014a\u0003\u0018\f\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014c"+
		"\u0001\u0000\u0000\u0000\u014b\u0146\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c?\u0001\u0000\u0000\u0000\u014d\u0150\u0003"+
		"B!\u0000\u014e\u0150\u0003H$\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u014e\u0001\u0000\u0000\u0000\u0150A\u0001\u0000\u0000\u0000\u0151"+
		"\u015c\u0005\u0018\u0000\u0000\u0152\u0154\u0003j5\u0000\u0153\u0152\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u015d\u0001"+
		"\u0000\u0000\u0000\u0155\u0157\u0003\u001e\u000f\u0000\u0156\u0155\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0001"+
		"\u0000\u0000\u0000\u0158\u015a\u0003t:\u0000\u0159\u015b\u0003j5\u0000"+
		"\u015a\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000"+
		"\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u0153\u0001\u0000\u0000\u0000"+
		"\u015c\u0156\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e\u0162\u0005;\u0000\u0000\u015f\u0161\u0003D\"\u0000\u0160\u015f"+
		"\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165"+
		"\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0005<\u0000\u0000\u0166C\u0001\u0000\u0000\u0000\u0167\u0168\u0003F"+
		"#\u0000\u0168\u016a\u0005@\u0000\u0000\u0169\u016b\u0003\u001a\r\u0000"+
		"\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016bE\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u0003\u0000\u0000\u016d"+
		"\u0170\u0003\n\u0005\u0000\u016e\u0170\u0005\u0007\u0000\u0000\u016f\u016c"+
		"\u0001\u0000\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170G\u0001"+
		"\u0000\u0000\u0000\u0171\u017a\u0005\u0018\u0000\u0000\u0172\u017b\u0003"+
		"J%\u0000\u0173\u0174\u0003t:\u0000\u0174\u0175\u0003J%\u0000\u0175\u017b"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0003\u001e\u000f\u0000\u0177\u0178"+
		"\u0003t:\u0000\u0178\u0179\u0003J%\u0000\u0179\u017b\u0001\u0000\u0000"+
		"\u0000\u017a\u0172\u0001\u0000\u0000\u0000\u017a\u0173\u0001\u0000\u0000"+
		"\u0000\u017a\u0176\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000"+
		"\u0000\u017c\u0180\u0005;\u0000\u0000\u017d\u017f\u0003L&\u0000\u017e"+
		"\u017d\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180"+
		"\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181"+
		"\u0183\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0005<\u0000\u0000\u0184I\u0001\u0000\u0000\u0000\u0185\u0186\u0005"+
		"A\u0000\u0000\u0186\u0188\u00056\u0000\u0000\u0187\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0003r9\u0000\u018a\u018b\u0005>\u0000\u0000\u018b"+
		"\u018c\u00057\u0000\u0000\u018c\u018d\u0005\u0019\u0000\u0000\u018d\u018e"+
		"\u00058\u0000\u0000\u018eK\u0001\u0000\u0000\u0000\u018f\u0190\u0003N"+
		"\'\u0000\u0190\u0192\u0005@\u0000\u0000\u0191\u0193\u0003\u001a\r\u0000"+
		"\u0192\u0191\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000"+
		"\u0193M\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u0003\u0000\u0000\u0195"+
		"\u0198\u0003P(\u0000\u0196\u0198\u0005\u0007\u0000\u0000\u0197\u0194\u0001"+
		"\u0000\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198O\u0001\u0000"+
		"\u0000\u0000\u0199\u019e\u0003 \u0010\u0000\u019a\u019b\u0005=\u0000\u0000"+
		"\u019b\u019d\u0003 \u0010\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d"+
		"\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0001\u0000\u0000\u0000\u019fQ\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a9\u0005\u000b\u0000\u0000\u01a2\u01a4"+
		"\u0003j5\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a4\u01aa\u0001\u0000\u0000\u0000\u01a5\u01aa\u0003T*\u0000"+
		"\u01a6\u01a8\u0003V+\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a9\u01a5\u0001\u0000\u0000\u0000\u01a9\u01a7"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0003\u0018\f\u0000\u01acS\u0001\u0000\u0000\u0000\u01ad\u01af\u0003"+
		"\u001e\u000f\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b2\u0003"+
		"t:\u0000\u01b1\u01b3\u0003j5\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b6\u0003t:\u0000\u01b5\u01b7\u0003\u001e\u000f\u0000\u01b6\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7U\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0003\n\u0005\u0000\u01b9\u01ba\u00056"+
		"\u0000\u0000\u01ba\u01be\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\u0001"+
		"\u0000\u0000\u01bc\u01be\u00056\u0000\u0000\u01bd\u01b8\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005\u0014\u0000"+
		"\u0000\u01c0\u01c1\u0003j5\u0000\u01c1W\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u00059\u0000\u0000\u01c3\u01c4\u0003Z-\u0000\u01c4\u01c5\u0005"+
		":\u0000\u0000\u01c5\u01c6\u0003\\.\u0000\u01c6Y\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0003j5\u0000\u01c8[\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0003 \u0010\u0000\u01ca]\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005A"+
		"\u0000\u0000\u01cc\u01cd\u0003f3\u0000\u01cd\u01ce\u0003d2\u0000\u01ce"+
		"\u01d2\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005A\u0000\u0000\u01d0\u01d2"+
		"\u0003f3\u0000\u01d1\u01cb\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d2_\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005\f\u0000"+
		"\u0000\u01d4\u01d5\u0003b1\u0000\u01d5a\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0003f3\u0000\u01d7\u01d8\u0003d2\u0000\u01d8\u01db\u0001\u0000"+
		"\u0000\u0000\u01d9\u01db\u0003f3\u0000\u01da\u01d6\u0001\u0000\u0000\u0000"+
		"\u01da\u01d9\u0001\u0000\u0000\u0000\u01dbc\u0001\u0000\u0000\u0000\u01dc"+
		"\u01df\u0003f3\u0000\u01dd\u01df\u0003 \u0010\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01dfe\u0001\u0000"+
		"\u0000\u0000\u01e0\u01ec\u00057\u0000\u0000\u01e1\u01e6\u0003h4\u0000"+
		"\u01e2\u01e3\u0005=\u0000\u0000\u01e3\u01e5\u0003h4\u0000\u01e4\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001\u0000\u0000\u0000\u01e6\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01ea"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01eb"+
		"\u0005=\u0000\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01e1\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ef\u00058\u0000\u0000\u01efg\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f2\u0005\u0001\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0003 \u0010\u0000\u01f4i\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\u00065\uffff\uffff\u0000\u01f6\u01fa\u0003r9\u0000\u01f7\u01f8"+
		"\u0007\u0002\u0000\u0000\u01f8\u01fa\u0003j5\u0005\u01f9\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u0209\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\n\u0004\u0000\u0000\u01fc\u01fd\u0007\u0003\u0000"+
		"\u0000\u01fd\u0208\u0003j5\u0005\u01fe\u01ff\n\u0003\u0000\u0000\u01ff"+
		"\u0200\u0007\u0004\u0000\u0000\u0200\u0208\u0003j5\u0004\u0201\u0202\n"+
		"\u0002\u0000\u0000\u0202\u0203\u0005*\u0000\u0000\u0203\u0208\u0003j5"+
		"\u0003\u0204\u0205\n\u0001\u0000\u0000\u0205\u0206\u0005+\u0000\u0000"+
		"\u0206\u0208\u0003j5\u0002\u0207\u01fb\u0001\u0000\u0000\u0000\u0207\u01fe"+
		"\u0001\u0000\u0000\u0000\u0207\u0201\u0001\u0000\u0000\u0000\u0207\u0204"+
		"\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207"+
		"\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020ak\u0001"+
		"\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u0211\u0005"+
		"A\u0000\u0000\u020d\u020e\u0005=\u0000\u0000\u020e\u0210\u0005A\u0000"+
		"\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000"+
		"\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000"+
		"\u0000\u0212m\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000"+
		"\u0214\u0216\u0005\"\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217"+
		"\u0218\u0003\"\u0011\u0000\u0218o\u0001\u0000\u0000\u0000\u0219\u021c"+
		"\u0003X,\u0000\u021a\u021c\u0003`0\u0000\u021b\u0219\u0001\u0000\u0000"+
		"\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021cq\u0001\u0000\u0000\u0000"+
		"\u021d\u0223\u0005A\u0000\u0000\u021e\u021f\u00057\u0000\u0000\u021f\u0220"+
		"\u0003j5\u0000\u0220\u0221\u00058\u0000\u0000\u0221\u0223\u0001\u0000"+
		"\u0000\u0000\u0222\u021d\u0001\u0000\u0000\u0000\u0222\u021e\u0001\u0000"+
		"\u0000\u0000\u0223s\u0001\u0000\u0000\u0000\u0224\u0225\u0007\u0005\u0000"+
		"\u0000\u0225u\u0001\u0000\u0000\u0000By\u007f\u0087\u008c\u0096\u009a"+
		"\u009e\u00a2\u00a9\u00b4\u00b8\u00bc\u00c5\u00d1\u00d5\u00db\u00df\u00e3"+
		"\u00e8\u00ef\u00fc\u0101\u0108\u010c\u011c\u0128\u012c\u0130\u0143\u0149"+
		"\u014b\u014f\u0153\u0156\u015a\u015c\u0162\u016a\u016f\u017a\u0180\u0187"+
		"\u0192\u0197\u019e\u01a3\u01a7\u01a9\u01ae\u01b2\u01b6\u01bd\u01d1\u01da"+
		"\u01de\u01e6\u01ea\u01ec\u01f1\u01f9\u0207\u0209\u0211\u0215\u021b\u0222";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}