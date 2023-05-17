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
		FALLTHROUGH=9, FOR=10, FUNC=11, GO=12, GOTO=13, IF=14, IMPORT=15, INTERFACE=16, 
		MAP=17, PACKAGE=18, RANGE=19, RETURN=20, SELECT=21, STRUCT=22, SWITCH=23, 
		TYPE=24, VAR=25, PLUS=26, MINUS=27, TIMES=28, OVER=29, MOD=30, PLUSEQ=31, 
		MINUSEQ=32, TIMESEQ=33, OVEREQ=34, MODEQ=35, AND=36, OR=37, PLUSONE=38, 
		MINUSONE=39, ISEQUAL=40, LESSTHAN=41, MORETHAN=42, ASSIGN=43, NOT=44, 
		NOTEQUAL=45, LESSEQTHAN=46, MOREEQTHAN=47, DECLARE_ASSIGN=48, LPAR=49, 
		RPAR=50, LBRACK=51, RBRACK=52, LCURLYBRACES=53, RCURLYBRACES=54, COMMA=55, 
		DOT=56, SEMI=57, COLON=58, ID=59, REAL_VAL=60, INT_VAL=61, STR_VAL=62, 
		COMMENT=63, BLOCK_COMMENT=64, WHITESPACE=65, UNKNOWN=66, EOS=67;
	public static final int
		RULE_begin = 0, RULE_functionDecl = 1, RULE_declaration = 2, RULE_typeSpec = 3, 
		RULE_constDecl = 4, RULE_constSpec = 5, RULE_declareAssignment = 6, RULE_idList = 7, 
		RULE_expressionList = 8, RULE_typeDecl = 9, RULE_varDecl = 10, RULE_varSpec = 11, 
		RULE_block = 12, RULE_statementList = 13, RULE_statement = 14, RULE_simpleStmt = 15, 
		RULE_type_ = 16, RULE_expressionStmt = 17, RULE_incDecStmt = 18, RULE_assignment = 19, 
		RULE_assign_op = 20, RULE_emptyStmt = 21, RULE_labeledStmt = 22, RULE_returnStmt = 23, 
		RULE_breakStmt = 24, RULE_continueStmt = 25, RULE_gotoStmt = 26, RULE_fallthroughStmt = 27, 
		RULE_deferStmt = 28, RULE_ifStmt = 29, RULE_switchStmt = 30, RULE_exprSwitchStmt = 31, 
		RULE_exprCaseClause = 32, RULE_exprSwitchCase = 33, RULE_typeSwitchStmt = 34, 
		RULE_typeSwitchGuard = 35, RULE_typeCaseClause = 36, RULE_typeSwitchCase = 37, 
		RULE_typeList = 38, RULE_forStmt = 39, RULE_forClause = 40, RULE_rangeClause = 41, 
		RULE_arrayType = 42, RULE_arrayLength = 43, RULE_elementType = 44, RULE_functionType = 45, 
		RULE_result = 46, RULE_parameters = 47, RULE_parameterDecl = 48, RULE_expression = 49, 
		RULE_primaryExpr = 50, RULE_identifierList = 51, RULE_embeddedField = 52, 
		RULE_typeLit = 53, RULE_operand = 54, RULE_basicLit = 55, RULE_index = 56, 
		RULE_arguments = 57, RULE_eos = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "functionDecl", "declaration", "typeSpec", "constDecl", "constSpec", 
			"declareAssignment", "idList", "expressionList", "typeDecl", "varDecl", 
			"varSpec", "block", "statementList", "statement", "simpleStmt", "type_", 
			"expressionStmt", "incDecStmt", "assignment", "assign_op", "emptyStmt", 
			"labeledStmt", "returnStmt", "breakStmt", "continueStmt", "gotoStmt", 
			"fallthroughStmt", "deferStmt", "ifStmt", "switchStmt", "exprSwitchStmt", 
			"exprCaseClause", "exprSwitchCase", "typeSwitchStmt", "typeSwitchGuard", 
			"typeCaseClause", "typeSwitchCase", "typeList", "forStmt", "forClause", 
			"rangeClause", "arrayType", "arrayLength", "elementType", "functionType", 
			"result", "parameters", "parameterDecl", "expression", "primaryExpr", 
			"identifierList", "embeddedField", "typeLit", "operand", "basicLit", 
			"index", "arguments", "eos"
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
			"STR_VAL", "COMMENT", "BLOCK_COMMENT", "WHITESPACE", "UNKNOWN", "EOS"
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
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 50333712L) != 0) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
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
		enterRule(_localctx, 6, RULE_typeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(143);
				match(ASSIGN);
				}
			}

			setState(146);
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
		enterRule(_localctx, 8, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(CONST);
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(149);
				constSpec();
				}
				break;
			case LPAR:
				{
				setState(150);
				match(LPAR);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(151);
					constSpec();
					setState(152);
					eos();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
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
		enterRule(_localctx, 10, RULE_constSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			idList();
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 579275502070532096L) != 0) {
					{
					setState(163);
					type_();
					}
				}

				setState(166);
				match(ASSIGN);
				setState(167);
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
		enterRule(_localctx, 12, RULE_declareAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ID);
			setState(171);
			match(DECLARE_ASSIGN);
			setState(172);
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
		enterRule(_localctx, 14, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ID);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(175);
				match(COMMA);
				setState(176);
				match(ID);
				}
				}
				setState(181);
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
		enterRule(_localctx, 16, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expression(0);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					match(COMMA);
					setState(184);
					expression(0);
					}
					} 
				}
				setState(189);
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
		enterRule(_localctx, 18, RULE_typeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(TYPE);
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(191);
				typeSpec();
				}
				break;
			case LPAR:
				{
				setState(192);
				match(LPAR);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(193);
					typeSpec();
					setState(194);
					eos();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
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
		enterRule(_localctx, 20, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(VAR);
			setState(205);
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
		enterRule(_localctx, 22, RULE_varSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			idList();
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case LPAR:
			case LBRACK:
			case ID:
				{
				setState(208);
				type_();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(209);
					match(ASSIGN);
					setState(210);
					expressionList();
					}
				}

				}
				break;
			case ASSIGN:
				{
				setState(213);
				match(ASSIGN);
				setState(214);
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
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LCURLYBRACES);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8800614215087834674L) != 0) {
				{
				setState(218);
				statementList();
				}
			}

			setState(221);
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
		enterRule(_localctx, 26, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(223);
					match(SEMI);
					}
				}

				}
				setState(226);
				statement();
				{
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(227);
					match(SEMI);
					}
					break;
				}
				}
				}
				}
				setState(232); 
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
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				returnStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(BREAK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				match(CONTINUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				fallthroughStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(241);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(242);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(243);
				switchStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(244);
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
		enterRule(_localctx, 30, RULE_simpleStmt);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new SimpleIncDecStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				incDecStmt();
				}
				break;
			case 2:
				_localctx = new SimpleDeclareAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				declareAssignment();
				}
				break;
			case 3:
				_localctx = new SimpleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				assignment();
				}
				break;
			case 4:
				_localctx = new SimpleExpressionStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
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
		enterRule(_localctx, 32, RULE_type_);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(ID);
				}
				break;
			case FUNC:
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				typeLit();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(LPAR);
				setState(256);
				type_();
				setState(257);
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
		enterRule(_localctx, 34, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 36, RULE_incDecStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			expression(0);
			setState(264);
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
		enterRule(_localctx, 38, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expressionList();
			setState(267);
			assign_op();
			setState(268);
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
		enterRule(_localctx, 40, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 139519328256L) != 0) {
				{
				setState(270);
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

			setState(273);
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
		enterRule(_localctx, 42, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 44, RULE_labeledStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ID);
			setState(278);
			match(COLON);
			setState(279);
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
		enterRule(_localctx, 46, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(RETURN);
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(282);
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
		enterRule(_localctx, 48, RULE_breakStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(BREAK);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(286);
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
		enterRule(_localctx, 50, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(CONTINUE);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(290);
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
		public TerminalNode GOTO() { return getToken(golangramParser.GOTO, 0); }
		public TerminalNode ID() { return getToken(golangramParser.ID, 0); }
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitGotoStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_gotoStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(GOTO);
			setState(294);
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
		enterRule(_localctx, 54, RULE_fallthroughStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
		enterRule(_localctx, 56, RULE_deferStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(DEFER);
			setState(299);
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
		enterRule(_localctx, 58, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(IF);
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(302);
				expression(0);
				}
				break;
			case 2:
				{
				setState(303);
				eos();
				setState(304);
				expression(0);
				}
				break;
			case 3:
				{
				setState(306);
				simpleStmt();
				setState(307);
				eos();
				setState(308);
				expression(0);
				}
				break;
			}
			setState(312);
			block();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(313);
				match(ELSE);
				setState(316);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(314);
					ifStmt();
					}
					break;
				case LCURLYBRACES:
					{
					setState(315);
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
		enterRule(_localctx, 60, RULE_switchStmt);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				exprSwitchStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
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
		enterRule(_localctx, 62, RULE_exprSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(SWITCH);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
					{
					setState(325);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
					{
					setState(328);
					simpleStmt();
					}
				}

				setState(331);
				eos();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
					{
					setState(332);
					expression(0);
					}
				}

				}
				break;
			}
			setState(337);
			match(LCURLYBRACES);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(338);
				exprCaseClause();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
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
		enterRule(_localctx, 64, RULE_exprCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			exprSwitchCase();
			setState(347);
			match(COLON);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8800614215087834674L) != 0) {
				{
				setState(348);
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
		enterRule(_localctx, 66, RULE_exprSwitchCase);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(CASE);
				setState(352);
				expressionList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
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
		enterRule(_localctx, 68, RULE_typeSwitchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(SWITCH);
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(357);
				typeSwitchGuard();
				}
				break;
			case 2:
				{
				setState(358);
				eos();
				setState(359);
				typeSwitchGuard();
				}
				break;
			case 3:
				{
				setState(361);
				simpleStmt();
				setState(362);
				eos();
				setState(363);
				typeSwitchGuard();
				}
				break;
			}
			setState(367);
			match(LCURLYBRACES);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(368);
				typeCaseClause();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
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
		enterRule(_localctx, 70, RULE_typeSwitchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(376);
				match(ID);
				setState(377);
				match(ASSIGN);
				}
				break;
			}
			setState(380);
			operand();
			setState(381);
			match(DOT);
			setState(382);
			match(LPAR);
			setState(383);
			match(TYPE);
			setState(384);
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
		enterRule(_localctx, 72, RULE_typeCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			typeSwitchCase();
			setState(387);
			match(COLON);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8800614215087834674L) != 0) {
				{
				setState(388);
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
		enterRule(_localctx, 74, RULE_typeSwitchCase);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(CASE);
				setState(392);
				typeList();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
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
		enterRule(_localctx, 76, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(396);
			type_();
			}
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(397);
				match(COMMA);
				{
				setState(398);
				type_();
				}
				}
				}
				setState(403);
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
		enterRule(_localctx, 78, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(FOR);
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
					{
					setState(405);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(408);
				forClause();
				}
				break;
			case 3:
				{
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697975296L) != 0) {
					{
					setState(409);
					rangeClause();
					}
				}

				}
				break;
			}
			setState(414);
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
		enterRule(_localctx, 80, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
				{
				setState(416);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
			}

			setState(419);
			eos();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
				{
				setState(420);
				expression(0);
				}
			}

			setState(423);
			eos();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
				{
				setState(424);
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
		enterRule(_localctx, 82, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(427);
				expressionList();
				setState(428);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(430);
				idList();
				setState(431);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(435);
			match(RANGE);
			setState(436);
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
		public ElementTypeContext elementType() {
			return getRuleContext(ElementTypeContext.class,0);
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
		enterRule(_localctx, 84, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(LBRACK);
			setState(439);
			arrayLength();
			setState(440);
			match(RBRACK);
			setState(441);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitElementType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementTypeContext elementType() throws RecognitionException {
		ElementTypeContext _localctx = new ElementTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_elementType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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
			setState(447);
			match(FUNC);
			setState(448);
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
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
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
			setState(454);
			match(LPAR);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 579275502070532096L) != 0) {
				{
				setState(455);
				parameterDecl();
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(456);
						match(COMMA);
						setState(457);
						parameterDecl();
						}
						} 
					}
					setState(462);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(463);
					match(COMMA);
					}
				}

				}
			}

			setState(468);
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
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(470);
				match(ID);
				}
				break;
			}
			setState(473);
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
		public TerminalNode PLUS() { return getToken(golangramParser.PLUS, 0); }
		public TerminalNode TIMES() { return getToken(golangramParser.TIMES, 0); }
		public TerminalNode MINUS() { return getToken(golangramParser.MINUS, 0); }
		public TerminalNode OVER() { return getToken(golangramParser.OVER, 0); }
		public TerminalNode NOT() { return getToken(golangramParser.NOT, 0); }
		public TerminalNode MOD() { return getToken(golangramParser.MOD, 0); }
		public TerminalNode OR() { return getToken(golangramParser.OR, 0); }
		public TerminalNode ISEQUAL() { return getToken(golangramParser.ISEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(golangramParser.NOTEQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(golangramParser.LESSTHAN, 0); }
		public TerminalNode LESSEQTHAN() { return getToken(golangramParser.LESSEQTHAN, 0); }
		public TerminalNode MORETHAN() { return getToken(golangramParser.MORETHAN, 0); }
		public TerminalNode MOREEQTHAN() { return getToken(golangramParser.MOREEQTHAN, 0); }
		public TerminalNode AND() { return getToken(golangramParser.AND, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof golangramVisitor ) return ((golangramVisitor<? extends T>)visitor).visitExpression(this);
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
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(476);
				primaryExpr(0);
				}
				break;
			case 2:
				{
				setState(477);
				operand();
				}
				break;
			case 3:
				{
				setState(478);
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
				setState(479);
				expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(497);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(482);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(483);
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
						setState(484);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(485);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(486);
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
						setState(487);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(488);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(489);
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
						setState(490);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(491);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(492);
						match(AND);
						setState(493);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(494);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(495);
						match(OR);
						setState(496);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
			setState(503);
			operand();
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
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(505);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(510);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						{
						setState(506);
						match(DOT);
						setState(507);
						match(ID);
						}
						}
						break;
					case LBRACK:
						{
						setState(508);
						index();
						}
						break;
					case LPAR:
						{
						setState(509);
						arguments();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
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
			setState(517);
			match(ID);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(518);
				match(COMMA);
				setState(519);
				match(ID);
				}
				}
				setState(524);
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
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES) {
				{
				setState(525);
				match(TIMES);
				}
			}

			setState(528);
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
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				arrayType();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
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
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_VAL:
			case INT_VAL:
			case STR_VAL:
				_localctx = new OperandBasicLitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				basicLit();
				}
				break;
			case ID:
				_localctx = new OperandIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(ID);
				}
				break;
			case LPAR:
				_localctx = new OperandLRPARContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				match(LPAR);
				setState(537);
				expression(0);
				setState(538);
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

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_basicLit);
		try {
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
				_localctx = new IntValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(INT_VAL);
				}
				break;
			case STR_VAL:
				_localctx = new StrValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(STR_VAL);
				}
				break;
			case REAL_VAL:
				_localctx = new RealValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				match(REAL_VAL);
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
			setState(547);
			match(LBRACK);
			setState(548);
			expression(0);
			setState(549);
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
		enterRule(_localctx, 114, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(LPAR);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 8647491827697451008L) != 0) {
				{
				{
				setState(552);
				expressionList();
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(553);
					match(COMMA);
					setState(554);
					expressionList();
					}
					break;
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(557);
					match(COMMA);
					}
				}

				}
			}

			setState(562);
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
		enterRule(_localctx, 116, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
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
		"\u0004\u0001C\u0237\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0088\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u008d\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u0091\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u009b\b\u0004\n\u0004"+
		"\f\u0004\u009e\t\u0004\u0001\u0004\u0003\u0004\u00a1\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00a5\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00a9\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00b2\b\u0007\n\u0007\f\u0007\u00b5"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00ba\b\b\n\b\f\b\u00bd\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00c5\b\t\n\t\f\t\u00c8"+
		"\t\t\u0001\t\u0003\t\u00cb\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d4\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00d8\b\u000b\u0001\f\u0001\f\u0003\f\u00dc\b\f\u0001"+
		"\f\u0001\f\u0001\r\u0003\r\u00e1\b\r\u0001\r\u0001\r\u0003\r\u00e5\b\r"+
		"\u0004\r\u00e7\b\r\u000b\r\f\r\u00e8\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00f6\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00fc\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0104\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u0110\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u011c\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0120\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0124\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0137\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u013d\b\u001d\u0003\u001d\u013f\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0143\b\u001e\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0147\b\u001f\u0001\u001f\u0003\u001f\u014a\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u014e\b\u001f\u0003\u001f\u0150\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u0154\b\u001f\n\u001f\f\u001f\u0157\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0003 \u015e\b \u0001!\u0001"+
		"!\u0001!\u0003!\u0163\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u016e\b\"\u0001\"\u0001\"\u0005\"\u0172"+
		"\b\"\n\"\f\"\u0175\t\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u017b\b#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u0186"+
		"\b$\u0001%\u0001%\u0001%\u0003%\u018b\b%\u0001&\u0001&\u0001&\u0005&\u0190"+
		"\b&\n&\f&\u0193\t&\u0001\'\u0001\'\u0003\'\u0197\b\'\u0001\'\u0001\'\u0003"+
		"\'\u019b\b\'\u0003\'\u019d\b\'\u0001\'\u0001\'\u0001(\u0003(\u01a2\b("+
		"\u0001(\u0001(\u0003(\u01a6\b(\u0001(\u0001(\u0003(\u01aa\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u01b2\b)\u0001)\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0003.\u01c5\b.\u0001/\u0001/\u0001/\u0001/\u0005"+
		"/\u01cb\b/\n/\f/\u01ce\t/\u0001/\u0003/\u01d1\b/\u0003/\u01d3\b/\u0001"+
		"/\u0001/\u00010\u00030\u01d8\b0\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00011\u00031\u01e1\b1\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00051\u01f2"+
		"\b1\n1\f1\u01f5\t1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u01ff\b2\u00052\u0201\b2\n2\f2\u0204\t2\u00013\u00013\u00013"+
		"\u00053\u0209\b3\n3\f3\u020c\t3\u00014\u00034\u020f\b4\u00014\u00014\u0001"+
		"5\u00015\u00035\u0215\b5\u00016\u00016\u00016\u00016\u00016\u00016\u0003"+
		"6\u021d\b6\u00017\u00017\u00017\u00037\u0222\b7\u00018\u00018\u00018\u0001"+
		"8\u00019\u00019\u00019\u00019\u00039\u022c\b9\u00019\u00039\u022f\b9\u0003"+
		"9\u0231\b9\u00019\u00019\u0001:\u0001:\u0001:\u0000\u0002bd;\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\u0000\b\u0001\u0000&\'\u0002"+
		"\u0000\u001a\u001e%%\u0002\u0000++00\u0002\u0000\u001a\u001d,,\u0001\u0000"+
		"\u001c\u001e\u0002\u0000\u001a\u001b%%\u0002\u0000(*-/\u0002\u000199C"+
		"C\u0257\u0000~\u0001\u0000\u0000\u0000\u0002\u0083\u0001\u0000\u0000\u0000"+
		"\u0004\u008c\u0001\u0000\u0000\u0000\u0006\u008e\u0001\u0000\u0000\u0000"+
		"\b\u0094\u0001\u0000\u0000\u0000\n\u00a2\u0001\u0000\u0000\u0000\f\u00aa"+
		"\u0001\u0000\u0000\u0000\u000e\u00ae\u0001\u0000\u0000\u0000\u0010\u00b6"+
		"\u0001\u0000\u0000\u0000\u0012\u00be\u0001\u0000\u0000\u0000\u0014\u00cc"+
		"\u0001\u0000\u0000\u0000\u0016\u00cf\u0001\u0000\u0000\u0000\u0018\u00d9"+
		"\u0001\u0000\u0000\u0000\u001a\u00e6\u0001\u0000\u0000\u0000\u001c\u00f5"+
		"\u0001\u0000\u0000\u0000\u001e\u00fb\u0001\u0000\u0000\u0000 \u0103\u0001"+
		"\u0000\u0000\u0000\"\u0105\u0001\u0000\u0000\u0000$\u0107\u0001\u0000"+
		"\u0000\u0000&\u010a\u0001\u0000\u0000\u0000(\u010f\u0001\u0000\u0000\u0000"+
		"*\u0113\u0001\u0000\u0000\u0000,\u0115\u0001\u0000\u0000\u0000.\u0119"+
		"\u0001\u0000\u0000\u00000\u011d\u0001\u0000\u0000\u00002\u0121\u0001\u0000"+
		"\u0000\u00004\u0125\u0001\u0000\u0000\u00006\u0128\u0001\u0000\u0000\u0000"+
		"8\u012a\u0001\u0000\u0000\u0000:\u012d\u0001\u0000\u0000\u0000<\u0142"+
		"\u0001\u0000\u0000\u0000>\u0144\u0001\u0000\u0000\u0000@\u015a\u0001\u0000"+
		"\u0000\u0000B\u0162\u0001\u0000\u0000\u0000D\u0164\u0001\u0000\u0000\u0000"+
		"F\u017a\u0001\u0000\u0000\u0000H\u0182\u0001\u0000\u0000\u0000J\u018a"+
		"\u0001\u0000\u0000\u0000L\u018c\u0001\u0000\u0000\u0000N\u0194\u0001\u0000"+
		"\u0000\u0000P\u01a1\u0001\u0000\u0000\u0000R\u01b1\u0001\u0000\u0000\u0000"+
		"T\u01b6\u0001\u0000\u0000\u0000V\u01bb\u0001\u0000\u0000\u0000X\u01bd"+
		"\u0001\u0000\u0000\u0000Z\u01bf\u0001\u0000\u0000\u0000\\\u01c4\u0001"+
		"\u0000\u0000\u0000^\u01c6\u0001\u0000\u0000\u0000`\u01d7\u0001\u0000\u0000"+
		"\u0000b\u01e0\u0001\u0000\u0000\u0000d\u01f6\u0001\u0000\u0000\u0000f"+
		"\u0205\u0001\u0000\u0000\u0000h\u020e\u0001\u0000\u0000\u0000j\u0214\u0001"+
		"\u0000\u0000\u0000l\u021c\u0001\u0000\u0000\u0000n\u0221\u0001\u0000\u0000"+
		"\u0000p\u0223\u0001\u0000\u0000\u0000r\u0227\u0001\u0000\u0000\u0000t"+
		"\u0234\u0001\u0000\u0000\u0000vy\u0003\u0002\u0001\u0000wy\u0003\u0004"+
		"\u0002\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0003t:\u0000{}\u0001\u0000\u0000\u0000|x\u0001\u0000"+
		"\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0000\u0000\u0001\u0082\u0001"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u000b\u0000\u0000\u0084\u0085"+
		"\u0005;\u0000\u0000\u0085\u0087\u0003^/\u0000\u0086\u0088\u0003\u0018"+
		"\f\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0003\u0001\u0000\u0000\u0000\u0089\u008d\u0003\b\u0004\u0000"+
		"\u008a\u008d\u0003\u0012\t\u0000\u008b\u008d\u0003\u0014\n\u0000\u008c"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u0005\u0001\u0000\u0000\u0000\u008e"+
		"\u0090\u0005;\u0000\u0000\u008f\u0091\u0005+\u0000\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0003 \u0010\u0000\u0093\u0007\u0001\u0000"+
		"\u0000\u0000\u0094\u00a0\u0005\u0004\u0000\u0000\u0095\u00a1\u0003\n\u0005"+
		"\u0000\u0096\u009c\u00051\u0000\u0000\u0097\u0098\u0003\n\u0005\u0000"+
		"\u0098\u0099\u0003t:\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0097"+
		"\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u00052\u0000\u0000\u00a0\u0095\u0001\u0000\u0000\u0000\u00a0\u0096\u0001"+
		"\u0000\u0000\u0000\u00a1\t\u0001\u0000\u0000\u0000\u00a2\u00a8\u0003\u000e"+
		"\u0007\u0000\u00a3\u00a5\u0003 \u0010\u0000\u00a4\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005+\u0000\u0000\u00a7\u00a9\u0003\u0010\b\u0000"+
		"\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u000b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005;\u0000\u0000\u00ab"+
		"\u00ac\u00050\u0000\u0000\u00ac\u00ad\u0003n7\u0000\u00ad\r\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b3\u0005;\u0000\u0000\u00af\u00b0\u00057\u0000\u0000"+
		"\u00b0\u00b2\u0005;\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u000f\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003b1\u0000\u00b7\u00b8\u0005"+
		"7\u0000\u0000\u00b8\u00ba\u0003b1\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u0011\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00ca\u0005\u0018\u0000"+
		"\u0000\u00bf\u00cb\u0003\u0006\u0003\u0000\u00c0\u00c6\u00051\u0000\u0000"+
		"\u00c1\u00c2\u0003\u0006\u0003\u0000\u00c2\u00c3\u0003t:\u0000\u00c3\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cb\u00052\u0000\u0000\u00ca\u00bf\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c0\u0001\u0000\u0000\u0000\u00cb\u0013\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005\u0019\u0000\u0000\u00cd\u00ce\u0003"+
		"\u0016\u000b\u0000\u00ce\u0015\u0001\u0000\u0000\u0000\u00cf\u00d7\u0003"+
		"\u000e\u0007\u0000\u00d0\u00d3\u0003 \u0010\u0000\u00d1\u00d2\u0005+\u0000"+
		"\u0000\u00d2\u00d4\u0003\u0010\b\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0005+\u0000\u0000\u00d6\u00d8\u0003\u0010\b\u0000\u00d7"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8"+
		"\u0017\u0001\u0000\u0000\u0000\u00d9\u00db\u00055\u0000\u0000\u00da\u00dc"+
		"\u0003\u001a\r\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"6\u0000\u0000\u00de\u0019\u0001\u0000\u0000\u0000\u00df\u00e1\u00059\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003\u001c\u000e"+
		"\u0000\u00e3\u00e5\u00059\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e0\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u001b\u0001\u0000\u0000\u0000\u00ea\u00f6\u0003\u0004\u0002\u0000"+
		"\u00eb\u00f6\u0003,\u0016\u0000\u00ec\u00f6\u0003\u001e\u000f\u0000\u00ed"+
		"\u00f6\u0003.\u0017\u0000\u00ee\u00f6\u0005\u0001\u0000\u0000\u00ef\u00f6"+
		"\u0005\u0005\u0000\u0000\u00f0\u00f6\u00036\u001b\u0000\u00f1\u00f6\u0003"+
		"\u0018\f\u0000\u00f2\u00f6\u0003:\u001d\u0000\u00f3\u00f6\u0003<\u001e"+
		"\u0000\u00f4\u00f6\u0003N\'\u0000\u00f5\u00ea\u0001\u0000\u0000\u0000"+
		"\u00f5\u00eb\u0001\u0000\u0000\u0000\u00f5\u00ec\u0001\u0000\u0000\u0000"+
		"\u00f5\u00ed\u0001\u0000\u0000\u0000\u00f5\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f5\u00ef\u0001\u0000\u0000\u0000\u00f5\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f1\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u001d\u0001\u0000\u0000\u0000\u00f7\u00fc\u0003$\u0012\u0000\u00f8"+
		"\u00fc\u0003\f\u0006\u0000\u00f9\u00fc\u0003&\u0013\u0000\u00fa\u00fc"+
		"\u0003\"\u0011\u0000\u00fb\u00f7\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u001f\u0001\u0000\u0000\u0000\u00fd\u0104\u0005"+
		";\u0000\u0000\u00fe\u0104\u0003j5\u0000\u00ff\u0100\u00051\u0000\u0000"+
		"\u0100\u0101\u0003 \u0010\u0000\u0101\u0102\u00052\u0000\u0000\u0102\u0104"+
		"\u0001\u0000\u0000\u0000\u0103\u00fd\u0001\u0000\u0000\u0000\u0103\u00fe"+
		"\u0001\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0104!\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0003b1\u0000\u0106#\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0003b1\u0000\u0108\u0109\u0007\u0000\u0000\u0000\u0109"+
		"%\u0001\u0000\u0000\u0000\u010a\u010b\u0003\u0010\b\u0000\u010b\u010c"+
		"\u0003(\u0014\u0000\u010c\u010d\u0003\u0010\b\u0000\u010d\'\u0001\u0000"+
		"\u0000\u0000\u010e\u0110\u0007\u0001\u0000\u0000\u010f\u010e\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0007\u0002\u0000\u0000\u0112)\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u00059\u0000\u0000\u0114+\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005;\u0000\u0000\u0116\u0117\u0005:\u0000\u0000\u0117\u0118\u0003"+
		"\u001c\u000e\u0000\u0118-\u0001\u0000\u0000\u0000\u0119\u011b\u0005\u0014"+
		"\u0000\u0000\u011a\u011c\u0003\u0010\b\u0000\u011b\u011a\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c/\u0001\u0000\u0000\u0000"+
		"\u011d\u011f\u0005\u0001\u0000\u0000\u011e\u0120\u0005;\u0000\u0000\u011f"+
		"\u011e\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"1\u0001\u0000\u0000\u0000\u0121\u0123\u0005\u0005\u0000\u0000\u0122\u0124"+
		"\u0005;\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u01243\u0001\u0000\u0000\u0000\u0125\u0126\u0005\r"+
		"\u0000\u0000\u0126\u0127\u0005;\u0000\u0000\u01275\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0005\t\u0000\u0000\u01297\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0005\u0007\u0000\u0000\u012b\u012c\u0003b1\u0000\u012c9\u0001"+
		"\u0000\u0000\u0000\u012d\u0136\u0005\u000e\u0000\u0000\u012e\u0137\u0003"+
		"b1\u0000\u012f\u0130\u0003t:\u0000\u0130\u0131\u0003b1\u0000\u0131\u0137"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0003\u001e\u000f\u0000\u0133\u0134"+
		"\u0003t:\u0000\u0134\u0135\u0003b1\u0000\u0135\u0137\u0001\u0000\u0000"+
		"\u0000\u0136\u012e\u0001\u0000\u0000\u0000\u0136\u012f\u0001\u0000\u0000"+
		"\u0000\u0136\u0132\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"+
		"\u0000\u0138\u013e\u0003\u0018\f\u0000\u0139\u013c\u0005\b\u0000\u0000"+
		"\u013a\u013d\u0003:\u001d\u0000\u013b\u013d\u0003\u0018\f\u0000\u013c"+
		"\u013a\u0001\u0000\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d"+
		"\u013f\u0001\u0000\u0000\u0000\u013e\u0139\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0001\u0000\u0000\u0000\u013f;\u0001\u0000\u0000\u0000\u0140\u0143"+
		"\u0003>\u001f\u0000\u0141\u0143\u0003D\"\u0000\u0142\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143=\u0001\u0000\u0000"+
		"\u0000\u0144\u014f\u0005\u0017\u0000\u0000\u0145\u0147\u0003b1\u0000\u0146"+
		"\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u0150\u0001\u0000\u0000\u0000\u0148\u014a\u0003\u001e\u000f\u0000\u0149"+
		"\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u014d\u0003t:\u0000\u014c\u014e\u0003"+
		"b1\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000"+
		"\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u0146\u0001\u0000\u0000"+
		"\u0000\u014f\u0149\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u0155\u00055\u0000\u0000\u0152\u0154\u0003@ \u0000\u0153"+
		"\u0152\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155"+
		"\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"\u0158\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u00056\u0000\u0000\u0159?\u0001\u0000\u0000\u0000\u015a\u015b\u0003"+
		"B!\u0000\u015b\u015d\u0005:\u0000\u0000\u015c\u015e\u0003\u001a\r\u0000"+
		"\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015eA\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0002\u0000\u0000\u0160"+
		"\u0163\u0003\u0010\b\u0000\u0161\u0163\u0005\u0006\u0000\u0000\u0162\u015f"+
		"\u0001\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163C\u0001"+
		"\u0000\u0000\u0000\u0164\u016d\u0005\u0017\u0000\u0000\u0165\u016e\u0003"+
		"F#\u0000\u0166\u0167\u0003t:\u0000\u0167\u0168\u0003F#\u0000\u0168\u016e"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0003\u001e\u000f\u0000\u016a\u016b"+
		"\u0003t:\u0000\u016b\u016c\u0003F#\u0000\u016c\u016e\u0001\u0000\u0000"+
		"\u0000\u016d\u0165\u0001\u0000\u0000\u0000\u016d\u0166\u0001\u0000\u0000"+
		"\u0000\u016d\u0169\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000"+
		"\u0000\u016f\u0173\u00055\u0000\u0000\u0170\u0172\u0003H$\u0000\u0171"+
		"\u0170\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173"+
		"\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174"+
		"\u0176\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u00056\u0000\u0000\u0177E\u0001\u0000\u0000\u0000\u0178\u0179\u0005"+
		";\u0000\u0000\u0179\u017b\u0005+\u0000\u0000\u017a\u0178\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0003l6\u0000\u017d\u017e\u00058\u0000\u0000\u017e"+
		"\u017f\u00051\u0000\u0000\u017f\u0180\u0005\u0018\u0000\u0000\u0180\u0181"+
		"\u00052\u0000\u0000\u0181G\u0001\u0000\u0000\u0000\u0182\u0183\u0003J"+
		"%\u0000\u0183\u0185\u0005:\u0000\u0000\u0184\u0186\u0003\u001a\r\u0000"+
		"\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000"+
		"\u0186I\u0001\u0000\u0000\u0000\u0187\u0188\u0005\u0002\u0000\u0000\u0188"+
		"\u018b\u0003L&\u0000\u0189\u018b\u0005\u0006\u0000\u0000\u018a\u0187\u0001"+
		"\u0000\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018bK\u0001\u0000"+
		"\u0000\u0000\u018c\u0191\u0003 \u0010\u0000\u018d\u018e\u00057\u0000\u0000"+
		"\u018e\u0190\u0003 \u0010\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190"+
		"\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0001\u0000\u0000\u0000\u0192M\u0001\u0000\u0000\u0000\u0193\u0191"+
		"\u0001\u0000\u0000\u0000\u0194\u019c\u0005\n\u0000\u0000\u0195\u0197\u0003"+
		"b1\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u019d\u0001\u0000\u0000\u0000\u0198\u019d\u0003P(\u0000\u0199"+
		"\u019b\u0003R)\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001"+
		"\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u0196\u0001"+
		"\u0000\u0000\u0000\u019c\u0198\u0001\u0000\u0000\u0000\u019c\u019a\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0003"+
		"\u0018\f\u0000\u019fO\u0001\u0000\u0000\u0000\u01a0\u01a2\u0003\u001e"+
		"\u000f\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5\u0003t:\u0000"+
		"\u01a4\u01a6\u0003b1\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a9"+
		"\u0003t:\u0000\u01a8\u01aa\u0003\u001e\u000f\u0000\u01a9\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aaQ\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0003\u0010\b\u0000\u01ac\u01ad\u0005+\u0000\u0000"+
		"\u01ad\u01b2\u0001\u0000\u0000\u0000\u01ae\u01af\u0003\u000e\u0007\u0000"+
		"\u01af\u01b0\u00050\u0000\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1"+
		"\u01ab\u0001\u0000\u0000\u0000\u01b1\u01ae\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0005\u0013\u0000\u0000\u01b4\u01b5\u0003b1\u0000\u01b5S\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u00053\u0000\u0000\u01b7\u01b8\u0003V+"+
		"\u0000\u01b8\u01b9\u00054\u0000\u0000\u01b9\u01ba\u0003X,\u0000\u01ba"+
		"U\u0001\u0000\u0000\u0000\u01bb\u01bc\u0003b1\u0000\u01bcW\u0001\u0000"+
		"\u0000\u0000\u01bd\u01be\u0003 \u0010\u0000\u01beY\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0005\u000b\u0000\u0000\u01c0\u01c1\u0003^/\u0000\u01c1["+
		"\u0001\u0000\u0000\u0000\u01c2\u01c5\u0003^/\u0000\u01c3\u01c5\u0003 "+
		"\u0010\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c5]\u0001\u0000\u0000\u0000\u01c6\u01d2\u00051\u0000\u0000"+
		"\u01c7\u01cc\u0003`0\u0000\u01c8\u01c9\u00057\u0000\u0000\u01c9\u01cb"+
		"\u0003`0\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000"+
		"\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d1\u00057\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d2\u01c7\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u00052\u0000\u0000"+
		"\u01d5_\u0001\u0000\u0000\u0000\u01d6\u01d8\u0005;\u0000\u0000\u01d7\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0003 \u0010\u0000\u01daa\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u00061\uffff\uffff\u0000\u01dc\u01e1\u0003d2"+
		"\u0000\u01dd\u01e1\u0003l6\u0000\u01de\u01df\u0007\u0003\u0000\u0000\u01df"+
		"\u01e1\u0003b1\u0006\u01e0\u01db\u0001\u0000\u0000\u0000\u01e0\u01dd\u0001"+
		"\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01f3\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e3\n\u0005\u0000\u0000\u01e3\u01e4\u0007\u0004"+
		"\u0000\u0000\u01e4\u01f2\u0003b1\u0006\u01e5\u01e6\n\u0004\u0000\u0000"+
		"\u01e6\u01e7\u0007\u0005\u0000\u0000\u01e7\u01f2\u0003b1\u0005\u01e8\u01e9"+
		"\n\u0003\u0000\u0000\u01e9\u01ea\u0007\u0006\u0000\u0000\u01ea\u01f2\u0003"+
		"b1\u0004\u01eb\u01ec\n\u0002\u0000\u0000\u01ec\u01ed\u0005$\u0000\u0000"+
		"\u01ed\u01f2\u0003b1\u0003\u01ee\u01ef\n\u0001\u0000\u0000\u01ef\u01f0"+
		"\u0005%\u0000\u0000\u01f0\u01f2\u0003b1\u0002\u01f1\u01e2\u0001\u0000"+
		"\u0000\u0000\u01f1\u01e5\u0001\u0000\u0000\u0000\u01f1\u01e8\u0001\u0000"+
		"\u0000\u0000\u01f1\u01eb\u0001\u0000\u0000\u0000\u01f1\u01ee\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4c\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f7\u00062\uffff\uffff"+
		"\u0000\u01f7\u01f8\u0003l6\u0000\u01f8\u0202\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fe\n\u0001\u0000\u0000\u01fa\u01fb\u00058\u0000\u0000\u01fb\u01ff"+
		"\u0005;\u0000\u0000\u01fc\u01ff\u0003p8\u0000\u01fd\u01ff\u0003r9\u0000"+
		"\u01fe\u01fa\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ff\u0201\u0001\u0000\u0000\u0000"+
		"\u0200\u01f9\u0001\u0000\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000"+
		"\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000"+
		"\u0203e\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205"+
		"\u020a\u0005;\u0000\u0000\u0206\u0207\u00057\u0000\u0000\u0207\u0209\u0005"+
		";\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000"+
		"\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020bg\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000"+
		"\u0000\u020d\u020f\u0005\u001c\u0000\u0000\u020e\u020d\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0005;\u0000\u0000\u0211i\u0001\u0000\u0000\u0000\u0212"+
		"\u0215\u0003T*\u0000\u0213\u0215\u0003Z-\u0000\u0214\u0212\u0001\u0000"+
		"\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0215k\u0001\u0000\u0000"+
		"\u0000\u0216\u021d\u0003n7\u0000\u0217\u021d\u0005;\u0000\u0000\u0218"+
		"\u0219\u00051\u0000\u0000\u0219\u021a\u0003b1\u0000\u021a\u021b\u0005"+
		"2\u0000\u0000\u021b\u021d\u0001\u0000\u0000\u0000\u021c\u0216\u0001\u0000"+
		"\u0000\u0000\u021c\u0217\u0001\u0000\u0000\u0000\u021c\u0218\u0001\u0000"+
		"\u0000\u0000\u021dm\u0001\u0000\u0000\u0000\u021e\u0222\u0005=\u0000\u0000"+
		"\u021f\u0222\u0005>\u0000\u0000\u0220\u0222\u0005<\u0000\u0000\u0221\u021e"+
		"\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0221\u0220"+
		"\u0001\u0000\u0000\u0000\u0222o\u0001\u0000\u0000\u0000\u0223\u0224\u0005"+
		"3\u0000\u0000\u0224\u0225\u0003b1\u0000\u0225\u0226\u00054\u0000\u0000"+
		"\u0226q\u0001\u0000\u0000\u0000\u0227\u0230\u00051\u0000\u0000\u0228\u022b"+
		"\u0003\u0010\b\u0000\u0229\u022a\u00057\u0000\u0000\u022a\u022c\u0003"+
		"\u0010\b\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000"+
		"\u0000\u0000\u022c\u022e\u0001\u0000\u0000\u0000\u022d\u022f\u00057\u0000"+
		"\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"+
		"\u0000\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u0228\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000"+
		"\u0000\u0232\u0233\u00052\u0000\u0000\u0233s\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\u0007\u0007\u0000\u0000\u0235u\u0001\u0000\u0000\u0000Dx~\u0087"+
		"\u008c\u0090\u009c\u00a0\u00a4\u00a8\u00b3\u00bb\u00c6\u00ca\u00d3\u00d7"+
		"\u00db\u00e0\u00e4\u00e8\u00f5\u00fb\u0103\u010f\u011b\u011f\u0123\u0136"+
		"\u013c\u013e\u0142\u0146\u0149\u014d\u014f\u0155\u015d\u0162\u016d\u0173"+
		"\u017a\u0185\u018a\u0191\u0196\u019a\u019c\u01a1\u01a5\u01a9\u01b1\u01c4"+
		"\u01cc\u01d0\u01d2\u01d7\u01e0\u01f1\u01f3\u01fe\u0202\u020a\u020e\u0214"+
		"\u021c\u0221\u022b\u022e\u0230";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}