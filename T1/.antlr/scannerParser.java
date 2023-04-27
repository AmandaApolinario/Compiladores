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
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (ASSIGN - 54)) | (1L << (LPAR - 54)) | (1L << (ID - 54)))) != 0)) {
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
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (BREAK - 2)) | (1L << (CONST - 2)) | (1L << (CONTINUE - 2)) | (1L << (FALLTHROUGH - 2)) | (1L << (FOR - 2)) | (1L << (IF - 2)) | (1L << (RETURN - 2)) | (1L << (SWITCH - 2)) | (1L << (TYPE - 2)) | (1L << (VAR - 2)) | (1L << (PLUS - 2)) | (1L << (MINUS - 2)) | (1L << (TIMES - 2)) | (1L << (NOT - 2)) | (1L << (LPAR - 2)) | (1L << (LCURLYBRACES - 2)) | (1L << (SEMI - 2)) | (1L << (ID - 2)))) != 0)) {
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
		enterRule(_localctx, 42, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << OVER) | (1L << MOD) | (1L << OR))) != 0)) {
				{
				setState(268);
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

	public static class EmptyStmtContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(scannerParser.SEMI, 0); }
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
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
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (BREAK - 2)) | (1L << (CONST - 2)) | (1L << (CONTINUE - 2)) | (1L << (FALLTHROUGH - 2)) | (1L << (FOR - 2)) | (1L << (IF - 2)) | (1L << (RETURN - 2)) | (1L << (SWITCH - 2)) | (1L << (TYPE - 2)) | (1L << (VAR - 2)) | (1L << (PLUS - 2)) | (1L << (MINUS - 2)) | (1L << (TIMES - 2)) | (1L << (NOT - 2)) | (1L << (LPAR - 2)) | (1L << (LCURLYBRACES - 2)) | (1L << (ID - 2)))) != 0)) {
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
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
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

	public static class FallthroughStmtContext extends ParserRuleContext {
		public TerminalNode FALLTHROUGH() { return getToken(scannerParser.FALLTHROUGH, 0); }
		public FallthroughStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStmt; }
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
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
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
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
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
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
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
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (BREAK - 2)) | (1L << (CONST - 2)) | (1L << (CONTINUE - 2)) | (1L << (FALLTHROUGH - 2)) | (1L << (FOR - 2)) | (1L << (IF - 2)) | (1L << (RETURN - 2)) | (1L << (SWITCH - 2)) | (1L << (TYPE - 2)) | (1L << (VAR - 2)) | (1L << (PLUS - 2)) | (1L << (MINUS - 2)) | (1L << (TIMES - 2)) | (1L << (NOT - 2)) | (1L << (LPAR - 2)) | (1L << (LCURLYBRACES - 2)) | (1L << (SEMI - 2)) | (1L << (ID - 2)))) != 0)) {
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
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (BREAK - 2)) | (1L << (CONST - 2)) | (1L << (CONTINUE - 2)) | (1L << (FALLTHROUGH - 2)) | (1L << (FOR - 2)) | (1L << (IF - 2)) | (1L << (RETURN - 2)) | (1L << (SWITCH - 2)) | (1L << (TYPE - 2)) | (1L << (VAR - 2)) | (1L << (PLUS - 2)) | (1L << (MINUS - 2)) | (1L << (TIMES - 2)) | (1L << (NOT - 2)) | (1L << (LPAR - 2)) | (1L << (LCURLYBRACES - 2)) | (1L << (SEMI - 2)) | (1L << (ID - 2)))) != 0)) {
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
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDList) | (1L << RANGE) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << NOT) | (1L << LPAR))) != 0) || _la==ID) {
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
		enterRule(_localctx, 82, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
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
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
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
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PLUS - 32)) | (1L << (MINUS - 32)) | (1L << (TIMES - 32)) | (1L << (NOT - 32)) | (1L << (LPAR - 32)) | (1L << (ID - 32)))) != 0)) {
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << NOT))) != 0)) ) {
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
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << OR))) != 0)) ) {
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
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ISEQUAL) | (1L << LESSTHAN) | (1L << MORETHAN) | (1L << NOTEQUAL) | (1L << LESSEQTHAN) | (1L << MOREEQTHAN))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u021b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\5\2z\n\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0082\n\3\f\3\16\3\u0085\13\3\3"+
		"\3\5\3\u0088\n\3\3\4\3\4\5\4\u008c\n\4\3\4\3\4\5\4\u0090\n\4\3\5\3\5\3"+
		"\5\7\5\u0095\n\5\f\5\16\5\u0098\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a0"+
		"\n\6\f\6\16\6\u00a3\13\6\3\6\5\6\u00a6\n\6\3\7\3\7\5\7\u00aa\n\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\5\b\u00b2\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00b9\n\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c3\n\13\f\13\16\13\u00c6\13"+
		"\13\3\13\5\13\u00c9\n\13\3\f\3\f\3\f\3\f\5\f\u00cf\n\f\3\f\3\f\5\f\u00d3"+
		"\n\f\3\r\3\r\5\r\u00d7\n\r\3\r\3\r\3\16\5\16\u00dc\n\16\3\16\3\16\3\16"+
		"\6\16\u00e1\n\16\r\16\16\16\u00e2\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00f0\n\17\3\20\3\20\3\20\5\20\u00f5\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00fc\n\21\3\22\3\22\5\22\u0100\n\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\5\27\u0110"+
		"\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\5\31\u0119\n\31\3\32\3\32\5\32"+
		"\u011d\n\32\3\33\3\33\5\33\u0121\n\33\3\34\3\34\5\34\u0125\n\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0138"+
		"\n \3 \3 \3 \3 \5 \u013e\n \5 \u0140\n \3!\3!\5!\u0144\n!\3\"\3\"\5\""+
		"\u0148\n\"\3\"\5\"\u014b\n\"\3\"\3\"\5\"\u014f\n\"\5\"\u0151\n\"\3\"\3"+
		"\"\7\"\u0155\n\"\f\"\16\"\u0158\13\"\3\"\3\"\3#\3#\3#\5#\u015f\n#\3$\3"+
		"$\3$\5$\u0164\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u016f\n%\3%\3%\7%\u0173"+
		"\n%\f%\16%\u0176\13%\3%\3%\3&\3&\5&\u017c\n&\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\5\'\u0187\n\'\3(\3(\3(\5(\u018c\n(\3)\3)\3)\7)\u0191\n)\f)\16)\u0194"+
		"\13)\3*\3*\5*\u0198\n*\3*\3*\5*\u019c\n*\5*\u019e\n*\3*\3*\3+\5+\u01a3"+
		"\n+\3+\3+\5+\u01a7\n+\3+\3+\5+\u01ab\n+\3,\3,\3,\3,\3,\5,\u01b2\n,\3,"+
		"\3,\3,\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01c6"+
		"\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u01cf\n\62\3\63\3\63\5\63"+
		"\u01d3\n\63\3\64\3\64\3\64\3\64\7\64\u01d9\n\64\f\64\16\64\u01dc\13\64"+
		"\3\64\5\64\u01df\n\64\5\64\u01e1\n\64\3\64\3\64\3\65\5\65\u01e6\n\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\5\66\u01ee\n\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u01fc\n\66\f\66\16\66\u01ff\13"+
		"\66\3\67\3\67\3\67\7\67\u0204\n\67\f\67\16\67\u0207\13\67\38\58\u020a"+
		"\n8\38\38\39\39\59\u0210\n9\3:\3:\3:\3:\3:\5:\u0217\n:\3;\3;\3;\2\3j<"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprt\2\b\3\2./\4\2\"&--\4\2\"$\64\64\4\2\"#--\4\2\60"+
		"\62\65\67\3\3AA\2\u0232\2y\3\2\2\2\4{\3\2\2\2\6\u0089\3\2\2\2\b\u0091"+
		"\3\2\2\2\n\u0099\3\2\2\2\f\u00a7\3\2\2\2\16\u00ad\3\2\2\2\20\u00b3\3\2"+
		"\2\2\22\u00ba\3\2\2\2\24\u00bc\3\2\2\2\26\u00ca\3\2\2\2\30\u00d4\3\2\2"+
		"\2\32\u00e0\3\2\2\2\34\u00ef\3\2\2\2\36\u00f4\3\2\2\2 \u00fb\3\2\2\2\""+
		"\u00ff\3\2\2\2$\u0101\3\2\2\2&\u0105\3\2\2\2(\u0107\3\2\2\2*\u010a\3\2"+
		"\2\2,\u010f\3\2\2\2.\u0113\3\2\2\2\60\u0115\3\2\2\2\62\u011a\3\2\2\2\64"+
		"\u011e\3\2\2\2\66\u0122\3\2\2\28\u0126\3\2\2\2:\u0129\3\2\2\2<\u012b\3"+
		"\2\2\2>\u012e\3\2\2\2@\u0143\3\2\2\2B\u0145\3\2\2\2D\u015b\3\2\2\2F\u0163"+
		"\3\2\2\2H\u0165\3\2\2\2J\u017b\3\2\2\2L\u0183\3\2\2\2N\u018b\3\2\2\2P"+
		"\u018d\3\2\2\2R\u0195\3\2\2\2T\u01a2\3\2\2\2V\u01b1\3\2\2\2X\u01b6\3\2"+
		"\2\2Z\u01bb\3\2\2\2\\\u01bd\3\2\2\2^\u01c5\3\2\2\2`\u01c7\3\2\2\2b\u01ce"+
		"\3\2\2\2d\u01d2\3\2\2\2f\u01d4\3\2\2\2h\u01e5\3\2\2\2j\u01ed\3\2\2\2l"+
		"\u0200\3\2\2\2n\u0209\3\2\2\2p\u020f\3\2\2\2r\u0216\3\2\2\2t\u0218\3\2"+
		"\2\2vz\5\4\3\2wz\5\n\6\2xz\5\24\13\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\3"+
		"\3\2\2\2{\u0087\7\7\2\2|\u0088\5\6\4\2}\u0083\79\2\2~\177\5\6\4\2\177"+
		"\u0080\5t;\2\u0080\u0082\3\2\2\2\u0081~\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0088\7:\2\2\u0087|\3\2\2\2\u0087}\3\2\2\2\u0088\5\3\2\2\2"+
		"\u0089\u008f\7\3\2\2\u008a\u008c\5 \21\2\u008b\u008a\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\78\2\2\u008e\u0090\5\b\5\2\u008f"+
		"\u008b\3\2\2\2\u008f\u0090\3\2\2\2\u0090\7\3\2\2\2\u0091\u0096\5j\66\2"+
		"\u0092\u0093\7?\2\2\u0093\u0095\5j\66\2\u0094\u0092\3\2\2\2\u0095\u0098"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\t\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u00a5\7\33\2\2\u009a\u00a6\5\f\7\2\u009b\u00a1\7"+
		"9\2\2\u009c\u009d\5\f\7\2\u009d\u009e\5t;\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\7:\2\2\u00a5"+
		"\u009a\3\2\2\2\u00a5\u009b\3\2\2\2\u00a6\13\3\2\2\2\u00a7\u00a9\7C\2\2"+
		"\u00a8\u00aa\78\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\5 \21\2\u00ac\r\3\2\2\2\u00ad\u00ae\7\16\2\2\u00ae"+
		"\u00af\7C\2\2\u00af\u00b1\5b\62\2\u00b0\u00b2\5\30\r\2\u00b1\u00b0\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\17\3\2\2\2\u00b3\u00b4\7\16\2\2\u00b4\u00b5"+
		"\5\22\n\2\u00b5\u00b6\7C\2\2\u00b6\u00b8\5b\62\2\u00b7\u00b9\5\30\r\2"+
		"\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\21\3\2\2\2\u00ba\u00bb"+
		"\5f\64\2\u00bb\23\3\2\2\2\u00bc\u00c8\7\34\2\2\u00bd\u00c9\5\26\f\2\u00be"+
		"\u00c4\79\2\2\u00bf\u00c0\5\26\f\2\u00c0\u00c1\5t;\2\u00c1\u00c3\3\2\2"+
		"\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\7:\2\2\u00c8"+
		"\u00bd\3\2\2\2\u00c8\u00be\3\2\2\2\u00c9\25\3\2\2\2\u00ca\u00d2\7\3\2"+
		"\2\u00cb\u00ce\5 \21\2\u00cc\u00cd\78\2\2\u00cd\u00cf\5\b\5\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d1\78\2\2\u00d1"+
		"\u00d3\5\b\5\2\u00d2\u00cb\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\27\3\2\2"+
		"\2\u00d4\u00d6\7=\2\2\u00d5\u00d7\5\32\16\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9\31\3\2\2\2"+
		"\u00da\u00dc\7A\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\5\34\17\2\u00de\u00df\5t;\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00db\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\33\3\2\2\2\u00e4\u00f0\5\2\2\2\u00e5\u00f0\5\60\31\2\u00e6"+
		"\u00f0\5\36\20\2\u00e7\u00f0\5\62\32\2\u00e8\u00f0\5\64\33\2\u00e9\u00f0"+
		"\5\66\34\2\u00ea\u00f0\5:\36\2\u00eb\u00f0\5\30\r\2\u00ec\u00f0\5> \2"+
		"\u00ed\u00f0\5@!\2\u00ee\u00f0\5R*\2\u00ef\u00e4\3\2\2\2\u00ef\u00e5\3"+
		"\2\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef"+
		"\u00e9\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\35\3\2\2\2\u00f1\u00f5"+
		"\5(\25\2\u00f2\u00f5\5*\26\2\u00f3\u00f5\5&\24\2\u00f4\u00f1\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00fc\5\"\22"+
		"\2\u00f7\u00f8\79\2\2\u00f8\u00f9\5 \21\2\u00f9\u00fa\7:\2\2\u00fa\u00fc"+
		"\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc!\3\2\2\2\u00fd"+
		"\u0100\5$\23\2\u00fe\u0100\7C\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2"+
		"\2\2\u0100#\3\2\2\2\u0101\u0102\7C\2\2\u0102\u0103\7@\2\2\u0103\u0104"+
		"\7C\2\2\u0104%\3\2\2\2\u0105\u0106\5j\66\2\u0106\'\3\2\2\2\u0107\u0108"+
		"\5j\66\2\u0108\u0109\t\2\2\2\u0109)\3\2\2\2\u010a\u010b\5\b\5\2\u010b"+
		"\u010c\5,\27\2\u010c\u010d\5\b\5\2\u010d+\3\2\2\2\u010e\u0110\t\3\2\2"+
		"\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112"+
		"\78\2\2\u0112-\3\2\2\2\u0113\u0114\7A\2\2\u0114/\3\2\2\2\u0115\u0116\7"+
		"C\2\2\u0116\u0118\7B\2\2\u0117\u0119\5\34\17\2\u0118\u0117\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\61\3\2\2\2\u011a\u011c\7\27\2\2\u011b\u011d\5\b\5"+
		"\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\63\3\2\2\2\u011e\u0120"+
		"\7\4\2\2\u011f\u0121\7C\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\65\3\2\2\2\u0122\u0124\7\b\2\2\u0123\u0125\7C\2\2\u0124\u0123\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\67\3\2\2\2\u0126\u0127\7\20\2\2\u0127\u0128"+
		"\7C\2\2\u01289\3\2\2\2\u0129\u012a\7\f\2\2\u012a;\3\2\2\2\u012b\u012c"+
		"\7\n\2\2\u012c\u012d\5j\66\2\u012d=\3\2\2\2\u012e\u0137\7\21\2\2\u012f"+
		"\u0138\5j\66\2\u0130\u0131\5t;\2\u0131\u0132\5j\66\2\u0132\u0138\3\2\2"+
		"\2\u0133\u0134\5\36\20\2\u0134\u0135\5t;\2\u0135\u0136\5j\66\2\u0136\u0138"+
		"\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0130\3\2\2\2\u0137\u0133\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013f\5\30\r\2\u013a\u013d\7\13\2\2\u013b\u013e\5"+
		"> \2\u013c\u013e\5\30\r\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u0140\3\2\2\2\u0140?\3\2\2\2"+
		"\u0141\u0144\5B\"\2\u0142\u0144\5H%\2\u0143\u0141\3\2\2\2\u0143\u0142"+
		"\3\2\2\2\u0144A\3\2\2\2\u0145\u0150\7\32\2\2\u0146\u0148\5j\66\2\u0147"+
		"\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0151\3\2\2\2\u0149\u014b\5\36"+
		"\20\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014e\5t;\2\u014d\u014f\5j\66\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2"+
		"\2\u014f\u0151\3\2\2\2\u0150\u0147\3\2\2\2\u0150\u014a\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0156\7=\2\2\u0153\u0155\5D#\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7>\2\2\u015aC\3\2\2\2\u015b\u015c"+
		"\5F$\2\u015c\u015e\7B\2\2\u015d\u015f\5\32\16\2\u015e\u015d\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015fE\3\2\2\2\u0160\u0161\7\5\2\2\u0161\u0164\5\b\5\2"+
		"\u0162\u0164\7\t\2\2\u0163\u0160\3\2\2\2\u0163\u0162\3\2\2\2\u0164G\3"+
		"\2\2\2\u0165\u016e\7\32\2\2\u0166\u016f\5J&\2\u0167\u0168\5t;\2\u0168"+
		"\u0169\5J&\2\u0169\u016f\3\2\2\2\u016a\u016b\5\36\20\2\u016b\u016c\5t"+
		";\2\u016c\u016d\5J&\2\u016d\u016f\3\2\2\2\u016e\u0166\3\2\2\2\u016e\u0167"+
		"\3\2\2\2\u016e\u016a\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0174\7=\2\2\u0171"+
		"\u0173\5L\'\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\7>\2\2\u0178I\3\2\2\2\u0179\u017a\7C\2\2\u017a\u017c\78\2\2\u017b"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\5r"+
		":\2\u017e\u017f\7@\2\2\u017f\u0180\79\2\2\u0180\u0181\7\33\2\2\u0181\u0182"+
		"\7:\2\2\u0182K\3\2\2\2\u0183\u0184\5N(\2\u0184\u0186\7B\2\2\u0185\u0187"+
		"\5\32\16\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187M\3\2\2\2\u0188"+
		"\u0189\7\5\2\2\u0189\u018c\5P)\2\u018a\u018c\7\t\2\2\u018b\u0188\3\2\2"+
		"\2\u018b\u018a\3\2\2\2\u018cO\3\2\2\2\u018d\u0192\5 \21\2\u018e\u018f"+
		"\7?\2\2\u018f\u0191\5 \21\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193Q\3\2\2\2\u0194\u0192\3\2\2\2"+
		"\u0195\u019d\7\r\2\2\u0196\u0198\5j\66\2\u0197\u0196\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u019e\3\2\2\2\u0199\u019e\5T+\2\u019a\u019c\5V,\2\u019b"+
		"\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u0197\3\2"+
		"\2\2\u019d\u0199\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\5\30\r\2\u01a0S\3\2\2\2\u01a1\u01a3\5\36\20\2\u01a2\u01a1\3\2\2"+
		"\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\5t;\2\u01a5\u01a7"+
		"\5j\66\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01aa\5t;\2\u01a9\u01ab\5\36\20\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01abU\3\2\2\2\u01ac\u01ad\5\b\5\2\u01ad\u01ae\78\2\2\u01ae\u01b2"+
		"\3\2\2\2\u01af\u01b0\7\3\2\2\u01b0\u01b2\78\2\2\u01b1\u01ac\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7\26"+
		"\2\2\u01b4\u01b5\5j\66\2\u01b5W\3\2\2\2\u01b6\u01b7\7;\2\2\u01b7\u01b8"+
		"\5Z.\2\u01b8\u01b9\7<\2\2\u01b9\u01ba\5\\/\2\u01baY\3\2\2\2\u01bb\u01bc"+
		"\5j\66\2\u01bc[\3\2\2\2\u01bd\u01be\5 \21\2\u01be]\3\2\2\2\u01bf\u01c0"+
		"\7C\2\2\u01c0\u01c1\5f\64\2\u01c1\u01c2\5d\63\2\u01c2\u01c6\3\2\2\2\u01c3"+
		"\u01c4\7C\2\2\u01c4\u01c6\5f\64\2\u01c5\u01bf\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c6_\3\2\2\2\u01c7\u01c8\7\16\2\2\u01c8\u01c9\5b\62\2\u01c9a\3"+
		"\2\2\2\u01ca\u01cb\5f\64\2\u01cb\u01cc\5d\63\2\u01cc\u01cf\3\2\2\2\u01cd"+
		"\u01cf\5f\64\2\u01ce\u01ca\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cfc\3\2\2\2"+
		"\u01d0\u01d3\5f\64\2\u01d1\u01d3\5 \21\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1"+
		"\3\2\2\2\u01d3e\3\2\2\2\u01d4\u01e0\79\2\2\u01d5\u01da\5h\65\2\u01d6\u01d7"+
		"\7?\2\2\u01d7\u01d9\5h\65\2\u01d8\u01d6\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2"+
		"\2\2\u01dd\u01df\7?\2\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e1\3\2\2\2\u01e0\u01d5\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e3\7:\2\2\u01e3g\3\2\2\2\u01e4\u01e6\7\3\2\2\u01e5\u01e4"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\5 \21\2\u01e8"+
		"i\3\2\2\2\u01e9\u01ea\b\66\1\2\u01ea\u01ee\5r:\2\u01eb\u01ec\t\4\2\2\u01ec"+
		"\u01ee\5j\66\7\u01ed\u01e9\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01fd\3\2"+
		"\2\2\u01ef\u01f0\f\6\2\2\u01f0\u01f1\t\5\2\2\u01f1\u01fc\5j\66\7\u01f2"+
		"\u01f3\f\5\2\2\u01f3\u01f4\t\6\2\2\u01f4\u01fc\5j\66\6\u01f5\u01f6\f\4"+
		"\2\2\u01f6\u01f7\7,\2\2\u01f7\u01fc\5j\66\5\u01f8\u01f9\f\3\2\2\u01f9"+
		"\u01fa\7-\2\2\u01fa\u01fc\5j\66\4\u01fb\u01ef\3\2\2\2\u01fb\u01f2\3\2"+
		"\2\2\u01fb\u01f5\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fek\3\2\2\2\u01ff\u01fd\3\2\2\2"+
		"\u0200\u0205\7C\2\2\u0201\u0202\7?\2\2\u0202\u0204\7C\2\2\u0203\u0201"+
		"\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"m\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020a\7$\2\2\u0209\u0208\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\5\"\22\2\u020co\3\2\2\2"+
		"\u020d\u0210\5X-\2\u020e\u0210\5`\61\2\u020f\u020d\3\2\2\2\u020f\u020e"+
		"\3\2\2\2\u0210q\3\2\2\2\u0211\u0217\7C\2\2\u0212\u0213\79\2\2\u0213\u0214"+
		"\5j\66\2\u0214\u0215\7:\2\2\u0215\u0217\3\2\2\2\u0216\u0211\3\2\2\2\u0216"+
		"\u0212\3\2\2\2\u0217s\3\2\2\2\u0218\u0219\t\7\2\2\u0219u\3\2\2\2Cy\u0083"+
		"\u0087\u008b\u008f\u0096\u00a1\u00a5\u00a9\u00b1\u00b8\u00c4\u00c8\u00ce"+
		"\u00d2\u00d6\u00db\u00e2\u00ef\u00f4\u00fb\u00ff\u010f\u0118\u011c\u0120"+
		"\u0124\u0137\u013d\u013f\u0143\u0147\u014a\u014e\u0150\u0156\u015e\u0163"+
		"\u016e\u0174\u017b\u0186\u018b\u0192\u0197\u019b\u019d\u01a2\u01a6\u01aa"+
		"\u01b1\u01c5\u01ce\u01d2\u01da\u01de\u01e0\u01e5\u01ed\u01fb\u01fd\u0205"+
		"\u0209\u020f\u0216";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}