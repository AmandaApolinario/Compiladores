// Generated from /home/lmscaramussa/Documents/Compiladores/T1/scanner.g by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scannerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "scanner.g"; }

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
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << FUNC) | (1L << TYPE) | (1L << VAR))) != 0)) {
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
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
			setState(132);
			match(FUNC);
			setState(133);
			match(ID);
			{
			setState(134);
			signature();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLYBRACES) {
				{
				setState(135);
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
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(138);
				constDecl();
				}
				break;
			case TYPE:
				{
				setState(139);
				typeDecl();
				}
				break;
			case VAR:
				{
				setState(140);
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
			setState(143);
			match(CONST);
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDList:
				{
				setState(144);
				constSpec();
				}
				break;
			case LPAR:
				{
				setState(145);
				match(LPAR);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDList) {
					{
					{
					setState(146);
					constSpec();
					setState(147);
					eos();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
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
			setState(157);
			match(IDList);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (ASSIGN - 54)) | (1L << (LPAR - 54)) | (1L << (ID - 54)))) != 0)) {
				{
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR || _la==ID) {
					{
					setState(158);
					type_();
					}
				}

				setState(161);
				match(ASSIGN);
				setState(162);
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
			setState(165);
			expression(0);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166);
				match(COMMA);
				setState(167);
				expression(0);
				}
				}
				setState(172);
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
			setState(173);
			match(TYPE);
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(174);
				typeSpec();
				}
				break;
			case LPAR:
				{
				setState(175);
				match(LPAR);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(176);
					typeSpec();
					setState(177);
					eos();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
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
			setState(187);
			match(ID);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(188);
				match(ASSIGN);
				}
			}

			setState(191);
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
			setState(193);
			match(FUNC);
			setState(194);
			receiver();
			setState(195);
			match(ID);
			{
			setState(196);
			signature();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLYBRACES) {
				{
				setState(197);
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
			setState(200);
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
			setState(202);
			match(VAR);
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDList:
				{
				setState(203);
				varSpec();
				}
				break;
			case LPAR:
				{
				setState(204);
				match(LPAR);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDList) {
					{
					{
					setState(205);
					varSpec();
					setState(206);
					eos();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
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
			setState(216);
			match(IDList);
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case ID:
				{
				setState(217);
				type_();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(218);
					match(ASSIGN);
					setState(219);
					expressionList();
					}
				}

				}
				break;
			case ASSIGN:
				{
				setState(222);
				match(ASSIGN);
				setState(223);
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
			setState(226);
			match(LCURLYBRACES);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (BREAK - 2)) | (1L << (CONST - 2)) | (1L << (CONTINUE - 2)) | (1L << (FALLTHROUGH - 2)) | (1L << (FOR - 2)) | (1L << (IF - 2)) | (1L << (RETURN - 2)) | (1L << (SWITCH - 2)) | (1L << (TYPE - 2)) | (1L << (VAR - 2)) | (1L << (PLUS - 2)) | (1L << (MINUS - 2)) | (1L << (TIMES - 2)) | (1L << (NOT - 2)) | (1L << (LPAR - 2)) | (1L << (LCURLYBRACES - 2)) | (1L << (SEMI - 2)) | (1L << (ID - 2)))) != 0)) {
				{
				setState(227);
				statementList();
				}
			}

			setState(230);
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
			setState(238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(232);
					match(SEMI);
					}
				}

				}
				setState(235);
				statement();
				setState(236);
				match(SEMI);
				}
				}
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (BREAK - 2)) | (1L << (CONST - 2)) | (1L << (CONTINUE - 2)) | (1L << (FALLTHROUGH - 2)) | (1L << (FOR - 2)) | (1L << (IF - 2)) | (1L << (RETURN - 2)) | (1L << (SWITCH - 2)) | (1L << (TYPE - 2)) | (1L << (VAR - 2)) | (1L << (PLUS - 2)) | (1L << (MINUS - 2)) | (1L << (TIMES - 2)) | (1L << (NOT - 2)) | (1L << (LPAR - 2)) | (1L << (LCURLYBRACES - 2)) | (1L << (SEMI - 2)) | (1L << (ID - 2)))) != 0) );
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
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				returnStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				breakStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				continueStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				fallthroughStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(250);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(251);
				switchStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(252);
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
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				incDecStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
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
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				typeName();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(LPAR);
				setState(262);
				type_();
				setState(263);
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
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				qualifiedIdent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
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
			setState(271);
			match(ID);
			setState(272);
			match(DOT);
			setState(273);
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
			setState(275);
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
			setState(277);
			expression(0);
			setState(278);
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
			setState(280);
			expressionList();
			setState(281);
			assign_op();
			setState(282);
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
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << OVER) | (1L << MOD) | (1L << OR))) != 0)) {
				{
				setState(284);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << OVER) | (1L << MOD) | (1L << OR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(287);
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
			setState(289);
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
			setState(291);
			match(ID);
			setState(292);
			match(COLON);
			setState(293);
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
			setState(295);
			match(RETURN);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
				{
				setState(296);
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
			setState(299);
			match(BREAK);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(300);
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
			setState(303);
			match(CONTINUE);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(304);
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
			setState(307);
			match(GOTO);
			setState(308);
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
			setState(310);
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
			setState(312);
			match(DEFER);
			setState(313);
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
			setState(315);
			match(IF);
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(316);
				expression(0);
				}
				break;
			case 2:
				{
				setState(317);
				eos();
				setState(318);
				expression(0);
				}
				break;
			case 3:
				{
				setState(320);
				simpleStmt();
				setState(321);
				eos();
				setState(322);
				expression(0);
				}
				break;
			}
			setState(326);
			block();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(327);
				match(ELSE);
				setState(330);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(328);
					ifStmt();
					}
					break;
				case LCURLYBRACES:
					{
					setState(329);
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
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
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
			setState(338);
			match(SWITCH);
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
					{
					setState(339);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
					{
					setState(342);
					simpleStmt();
					}
				}

				setState(345);
				eos();
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
					{
					setState(346);
					expression(0);
					}
				}

				}
				break;
			}
			setState(351);
			match(LCURLYBRACES);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(352);
				exprCaseClause();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
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
			setState(360);
			exprSwitchCase();
			setState(361);
			match(COLON);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (BREAK - 2)) | (1L << (CONST - 2)) | (1L << (CONTINUE - 2)) | (1L << (FALLTHROUGH - 2)) | (1L << (FOR - 2)) | (1L << (IF - 2)) | (1L << (RETURN - 2)) | (1L << (SWITCH - 2)) | (1L << (TYPE - 2)) | (1L << (VAR - 2)) | (1L << (PLUS - 2)) | (1L << (MINUS - 2)) | (1L << (TIMES - 2)) | (1L << (NOT - 2)) | (1L << (LPAR - 2)) | (1L << (LCURLYBRACES - 2)) | (1L << (SEMI - 2)) | (1L << (ID - 2)))) != 0)) {
				{
				setState(362);
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
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(CASE);
				setState(366);
				expressionList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
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
			setState(370);
			match(SWITCH);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(371);
				typeSwitchGuard();
				}
				break;
			case 2:
				{
				setState(372);
				eos();
				setState(373);
				typeSwitchGuard();
				}
				break;
			case 3:
				{
				setState(375);
				simpleStmt();
				setState(376);
				eos();
				setState(377);
				typeSwitchGuard();
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
				typeCaseClause();
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
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(390);
				match(ID);
				setState(391);
				match(ASSIGN);
				}
				break;
			}
			setState(394);
			operand();
			setState(395);
			match(DOT);
			setState(396);
			match(LPAR);
			setState(397);
			match(TYPE);
			setState(398);
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
			setState(400);
			typeSwitchCase();
			setState(401);
			match(COLON);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (BREAK - 2)) | (1L << (CONST - 2)) | (1L << (CONTINUE - 2)) | (1L << (FALLTHROUGH - 2)) | (1L << (FOR - 2)) | (1L << (IF - 2)) | (1L << (RETURN - 2)) | (1L << (SWITCH - 2)) | (1L << (TYPE - 2)) | (1L << (VAR - 2)) | (1L << (PLUS - 2)) | (1L << (MINUS - 2)) | (1L << (TIMES - 2)) | (1L << (NOT - 2)) | (1L << (LPAR - 2)) | (1L << (LCURLYBRACES - 2)) | (1L << (SEMI - 2)) | (1L << (ID - 2)))) != 0)) {
				{
				setState(402);
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
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(CASE);
				setState(406);
				typeList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
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
			setState(410);
			type_();
			}
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(411);
				match(COMMA);
				{
				setState(412);
				type_();
				}
				}
				}
				setState(417);
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
			setState(418);
			match(FOR);
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
					{
					setState(419);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(422);
				forClause();
				}
				break;
			case 3:
				{
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDList) | (1L << RANGE) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << NOT) | (1L << LPAR))) != 0) || _la==ID) {
					{
					setState(423);
					rangeClause();
					}
				}

				}
				break;
			}
			setState(428);
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
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
				{
				setState(430);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
			}

			setState(433);
			eos();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
				{
				setState(434);
				expression(0);
				}
			}

			setState(437);
			eos();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
				{
				setState(438);
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
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case TIMES:
			case NOT:
			case LPAR:
			case ID:
				{
				setState(441);
				expressionList();
				setState(442);
				match(ASSIGN);
				}
				break;
			case IDList:
				{
				setState(444);
				match(IDList);
				setState(445);
				match(ASSIGN);
				}
				break;
			case RANGE:
				break;
			default:
				break;
			}
			setState(448);
			match(RANGE);
			setState(449);
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
			setState(451);
			match(LBRACK);
			setState(452);
			arrayLength();
			setState(453);
			match(RBRACK);
			setState(454);
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
			setState(456);
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
			setState(458);
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
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(ID);
				setState(461);
				parameters();
				setState(462);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(ID);
				setState(465);
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
			setState(468);
			match(FUNC);
			setState(469);
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
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				parameters();
				setState(472);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
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
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
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
			setState(481);
			match(LPAR);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDList || _la==LPAR || _la==ID) {
				{
				setState(482);
				parameterDecl();
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(483);
						match(COMMA);
						setState(484);
						parameterDecl();
						}
						} 
					}
					setState(489);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(490);
					match(COMMA);
					}
				}

				}
			}

			setState(495);
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
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDList) {
				{
				setState(497);
				match(IDList);
				}
			}

			setState(500);
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
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case ID:
				{
				setState(503);
				operand();
				}
				break;
			case PLUS:
			case MINUS:
			case TIMES:
			case NOT:
				{
				setState(504);
				((ExpressionContext)_localctx).unary_op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << NOT))) != 0)) ) {
					((ExpressionContext)_localctx).unary_op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(505);
				expression(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(520);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(508);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(509);
						((ExpressionContext)_localctx).add_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << OR))) != 0)) ) {
							((ExpressionContext)_localctx).add_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(510);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(511);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(512);
						((ExpressionContext)_localctx).rel_op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ISEQUAL) | (1L << LESSTHAN) | (1L << MORETHAN) | (1L << NOTEQUAL) | (1L << LESSEQTHAN) | (1L << MOREEQTHAN))) != 0)) ) {
							((ExpressionContext)_localctx).rel_op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(513);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(514);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(515);
						match(AND);
						setState(516);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(517);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(518);
						match(OR);
						setState(519);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(524);
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
			setState(525);
			match(ID);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(526);
				match(COMMA);
				setState(527);
				match(ID);
				}
				}
				setState(532);
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
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES) {
				{
				setState(533);
				match(TIMES);
				}
			}

			setState(536);
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
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				arrayType();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
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
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(ID);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(LPAR);
				setState(544);
				expression(0);
				setState(545);
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
			setState(549);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u022a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\5\2|\n\2\3\2\3\2\7\2\u0080\n\2\f\2\16\2\u0083\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\5\3\u008b\n\3\3\4\3\4\3\4\5\4\u0090\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5\u0098\n\5\f\5\16\5\u009b\13\5\3\5\5\5\u009e\n\5\3\6\3\6\5\6"+
		"\u00a2\n\6\3\6\3\6\5\6\u00a6\n\6\3\7\3\7\3\7\7\7\u00ab\n\7\f\7\16\7\u00ae"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b6\n\b\f\b\16\b\u00b9\13\b\3\b\5"+
		"\b\u00bc\n\b\3\t\3\t\5\t\u00c0\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c9"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d3\n\f\f\f\16\f\u00d6\13"+
		"\f\3\f\5\f\u00d9\n\f\3\r\3\r\3\r\3\r\5\r\u00df\n\r\3\r\3\r\5\r\u00e3\n"+
		"\r\3\16\3\16\5\16\u00e7\n\16\3\16\3\16\3\17\5\17\u00ec\n\17\3\17\3\17"+
		"\3\17\6\17\u00f1\n\17\r\17\16\17\u00f2\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u0100\n\20\3\21\3\21\3\21\5\21\u0105\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u010c\n\22\3\23\3\23\5\23\u0110\n\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\5"+
		"\30\u0120\n\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\5\33"+
		"\u012c\n\33\3\34\3\34\5\34\u0130\n\34\3\35\3\35\5\35\u0134\n\35\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0147\n!\3!"+
		"\3!\3!\3!\5!\u014d\n!\5!\u014f\n!\3\"\3\"\5\"\u0153\n\"\3#\3#\5#\u0157"+
		"\n#\3#\5#\u015a\n#\3#\3#\5#\u015e\n#\5#\u0160\n#\3#\3#\7#\u0164\n#\f#"+
		"\16#\u0167\13#\3#\3#\3$\3$\3$\5$\u016e\n$\3%\3%\3%\5%\u0173\n%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\5&\u017e\n&\3&\3&\7&\u0182\n&\f&\16&\u0185\13&\3&"+
		"\3&\3\'\3\'\5\'\u018b\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u0196\n"+
		"(\3)\3)\3)\5)\u019b\n)\3*\3*\3*\7*\u01a0\n*\f*\16*\u01a3\13*\3+\3+\5+"+
		"\u01a7\n+\3+\3+\5+\u01ab\n+\5+\u01ad\n+\3+\3+\3,\5,\u01b2\n,\3,\3,\5,"+
		"\u01b6\n,\3,\3,\5,\u01ba\n,\3-\3-\3-\3-\3-\5-\u01c1\n-\3-\3-\3-\3.\3."+
		"\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01d5\n\61"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u01de\n\63\3\64\3\64\5\64\u01e2"+
		"\n\64\3\65\3\65\3\65\3\65\7\65\u01e8\n\65\f\65\16\65\u01eb\13\65\3\65"+
		"\5\65\u01ee\n\65\5\65\u01f0\n\65\3\65\3\65\3\66\5\66\u01f5\n\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\5\67\u01fd\n\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u020b\n\67\f\67\16\67\u020e\13\67"+
		"\38\38\38\78\u0213\n8\f8\168\u0216\138\39\59\u0219\n9\39\39\3:\3:\5:\u021f"+
		"\n:\3;\3;\3;\3;\3;\5;\u0226\n;\3<\3<\3<\2\3l=\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"\2\b\3\2./\4\2\"&--\4\2\"$\64\64\4\2\"#--\4\2\60\62\65\67\3\3AA\2\u0242"+
		"\2\u0081\3\2\2\2\4\u0086\3\2\2\2\6\u008f\3\2\2\2\b\u0091\3\2\2\2\n\u009f"+
		"\3\2\2\2\f\u00a7\3\2\2\2\16\u00af\3\2\2\2\20\u00bd\3\2\2\2\22\u00c3\3"+
		"\2\2\2\24\u00ca\3\2\2\2\26\u00cc\3\2\2\2\30\u00da\3\2\2\2\32\u00e4\3\2"+
		"\2\2\34\u00f0\3\2\2\2\36\u00ff\3\2\2\2 \u0104\3\2\2\2\"\u010b\3\2\2\2"+
		"$\u010f\3\2\2\2&\u0111\3\2\2\2(\u0115\3\2\2\2*\u0117\3\2\2\2,\u011a\3"+
		"\2\2\2.\u011f\3\2\2\2\60\u0123\3\2\2\2\62\u0125\3\2\2\2\64\u0129\3\2\2"+
		"\2\66\u012d\3\2\2\28\u0131\3\2\2\2:\u0135\3\2\2\2<\u0138\3\2\2\2>\u013a"+
		"\3\2\2\2@\u013d\3\2\2\2B\u0152\3\2\2\2D\u0154\3\2\2\2F\u016a\3\2\2\2H"+
		"\u0172\3\2\2\2J\u0174\3\2\2\2L\u018a\3\2\2\2N\u0192\3\2\2\2P\u019a\3\2"+
		"\2\2R\u019c\3\2\2\2T\u01a4\3\2\2\2V\u01b1\3\2\2\2X\u01c0\3\2\2\2Z\u01c5"+
		"\3\2\2\2\\\u01ca\3\2\2\2^\u01cc\3\2\2\2`\u01d4\3\2\2\2b\u01d6\3\2\2\2"+
		"d\u01dd\3\2\2\2f\u01e1\3\2\2\2h\u01e3\3\2\2\2j\u01f4\3\2\2\2l\u01fc\3"+
		"\2\2\2n\u020f\3\2\2\2p\u0218\3\2\2\2r\u021e\3\2\2\2t\u0225\3\2\2\2v\u0227"+
		"\3\2\2\2x|\5\4\3\2y|\5\22\n\2z|\5\6\4\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2"+
		"|}\3\2\2\2}~\5v<\2~\u0080\3\2\2\2\177{\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084\u0085\7\2\2\3\u0085\3\3\2\2\2\u0086\u0087\7\16\2\2\u0087\u0088"+
		"\7C\2\2\u0088\u008a\5d\63\2\u0089\u008b\5\32\16\2\u008a\u0089\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\5\3\2\2\2\u008c\u0090\5\b\5\2\u008d\u0090\5"+
		"\16\b\2\u008e\u0090\5\26\f\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\7\3\2\2\2\u0091\u009d\7\7\2\2\u0092\u009e\5\n\6\2"+
		"\u0093\u0099\79\2\2\u0094\u0095\5\n\6\2\u0095\u0096\5v<\2\u0096\u0098"+
		"\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7:"+
		"\2\2\u009d\u0092\3\2\2\2\u009d\u0093\3\2\2\2\u009e\t\3\2\2\2\u009f\u00a5"+
		"\7\3\2\2\u00a0\u00a2\5\"\22\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\u00a4\78\2\2\u00a4\u00a6\5\f\7\2\u00a5\u00a1"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\13\3\2\2\2\u00a7\u00ac\5l\67\2\u00a8"+
		"\u00a9\7?\2\2\u00a9\u00ab\5l\67\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\r\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00af\u00bb\7\33\2\2\u00b0\u00bc\5\20\t\2\u00b1\u00b7\79\2\2"+
		"\u00b2\u00b3\5\20\t\2\u00b3\u00b4\5v<\2\u00b4\u00b6\3\2\2\2\u00b5\u00b2"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\7:\2\2\u00bb\u00b0\3\2"+
		"\2\2\u00bb\u00b1\3\2\2\2\u00bc\17\3\2\2\2\u00bd\u00bf\7C\2\2\u00be\u00c0"+
		"\78\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\5\"\22\2\u00c2\21\3\2\2\2\u00c3\u00c4\7\16\2\2\u00c4\u00c5\5\24"+
		"\13\2\u00c5\u00c6\7C\2\2\u00c6\u00c8\5d\63\2\u00c7\u00c9\5\32\16\2\u00c8"+
		"\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\23\3\2\2\2\u00ca\u00cb\5h\65"+
		"\2\u00cb\25\3\2\2\2\u00cc\u00d8\7\34\2\2\u00cd\u00d9\5\30\r\2\u00ce\u00d4"+
		"\79\2\2\u00cf\u00d0\5\30\r\2\u00d0\u00d1\5v<\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\7:\2\2\u00d8"+
		"\u00cd\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d9\27\3\2\2\2\u00da\u00e2\7\3\2"+
		"\2\u00db\u00de\5\"\22\2\u00dc\u00dd\78\2\2\u00dd\u00df\5\f\7\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e1\78\2\2\u00e1"+
		"\u00e3\5\f\7\2\u00e2\u00db\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\31\3\2\2"+
		"\2\u00e4\u00e6\7=\2\2\u00e5\u00e7\5\34\17\2\u00e6\u00e5\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\33\3\2\2\2"+
		"\u00ea\u00ec\7A\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\5\36\20\2\u00ee\u00ef\7A\2\2\u00ef\u00f1\3\2\2\2"+
		"\u00f0\u00eb\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\35\3\2\2\2\u00f4\u0100\5\6\4\2\u00f5\u0100\5\62\32\2\u00f6"+
		"\u0100\5 \21\2\u00f7\u0100\5\64\33\2\u00f8\u0100\5\66\34\2\u00f9\u0100"+
		"\58\35\2\u00fa\u0100\5<\37\2\u00fb\u0100\5\32\16\2\u00fc\u0100\5@!\2\u00fd"+
		"\u0100\5B\"\2\u00fe\u0100\5T+\2\u00ff\u00f4\3\2\2\2\u00ff\u00f5\3\2\2"+
		"\2\u00ff\u00f6\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00f9"+
		"\3\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\37\3\2\2\2\u0101\u0105\5*\26"+
		"\2\u0102\u0105\5,\27\2\u0103\u0105\5(\25\2\u0104\u0101\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0103\3\2\2\2\u0105!\3\2\2\2\u0106\u010c\5$\23\2\u0107"+
		"\u0108\79\2\2\u0108\u0109\5\"\22\2\u0109\u010a\7:\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010c#\3\2\2\2\u010d\u0110"+
		"\5&\24\2\u010e\u0110\7C\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110"+
		"%\3\2\2\2\u0111\u0112\7C\2\2\u0112\u0113\7@\2\2\u0113\u0114\7C\2\2\u0114"+
		"\'\3\2\2\2\u0115\u0116\5l\67\2\u0116)\3\2\2\2\u0117\u0118\5l\67\2\u0118"+
		"\u0119\t\2\2\2\u0119+\3\2\2\2\u011a\u011b\5\f\7\2\u011b\u011c\5.\30\2"+
		"\u011c\u011d\5\f\7\2\u011d-\3\2\2\2\u011e\u0120\t\3\2\2\u011f\u011e\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\78\2\2\u0122"+
		"/\3\2\2\2\u0123\u0124\7A\2\2\u0124\61\3\2\2\2\u0125\u0126\7C\2\2\u0126"+
		"\u0127\7B\2\2\u0127\u0128\5\36\20\2\u0128\63\3\2\2\2\u0129\u012b\7\27"+
		"\2\2\u012a\u012c\5\f\7\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\65\3\2\2\2\u012d\u012f\7\4\2\2\u012e\u0130\7C\2\2\u012f\u012e\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130\67\3\2\2\2\u0131\u0133\7\b\2\2\u0132\u0134"+
		"\7C\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u01349\3\2\2\2\u0135\u0136"+
		"\7\20\2\2\u0136\u0137\7C\2\2\u0137;\3\2\2\2\u0138\u0139\7\f\2\2\u0139"+
		"=\3\2\2\2\u013a\u013b\7\n\2\2\u013b\u013c\5l\67\2\u013c?\3\2\2\2\u013d"+
		"\u0146\7\21\2\2\u013e\u0147\5l\67\2\u013f\u0140\5v<\2\u0140\u0141\5l\67"+
		"\2\u0141\u0147\3\2\2\2\u0142\u0143\5 \21\2\u0143\u0144\5v<\2\u0144\u0145"+
		"\5l\67\2\u0145\u0147\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u013f\3\2\2\2\u0146"+
		"\u0142\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014e\5\32\16\2\u0149\u014c\7"+
		"\13\2\2\u014a\u014d\5@!\2\u014b\u014d\5\32\16\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0149\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014fA\3\2\2\2\u0150\u0153\5D#\2\u0151\u0153\5J&\2\u0152\u0150\3"+
		"\2\2\2\u0152\u0151\3\2\2\2\u0153C\3\2\2\2\u0154\u015f\7\32\2\2\u0155\u0157"+
		"\5l\67\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0160\3\2\2\2\u0158"+
		"\u015a\5 \21\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015d\5v<\2\u015c\u015e\5l\67\2\u015d\u015c\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u0159\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0165\7=\2\2\u0162\u0164\5F$\2\u0163\u0162\3\2\2"+
		"\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7>\2\2\u0169E\3\2\2\2\u016a\u016b"+
		"\5H%\2\u016b\u016d\7B\2\2\u016c\u016e\5\34\17\2\u016d\u016c\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016eG\3\2\2\2\u016f\u0170\7\5\2\2\u0170\u0173\5\f\7\2"+
		"\u0171\u0173\7\t\2\2\u0172\u016f\3\2\2\2\u0172\u0171\3\2\2\2\u0173I\3"+
		"\2\2\2\u0174\u017d\7\32\2\2\u0175\u017e\5L\'\2\u0176\u0177\5v<\2\u0177"+
		"\u0178\5L\'\2\u0178\u017e\3\2\2\2\u0179\u017a\5 \21\2\u017a\u017b\5v<"+
		"\2\u017b\u017c\5L\'\2\u017c\u017e\3\2\2\2\u017d\u0175\3\2\2\2\u017d\u0176"+
		"\3\2\2\2\u017d\u0179\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0183\7=\2\2\u0180"+
		"\u0182\5N(\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2"+
		"\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187"+
		"\7>\2\2\u0187K\3\2\2\2\u0188\u0189\7C\2\2\u0189\u018b\78\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\5t;\2\u018d"+
		"\u018e\7@\2\2\u018e\u018f\79\2\2\u018f\u0190\7\33\2\2\u0190\u0191\7:\2"+
		"\2\u0191M\3\2\2\2\u0192\u0193\5P)\2\u0193\u0195\7B\2\2\u0194\u0196\5\34"+
		"\17\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196O\3\2\2\2\u0197\u0198"+
		"\7\5\2\2\u0198\u019b\5R*\2\u0199\u019b\7\t\2\2\u019a\u0197\3\2\2\2\u019a"+
		"\u0199\3\2\2\2\u019bQ\3\2\2\2\u019c\u01a1\5\"\22\2\u019d\u019e\7?\2\2"+
		"\u019e\u01a0\5\"\22\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2S\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01ac\7\r\2\2\u01a5\u01a7\5l\67\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01ad\3\2\2\2\u01a8\u01ad\5V,\2\u01a9\u01ab\5X-\2\u01aa\u01a9"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a6\3\2\2\2\u01ac"+
		"\u01a8\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\5\32"+
		"\16\2\u01afU\3\2\2\2\u01b0\u01b2\5 \21\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\5v<\2\u01b4\u01b6\5l\67\2\u01b5"+
		"\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\5v"+
		"<\2\u01b8\u01ba\5 \21\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"W\3\2\2\2\u01bb\u01bc\5\f\7\2\u01bc\u01bd\78\2\2\u01bd\u01c1\3\2\2\2\u01be"+
		"\u01bf\7\3\2\2\u01bf\u01c1\78\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01be\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7\26\2\2\u01c3"+
		"\u01c4\5l\67\2\u01c4Y\3\2\2\2\u01c5\u01c6\7;\2\2\u01c6\u01c7\5\\/\2\u01c7"+
		"\u01c8\7<\2\2\u01c8\u01c9\5^\60\2\u01c9[\3\2\2\2\u01ca\u01cb\5l\67\2\u01cb"+
		"]\3\2\2\2\u01cc\u01cd\5\"\22\2\u01cd_\3\2\2\2\u01ce\u01cf\7C\2\2\u01cf"+
		"\u01d0\5h\65\2\u01d0\u01d1\5f\64\2\u01d1\u01d5\3\2\2\2\u01d2\u01d3\7C"+
		"\2\2\u01d3\u01d5\5h\65\2\u01d4\u01ce\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"a\3\2\2\2\u01d6\u01d7\7\16\2\2\u01d7\u01d8\5d\63\2\u01d8c\3\2\2\2\u01d9"+
		"\u01da\5h\65\2\u01da\u01db\5f\64\2\u01db\u01de\3\2\2\2\u01dc\u01de\5h"+
		"\65\2\u01dd\u01d9\3\2\2\2\u01dd\u01dc\3\2\2\2\u01dee\3\2\2\2\u01df\u01e2"+
		"\5h\65\2\u01e0\u01e2\5\"\22\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2"+
		"\u01e2g\3\2\2\2\u01e3\u01ef\79\2\2\u01e4\u01e9\5j\66\2\u01e5\u01e6\7?"+
		"\2\2\u01e6\u01e8\5j\66\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01ec\u01ee\7?\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01f0\3\2\2\2\u01ef\u01e4\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01f2\7:\2\2\u01f2i\3\2\2\2\u01f3\u01f5\7\3\2\2\u01f4\u01f3"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\5\"\22\2"+
		"\u01f7k\3\2\2\2\u01f8\u01f9\b\67\1\2\u01f9\u01fd\5t;\2\u01fa\u01fb\t\4"+
		"\2\2\u01fb\u01fd\5l\67\7\u01fc\u01f8\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd"+
		"\u020c\3\2\2\2\u01fe\u01ff\f\6\2\2\u01ff\u0200\t\5\2\2\u0200\u020b\5l"+
		"\67\7\u0201\u0202\f\5\2\2\u0202\u0203\t\6\2\2\u0203\u020b\5l\67\6\u0204"+
		"\u0205\f\4\2\2\u0205\u0206\7,\2\2\u0206\u020b\5l\67\5\u0207\u0208\f\3"+
		"\2\2\u0208\u0209\7-\2\2\u0209\u020b\5l\67\4\u020a\u01fe\3\2\2\2\u020a"+
		"\u0201\3\2\2\2\u020a\u0204\3\2\2\2\u020a\u0207\3\2\2\2\u020b\u020e\3\2"+
		"\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020dm\3\2\2\2\u020e\u020c"+
		"\3\2\2\2\u020f\u0214\7C\2\2\u0210\u0211\7?\2\2\u0211\u0213\7C\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215o\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\7$\2\2\u0218\u0217"+
		"\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\5$\23\2\u021b"+
		"q\3\2\2\2\u021c\u021f\5Z.\2\u021d\u021f\5b\62\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021d\3\2\2\2\u021fs\3\2\2\2\u0220\u0226\7C\2\2\u0221\u0222\79\2\2\u0222"+
		"\u0223\5l\67\2\u0223\u0224\7:\2\2\u0224\u0226\3\2\2\2\u0225\u0220\3\2"+
		"\2\2\u0225\u0221\3\2\2\2\u0226u\3\2\2\2\u0227\u0228\t\7\2\2\u0228w\3\2"+
		"\2\2D{\u0081\u008a\u008f\u0099\u009d\u00a1\u00a5\u00ac\u00b7\u00bb\u00bf"+
		"\u00c8\u00d4\u00d8\u00de\u00e2\u00e6\u00eb\u00f2\u00ff\u0104\u010b\u010f"+
		"\u011f\u012b\u012f\u0133\u0146\u014c\u014e\u0152\u0156\u0159\u015d\u015f"+
		"\u0165\u016d\u0172\u017d\u0183\u018a\u0195\u019a\u01a1\u01a6\u01aa\u01ac"+
		"\u01b1\u01b5\u01b9\u01c0\u01d4\u01dd\u01e1\u01e9\u01ed\u01ef\u01f4\u01fc"+
		"\u020a\u020c\u0214\u0218\u021e\u0225";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}