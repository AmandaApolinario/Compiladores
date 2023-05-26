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
		COMMENT=65, BLOCK_COMMENT=66, WHITESPACE=67, UNKNOWN=68, PLUSparam=69, 
		EOS=70;
	public static final int
		RULE_begin = 0, RULE_functionDecl = 1, RULE_declaration = 2, RULE_typeSpec = 3, 
		RULE_constDecl = 4, RULE_constSpec = 5, RULE_declareAssignment = 6, RULE_idList = 7, 
		RULE_expressionList = 8, RULE_funcCall = 9, RULE_typeDecl = 10, RULE_varDecl = 11, 
		RULE_varSpec = 12, RULE_block = 13, RULE_statementList = 14, RULE_statement = 15, 
		RULE_simpleStmt = 16, RULE_type_ = 17, RULE_expressionStmt = 18, RULE_incDecStmt = 19, 
		RULE_assignment = 20, RULE_assign_op = 21, RULE_emptyStmt = 22, RULE_labeledStmt = 23, 
		RULE_returnStmt = 24, RULE_breakStmt = 25, RULE_continueStmt = 26, RULE_fallthroughStmt = 27, 
		RULE_deferStmt = 28, RULE_ifStmt = 29, RULE_switchStmt = 30, RULE_exprSwitchStmt = 31, 
		RULE_exprCaseClause = 32, RULE_exprSwitchCase = 33, RULE_typeSwitchStmt = 34, 
		RULE_typeSwitchGuard = 35, RULE_typeCaseClause = 36, RULE_typeSwitchCase = 37, 
		RULE_typeList = 38, RULE_forStmt = 39, RULE_forClause = 40, RULE_rangeClause = 41, 
		RULE_arrayType = 42, RULE_arrayLength = 43, RULE_functionType = 44, RULE_result = 45, 
		RULE_parameters = 46, RULE_parameterDecl = 47, RULE_expression = 48, RULE_primaryExpr = 49, 
		RULE_identifierList = 50, RULE_embeddedField = 51, RULE_typeLit = 52, 
		RULE_operand = 53, RULE_basicLit = 54, RULE_index = 55, RULE_bool = 56, 
		RULE_arguments = 57, RULE_eos = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "functionDecl", "declaration", "typeSpec", "constDecl", "constSpec", 
			"declareAssignment", "idList", "expressionList", "funcCall", "typeDecl", 
			"varDecl", "varSpec", "block", "statementList", "statement", "simpleStmt", 
			"type_", "expressionStmt", "incDecStmt", "assignment", "assign_op", "emptyStmt", 
			"labeledStmt", "returnStmt", "breakStmt", "continueStmt", "fallthroughStmt", 
			"deferStmt", "ifStmt", "switchStmt", "exprSwitchStmt", "exprCaseClause", 
			"exprSwitchCase", "typeSwitchStmt", "typeSwitchGuard", "typeCaseClause", 
			"typeSwitchCase", "typeList", "forStmt", "forClause", "rangeClause", 
			"arrayType", "arrayLength", "functionType", "result", "parameters", "parameterDecl", 
			"expression", "primaryExpr", "identifierList", "embeddedField", "typeLit", 
			"operand", "basicLit", "index", "bool", "arguments", "eos"
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
			"WHITESPACE", "UNKNOWN", "PLUSparam", "EOS"
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
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 201334800L) != 0) {
				{
				{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
					{
					setState(118);
					functionDecl();
					}
					break;
				case CONST:
				case TYPE:
				case VAR:
					{
					setState(119);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122);
				eos();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			parameters();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2317102008282128384L) != 0) {
				{
				setState(134);
				type_();
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLYBRACES) {
				{
				setState(137);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(140);
				constDecl();
				}
				break;
			case TYPE:
				{
				setState(141);
				typeDecl();
				}
				break;
			case VAR:
				{
				setState(142);
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
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(146);
				match(ASSIGN);
				}
			}

			setState(149);
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
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(CONST);
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(152);
				constSpec();
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
					constSpec();
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
	}

	public final ConstSpecContext constSpec() throws RecognitionException {
		ConstSpecContext _localctx = new ConstSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			idList();
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2317102008282128384L) != 0) {
					{
					setState(166);
					type_();
					}
				}

				setState(169);
				match(ASSIGN);
				setState(170);
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
	}

	public final DeclareAssignmentContext declareAssignment() throws RecognitionException {
		DeclareAssignmentContext _localctx = new DeclareAssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declareAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ID);
			setState(174);
			match(DECLARE_ASSIGN);
			setState(175);
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
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				match(ID);
				}
				}
				setState(184);
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
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			expression(0);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					match(COMMA);
					setState(187);
					expression(0);
					}
					} 
				}
				setState(192);
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
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ID);
			setState(194);
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
	}

	public final TypeDeclContext typeDecl() throws RecognitionException {
		TypeDeclContext _localctx = new TypeDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(TYPE);
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(197);
				typeSpec();
				}
				break;
			case LPAR:
				{
				setState(198);
				match(LPAR);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(199);
					typeSpec();
					setState(200);
					eos();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
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
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(VAR);
			setState(211);
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
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			idList();
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(214);
				arrayType();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(215);
					match(ASSIGN);
					setState(216);
					expressionList();
					}
				}

				}
				break;
			case 2:
				{
				setState(219);
				type_();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(220);
					match(ASSIGN);
					setState(221);
					expressionList();
					}
				}

				}
				break;
			case 3:
				{
				setState(224);
				match(ASSIGN);
				setState(225);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LCURLYBRACES);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -845515643533881575L) != 0) {
				{
				setState(229);
				statementList();
				}
			}

			setState(232);
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
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(234);
					match(SEMI);
					}
				}

				}
				setState(237);
				statement();
				{
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(238);
					match(SEMI);
					}
					break;
				}
				}
				}
				}
				setState(243); 
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				returnStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(BREAK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				match(CONTINUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				fallthroughStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(253);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				switchStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(255);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleDeclareAssignmentContext extends SimpleStmtContext {
		public DeclareAssignmentContext declareAssignment() {
			return getRuleContext(DeclareAssignmentContext.class,0);
		}
		public SimpleDeclareAssignmentContext(SimpleStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAssignmentContext extends SimpleStmtContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SimpleAssignmentContext(SimpleStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionStmtContext extends SimpleStmtContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public SimpleExpressionStmtContext(SimpleStmtContext ctx) { copyFrom(ctx); }
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleStmt);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new SimpleIncDecStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				incDecStmt();
				}
				break;
			case 2:
				_localctx = new SimpleDeclareAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				declareAssignment();
				}
				break;
			case 3:
				_localctx = new SimpleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				assignment();
				}
				break;
			case 4:
				_localctx = new SimpleExpressionStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
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
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_type_);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(ID);
				}
				break;
			case FUNC:
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				typeLit();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(LPAR);
				setState(267);
				type_();
				setState(268);
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
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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
	}

	public final IncDecStmtContext incDecStmt() throws RecognitionException {
		IncDecStmtContext _localctx = new IncDecStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			expression(0);
			setState(275);
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
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			expressionList();
			setState(278);
			assign_op();
			setState(279);
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
		public TerminalNode PLUSparam() { return getToken(golangramParser.PLUSparam, 0); }
		public TerminalNode MINUS() { return getToken(golangramParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(golangramParser.OR, 0); }
		public TerminalNode TIMES() { return getToken(golangramParser.TIMES, 0); }
		public TerminalNode OVER() { return getToken(golangramParser.OVER, 0); }
		public TerminalNode MOD() { return getToken(golangramParser.MOD, 0); }
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
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & 1099511628815L) != 0) {
				{
				setState(281);
				_la = _input.LA(1);
				if ( !((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & 1099511628815L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(284);
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
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
	}

	public final LabeledStmtContext labeledStmt() throws RecognitionException {
		LabeledStmtContext _localctx = new LabeledStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(ID);
			setState(289);
			match(COLON);
			setState(290);
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
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(RETURN);
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(293);
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
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_breakStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(BREAK);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(297);
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
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(CONTINUE);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(301);
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
	}

	public final FallthroughStmtContext fallthroughStmt() throws RecognitionException {
		FallthroughStmtContext _localctx = new FallthroughStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
	}

	public final DeferStmtContext deferStmt() throws RecognitionException {
		DeferStmtContext _localctx = new DeferStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(DEFER);
			setState(307);
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
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IF);
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(310);
				expression(0);
				}
				break;
			case 2:
				{
				setState(311);
				eos();
				setState(312);
				expression(0);
				}
				break;
			case 3:
				{
				setState(314);
				simpleStmt();
				setState(315);
				eos();
				setState(316);
				expression(0);
				}
				break;
			}
			setState(320);
			block();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(321);
				match(ELSE);
				setState(324);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(322);
					ifStmt();
					}
					break;
				case LCURLYBRACES:
					{
					setState(323);
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
		enterRule(_localctx, 60, RULE_switchStmt);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
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
	}

	public final ExprSwitchStmtContext exprSwitchStmt() throws RecognitionException {
		ExprSwitchStmtContext _localctx = new ExprSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(SWITCH);
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
					{
					setState(333);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
					{
					setState(336);
					simpleStmt();
					}
				}

				setState(339);
				eos();
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
					{
					setState(340);
					expression(0);
					}
				}

				}
				break;
			}
			setState(345);
			match(LCURLYBRACES);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(346);
				exprCaseClause();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
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
	}

	public final ExprCaseClauseContext exprCaseClause() throws RecognitionException {
		ExprCaseClauseContext _localctx = new ExprCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exprCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			exprSwitchCase();
			setState(355);
			match(COLON);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -845515643533881575L) != 0) {
				{
				setState(356);
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
	}

	public final ExprSwitchCaseContext exprSwitchCase() throws RecognitionException {
		ExprSwitchCaseContext _localctx = new ExprSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exprSwitchCase);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(CASE);
				setState(360);
				expressionList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
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
	}

	public final TypeSwitchStmtContext typeSwitchStmt() throws RecognitionException {
		TypeSwitchStmtContext _localctx = new TypeSwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(SWITCH);
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(365);
				typeSwitchGuard();
				}
				break;
			case 2:
				{
				setState(366);
				eos();
				setState(367);
				typeSwitchGuard();
				}
				break;
			case 3:
				{
				setState(369);
				simpleStmt();
				setState(370);
				eos();
				setState(371);
				typeSwitchGuard();
				}
				break;
			}
			setState(375);
			match(LCURLYBRACES);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(376);
				typeCaseClause();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
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
	}

	public final TypeSwitchGuardContext typeSwitchGuard() throws RecognitionException {
		TypeSwitchGuardContext _localctx = new TypeSwitchGuardContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(384);
				match(ID);
				setState(385);
				match(ASSIGN);
				}
				break;
			}
			setState(388);
			operand();
			setState(389);
			match(DOT);
			setState(390);
			match(LPAR);
			setState(391);
			match(TYPE);
			setState(392);
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
	}

	public final TypeCaseClauseContext typeCaseClause() throws RecognitionException {
		TypeCaseClauseContext _localctx = new TypeCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			typeSwitchCase();
			setState(395);
			match(COLON);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -845515643533881575L) != 0) {
				{
				setState(396);
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
	}

	public final TypeSwitchCaseContext typeSwitchCase() throws RecognitionException {
		TypeSwitchCaseContext _localctx = new TypeSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeSwitchCase);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(CASE);
				setState(400);
				typeList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
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
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404);
			type_();
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(405);
				match(COMMA);
				{
				setState(406);
				type_();
				}
				}
				}
				setState(411);
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
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(FOR);
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
					{
					setState(413);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(416);
				forClause();
				}
				break;
			case 3:
				{
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903890435L) != 0) {
					{
					setState(417);
					rangeClause();
					}
				}

				}
				break;
			}
			setState(422);
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
		enterRule(_localctx, 80, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
				{
				setState(424);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
			}

			setState(427);
			eos();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
				{
				setState(428);
				expression(0);
				}
			}

			setState(431);
			eos();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
				{
				setState(432);
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
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(435);
				expressionList();
				setState(436);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(438);
				idList();
				setState(439);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(443);
			match(RANGE);
			setState(444);
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
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(LBRACK);
			setState(447);
			arrayLength();
			setState(448);
			match(RBRACK);
			setState(449);
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
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
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
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(FUNC);
			setState(454);
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
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_result);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
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
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(LPAR);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2317102008282128384L) != 0) {
				{
				setState(461);
				parameterDecl();
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(462);
						match(COMMA);
						setState(463);
						parameterDecl();
						}
						} 
					}
					setState(468);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(469);
					match(COMMA);
					}
				}

				}
			}

			setState(474);
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
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(476);
				match(ID);
				}
				break;
			}
			setState(479);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandExpressionContext extends ExpressionContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OperandExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprExpressionContext extends ExpressionContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public PrimaryExprExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallExpressionContext extends ExpressionContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				_localctx = new FuncCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(482);
				funcCall();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryExprExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(483);
				primaryExpr(0);
				}
				break;
			case 3:
				{
				_localctx = new OperandExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(484);
				operand();
				}
				break;
			case 4:
				{
				_localctx = new Unary_opExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(485);
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
				setState(486);
				expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(504);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new Mul_opExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(489);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(490);
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
						setState(491);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Add_opExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(492);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(493);
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
						setState(494);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new Rel_opExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(495);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(496);
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
						setState(497);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(498);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(499);
						match(AND);
						setState(500);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(501);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(502);
						match(OR);
						setState(503);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(508);
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
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(510);
			operand();
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
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(512);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(517);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(513);
						match(DOT);
						setState(514);
						match(ID);
						}
						}
						break;
					case LBRACK:
						{
						setState(515);
						index();
						}
						break;
					case LPAR:
						{
						setState(516);
						arguments();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
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
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifierList);
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
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public TerminalNode TIMES() { return getToken(golangramParser.TIMES, 0); }
		public EmbeddedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embeddedField; }
	}

	public final EmbeddedFieldContext embeddedField() throws RecognitionException {
		EmbeddedFieldContext _localctx = new EmbeddedFieldContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_embeddedField);
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
	}

	public final TypeLitContext typeLit() throws RecognitionException {
		TypeLitContext _localctx = new TypeLitContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeLit);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandBasicLitContext extends OperandContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public OperandBasicLitContext(OperandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandIDContext extends OperandContext {
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public OperandIDContext(OperandContext ctx) { copyFrom(ctx); }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_operand);
		try {
			setState(547);
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
				setState(541);
				basicLit();
				}
				break;
			case ID:
				_localctx = new OperandIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(ID);
				}
				break;
			case LPAR:
				_localctx = new OperandLRPARContext(_localctx);
				enterOuterAlt(_localctx, 3);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrValContext extends BasicLitContext {
		public TerminalNode STR_VAL() { return getToken(golangramParser.STR_VAL, 0); }
		public StrValContext(BasicLitContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealValContext extends BasicLitContext {
		public TerminalNode REAL_VAL() { return getToken(golangramParser.REAL_VAL, 0); }
		public RealValContext(BasicLitContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolValContext extends BasicLitContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolValContext(BasicLitContext ctx) { copyFrom(ctx); }
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_basicLit);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
				_localctx = new IntValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(INT_VAL);
				}
				break;
			case STR_VAL:
				_localctx = new StrValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(STR_VAL);
				}
				break;
			case REAL_VAL:
				_localctx = new RealValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				match(REAL_VAL);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(552);
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
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(LBRACK);
			setState(556);
			expression(0);
			setState(557);
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
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
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
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(LPAR);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 67558529903886339L) != 0) {
				{
				{
				setState(562);
				expressionList();
				setState(565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(563);
					match(COMMA);
					setState(564);
					expressionList();
					}
					break;
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(567);
					match(COMMA);
					}
				}

				}
			}

			setState(572);
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
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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
		case 48:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 49:
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
		"\u0004\u0001F\u0241\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0003\u0000y\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000}\b\u0000\n\u0000"+
		"\f\u0000\u0080\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0088\b\u0001\u0001\u0001\u0003\u0001"+
		"\u008b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0090\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u0094\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u009e\b\u0004\n\u0004\f\u0004\u00a1\t\u0004\u0001\u0004"+
		"\u0003\u0004\u00a4\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u00a8\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ac\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00b5\b\u0007\n\u0007\f\u0007\u00b8\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u00bd\b\b\n\b\f\b\u00c0\t\b\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00cb\b\n\n\n\f\n\u00ce"+
		"\t\n\u0001\n\u0003\n\u00d1\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00da\b\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00df\b\f\u0001\f\u0001\f\u0003\f\u00e3\b\f\u0001\r\u0001\r\u0003\r"+
		"\u00e7\b\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u00ec\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00f0\b\u000e\u0004\u000e\u00f2\b\u000e"+
		"\u000b\u000e\f\u000e\u00f3\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0101\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0107\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u010f\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u011b\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0127\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u012b\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u012f\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u013f\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0145\b\u001d\u0003\u001d"+
		"\u0147\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u014b\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u014f\b\u001f\u0001\u001f\u0003\u001f\u0152"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0156\b\u001f\u0003\u001f"+
		"\u0158\b\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u015c\b\u001f\n\u001f"+
		"\f\u001f\u015f\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003"+
		" \u0166\b \u0001!\u0001!\u0001!\u0003!\u016b\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0176\b\"\u0001"+
		"\"\u0001\"\u0005\"\u017a\b\"\n\"\f\"\u017d\t\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0003#\u0183\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0003$\u018e\b$\u0001%\u0001%\u0001%\u0003%\u0193\b%\u0001"+
		"&\u0001&\u0001&\u0005&\u0198\b&\n&\f&\u019b\t&\u0001\'\u0001\'\u0003\'"+
		"\u019f\b\'\u0001\'\u0001\'\u0003\'\u01a3\b\'\u0003\'\u01a5\b\'\u0001\'"+
		"\u0001\'\u0001(\u0003(\u01aa\b(\u0001(\u0001(\u0003(\u01ae\b(\u0001(\u0001"+
		"(\u0003(\u01b2\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u01ba"+
		"\b)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001-\u0001-\u0003-\u01cb\b-\u0001.\u0001.\u0001"+
		".\u0001.\u0005.\u01d1\b.\n.\f.\u01d4\t.\u0001.\u0003.\u01d7\b.\u0003."+
		"\u01d9\b.\u0001.\u0001.\u0001/\u0003/\u01de\b/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00030\u01e8\b0\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00050\u01f9\b0\n0\f0\u01fc\t0\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00031\u0206\b1\u00051\u0208\b1\n1\f1\u020b\t1"+
		"\u00012\u00012\u00012\u00052\u0210\b2\n2\f2\u0213\t2\u00013\u00033\u0216"+
		"\b3\u00013\u00013\u00014\u00014\u00034\u021c\b4\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00035\u0224\b5\u00016\u00016\u00016\u00016\u00036\u022a"+
		"\b6\u00017\u00017\u00017\u00017\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00039\u0236\b9\u00019\u00039\u0239\b9\u00039\u023b\b9\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0000\u0002`b;\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprt\u0000\t\u0001\u0000()\u0003\u0000\u001d \'\'"+
		"EE\u0002\u0000--22\u0002\u0000\u001c\u001f..\u0001\u0000\u001e \u0002"+
		"\u0000\u001c\u001d\'\'\u0002\u0000*,/1\u0001\u0000\t\n\u0002\u0001;;F"+
		"F\u0266\u0000~\u0001\u0000\u0000\u0000\u0002\u0083\u0001\u0000\u0000\u0000"+
		"\u0004\u008f\u0001\u0000\u0000\u0000\u0006\u0091\u0001\u0000\u0000\u0000"+
		"\b\u0097\u0001\u0000\u0000\u0000\n\u00a5\u0001\u0000\u0000\u0000\f\u00ad"+
		"\u0001\u0000\u0000\u0000\u000e\u00b1\u0001\u0000\u0000\u0000\u0010\u00b9"+
		"\u0001\u0000\u0000\u0000\u0012\u00c1\u0001\u0000\u0000\u0000\u0014\u00c4"+
		"\u0001\u0000\u0000\u0000\u0016\u00d2\u0001\u0000\u0000\u0000\u0018\u00d5"+
		"\u0001\u0000\u0000\u0000\u001a\u00e4\u0001\u0000\u0000\u0000\u001c\u00f1"+
		"\u0001\u0000\u0000\u0000\u001e\u0100\u0001\u0000\u0000\u0000 \u0106\u0001"+
		"\u0000\u0000\u0000\"\u010e\u0001\u0000\u0000\u0000$\u0110\u0001\u0000"+
		"\u0000\u0000&\u0112\u0001\u0000\u0000\u0000(\u0115\u0001\u0000\u0000\u0000"+
		"*\u011a\u0001\u0000\u0000\u0000,\u011e\u0001\u0000\u0000\u0000.\u0120"+
		"\u0001\u0000\u0000\u00000\u0124\u0001\u0000\u0000\u00002\u0128\u0001\u0000"+
		"\u0000\u00004\u012c\u0001\u0000\u0000\u00006\u0130\u0001\u0000\u0000\u0000"+
		"8\u0132\u0001\u0000\u0000\u0000:\u0135\u0001\u0000\u0000\u0000<\u014a"+
		"\u0001\u0000\u0000\u0000>\u014c\u0001\u0000\u0000\u0000@\u0162\u0001\u0000"+
		"\u0000\u0000B\u016a\u0001\u0000\u0000\u0000D\u016c\u0001\u0000\u0000\u0000"+
		"F\u0182\u0001\u0000\u0000\u0000H\u018a\u0001\u0000\u0000\u0000J\u0192"+
		"\u0001\u0000\u0000\u0000L\u0194\u0001\u0000\u0000\u0000N\u019c\u0001\u0000"+
		"\u0000\u0000P\u01a9\u0001\u0000\u0000\u0000R\u01b9\u0001\u0000\u0000\u0000"+
		"T\u01be\u0001\u0000\u0000\u0000V\u01c3\u0001\u0000\u0000\u0000X\u01c5"+
		"\u0001\u0000\u0000\u0000Z\u01ca\u0001\u0000\u0000\u0000\\\u01cc\u0001"+
		"\u0000\u0000\u0000^\u01dd\u0001\u0000\u0000\u0000`\u01e7\u0001\u0000\u0000"+
		"\u0000b\u01fd\u0001\u0000\u0000\u0000d\u020c\u0001\u0000\u0000\u0000f"+
		"\u0215\u0001\u0000\u0000\u0000h\u021b\u0001\u0000\u0000\u0000j\u0223\u0001"+
		"\u0000\u0000\u0000l\u0229\u0001\u0000\u0000\u0000n\u022b\u0001\u0000\u0000"+
		"\u0000p\u022f\u0001\u0000\u0000\u0000r\u0231\u0001\u0000\u0000\u0000t"+
		"\u023e\u0001\u0000\u0000\u0000vy\u0003\u0002\u0001\u0000wy\u0003\u0004"+
		"\u0002\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0003t:\u0000{}\u0001\u0000\u0000\u0000|x\u0001\u0000"+
		"\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0000\u0000\u0001\u0082\u0001"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005\r\u0000\u0000\u0084\u0085\u0005"+
		"=\u0000\u0000\u0085\u0087\u0003\\.\u0000\u0086\u0088\u0003\"\u0011\u0000"+
		"\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u008b\u0003\u001a\r\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u0003\u0001\u0000\u0000\u0000\u008c\u0090\u0003\b\u0004\u0000\u008d\u0090"+
		"\u0003\u0014\n\u0000\u008e\u0090\u0003\u0016\u000b\u0000\u008f\u008c\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0005\u0001\u0000\u0000\u0000\u0091\u0093\u0005"+
		"=\u0000\u0000\u0092\u0094\u0005-\u0000\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0003\"\u0011\u0000\u0096\u0007\u0001\u0000\u0000\u0000"+
		"\u0097\u00a3\u0005\u0004\u0000\u0000\u0098\u00a4\u0003\n\u0005\u0000\u0099"+
		"\u009f\u00053\u0000\u0000\u009a\u009b\u0003\n\u0005\u0000\u009b\u009c"+
		"\u0003t:\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000"+
		"\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a4\u00054\u0000"+
		"\u0000\u00a3\u0098\u0001\u0000\u0000\u0000\u00a3\u0099\u0001\u0000\u0000"+
		"\u0000\u00a4\t\u0001\u0000\u0000\u0000\u00a5\u00ab\u0003\u000e\u0007\u0000"+
		"\u00a6\u00a8\u0003\"\u0011\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005-\u0000\u0000\u00aa\u00ac\u0003\u0010\b\u0000\u00ab\u00a7"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u000b"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005=\u0000\u0000\u00ae\u00af\u0005"+
		"2\u0000\u0000\u00af\u00b0\u0003l6\u0000\u00b0\r\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b6\u0005=\u0000\u0000\u00b2\u00b3\u00059\u0000\u0000\u00b3\u00b5"+
		"\u0005=\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u000f\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00be\u0003`0\u0000\u00ba\u00bb\u00059\u0000"+
		"\u0000\u00bb\u00bd\u0003`0\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u0011\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005=\u0000\u0000\u00c2\u00c3"+
		"\u0003r9\u0000\u00c3\u0013\u0001\u0000\u0000\u0000\u00c4\u00d0\u0005\u001a"+
		"\u0000\u0000\u00c5\u00d1\u0003\u0006\u0003\u0000\u00c6\u00cc\u00053\u0000"+
		"\u0000\u00c7\u00c8\u0003\u0006\u0003\u0000\u00c8\u00c9\u0003t:\u0000\u00c9"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d1\u00054\u0000\u0000\u00d0\u00c5"+
		"\u0001\u0000\u0000\u0000\u00d0\u00c6\u0001\u0000\u0000\u0000\u00d1\u0015"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001b\u0000\u0000\u00d3\u00d4"+
		"\u0003\u0018\f\u0000\u00d4\u0017\u0001\u0000\u0000\u0000\u00d5\u00e2\u0003"+
		"\u000e\u0007\u0000\u00d6\u00d9\u0003T*\u0000\u00d7\u00d8\u0005-\u0000"+
		"\u0000\u00d8\u00da\u0003\u0010\b\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00e3\u0001\u0000\u0000\u0000"+
		"\u00db\u00de\u0003\"\u0011\u0000\u00dc\u00dd\u0005-\u0000\u0000\u00dd"+
		"\u00df\u0003\u0010\b\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u00e3\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0005-\u0000\u0000\u00e1\u00e3\u0003\u0010\b\u0000\u00e2\u00d6\u0001"+
		"\u0000\u0000\u0000\u00e2\u00db\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e3\u0019\u0001\u0000\u0000\u0000\u00e4\u00e6\u0005"+
		"7\u0000\u0000\u00e5\u00e7\u0003\u001c\u000e\u0000\u00e6\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u00058\u0000\u0000\u00e9\u001b\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ec\u0005;\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0003\u001e\u000f\u0000\u00ee\u00f0\u0005;\u0000\u0000\u00ef"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f1\u00eb\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f4\u001d\u0001\u0000\u0000\u0000\u00f5"+
		"\u0101\u0003\u0004\u0002\u0000\u00f6\u0101\u0003.\u0017\u0000\u00f7\u0101"+
		"\u0003 \u0010\u0000\u00f8\u0101\u00030\u0018\u0000\u00f9\u0101\u0005\u0001"+
		"\u0000\u0000\u00fa\u0101\u0005\u0005\u0000\u0000\u00fb\u0101\u00036\u001b"+
		"\u0000\u00fc\u0101\u0003\u001a\r\u0000\u00fd\u0101\u0003:\u001d\u0000"+
		"\u00fe\u0101\u0003<\u001e\u0000\u00ff\u0101\u0003N\'\u0000\u0100\u00f5"+
		"\u0001\u0000\u0000\u0000\u0100\u00f6\u0001\u0000\u0000\u0000\u0100\u00f7"+
		"\u0001\u0000\u0000\u0000\u0100\u00f8\u0001\u0000\u0000\u0000\u0100\u00f9"+
		"\u0001\u0000\u0000\u0000\u0100\u00fa\u0001\u0000\u0000\u0000\u0100\u00fb"+
		"\u0001\u0000\u0000\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0100\u00fd"+
		"\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u00ff"+
		"\u0001\u0000\u0000\u0000\u0101\u001f\u0001\u0000\u0000\u0000\u0102\u0107"+
		"\u0003&\u0013\u0000\u0103\u0107\u0003\f\u0006\u0000\u0104\u0107\u0003"+
		"(\u0014\u0000\u0105\u0107\u0003$\u0012\u0000\u0106\u0102\u0001\u0000\u0000"+
		"\u0000\u0106\u0103\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107!\u0001\u0000\u0000\u0000"+
		"\u0108\u010f\u0005=\u0000\u0000\u0109\u010f\u0003h4\u0000\u010a\u010b"+
		"\u00053\u0000\u0000\u010b\u010c\u0003\"\u0011\u0000\u010c\u010d\u0005"+
		"4\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0108\u0001\u0000"+
		"\u0000\u0000\u010e\u0109\u0001\u0000\u0000\u0000\u010e\u010a\u0001\u0000"+
		"\u0000\u0000\u010f#\u0001\u0000\u0000\u0000\u0110\u0111\u0003`0\u0000"+
		"\u0111%\u0001\u0000\u0000\u0000\u0112\u0113\u0003`0\u0000\u0113\u0114"+
		"\u0007\u0000\u0000\u0000\u0114\'\u0001\u0000\u0000\u0000\u0115\u0116\u0003"+
		"\u0010\b\u0000\u0116\u0117\u0003*\u0015\u0000\u0117\u0118\u0003\u0010"+
		"\b\u0000\u0118)\u0001\u0000\u0000\u0000\u0119\u011b\u0007\u0001\u0000"+
		"\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0007\u0002\u0000"+
		"\u0000\u011d+\u0001\u0000\u0000\u0000\u011e\u011f\u0005;\u0000\u0000\u011f"+
		"-\u0001\u0000\u0000\u0000\u0120\u0121\u0005=\u0000\u0000\u0121\u0122\u0005"+
		"<\u0000\u0000\u0122\u0123\u0003\u001e\u000f\u0000\u0123/\u0001\u0000\u0000"+
		"\u0000\u0124\u0126\u0005\u0016\u0000\u0000\u0125\u0127\u0003\u0010\b\u0000"+
		"\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u01271\u0001\u0000\u0000\u0000\u0128\u012a\u0005\u0001\u0000\u0000\u0129"+
		"\u012b\u0005=\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0001\u0000\u0000\u0000\u012b3\u0001\u0000\u0000\u0000\u012c\u012e\u0005"+
		"\u0005\u0000\u0000\u012d\u012f\u0005=\u0000\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f5\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0005\u000b\u0000\u0000\u01317\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0005\u0007\u0000\u0000\u0133\u0134\u0003`0\u0000\u01349"+
		"\u0001\u0000\u0000\u0000\u0135\u013e\u0005\u0010\u0000\u0000\u0136\u013f"+
		"\u0003`0\u0000\u0137\u0138\u0003t:\u0000\u0138\u0139\u0003`0\u0000\u0139"+
		"\u013f\u0001\u0000\u0000\u0000\u013a\u013b\u0003 \u0010\u0000\u013b\u013c"+
		"\u0003t:\u0000\u013c\u013d\u0003`0\u0000\u013d\u013f\u0001\u0000\u0000"+
		"\u0000\u013e\u0136\u0001\u0000\u0000\u0000\u013e\u0137\u0001\u0000\u0000"+
		"\u0000\u013e\u013a\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000"+
		"\u0000\u0140\u0146\u0003\u001a\r\u0000\u0141\u0144\u0005\b\u0000\u0000"+
		"\u0142\u0145\u0003:\u001d\u0000\u0143\u0145\u0003\u001a\r\u0000\u0144"+
		"\u0142\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145"+
		"\u0147\u0001\u0000\u0000\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0001\u0000\u0000\u0000\u0147;\u0001\u0000\u0000\u0000\u0148\u014b"+
		"\u0003>\u001f\u0000\u0149\u014b\u0003D\"\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b=\u0001\u0000\u0000"+
		"\u0000\u014c\u0157\u0005\u0019\u0000\u0000\u014d\u014f\u0003`0\u0000\u014e"+
		"\u014d\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f"+
		"\u0158\u0001\u0000\u0000\u0000\u0150\u0152\u0003 \u0010\u0000\u0151\u0150"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0001\u0000\u0000\u0000\u0153\u0155\u0003t:\u0000\u0154\u0156\u0003`"+
		"0\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000"+
		"\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u014e\u0001\u0000\u0000"+
		"\u0000\u0157\u0151\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159\u015d\u00057\u0000\u0000\u015a\u015c\u0003@ \u0000\u015b"+
		"\u015a\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e"+
		"\u0160\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u00058\u0000\u0000\u0161?\u0001\u0000\u0000\u0000\u0162\u0163\u0003"+
		"B!\u0000\u0163\u0165\u0005<\u0000\u0000\u0164\u0166\u0003\u001c\u000e"+
		"\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000"+
		"\u0000\u0166A\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u0002\u0000\u0000"+
		"\u0168\u016b\u0003\u0010\b\u0000\u0169\u016b\u0005\u0006\u0000\u0000\u016a"+
		"\u0167\u0001\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b"+
		"C\u0001\u0000\u0000\u0000\u016c\u0175\u0005\u0019\u0000\u0000\u016d\u0176"+
		"\u0003F#\u0000\u016e\u016f\u0003t:\u0000\u016f\u0170\u0003F#\u0000\u0170"+
		"\u0176\u0001\u0000\u0000\u0000\u0171\u0172\u0003 \u0010\u0000\u0172\u0173"+
		"\u0003t:\u0000\u0173\u0174\u0003F#\u0000\u0174\u0176\u0001\u0000\u0000"+
		"\u0000\u0175\u016d\u0001\u0000\u0000\u0000\u0175\u016e\u0001\u0000\u0000"+
		"\u0000\u0175\u0171\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000"+
		"\u0000\u0177\u017b\u00057\u0000\u0000\u0178\u017a\u0003H$\u0000\u0179"+
		"\u0178\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c"+
		"\u017e\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u00058\u0000\u0000\u017fE\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		"=\u0000\u0000\u0181\u0183\u0005-\u0000\u0000\u0182\u0180\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0003j5\u0000\u0185\u0186\u0005:\u0000\u0000\u0186"+
		"\u0187\u00053\u0000\u0000\u0187\u0188\u0005\u001a\u0000\u0000\u0188\u0189"+
		"\u00054\u0000\u0000\u0189G\u0001\u0000\u0000\u0000\u018a\u018b\u0003J"+
		"%\u0000\u018b\u018d\u0005<\u0000\u0000\u018c\u018e\u0003\u001c\u000e\u0000"+
		"\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000"+
		"\u018eI\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u0002\u0000\u0000\u0190"+
		"\u0193\u0003L&\u0000\u0191\u0193\u0005\u0006\u0000\u0000\u0192\u018f\u0001"+
		"\u0000\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193K\u0001\u0000"+
		"\u0000\u0000\u0194\u0199\u0003\"\u0011\u0000\u0195\u0196\u00059\u0000"+
		"\u0000\u0196\u0198\u0003\"\u0011\u0000\u0197\u0195\u0001\u0000\u0000\u0000"+
		"\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019aM\u0001\u0000\u0000\u0000\u019b"+
		"\u0199\u0001\u0000\u0000\u0000\u019c\u01a4\u0005\f\u0000\u0000\u019d\u019f"+
		"\u0003`0\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000"+
		"\u0000\u0000\u019f\u01a5\u0001\u0000\u0000\u0000\u01a0\u01a5\u0003P(\u0000"+
		"\u01a1\u01a3\u0003R)\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u019e"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a0\u0001\u0000\u0000\u0000\u01a4\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0003\u001a\r\u0000\u01a7O\u0001\u0000\u0000\u0000\u01a8\u01aa\u0003"+
		" \u0010\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0003t:\u0000"+
		"\u01ac\u01ae\u0003`0\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1"+
		"\u0003t:\u0000\u01b0\u01b2\u0003 \u0010\u0000\u01b1\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2Q\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0003\u0010\b\u0000\u01b4\u01b5\u0005-\u0000\u0000"+
		"\u01b5\u01ba\u0001\u0000\u0000\u0000\u01b6\u01b7\u0003\u000e\u0007\u0000"+
		"\u01b7\u01b8\u00052\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b9\u01b6\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0005\u0015\u0000\u0000\u01bc\u01bd\u0003`0\u0000\u01bdS\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u00055\u0000\u0000\u01bf\u01c0\u0003V+"+
		"\u0000\u01c0\u01c1\u00056\u0000\u0000\u01c1\u01c2\u0003\"\u0011\u0000"+
		"\u01c2U\u0001\u0000\u0000\u0000\u01c3\u01c4\u0003`0\u0000\u01c4W\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0005\r\u0000\u0000\u01c6\u01c7\u0003\\"+
		".\u0000\u01c7Y\u0001\u0000\u0000\u0000\u01c8\u01cb\u0003\\.\u0000\u01c9"+
		"\u01cb\u0003\"\u0011\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cb[\u0001\u0000\u0000\u0000\u01cc\u01d8\u0005"+
		"3\u0000\u0000\u01cd\u01d2\u0003^/\u0000\u01ce\u01cf\u00059\u0000\u0000"+
		"\u01cf\u01d1\u0003^/\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d7\u00059\u0000\u0000\u01d6\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d8\u01cd\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0005"+
		"4\u0000\u0000\u01db]\u0001\u0000\u0000\u0000\u01dc\u01de\u0005=\u0000"+
		"\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000"+
		"\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0003\"\u0011\u0000"+
		"\u01e0_\u0001\u0000\u0000\u0000\u01e1\u01e2\u00060\uffff\uffff\u0000\u01e2"+
		"\u01e8\u0003\u0012\t\u0000\u01e3\u01e8\u0003b1\u0000\u01e4\u01e8\u0003"+
		"j5\u0000\u01e5\u01e6\u0007\u0003\u0000\u0000\u01e6\u01e8\u0003`0\u0006"+
		"\u01e7\u01e1\u0001\u0000\u0000\u0000\u01e7\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e8\u01fa\u0001\u0000\u0000\u0000\u01e9\u01ea\n\u0005\u0000\u0000\u01ea"+
		"\u01eb\u0007\u0004\u0000\u0000\u01eb\u01f9\u0003`0\u0006\u01ec\u01ed\n"+
		"\u0004\u0000\u0000\u01ed\u01ee\u0007\u0005\u0000\u0000\u01ee\u01f9\u0003"+
		"`0\u0005\u01ef\u01f0\n\u0003\u0000\u0000\u01f0\u01f1\u0007\u0006\u0000"+
		"\u0000\u01f1\u01f9\u0003`0\u0004\u01f2\u01f3\n\u0002\u0000\u0000\u01f3"+
		"\u01f4\u0005&\u0000\u0000\u01f4\u01f9\u0003`0\u0003\u01f5\u01f6\n\u0001"+
		"\u0000\u0000\u01f6\u01f7\u0005\'\u0000\u0000\u01f7\u01f9\u0003`0\u0002"+
		"\u01f8\u01e9\u0001\u0000\u0000\u0000\u01f8\u01ec\u0001\u0000\u0000\u0000"+
		"\u01f8\u01ef\u0001\u0000\u0000\u0000\u01f8\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f5\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fba\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u00061\uffff\uffff\u0000\u01fe\u01ff\u0003j5\u0000\u01ff\u0209"+
		"\u0001\u0000\u0000\u0000\u0200\u0205\n\u0001\u0000\u0000\u0201\u0202\u0005"+
		":\u0000\u0000\u0202\u0206\u0005=\u0000\u0000\u0203\u0206\u0003n7\u0000"+
		"\u0204\u0206\u0003r9\u0000\u0205\u0201\u0001\u0000\u0000\u0000\u0205\u0203"+
		"\u0001\u0000\u0000\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0206\u0208"+
		"\u0001\u0000\u0000\u0000\u0207\u0200\u0001\u0000\u0000\u0000\u0208\u020b"+
		"\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a"+
		"\u0001\u0000\u0000\u0000\u020ac\u0001\u0000\u0000\u0000\u020b\u0209\u0001"+
		"\u0000\u0000\u0000\u020c\u0211\u0005=\u0000\u0000\u020d\u020e\u00059\u0000"+
		"\u0000\u020e\u0210\u0005=\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000"+
		"\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0001\u0000\u0000\u0000\u0212e\u0001\u0000\u0000\u0000\u0213"+
		"\u0211\u0001\u0000\u0000\u0000\u0214\u0216\u0005\u001e\u0000\u0000\u0215"+
		"\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0005=\u0000\u0000\u0218g\u0001"+
		"\u0000\u0000\u0000\u0219\u021c\u0003T*\u0000\u021a\u021c\u0003X,\u0000"+
		"\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021a\u0001\u0000\u0000\u0000"+
		"\u021ci\u0001\u0000\u0000\u0000\u021d\u0224\u0003l6\u0000\u021e\u0224"+
		"\u0005=\u0000\u0000\u021f\u0220\u00053\u0000\u0000\u0220\u0221\u0003`"+
		"0\u0000\u0221\u0222\u00054\u0000\u0000\u0222\u0224\u0001\u0000\u0000\u0000"+
		"\u0223\u021d\u0001\u0000\u0000\u0000\u0223\u021e\u0001\u0000\u0000\u0000"+
		"\u0223\u021f\u0001\u0000\u0000\u0000\u0224k\u0001\u0000\u0000\u0000\u0225"+
		"\u022a\u0005?\u0000\u0000\u0226\u022a\u0005@\u0000\u0000\u0227\u022a\u0005"+
		">\u0000\u0000\u0228\u022a\u0003p8\u0000\u0229\u0225\u0001\u0000\u0000"+
		"\u0000\u0229\u0226\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000"+
		"\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022am\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u00055\u0000\u0000\u022c\u022d\u0003`0\u0000\u022d\u022e"+
		"\u00056\u0000\u0000\u022eo\u0001\u0000\u0000\u0000\u022f\u0230\u0007\u0007"+
		"\u0000\u0000\u0230q\u0001\u0000\u0000\u0000\u0231\u023a\u00053\u0000\u0000"+
		"\u0232\u0235\u0003\u0010\b\u0000\u0233\u0234\u00059\u0000\u0000\u0234"+
		"\u0236\u0003\u0010\b\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0001\u0000\u0000\u0000\u0236\u0238\u0001\u0000\u0000\u0000\u0237\u0239"+
		"\u00059\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0238\u0239\u0001"+
		"\u0000\u0000\u0000\u0239\u023b\u0001\u0000\u0000\u0000\u023a\u0232\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0001"+
		"\u0000\u0000\u0000\u023c\u023d\u00054\u0000\u0000\u023ds\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0007\b\u0000\u0000\u023fu\u0001\u0000\u0000\u0000"+
		"Fx~\u0087\u008a\u008f\u0093\u009f\u00a3\u00a7\u00ab\u00b6\u00be\u00cc"+
		"\u00d0\u00d9\u00de\u00e2\u00e6\u00eb\u00ef\u00f3\u0100\u0106\u010e\u011a"+
		"\u0126\u012a\u012e\u013e\u0144\u0146\u014a\u014e\u0151\u0155\u0157\u015d"+
		"\u0165\u016a\u0175\u017b\u0182\u018d\u0192\u0199\u019e\u01a2\u01a4\u01a9"+
		"\u01ad\u01b1\u01b9\u01ca\u01d2\u01d6\u01d8\u01dd\u01e7\u01f8\u01fa\u0205"+
		"\u0209\u0211\u0215\u021b\u0223\u0229\u0235\u0238\u023a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}