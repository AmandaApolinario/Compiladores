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
		BREAK=1, CASE=2, CHAN=3, CONST=4, CONTINUE=5, DEFAULT=6, DEFER=7, ELSE=8, 
		FALLTHROUGH=9, FOR=10, FUNC=11, GO=12, GOTO=13, IF=14, IMPORT=15, INTERFACE=16, 
		MAP=17, PACKAGE=18, RANGE=19, RETURN=20, SELECT=21, STRUCT=22, SWITCH=23, 
		TYPE=24, VAR=25, PLUS=26, MINUS=27, TIMES=28, OVER=29, MOD=30, PLUSEQ=31, 
		MINUSEQ=32, TIMESEQ=33, OVEREQ=34, MODEQ=35, AND=36, OR=37, PLUSONE=38, 
		MINUSONE=39, ISEQUAL=40, LESSTHAN=41, MORETHAN=42, ASSIGN=43, NOT=44, 
		NOTEQUAL=45, LESSEQTHAN=46, MOREEQTHAN=47, DECLARE_ASSIGN=48, LPAR=49, 
		RPAR=50, LBRACK=51, RBRACK=52, LCURLYBRACES=53, RCURLYBRACES=54, COMMA=55, 
		DOT=56, SEMI=57, COLON=58, ID=59, REAL_VAL=60, INT_VAL=61, STR_VAL=62, 
		COMMENT=63, BLOCK_COMMENT=64, WHITESPACE=65, UNKNOWN=66, RECEIVE=67, EOS=68;
	public static final int
		RULE_begin = 0, RULE_functionDecl = 1, RULE_declaration = 2, RULE_typeSpec = 3, 
		RULE_constDecl = 4, RULE_constSpec = 5, RULE_idList = 6, RULE_expressionList = 7, 
		RULE_typeDecl = 8, RULE_methodDecl = 9, RULE_receiver = 10, RULE_varDecl = 11, 
		RULE_varSpec = 12, RULE_block = 13, RULE_statementList = 14, RULE_statement = 15, 
		RULE_simpleStmt = 16, RULE_type_ = 17, RULE_typeName = 18, RULE_qualifiedIdent = 19, 
		RULE_expressionStmt = 20, RULE_sendStmt = 21, RULE_incDecStmt = 22, RULE_assignment = 23, 
		RULE_assign_op = 24, RULE_emptyStmt = 25, RULE_labeledStmt = 26, RULE_returnStmt = 27, 
		RULE_breakStmt = 28, RULE_continueStmt = 29, RULE_gotoStmt = 30, RULE_fallthroughStmt = 31, 
		RULE_deferStmt = 32, RULE_ifStmt = 33, RULE_switchStmt = 34, RULE_exprSwitchStmt = 35, 
		RULE_exprCaseClause = 36, RULE_exprSwitchCase = 37, RULE_typeSwitchStmt = 38, 
		RULE_typeSwitchGuard = 39, RULE_typeCaseClause = 40, RULE_typeSwitchCase = 41, 
		RULE_typeList = 42, RULE_forStmt = 43, RULE_forClause = 44, RULE_rangeClause = 45, 
		RULE_arrayType = 46, RULE_arrayLength = 47, RULE_elementType = 48, RULE_sliceType = 49, 
		RULE_methodSpec = 50, RULE_functionType = 51, RULE_signature = 52, RULE_result = 53, 
		RULE_parameters = 54, RULE_parameterDecl = 55, RULE_expression = 56, RULE_primaryExpr = 57, 
		RULE_identifierList = 58, RULE_embeddedField = 59, RULE_typeLit = 60, 
		RULE_operand = 61, RULE_basicLit = 62, RULE_index = 63, RULE_slice_ = 64, 
		RULE_arguments = 65, RULE_eos = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "functionDecl", "declaration", "typeSpec", "constDecl", "constSpec", 
			"idList", "expressionList", "typeDecl", "methodDecl", "receiver", "varDecl", 
			"varSpec", "block", "statementList", "statement", "simpleStmt", "type_", 
			"typeName", "qualifiedIdent", "expressionStmt", "sendStmt", "incDecStmt", 
			"assignment", "assign_op", "emptyStmt", "labeledStmt", "returnStmt", 
			"breakStmt", "continueStmt", "gotoStmt", "fallthroughStmt", "deferStmt", 
			"ifStmt", "switchStmt", "exprSwitchStmt", "exprCaseClause", "exprSwitchCase", 
			"typeSwitchStmt", "typeSwitchGuard", "typeCaseClause", "typeSwitchCase", 
			"typeList", "forStmt", "forClause", "rangeClause", "arrayType", "arrayLength", 
			"elementType", "sliceType", "methodSpec", "functionType", "signature", 
			"result", "parameters", "parameterDecl", "expression", "primaryExpr", 
			"identifierList", "embeddedField", "typeLit", "operand", "basicLit", 
			"index", "slice_", "arguments", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'case'", "'chan'", "'const'", "'continue'", "'default'", 
			"'defer'", "'else'", "'fallthrough'", "'for'", "'func'", "'go'", "'goto'", 
			"'if'", null, "'interface'", "'map'", null, "'range'", "'return'", "'select'", 
			"'struct'", "'switch'", "'type'", "'var'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&&'", "'||'", "'++'", 
			"'--'", "'=='", "'<'", "'>'", "'='", "'!'", "'!='", "'<='", "'>='", "':='", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "','", "'.'", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", "DEFER", 
			"ELSE", "FALLTHROUGH", "FOR", "FUNC", "GO", "GOTO", "IF", "IMPORT", "INTERFACE", 
			"MAP", "PACKAGE", "RANGE", "RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", 
			"VAR", "PLUS", "MINUS", "TIMES", "OVER", "MOD", "PLUSEQ", "MINUSEQ", 
			"TIMESEQ", "OVEREQ", "MODEQ", "AND", "OR", "PLUSONE", "MINUSONE", "ISEQUAL", 
			"LESSTHAN", "MORETHAN", "ASSIGN", "NOT", "NOTEQUAL", "LESSEQTHAN", "MOREEQTHAN", 
			"DECLARE_ASSIGN", "LPAR", "RPAR", "LBRACK", "RBRACK", "LCURLYBRACES", 
			"RCURLYBRACES", "COMMA", "DOT", "SEMI", "COLON", "ID", "REAL_VAL", "INT_VAL", 
			"STR_VAL", "COMMENT", "BLOCK_COMMENT", "WHITESPACE", "UNKNOWN", "RECEIVE", 
			"EOS"
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
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 50333712L) != 0) {
				{
				{
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(134);
					functionDecl();
					}
					break;
				case 2:
					{
					setState(135);
					methodDecl();
					}
					break;
				case 3:
					{
					setState(136);
					declaration();
					}
					break;
				}
				setState(139);
				eos();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
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
			setState(148);
			match(FUNC);
			setState(149);
			match(ID);
			{
			setState(150);
			signature();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLYBRACES) {
				{
				setState(151);
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
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(154);
				constDecl();
				}
				break;
			case TYPE:
				{
				setState(155);
				typeDecl();
				}
				break;
			case VAR:
				{
				setState(156);
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
		enterRule(_localctx, 6, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ID);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(160);
				match(ASSIGN);
				}
			}

			setState(163);
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
		enterRule(_localctx, 8, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(CONST);
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(166);
				constSpec();
				}
				break;
			case LPAR:
				{
				setState(167);
				match(LPAR);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(168);
					constSpec();
					setState(169);
					eos();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
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
		enterRule(_localctx, 10, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			idList();
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 579275502070532096L) != 0) {
					{
					setState(180);
					type_();
					}
				}

				setState(183);
				match(ASSIGN);
				setState(184);
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
	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(scannerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(scannerParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(scannerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(scannerParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				match(ID);
				}
				}
				setState(194);
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
		enterRule(_localctx, 14, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			expression(0);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(COMMA);
					setState(197);
					expression(0);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 16, RULE_typeDecl);
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
		enterRule(_localctx, 18, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(FUNC);
			setState(218);
			receiver();
			setState(219);
			match(ID);
			{
			setState(220);
			signature();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLYBRACES) {
				{
				setState(221);
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
		enterRule(_localctx, 20, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		enterRule(_localctx, 22, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(VAR);
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(227);
				varSpec();
				}
				break;
			case LPAR:
				{
				setState(228);
				match(LPAR);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(229);
					varSpec();
					setState(230);
					eos();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
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
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_varSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			idList();
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case LPAR:
			case LBRACK:
			case ID:
				{
				setState(241);
				type_();
				{
				setState(242);
				match(ASSIGN);
				setState(243);
				expressionList();
				}
				}
				break;
			case ASSIGN:
				{
				setState(245);
				match(ASSIGN);
				setState(246);
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
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(LCURLYBRACES);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8800614215087834674L) != 0) {
				{
				setState(250);
				statementList();
				}
			}

			setState(253);
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
		enterRule(_localctx, 28, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(255);
					match(SEMI);
					}
				}

				}
				setState(258);
				statement();
				{
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(259);
					match(SEMI);
					}
					break;
				}
				}
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 8800614215087834674L) != 0 );
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
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				returnStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				breakStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				continueStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(272);
				fallthroughStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(273);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(274);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(275);
				switchStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(276);
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
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_simpleStmt);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				sendStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				incDecStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
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
		public TypeLitContext typeLit() {
			return getRuleContext(TypeLitContext.class,0);
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
		enterRule(_localctx, 34, RULE_type_);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				typeName();
				}
				break;
			case FUNC:
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				typeLit();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(LPAR);
				setState(288);
				type_();
				setState(289);
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
		enterRule(_localctx, 36, RULE_typeName);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				qualifiedIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
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
		enterRule(_localctx, 38, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(ID);
			setState(298);
			match(DOT);
			setState(299);
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
		enterRule(_localctx, 40, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
	public static class SendStmtContext extends ParserRuleContext {
		public ExpressionContext channel;
		public TerminalNode RECEIVE() { return getToken(scannerParser.RECEIVE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SendStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendStmt; }
	}

	public final SendStmtContext sendStmt() throws RecognitionException {
		SendStmtContext _localctx = new SendStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			((SendStmtContext)_localctx).channel = expression(0);
			setState(304);
			match(RECEIVE);
			setState(305);
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
		enterRule(_localctx, 44, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			expression(0);
			setState(308);
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
		enterRule(_localctx, 46, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			expressionList();
			setState(311);
			assign_op();
			setState(312);
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
		public TerminalNode DECLARE_ASSIGN() { return getToken(scannerParser.DECLARE_ASSIGN, 0); }
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
		enterRule(_localctx, 48, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 139519328256L) != 0) {
				{
				setState(314);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 139519328256L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(317);
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
		public TerminalNode SEMI() { return getToken(scannerParser.SEMI, 0); }
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		enterRule(_localctx, 52, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ID);
			setState(322);
			match(COLON);
			setState(323);
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
		enterRule(_localctx, 54, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(RETURN);
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(326);
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
		public TerminalNode BREAK() { return getToken(scannerParser.BREAK, 0); }
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(BREAK);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(330);
				match(ID);
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
		enterRule(_localctx, 58, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(CONTINUE);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(334);
				match(ID);
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
		enterRule(_localctx, 60, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(GOTO);
			setState(338);
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
		enterRule(_localctx, 62, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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
		enterRule(_localctx, 64, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(DEFER);
			setState(343);
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
		enterRule(_localctx, 66, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(IF);
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(346);
				expression(0);
				}
				break;
			case 2:
				{
				setState(347);
				eos();
				setState(348);
				expression(0);
				}
				break;
			case 3:
				{
				setState(350);
				simpleStmt();
				setState(351);
				eos();
				setState(352);
				expression(0);
				}
				break;
			}
			setState(356);
			block();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(357);
				match(ELSE);
				setState(360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(358);
					ifStmt();
					}
					break;
				case LCURLYBRACES:
					{
					setState(359);
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
		enterRule(_localctx, 68, RULE_switchStmt);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
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
		enterRule(_localctx, 70, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(SWITCH);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
					{
					setState(369);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
					{
					setState(372);
					simpleStmt();
					}
				}

				setState(375);
				eos();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
					{
					setState(376);
					expression(0);
					}
				}

				}
				break;
			}
			setState(381);
			match(LCURLYBRACES);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(382);
				exprCaseClause();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
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
		enterRule(_localctx, 72, RULE_exprCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			exprSwitchCase();
			setState(391);
			match(COLON);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8800614215087834674L) != 0) {
				{
				setState(392);
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
		enterRule(_localctx, 74, RULE_exprSwitchCase);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(CASE);
				setState(396);
				expressionList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
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
		enterRule(_localctx, 76, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(SWITCH);
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(401);
				typeSwitchGuard();
				}
				break;
			case 2:
				{
				setState(402);
				eos();
				setState(403);
				typeSwitchGuard();
				}
				break;
			case 3:
				{
				setState(405);
				simpleStmt();
				setState(406);
				eos();
				setState(407);
				typeSwitchGuard();
				}
				break;
			}
			setState(411);
			match(LCURLYBRACES);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(412);
				typeCaseClause();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
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
		enterRule(_localctx, 78, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(420);
				match(ID);
				setState(421);
				match(ASSIGN);
				}
				break;
			}
			setState(424);
			operand();
			setState(425);
			match(DOT);
			setState(426);
			match(LPAR);
			setState(427);
			match(TYPE);
			setState(428);
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
		enterRule(_localctx, 80, RULE_typeCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			typeSwitchCase();
			setState(431);
			match(COLON);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8800614215087834674L) != 0) {
				{
				setState(432);
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
		enterRule(_localctx, 82, RULE_typeSwitchCase);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(CASE);
				setState(436);
				typeList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
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
		enterRule(_localctx, 84, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(440);
			type_();
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(441);
				match(COMMA);
				{
				setState(442);
				type_();
				}
				}
				}
				setState(447);
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
		enterRule(_localctx, 86, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(FOR);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
					{
					setState(449);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(452);
				forClause();
				}
				break;
			case 3:
				{
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697975296L) != 0) {
					{
					setState(453);
					rangeClause();
					}
				}

				}
				break;
			}
			setState(458);
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
		enterRule(_localctx, 88, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
				{
				setState(460);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
			}

			setState(463);
			eos();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
				{
				setState(464);
				expression(0);
				}
			}

			setState(467);
			eos();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
				{
				setState(468);
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
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode DECLARE_ASSIGN() { return getToken(scannerParser.DECLARE_ASSIGN, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(471);
				expressionList();
				setState(472);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(474);
				idList();
				setState(475);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(479);
			match(RANGE);
			setState(480);
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
		enterRule(_localctx, 92, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(LBRACK);
			setState(483);
			arrayLength();
			setState(484);
			match(RBRACK);
			setState(485);
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
		enterRule(_localctx, 94, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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
		enterRule(_localctx, 96, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
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
	public static class SliceTypeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(scannerParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(scannerParser.RBRACK, 0); }
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
		}
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(LBRACK);
			setState(492);
			match(RBRACK);
			setState(493);
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
		enterRule(_localctx, 100, RULE_methodSpec);
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(ID);
				setState(496);
				parameters();
				setState(497);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				match(ID);
				setState(500);
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
		enterRule(_localctx, 102, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(FUNC);
			setState(504);
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
		enterRule(_localctx, 104, RULE_signature);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				parameters();
				setState(507);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
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
		enterRule(_localctx, 106, RULE_result);
		try {
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
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
		enterRule(_localctx, 108, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(LPAR);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 579275502070532096L) != 0) {
				{
				setState(517);
				parameterDecl();
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(518);
						match(COMMA);
						setState(519);
						parameterDecl();
						}
						} 
					}
					setState(524);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(525);
					match(COMMA);
					}
				}

				}
			}

			setState(530);
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
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_parameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(532);
				idList();
				}
				break;
			}
			setState(535);
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
		public Token mul_op;
		public Token add_op;
		public Token rel_op;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
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
		public TerminalNode TIMES() { return getToken(scannerParser.TIMES, 0); }
		public TerminalNode MINUS() { return getToken(scannerParser.MINUS, 0); }
		public TerminalNode OVER() { return getToken(scannerParser.OVER, 0); }
		public TerminalNode NOT() { return getToken(scannerParser.NOT, 0); }
		public TerminalNode MOD() { return getToken(scannerParser.MOD, 0); }
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(538);
				primaryExpr(0);
				}
				break;
			case 2:
				{
				setState(539);
				operand();
				}
				break;
			case 3:
				{
				setState(540);
				((ExpressionContext)_localctx).unary_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17593192677376L) != 0) ) {
					((ExpressionContext)_localctx).unary_op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(541);
				expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(559);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(544);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(545);
						((ExpressionContext)_localctx).mul_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0) ) {
							((ExpressionContext)_localctx).mul_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(546);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(547);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(548);
						((ExpressionContext)_localctx).add_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 137640280064L) != 0) ) {
							((ExpressionContext)_localctx).add_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(549);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(550);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(551);
						((ExpressionContext)_localctx).rel_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 253987186016256L) != 0) ) {
							((ExpressionContext)_localctx).rel_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(552);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(553);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(554);
						match(AND);
						setState(555);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(556);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(557);
						match(OR);
						setState(558);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		public Slice_Context slice_() {
			return getRuleContext(Slice_Context.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(scannerParser.DOT, 0); }
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(565);
			operand();
			}
			_ctx.stop = _input.LT(-1);
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(567);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(573);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						{
						setState(568);
						match(DOT);
						setState(569);
						match(ID);
						}
						}
						break;
					case 2:
						{
						setState(570);
						index();
						}
						break;
					case 3:
						{
						setState(571);
						slice_();
						}
						break;
					case 4:
						{
						setState(572);
						arguments();
						}
						break;
					}
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		enterRule(_localctx, 116, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(ID);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(581);
				match(COMMA);
				setState(582);
				match(ID);
				}
				}
				setState(587);
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
		enterRule(_localctx, 118, RULE_embeddedField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES) {
				{
				setState(588);
				match(TIMES);
				}
			}

			setState(591);
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
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public TypeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLit; }
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_typeLit);
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				functionType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				sliceType();
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
	public static class OperandContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
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
		enterRule(_localctx, 122, RULE_operand);
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_VAL:
			case INT_VAL:
			case STR_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				basicLit();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				match(ID);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				match(LPAR);
				setState(601);
				expression(0);
				setState(602);
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
		public TerminalNode INT_VAL() { return getToken(scannerParser.INT_VAL, 0); }
		public TerminalNode STR_VAL() { return getToken(scannerParser.STR_VAL, 0); }
		public TerminalNode REAL_VAL() { return getToken(scannerParser.REAL_VAL, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_basicLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247928832L) != 0) ) {
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
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(scannerParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(scannerParser.RBRACK, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(LBRACK);
			setState(609);
			expression(0);
			setState(610);
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
	public static class Slice_Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(scannerParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(scannerParser.RBRACK, 0); }
		public List<TerminalNode> COLON() { return getTokens(scannerParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(scannerParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Slice_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_; }
	}

	public final Slice_Context slice_() throws RecognitionException {
		Slice_Context _localctx = new Slice_Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_slice_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(LBRACK);
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
					{
					setState(613);
					expression(0);
					}
				}

				setState(616);
				match(COLON);
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
					{
					setState(617);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
					{
					setState(620);
					expression(0);
					}
				}

				setState(623);
				match(COLON);
				setState(624);
				expression(0);
				setState(625);
				match(COLON);
				setState(626);
				expression(0);
				}
				break;
			}
			setState(630);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(scannerParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(scannerParser.RPAR, 0); }
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(scannerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(scannerParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(LPAR);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
				{
				{
				setState(633);
				expressionList();
				setState(636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(634);
					match(COMMA);
					setState(635);
					expressionList();
					}
					break;
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(638);
					match(COMMA);
					}
				}

				}
			}

			setState(643);
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
		public TerminalNode SEMI() { return getToken(scannerParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(scannerParser.EOF, 0); }
		public TerminalNode EOS() { return getToken(scannerParser.EOS, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
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
		case 56:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 57:
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
		"\u0004\u0001D\u0288\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u008a\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u008e\b\u0000\n\u0000"+
		"\f\u0000\u0091\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0099\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u009e\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00a2\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00ac\b\u0004\n\u0004"+
		"\f\u0004\u00af\t\u0004\u0001\u0004\u0003\u0004\u00b2\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00b6\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00ba\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00bf\b"+
		"\u0006\n\u0006\f\u0006\u00c2\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00c7\b\u0007\n\u0007\f\u0007\u00ca\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d2\b\b\n\b\f\b\u00d5\t\b"+
		"\u0001\b\u0003\b\u00d8\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00df\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e9\b\u000b\n\u000b\f\u000b"+
		"\u00ec\t\u000b\u0001\u000b\u0003\u000b\u00ef\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f8\b\f\u0001\r\u0001\r\u0003"+
		"\r\u00fc\b\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u0101\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0105\b\u000e\u0004\u000e\u0107\b\u000e"+
		"\u000b\u000e\f\u000e\u0108\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0116\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u011c\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0124\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0128\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0003\u0018\u013c\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0148\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u014c\b\u001c\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0150\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u0163\b!\u0001!\u0001!\u0001!\u0001!\u0003!\u0169"+
		"\b!\u0003!\u016b\b!\u0001\"\u0001\"\u0003\"\u016f\b\"\u0001#\u0001#\u0003"+
		"#\u0173\b#\u0001#\u0003#\u0176\b#\u0001#\u0001#\u0003#\u017a\b#\u0003"+
		"#\u017c\b#\u0001#\u0001#\u0005#\u0180\b#\n#\f#\u0183\t#\u0001#\u0001#"+
		"\u0001$\u0001$\u0001$\u0003$\u018a\b$\u0001%\u0001%\u0001%\u0003%\u018f"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u019a\b&\u0001&\u0001&\u0005&\u019e\b&\n&\f&\u01a1\t&\u0001&\u0001&"+
		"\u0001\'\u0001\'\u0003\'\u01a7\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0003(\u01b2\b(\u0001)\u0001)\u0001)\u0003"+
		")\u01b7\b)\u0001*\u0001*\u0001*\u0005*\u01bc\b*\n*\f*\u01bf\t*\u0001+"+
		"\u0001+\u0003+\u01c3\b+\u0001+\u0001+\u0003+\u01c7\b+\u0003+\u01c9\b+"+
		"\u0001+\u0001+\u0001,\u0003,\u01ce\b,\u0001,\u0001,\u0003,\u01d2\b,\u0001"+
		",\u0001,\u0003,\u01d6\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u01de\b-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		"/\u0001/\u00010\u00010\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u01f6\b2\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00034\u01ff\b4\u00015\u00015\u00035\u0203\b5\u00016\u0001"+
		"6\u00016\u00016\u00056\u0209\b6\n6\f6\u020c\t6\u00016\u00036\u020f\b6"+
		"\u00036\u0211\b6\u00016\u00016\u00017\u00037\u0216\b7\u00017\u00017\u0001"+
		"8\u00018\u00018\u00018\u00018\u00038\u021f\b8\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00058\u0230\b8\n8\f8\u0233\t8\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u023e\b9\u00059\u0240\b9\n9\f9\u0243"+
		"\t9\u0001:\u0001:\u0001:\u0005:\u0248\b:\n:\f:\u024b\t:\u0001;\u0003;"+
		"\u024e\b;\u0001;\u0001;\u0001<\u0001<\u0001<\u0003<\u0255\b<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0003=\u025d\b=\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001@\u0001@\u0003@\u0267\b@\u0001@\u0001@\u0003@\u026b"+
		"\b@\u0001@\u0003@\u026e\b@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0275"+
		"\b@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0003A\u027d\bA\u0001A\u0003"+
		"A\u0280\bA\u0003A\u0282\bA\u0001A\u0001A\u0001B\u0001B\u0001B\u0000\u0002"+
		"prC\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0000\t\u0001\u0000&\'\u0002\u0000\u001a\u001e%%\u0002\u0000"+
		"++00\u0002\u0000\u001a\u001d,,\u0001\u0000\u001c\u001e\u0002\u0000\u001a"+
		"\u001b%%\u0002\u0000(*-/\u0001\u0000<>\u0002\u000199DD\u02aa\u0000\u008f"+
		"\u0001\u0000\u0000\u0000\u0002\u0094\u0001\u0000\u0000\u0000\u0004\u009d"+
		"\u0001\u0000\u0000\u0000\u0006\u009f\u0001\u0000\u0000\u0000\b\u00a5\u0001"+
		"\u0000\u0000\u0000\n\u00b3\u0001\u0000\u0000\u0000\f\u00bb\u0001\u0000"+
		"\u0000\u0000\u000e\u00c3\u0001\u0000\u0000\u0000\u0010\u00cb\u0001\u0000"+
		"\u0000\u0000\u0012\u00d9\u0001\u0000\u0000\u0000\u0014\u00e0\u0001\u0000"+
		"\u0000\u0000\u0016\u00e2\u0001\u0000\u0000\u0000\u0018\u00f0\u0001\u0000"+
		"\u0000\u0000\u001a\u00f9\u0001\u0000\u0000\u0000\u001c\u0106\u0001\u0000"+
		"\u0000\u0000\u001e\u0115\u0001\u0000\u0000\u0000 \u011b\u0001\u0000\u0000"+
		"\u0000\"\u0123\u0001\u0000\u0000\u0000$\u0127\u0001\u0000\u0000\u0000"+
		"&\u0129\u0001\u0000\u0000\u0000(\u012d\u0001\u0000\u0000\u0000*\u012f"+
		"\u0001\u0000\u0000\u0000,\u0133\u0001\u0000\u0000\u0000.\u0136\u0001\u0000"+
		"\u0000\u00000\u013b\u0001\u0000\u0000\u00002\u013f\u0001\u0000\u0000\u0000"+
		"4\u0141\u0001\u0000\u0000\u00006\u0145\u0001\u0000\u0000\u00008\u0149"+
		"\u0001\u0000\u0000\u0000:\u014d\u0001\u0000\u0000\u0000<\u0151\u0001\u0000"+
		"\u0000\u0000>\u0154\u0001\u0000\u0000\u0000@\u0156\u0001\u0000\u0000\u0000"+
		"B\u0159\u0001\u0000\u0000\u0000D\u016e\u0001\u0000\u0000\u0000F\u0170"+
		"\u0001\u0000\u0000\u0000H\u0186\u0001\u0000\u0000\u0000J\u018e\u0001\u0000"+
		"\u0000\u0000L\u0190\u0001\u0000\u0000\u0000N\u01a6\u0001\u0000\u0000\u0000"+
		"P\u01ae\u0001\u0000\u0000\u0000R\u01b6\u0001\u0000\u0000\u0000T\u01b8"+
		"\u0001\u0000\u0000\u0000V\u01c0\u0001\u0000\u0000\u0000X\u01cd\u0001\u0000"+
		"\u0000\u0000Z\u01dd\u0001\u0000\u0000\u0000\\\u01e2\u0001\u0000\u0000"+
		"\u0000^\u01e7\u0001\u0000\u0000\u0000`\u01e9\u0001\u0000\u0000\u0000b"+
		"\u01eb\u0001\u0000\u0000\u0000d\u01f5\u0001\u0000\u0000\u0000f\u01f7\u0001"+
		"\u0000\u0000\u0000h\u01fe\u0001\u0000\u0000\u0000j\u0202\u0001\u0000\u0000"+
		"\u0000l\u0204\u0001\u0000\u0000\u0000n\u0215\u0001\u0000\u0000\u0000p"+
		"\u021e\u0001\u0000\u0000\u0000r\u0234\u0001\u0000\u0000\u0000t\u0244\u0001"+
		"\u0000\u0000\u0000v\u024d\u0001\u0000\u0000\u0000x\u0254\u0001\u0000\u0000"+
		"\u0000z\u025c\u0001\u0000\u0000\u0000|\u025e\u0001\u0000\u0000\u0000~"+
		"\u0260\u0001\u0000\u0000\u0000\u0080\u0264\u0001\u0000\u0000\u0000\u0082"+
		"\u0278\u0001\u0000\u0000\u0000\u0084\u0285\u0001\u0000\u0000\u0000\u0086"+
		"\u008a\u0003\u0002\u0001\u0000\u0087\u008a\u0003\u0012\t\u0000\u0088\u008a"+
		"\u0003\u0004\u0002\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u0084B\u0000\u008c\u008e\u0001"+
		"\u0000\u0000\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u0000\u0000\u0001\u0093\u0001\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u000b\u0000\u0000\u0095\u0096\u0005"+
		";\u0000\u0000\u0096\u0098\u0003h4\u0000\u0097\u0099\u0003\u001a\r\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u0003\u0001\u0000\u0000\u0000\u009a\u009e\u0003\b\u0004\u0000\u009b"+
		"\u009e\u0003\u0010\b\u0000\u009c\u009e\u0003\u0016\u000b\u0000\u009d\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u0005\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u0005;\u0000\u0000\u00a0\u00a2\u0005+\u0000\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0003\"\u0011\u0000\u00a4\u0007\u0001\u0000\u0000"+
		"\u0000\u00a5\u00b1\u0005\u0004\u0000\u0000\u00a6\u00b2\u0003\n\u0005\u0000"+
		"\u00a7\u00ad\u00051\u0000\u0000\u00a8\u00a9\u0003\n\u0005\u0000\u00a9"+
		"\u00aa\u0003\u0084B\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u00052\u0000\u0000\u00b1\u00a6\u0001\u0000\u0000\u0000\u00b1\u00a7\u0001"+
		"\u0000\u0000\u0000\u00b2\t\u0001\u0000\u0000\u0000\u00b3\u00b9\u0003\f"+
		"\u0006\u0000\u00b4\u00b6\u0003\"\u0011\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005+\u0000\u0000\u00b8\u00ba\u0003\u000e\u0007\u0000"+
		"\u00b9\u00b5\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u000b\u0001\u0000\u0000\u0000\u00bb\u00c0\u0005;\u0000\u0000\u00bc"+
		"\u00bd\u00057\u0000\u0000\u00bd\u00bf\u0005;\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\r\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c8\u0003p8\u0000"+
		"\u00c4\u00c5\u00057\u0000\u0000\u00c5\u00c7\u0003p8\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u000f"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00d7"+
		"\u0005\u0018\u0000\u0000\u00cc\u00d8\u0003\u0006\u0003\u0000\u00cd\u00d3"+
		"\u00051\u0000\u0000\u00ce\u00cf\u0003\u0006\u0003\u0000\u00cf\u00d0\u0003"+
		"\u0084B\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8\u00052\u0000"+
		"\u0000\u00d7\u00cc\u0001\u0000\u0000\u0000\u00d7\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d8\u0011\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u000b\u0000"+
		"\u0000\u00da\u00db\u0003\u0014\n\u0000\u00db\u00dc\u0005;\u0000\u0000"+
		"\u00dc\u00de\u0003h4\u0000\u00dd\u00df\u0003\u001a\r\u0000\u00de\u00dd"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u0013"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003l6\u0000\u00e1\u0015\u0001\u0000"+
		"\u0000\u0000\u00e2\u00ee\u0005\u0019\u0000\u0000\u00e3\u00ef\u0003\u0018"+
		"\f\u0000\u00e4\u00ea\u00051\u0000\u0000\u00e5\u00e6\u0003\u0018\f\u0000"+
		"\u00e6\u00e7\u0003\u0084B\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ef\u00052\u0000\u0000\u00ee\u00e3\u0001\u0000\u0000\u0000\u00ee\u00e4"+
		"\u0001\u0000\u0000\u0000\u00ef\u0017\u0001\u0000\u0000\u0000\u00f0\u00f7"+
		"\u0003\f\u0006\u0000\u00f1\u00f2\u0003\"\u0011\u0000\u00f2\u00f3\u0005"+
		"+\u0000\u0000\u00f3\u00f4\u0003\u000e\u0007\u0000\u00f4\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005+\u0000\u0000\u00f6\u00f8\u0003\u000e\u0007"+
		"\u0000\u00f7\u00f1\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f8\u0019\u0001\u0000\u0000\u0000\u00f9\u00fb\u00055\u0000\u0000"+
		"\u00fa\u00fc\u0003\u001c\u000e\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u00056\u0000\u0000\u00fe\u001b\u0001\u0000\u0000\u0000\u00ff"+
		"\u0101\u00059\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104"+
		"\u0003\u001e\u000f\u0000\u0103\u0105\u00059\u0000\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001"+
		"\u0000\u0000\u0000\u0106\u0100\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109\u001d\u0001\u0000\u0000\u0000\u010a\u0116\u0003"+
		"\u0004\u0002\u0000\u010b\u0116\u00034\u001a\u0000\u010c\u0116\u0003 \u0010"+
		"\u0000\u010d\u0116\u00036\u001b\u0000\u010e\u0116\u00038\u001c\u0000\u010f"+
		"\u0116\u0003:\u001d\u0000\u0110\u0116\u0003>\u001f\u0000\u0111\u0116\u0003"+
		"\u001a\r\u0000\u0112\u0116\u0003B!\u0000\u0113\u0116\u0003D\"\u0000\u0114"+
		"\u0116\u0003V+\u0000\u0115\u010a\u0001\u0000\u0000\u0000\u0115\u010b\u0001"+
		"\u0000\u0000\u0000\u0115\u010c\u0001\u0000\u0000\u0000\u0115\u010d\u0001"+
		"\u0000\u0000\u0000\u0115\u010e\u0001\u0000\u0000\u0000\u0115\u010f\u0001"+
		"\u0000\u0000\u0000\u0115\u0110\u0001\u0000\u0000\u0000\u0115\u0111\u0001"+
		"\u0000\u0000\u0000\u0115\u0112\u0001\u0000\u0000\u0000\u0115\u0113\u0001"+
		"\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u001f\u0001"+
		"\u0000\u0000\u0000\u0117\u011c\u0003*\u0015\u0000\u0118\u011c\u0003,\u0016"+
		"\u0000\u0119\u011c\u0003.\u0017\u0000\u011a\u011c\u0003(\u0014\u0000\u011b"+
		"\u0117\u0001\u0000\u0000\u0000\u011b\u0118\u0001\u0000\u0000\u0000\u011b"+
		"\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c"+
		"!\u0001\u0000\u0000\u0000\u011d\u0124\u0003$\u0012\u0000\u011e\u0124\u0003"+
		"x<\u0000\u011f\u0120\u00051\u0000\u0000\u0120\u0121\u0003\"\u0011\u0000"+
		"\u0121\u0122\u00052\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123"+
		"\u011d\u0001\u0000\u0000\u0000\u0123\u011e\u0001\u0000\u0000\u0000\u0123"+
		"\u011f\u0001\u0000\u0000\u0000\u0124#\u0001\u0000\u0000\u0000\u0125\u0128"+
		"\u0003&\u0013\u0000\u0126\u0128\u0005;\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128%\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0005;\u0000\u0000\u012a\u012b\u00058\u0000\u0000\u012b"+
		"\u012c\u0005;\u0000\u0000\u012c\'\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0003p8\u0000\u012e)\u0001\u0000\u0000\u0000\u012f\u0130\u0003p8\u0000"+
		"\u0130\u0131\u0005C\u0000\u0000\u0131\u0132\u0003p8\u0000\u0132+\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0003p8\u0000\u0134\u0135\u0007\u0000\u0000"+
		"\u0000\u0135-\u0001\u0000\u0000\u0000\u0136\u0137\u0003\u000e\u0007\u0000"+
		"\u0137\u0138\u00030\u0018\u0000\u0138\u0139\u0003\u000e\u0007\u0000\u0139"+
		"/\u0001\u0000\u0000\u0000\u013a\u013c\u0007\u0001\u0000\u0000\u013b\u013a"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0007\u0002\u0000\u0000\u013e1\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u00059\u0000\u0000\u01403\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0005;\u0000\u0000\u0142\u0143\u0005:\u0000\u0000\u0143"+
		"\u0144\u0003\u001e\u000f\u0000\u01445\u0001\u0000\u0000\u0000\u0145\u0147"+
		"\u0005\u0014\u0000\u0000\u0146\u0148\u0003\u000e\u0007\u0000\u0147\u0146"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u01487\u0001"+
		"\u0000\u0000\u0000\u0149\u014b\u0005\u0001\u0000\u0000\u014a\u014c\u0005"+
		";\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c9\u0001\u0000\u0000\u0000\u014d\u014f\u0005\u0005\u0000"+
		"\u0000\u014e\u0150\u0005;\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150;\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0005\r\u0000\u0000\u0152\u0153\u0005;\u0000\u0000\u0153=\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0005\t\u0000\u0000\u0155?\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0005\u0007\u0000\u0000\u0157\u0158\u0003p8\u0000"+
		"\u0158A\u0001\u0000\u0000\u0000\u0159\u0162\u0005\u000e\u0000\u0000\u015a"+
		"\u0163\u0003p8\u0000\u015b\u015c\u0003\u0084B\u0000\u015c\u015d\u0003"+
		"p8\u0000\u015d\u0163\u0001\u0000\u0000\u0000\u015e\u015f\u0003 \u0010"+
		"\u0000\u015f\u0160\u0003\u0084B\u0000\u0160\u0161\u0003p8\u0000\u0161"+
		"\u0163\u0001\u0000\u0000\u0000\u0162\u015a\u0001\u0000\u0000\u0000\u0162"+
		"\u015b\u0001\u0000\u0000\u0000\u0162\u015e\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164\u016a\u0003\u001a\r\u0000\u0165\u0168"+
		"\u0005\b\u0000\u0000\u0166\u0169\u0003B!\u0000\u0167\u0169\u0003\u001a"+
		"\r\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000"+
		"\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0165\u0001\u0000\u0000"+
		"\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016bC\u0001\u0000\u0000\u0000"+
		"\u016c\u016f\u0003F#\u0000\u016d\u016f\u0003L&\u0000\u016e\u016c\u0001"+
		"\u0000\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016fE\u0001\u0000"+
		"\u0000\u0000\u0170\u017b\u0005\u0017\u0000\u0000\u0171\u0173\u0003p8\u0000"+
		"\u0172\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000"+
		"\u0173\u017c\u0001\u0000\u0000\u0000\u0174\u0176\u0003 \u0010\u0000\u0175"+
		"\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0003\u0084B\u0000\u0178\u017a"+
		"\u0003p8\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000"+
		"\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0172\u0001\u0000"+
		"\u0000\u0000\u017b\u0175\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u0181\u00055\u0000\u0000\u017e\u0180\u0003H$\u0000"+
		"\u017f\u017e\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000"+
		"\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000"+
		"\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u00056\u0000\u0000\u0185G\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u0003J%\u0000\u0187\u0189\u0005:\u0000\u0000\u0188\u018a\u0003\u001c"+
		"\u000e\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000"+
		"\u0000\u0000\u018aI\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0002\u0000"+
		"\u0000\u018c\u018f\u0003\u000e\u0007\u0000\u018d\u018f\u0005\u0006\u0000"+
		"\u0000\u018e\u018b\u0001\u0000\u0000\u0000\u018e\u018d\u0001\u0000\u0000"+
		"\u0000\u018fK\u0001\u0000\u0000\u0000\u0190\u0199\u0005\u0017\u0000\u0000"+
		"\u0191\u019a\u0003N\'\u0000\u0192\u0193\u0003\u0084B\u0000\u0193\u0194"+
		"\u0003N\'\u0000\u0194\u019a\u0001\u0000\u0000\u0000\u0195\u0196\u0003"+
		" \u0010\u0000\u0196\u0197\u0003\u0084B\u0000\u0197\u0198\u0003N\'\u0000"+
		"\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0191\u0001\u0000\u0000\u0000"+
		"\u0199\u0192\u0001\u0000\u0000\u0000\u0199\u0195\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019f\u00055\u0000\u0000\u019c"+
		"\u019e\u0003P(\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u01a1\u0001"+
		"\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u019f\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u00056\u0000\u0000\u01a3M\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0005;\u0000\u0000\u01a5\u01a7\u0005+\u0000\u0000\u01a6"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003z=\u0000\u01a9\u01aa\u0005"+
		"8\u0000\u0000\u01aa\u01ab\u00051\u0000\u0000\u01ab\u01ac\u0005\u0018\u0000"+
		"\u0000\u01ac\u01ad\u00052\u0000\u0000\u01adO\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0003R)\u0000\u01af\u01b1\u0005:\u0000\u0000\u01b0\u01b2\u0003"+
		"\u001c\u000e\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b2Q\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005\u0002"+
		"\u0000\u0000\u01b4\u01b7\u0003T*\u0000\u01b5\u01b7\u0005\u0006\u0000\u0000"+
		"\u01b6\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b7S\u0001\u0000\u0000\u0000\u01b8\u01bd\u0003\"\u0011\u0000\u01b9"+
		"\u01ba\u00057\u0000\u0000\u01ba\u01bc\u0003\"\u0011\u0000\u01bb\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01beU\u0001"+
		"\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c8\u0005"+
		"\n\u0000\u0000\u01c1\u01c3\u0003p8\u0000\u01c2\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c9\u0003X,\u0000\u01c5\u01c7\u0003Z-\u0000\u01c6\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c2\u0001\u0000\u0000\u0000\u01c8\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003\u001a\r\u0000\u01cbW\u0001"+
		"\u0000\u0000\u0000\u01cc\u01ce\u0003 \u0010\u0000\u01cd\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d1\u0003\u0084B\u0000\u01d0\u01d2\u0003p8\u0000"+
		"\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d5\u0003\u0084B\u0000\u01d4"+
		"\u01d6\u0003 \u0010\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d6Y\u0001\u0000\u0000\u0000\u01d7\u01d8\u0003"+
		"\u000e\u0007\u0000\u01d8\u01d9\u0005+\u0000\u0000\u01d9\u01de\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0003\f\u0006\u0000\u01db\u01dc\u00050\u0000"+
		"\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u01d7\u0001\u0000\u0000"+
		"\u0000\u01dd\u01da\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000"+
		"\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0005\u0013\u0000"+
		"\u0000\u01e0\u01e1\u0003p8\u0000\u01e1[\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u00053\u0000\u0000\u01e3\u01e4\u0003^/\u0000\u01e4\u01e5\u0005"+
		"4\u0000\u0000\u01e5\u01e6\u0003`0\u0000\u01e6]\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0003p8\u0000\u01e8_\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0003\"\u0011\u0000\u01eaa\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005"+
		"3\u0000\u0000\u01ec\u01ed\u00054\u0000\u0000\u01ed\u01ee\u0003`0\u0000"+
		"\u01eec\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005;\u0000\u0000\u01f0\u01f1"+
		"\u0003l6\u0000\u01f1\u01f2\u0003j5\u0000\u01f2\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0005;\u0000\u0000\u01f4\u01f6\u0003l6\u0000\u01f5"+
		"\u01ef\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6"+
		"e\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\u000b\u0000\u0000\u01f8\u01f9"+
		"\u0003h4\u0000\u01f9g\u0001\u0000\u0000\u0000\u01fa\u01fb\u0003l6\u0000"+
		"\u01fb\u01fc\u0003j5\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01ff"+
		"\u0003l6\u0000\u01fe\u01fa\u0001\u0000\u0000\u0000\u01fe\u01fd\u0001\u0000"+
		"\u0000\u0000\u01ffi\u0001\u0000\u0000\u0000\u0200\u0203\u0003l6\u0000"+
		"\u0201\u0203\u0003\"\u0011\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202"+
		"\u0201\u0001\u0000\u0000\u0000\u0203k\u0001\u0000\u0000\u0000\u0204\u0210"+
		"\u00051\u0000\u0000\u0205\u020a\u0003n7\u0000\u0206\u0207\u00057\u0000"+
		"\u0000\u0207\u0209\u0003n7\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209"+
		"\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a"+
		"\u020b\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c"+
		"\u020a\u0001\u0000\u0000\u0000\u020d\u020f\u00057\u0000\u0000\u020e\u020d"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0211"+
		"\u0001\u0000\u0000\u0000\u0210\u0205\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u00052\u0000\u0000\u0213m\u0001\u0000\u0000\u0000\u0214\u0216\u0003\f"+
		"\u0006\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0003\"\u0011"+
		"\u0000\u0218o\u0001\u0000\u0000\u0000\u0219\u021a\u00068\uffff\uffff\u0000"+
		"\u021a\u021f\u0003r9\u0000\u021b\u021f\u0003z=\u0000\u021c\u021d\u0007"+
		"\u0003\u0000\u0000\u021d\u021f\u0003p8\u0006\u021e\u0219\u0001\u0000\u0000"+
		"\u0000\u021e\u021b\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000"+
		"\u0000\u021f\u0231\u0001\u0000\u0000\u0000\u0220\u0221\n\u0005\u0000\u0000"+
		"\u0221\u0222\u0007\u0004\u0000\u0000\u0222\u0230\u0003p8\u0006\u0223\u0224"+
		"\n\u0004\u0000\u0000\u0224\u0225\u0007\u0005\u0000\u0000\u0225\u0230\u0003"+
		"p8\u0005\u0226\u0227\n\u0003\u0000\u0000\u0227\u0228\u0007\u0006\u0000"+
		"\u0000\u0228\u0230\u0003p8\u0004\u0229\u022a\n\u0002\u0000\u0000\u022a"+
		"\u022b\u0005$\u0000\u0000\u022b\u0230\u0003p8\u0003\u022c\u022d\n\u0001"+
		"\u0000\u0000\u022d\u022e\u0005%\u0000\u0000\u022e\u0230\u0003p8\u0002"+
		"\u022f\u0220\u0001\u0000\u0000\u0000\u022f\u0223\u0001\u0000\u0000\u0000"+
		"\u022f\u0226\u0001\u0000\u0000\u0000\u022f\u0229\u0001\u0000\u0000\u0000"+
		"\u022f\u022c\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000"+
		"\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000"+
		"\u0232q\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\u00069\uffff\uffff\u0000\u0235\u0236\u0003z=\u0000\u0236\u0241"+
		"\u0001\u0000\u0000\u0000\u0237\u023d\n\u0001\u0000\u0000\u0238\u0239\u0005"+
		"8\u0000\u0000\u0239\u023e\u0005;\u0000\u0000\u023a\u023e\u0003~?\u0000"+
		"\u023b\u023e\u0003\u0080@\u0000\u023c\u023e\u0003\u0082A\u0000\u023d\u0238"+
		"\u0001\u0000\u0000\u0000\u023d\u023a\u0001\u0000\u0000\u0000\u023d\u023b"+
		"\u0001\u0000\u0000\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u0240"+
		"\u0001\u0000\u0000\u0000\u023f\u0237\u0001\u0000\u0000\u0000\u0240\u0243"+
		"\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0001\u0000\u0000\u0000\u0242s\u0001\u0000\u0000\u0000\u0243\u0241\u0001"+
		"\u0000\u0000\u0000\u0244\u0249\u0005;\u0000\u0000\u0245\u0246\u00057\u0000"+
		"\u0000\u0246\u0248\u0005;\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000"+
		"\u0248\u024b\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0001\u0000\u0000\u0000\u024au\u0001\u0000\u0000\u0000\u024b"+
		"\u0249\u0001\u0000\u0000\u0000\u024c\u024e\u0005\u001c\u0000\u0000\u024d"+
		"\u024c\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0003$\u0012\u0000\u0250w\u0001"+
		"\u0000\u0000\u0000\u0251\u0255\u0003\\.\u0000\u0252\u0255\u0003f3\u0000"+
		"\u0253\u0255\u0003b1\u0000\u0254\u0251\u0001\u0000\u0000\u0000\u0254\u0252"+
		"\u0001\u0000\u0000\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0255y\u0001"+
		"\u0000\u0000\u0000\u0256\u025d\u0003|>\u0000\u0257\u025d\u0005;\u0000"+
		"\u0000\u0258\u0259\u00051\u0000\u0000\u0259\u025a\u0003p8\u0000\u025a"+
		"\u025b\u00052\u0000\u0000\u025b\u025d\u0001\u0000\u0000\u0000\u025c\u0256"+
		"\u0001\u0000\u0000\u0000\u025c\u0257\u0001\u0000\u0000\u0000\u025c\u0258"+
		"\u0001\u0000\u0000\u0000\u025d{\u0001\u0000\u0000\u0000\u025e\u025f\u0007"+
		"\u0007\u0000\u0000\u025f}\u0001\u0000\u0000\u0000\u0260\u0261\u00053\u0000"+
		"\u0000\u0261\u0262\u0003p8\u0000\u0262\u0263\u00054\u0000\u0000\u0263"+
		"\u007f\u0001\u0000\u0000\u0000\u0264\u0274\u00053\u0000\u0000\u0265\u0267"+
		"\u0003p8\u0000\u0266\u0265\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000"+
		"\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u026a\u0005:\u0000"+
		"\u0000\u0269\u026b\u0003p8\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026a"+
		"\u026b\u0001\u0000\u0000\u0000\u026b\u0275\u0001\u0000\u0000\u0000\u026c"+
		"\u026e\u0003p8\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026d\u026e\u0001"+
		"\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0270\u0005"+
		":\u0000\u0000\u0270\u0271\u0003p8\u0000\u0271\u0272\u0005:\u0000\u0000"+
		"\u0272\u0273\u0003p8\u0000\u0273\u0275\u0001\u0000\u0000\u0000\u0274\u0266"+
		"\u0001\u0000\u0000\u0000\u0274\u026d\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u00054\u0000\u0000\u0277\u0081\u0001"+
		"\u0000\u0000\u0000\u0278\u0281\u00051\u0000\u0000\u0279\u027c\u0003\u000e"+
		"\u0007\u0000\u027a\u027b\u00057\u0000\u0000\u027b\u027d\u0003\u000e\u0007"+
		"\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000"+
		"\u0000\u027d\u027f\u0001\u0000\u0000\u0000\u027e\u0280\u00057\u0000\u0000"+
		"\u027f\u027e\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000"+
		"\u0280\u0282\u0001\u0000\u0000\u0000\u0281\u0279\u0001\u0000\u0000\u0000"+
		"\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000"+
		"\u0283\u0284\u00052\u0000\u0000\u0284\u0083\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0007\b\u0000\u0000\u0286\u0085\u0001\u0000\u0000\u0000L\u0089"+
		"\u008f\u0098\u009d\u00a1\u00ad\u00b1\u00b5\u00b9\u00c0\u00c8\u00d3\u00d7"+
		"\u00de\u00ea\u00ee\u00f7\u00fb\u0100\u0104\u0108\u0115\u011b\u0123\u0127"+
		"\u013b\u0147\u014b\u014f\u0162\u0168\u016a\u016e\u0172\u0175\u0179\u017b"+
		"\u0181\u0189\u018e\u0199\u019f\u01a6\u01b1\u01b6\u01bd\u01c2\u01c6\u01c8"+
		"\u01cd\u01d1\u01d5\u01dd\u01f5\u01fe\u0202\u020a\u020e\u0210\u0215\u021e"+
		"\u022f\u0231\u023d\u0241\u0249\u024d\u0254\u025c\u0266\u026a\u026d\u0274"+
		"\u027c\u027f\u0281";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}