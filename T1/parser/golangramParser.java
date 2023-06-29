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
		COMMA=57, SEMI=58, COLON=59, ID=60, REAL_VAL=61, INT_VAL=62, STR_VAL=63, 
		COMMENT=64, BLOCK_COMMENT=65, WHITESPACE=66, UNKNOWN=67, EOS=68;
	public static final int
		RULE_begin = 0, RULE_functionDecl = 1, RULE_arrayStmt = 2, RULE_declaration = 3, 
		RULE_typeSpec = 4, RULE_constDecl = 5, RULE_constSpec = 6, RULE_declareAssignment = 7, 
		RULE_idList = 8, RULE_expressionList = 9, RULE_funcCall = 10, RULE_typeDecl = 11, 
		RULE_varDecl = 12, RULE_varSpec = 13, RULE_block = 14, RULE_statementList = 15, 
		RULE_statement = 16, RULE_simpleStmt = 17, RULE_type_ = 18, RULE_expressionStmt = 19, 
		RULE_incDecStmt = 20, RULE_assignment = 21, RULE_assign_op = 22, RULE_emptyStmt = 23, 
		RULE_labeledStmt = 24, RULE_returnStmt = 25, RULE_breakStmt = 26, RULE_continueStmt = 27, 
		RULE_fallthroughStmt = 28, RULE_deferStmt = 29, RULE_ifStmt = 30, RULE_typeList = 31, 
		RULE_forStmt = 32, RULE_forClause = 33, RULE_rangeClause = 34, RULE_arrayType = 35, 
		RULE_arrayLength = 36, RULE_functionType = 37, RULE_result = 38, RULE_parameters = 39, 
		RULE_parameterDecl = 40, RULE_expression = 41, RULE_primaryExpr = 42, 
		RULE_identifierList = 43, RULE_embeddedField = 44, RULE_typeLit = 45, 
		RULE_operand = 46, RULE_basicLit = 47, RULE_index = 48, RULE_bool = 49, 
		RULE_arguments = 50, RULE_eos = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "functionDecl", "arrayStmt", "declaration", "typeSpec", "constDecl", 
			"constSpec", "declareAssignment", "idList", "expressionList", "funcCall", 
			"typeDecl", "varDecl", "varSpec", "block", "statementList", "statement", 
			"simpleStmt", "type_", "expressionStmt", "incDecStmt", "assignment", 
			"assign_op", "emptyStmt", "labeledStmt", "returnStmt", "breakStmt", "continueStmt", 
			"fallthroughStmt", "deferStmt", "ifStmt", "typeList", "forStmt", "forClause", 
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
			"'>='", "':='", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", 
			"':'"
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
			"LBRACK", "RBRACK", "LCURLYBRACES", "RCURLYBRACES", "COMMA", "SEMI", 
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
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 201334800L) != 0) {
				{
				{
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
					{
					setState(104);
					functionDecl();
					}
					break;
				case CONST:
				case TYPE:
				case VAR:
					{
					setState(105);
					declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(108);
				eos();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
			setState(117);
			match(FUNC);
			setState(118);
			match(ID);
			{
			setState(119);
			parameters();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1164180503675281408L) != 0) {
				{
				setState(120);
				type_();
				}
			}

			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLYBRACES) {
				{
				setState(123);
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
			setState(126);
			operand();
			setState(127);
			index();
			setState(128);
			match(ASSIGN);
			setState(129);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(131);
				constDecl();
				}
				break;
			case TYPE:
				{
				setState(132);
				typeDecl();
				}
				break;
			case VAR:
				{
				setState(133);
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
			setState(136);
			match(ID);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(137);
				match(ASSIGN);
				}
			}

			setState(140);
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
			setState(142);
			match(CONST);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
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
				while (_la==ID) {
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
			setState(156);
			idList();
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1164180503675281408L) != 0) {
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
			setState(164);
			match(ID);
			setState(165);
			match(DECLARE_ASSIGN);
			setState(166);
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
			setState(168);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169);
				match(COMMA);
				setState(170);
				match(ID);
				}
				}
				setState(175);
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
			setState(176);
			expression(0);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(COMMA);
					setState(178);
					expression(0);
					}
					} 
				}
				setState(183);
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
			setState(184);
			match(ID);
			setState(185);
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
			setState(187);
			match(TYPE);
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(188);
				typeSpec();
				}
				break;
			case LPAR:
				{
				setState(189);
				match(LPAR);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(190);
					typeSpec();
					setState(191);
					eos();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
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
			setState(201);
			match(VAR);
			setState(202);
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
			setState(204);
			idList();
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(205);
				arrayType();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(206);
					match(ASSIGN);
					setState(207);
					expressionList();
					}
				}

				}
				break;
			case 2:
				{
				setState(210);
				type_();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(211);
					match(ASSIGN);
					setState(212);
					expressionList();
					}
				}

				}
				break;
			case 3:
				{
				setState(215);
				match(ASSIGN);
				setState(216);
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
			setState(219);
			match(LCURLYBRACES);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -826340158646182350L) != 0) {
				{
				setState(220);
				statementList();
				}
			}

			setState(223);
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
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(225);
					match(SEMI);
					}
				}

				}
				setState(228);
				statement();
				{
				setState(230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(229);
					match(SEMI);
					}
					break;
				}
				}
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & -826340158646182350L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				labeledStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				simpleStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				returnStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				match(BREAK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				match(CONTINUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				fallthroughStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(245);
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
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new SimpleArrayStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				arrayStmt();
				}
				break;
			case 2:
				_localctx = new SimpleIncDecStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				incDecStmt();
				}
				break;
			case 3:
				_localctx = new SimpleDeclareAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				declareAssignment();
				}
				break;
			case 4:
				_localctx = new SimpleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				assignment();
				}
				break;
			case 5:
				_localctx = new SimpleExpressionStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
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
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(ID);
				}
				break;
			case FUNC:
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				typeLit();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(LPAR);
				setState(258);
				type_();
				setState(259);
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
			setState(263);
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
			setState(265);
			expression(0);
			setState(266);
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
			setState(268);
			expressionList();
			setState(269);
			assign_op();
			setState(270);
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
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 558077313024L) != 0) {
				{
				setState(272);
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

			setState(275);
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
			setState(277);
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
			setState(279);
			match(ID);
			setState(280);
			match(COLON);
			setState(281);
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
			setState(283);
			match(RETURN);
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(284);
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
			setState(287);
			match(BREAK);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(288);
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
			setState(291);
			match(CONTINUE);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(292);
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
			setState(300);
			match(IF);
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
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
		enterRule(_localctx, 62, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(319);
			type_();
			}
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(320);
				match(COMMA);
				{
				setState(321);
				type_();
				}
				}
				}
				setState(326);
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
		enterRule(_localctx, 64, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(FOR);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -1150599332022450688L) != 0) {
					{
					setState(328);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(331);
				forClause();
				}
				break;
			case 3:
				{
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -1150599332020353536L) != 0) {
					{
					setState(332);
					rangeClause();
					}
				}

				}
				break;
			}
			setState(337);
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
		enterRule(_localctx, 66, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -1150599332022450688L) != 0) {
				{
				setState(339);
				((ForClauseContext)_localctx).initStmt = simpleStmt();
				}
			}

			setState(342);
			eos();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -1150599332022450688L) != 0) {
				{
				setState(343);
				expression(0);
				}
			}

			setState(346);
			eos();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -1150599332022450688L) != 0) {
				{
				setState(347);
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
		enterRule(_localctx, 68, RULE_rangeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(350);
				expressionList();
				setState(351);
				match(ASSIGN);
				}
				break;
			case 2:
				{
				setState(353);
				idList();
				setState(354);
				match(DECLARE_ASSIGN);
				}
				break;
			}
			setState(358);
			match(RANGE);
			setState(359);
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
		enterRule(_localctx, 70, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(LBRACK);
			setState(362);
			arrayLength();
			setState(363);
			match(RBRACK);
			setState(364);
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
		enterRule(_localctx, 72, RULE_arrayLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		enterRule(_localctx, 74, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(FUNC);
			setState(369);
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
		enterRule(_localctx, 76, RULE_result);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
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
		enterRule(_localctx, 78, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(LPAR);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1164180503675281408L) != 0) {
				{
				setState(376);
				parameterDecl();
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(377);
						match(COMMA);
						setState(378);
						parameterDecl();
						}
						} 
					}
					setState(383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(384);
					match(COMMA);
					}
				}

				}
			}

			setState(389);
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
		enterRule(_localctx, 80, RULE_parameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(391);
				match(ID);
				}
				break;
			}
			setState(394);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				_localctx = new FuncCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(397);
				funcCall();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryExprExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(398);
				primaryExpr(0);
				}
				break;
			case 3:
				{
				_localctx = new OperandExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(399);
				operand();
				}
				break;
			case 4:
				{
				_localctx = new Unary_opExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(400);
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
				setState(401);
				expression(6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(419);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new Mul_opExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(405);
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
						setState(406);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Add_opExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(407);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(408);
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
						setState(409);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new Rel_opExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(410);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(411);
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
						setState(412);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(413);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(414);
						match(AND);
						setState(415);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(416);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(417);
						match(OR);
						setState(418);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(425);
			operand();
			}
			_ctx.stop = _input.LT(-1);
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(427);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(430);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACK:
						{
						setState(428);
						index();
						}
						break;
					case LPAR:
						{
						setState(429);
						arguments();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 86, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(ID);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(438);
				match(COMMA);
				setState(439);
				match(ID);
				}
				}
				setState(444);
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
		enterRule(_localctx, 88, RULE_embeddedField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMES) {
				{
				setState(445);
				match(TIMES);
				}
			}

			setState(448);
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
		enterRule(_localctx, 90, RULE_typeLit);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				arrayType();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
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
		enterRule(_localctx, 92, RULE_operand);
		try {
			setState(460);
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
				setState(454);
				basicLit();
				}
				break;
			case ID:
				_localctx = new OperandIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(ID);
				}
				break;
			case LPAR:
				_localctx = new OperandLRPARContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				match(LPAR);
				setState(457);
				expression(0);
				setState(458);
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
		enterRule(_localctx, 94, RULE_basicLit);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
				_localctx = new IntValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(INT_VAL);
				}
				break;
			case STR_VAL:
				_localctx = new StrValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(STR_VAL);
				}
				break;
			case REAL_VAL:
				_localctx = new RealValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				match(REAL_VAL);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BoolValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
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
		enterRule(_localctx, 96, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(LBRACK);
			setState(469);
			expression(0);
			setState(470);
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
		enterRule(_localctx, 98, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
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
		enterRule(_localctx, 100, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(LPAR);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -1150599332022450688L) != 0) {
				{
				{
				setState(475);
				expressionList();
				setState(478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(476);
					match(COMMA);
					setState(477);
					expressionList();
					}
					break;
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(480);
					match(COMMA);
					}
				}

				}
			}

			setState(485);
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
		enterRule(_localctx, 102, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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
		case 41:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 42:
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
		"\u0004\u0001D\u01ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0003\u0000k\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000o\b\u0000\n\u0000\f\u0000r\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001z\b\u0001\u0001\u0001\u0003\u0001}\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0087\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u008b\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0095\b\u0005\n\u0005\f\u0005"+
		"\u0098\t\u0005\u0001\u0005\u0003\u0005\u009b\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u009f\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a3"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00ac\b\b\n\b\f\b\u00af\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u00b4\b\t\n\t\f\t\u00b7\t\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00c2\b\u000b\n\u000b\f\u000b\u00c5\t\u000b\u0001\u000b\u0003\u000b\u00c8"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00d1\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d6\b\r\u0001\r\u0001\r"+
		"\u0003\r\u00da\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u00de\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0003\u000f\u00e3\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00e7\b\u000f\u0004\u000f\u00e9\b\u000f\u000b\u000f"+
		"\f\u000f\u00ea\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00f7\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00fe\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0106\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0003\u0016\u0112\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u011e\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0122\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0126\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0136\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u013c\b\u001e\u0003\u001e\u013e"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0143\b\u001f"+
		"\n\u001f\f\u001f\u0146\t\u001f\u0001 \u0001 \u0003 \u014a\b \u0001 \u0001"+
		" \u0003 \u014e\b \u0003 \u0150\b \u0001 \u0001 \u0001!\u0003!\u0155\b"+
		"!\u0001!\u0001!\u0003!\u0159\b!\u0001!\u0001!\u0003!\u015d\b!\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0165\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0003&\u0176\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0005\'\u017c\b\'\n\'\f\'\u017f\t\'\u0001\'\u0003\'\u0182\b\'\u0003\'"+
		"\u0184\b\'\u0001\'\u0001\'\u0001(\u0003(\u0189\b(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0193\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0005)\u01a4\b)\n)\f)\u01a7\t)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u01af\b*\u0005*\u01b1\b*\n*\f*\u01b4\t*\u0001+"+
		"\u0001+\u0001+\u0005+\u01b9\b+\n+\f+\u01bc\t+\u0001,\u0003,\u01bf\b,\u0001"+
		",\u0001,\u0001-\u0001-\u0003-\u01c5\b-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u01cd\b.\u0001/\u0001/\u0001/\u0001/\u0003/\u01d3\b/\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00012\u00012\u00012\u00012\u0003"+
		"2\u01df\b2\u00012\u00032\u01e2\b2\u00032\u01e4\b2\u00012\u00012\u0001"+
		"3\u00013\u00013\u0000\u0002RT4\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdf\u0000\t\u0001\u0000()\u0002\u0000\u001c \'\'\u0002\u0000-"+
		"-22\u0002\u0000\u001c\u001f..\u0001\u0000\u001e \u0002\u0000\u001c\u001d"+
		"\'\'\u0002\u0000*,/1\u0001\u0000\t\n\u0002\u0001::DD\u0207\u0000p\u0001"+
		"\u0000\u0000\u0000\u0002u\u0001\u0000\u0000\u0000\u0004~\u0001\u0000\u0000"+
		"\u0000\u0006\u0086\u0001\u0000\u0000\u0000\b\u0088\u0001\u0000\u0000\u0000"+
		"\n\u008e\u0001\u0000\u0000\u0000\f\u009c\u0001\u0000\u0000\u0000\u000e"+
		"\u00a4\u0001\u0000\u0000\u0000\u0010\u00a8\u0001\u0000\u0000\u0000\u0012"+
		"\u00b0\u0001\u0000\u0000\u0000\u0014\u00b8\u0001\u0000\u0000\u0000\u0016"+
		"\u00bb\u0001\u0000\u0000\u0000\u0018\u00c9\u0001\u0000\u0000\u0000\u001a"+
		"\u00cc\u0001\u0000\u0000\u0000\u001c\u00db\u0001\u0000\u0000\u0000\u001e"+
		"\u00e8\u0001\u0000\u0000\u0000 \u00f6\u0001\u0000\u0000\u0000\"\u00fd"+
		"\u0001\u0000\u0000\u0000$\u0105\u0001\u0000\u0000\u0000&\u0107\u0001\u0000"+
		"\u0000\u0000(\u0109\u0001\u0000\u0000\u0000*\u010c\u0001\u0000\u0000\u0000"+
		",\u0111\u0001\u0000\u0000\u0000.\u0115\u0001\u0000\u0000\u00000\u0117"+
		"\u0001\u0000\u0000\u00002\u011b\u0001\u0000\u0000\u00004\u011f\u0001\u0000"+
		"\u0000\u00006\u0123\u0001\u0000\u0000\u00008\u0127\u0001\u0000\u0000\u0000"+
		":\u0129\u0001\u0000\u0000\u0000<\u012c\u0001\u0000\u0000\u0000>\u013f"+
		"\u0001\u0000\u0000\u0000@\u0147\u0001\u0000\u0000\u0000B\u0154\u0001\u0000"+
		"\u0000\u0000D\u0164\u0001\u0000\u0000\u0000F\u0169\u0001\u0000\u0000\u0000"+
		"H\u016e\u0001\u0000\u0000\u0000J\u0170\u0001\u0000\u0000\u0000L\u0175"+
		"\u0001\u0000\u0000\u0000N\u0177\u0001\u0000\u0000\u0000P\u0188\u0001\u0000"+
		"\u0000\u0000R\u0192\u0001\u0000\u0000\u0000T\u01a8\u0001\u0000\u0000\u0000"+
		"V\u01b5\u0001\u0000\u0000\u0000X\u01be\u0001\u0000\u0000\u0000Z\u01c4"+
		"\u0001\u0000\u0000\u0000\\\u01cc\u0001\u0000\u0000\u0000^\u01d2\u0001"+
		"\u0000\u0000\u0000`\u01d4\u0001\u0000\u0000\u0000b\u01d8\u0001\u0000\u0000"+
		"\u0000d\u01da\u0001\u0000\u0000\u0000f\u01e7\u0001\u0000\u0000\u0000h"+
		"k\u0003\u0002\u0001\u0000ik\u0003\u0006\u0003\u0000jh\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0003f3\u0000"+
		"mo\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000or\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005\u0000\u0000\u0001t\u0001"+
		"\u0001\u0000\u0000\u0000uv\u0005\r\u0000\u0000vw\u0005<\u0000\u0000wy"+
		"\u0003N\'\u0000xz\u0003$\u0012\u0000yx\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{}\u0003\u001c\u000e\u0000"+
		"|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0003\u0001\u0000"+
		"\u0000\u0000~\u007f\u0003\\.\u0000\u007f\u0080\u0003`0\u0000\u0080\u0081"+
		"\u0005-\u0000\u0000\u0081\u0082\u0003^/\u0000\u0082\u0005\u0001\u0000"+
		"\u0000\u0000\u0083\u0087\u0003\n\u0005\u0000\u0084\u0087\u0003\u0016\u000b"+
		"\u0000\u0085\u0087\u0003\u0018\f\u0000\u0086\u0083\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0007\u0001\u0000\u0000\u0000\u0088\u008a\u0005<\u0000\u0000\u0089"+
		"\u008b\u0005-\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0003$\u0012\u0000\u008d\t\u0001\u0000\u0000\u0000\u008e\u009a\u0005"+
		"\u0004\u0000\u0000\u008f\u009b\u0003\f\u0006\u0000\u0090\u0096\u00053"+
		"\u0000\u0000\u0091\u0092\u0003\f\u0006\u0000\u0092\u0093\u0003f3\u0000"+
		"\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000"+
		"\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009b\u00054\u0000\u0000\u009a"+
		"\u008f\u0001\u0000\u0000\u0000\u009a\u0090\u0001\u0000\u0000\u0000\u009b"+
		"\u000b\u0001\u0000\u0000\u0000\u009c\u00a2\u0003\u0010\b\u0000\u009d\u009f"+
		"\u0003$\u0012\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		"-\u0000\u0000\u00a1\u00a3\u0003\u0012\t\u0000\u00a2\u009e\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\r\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005<\u0000\u0000\u00a5\u00a6\u00052\u0000\u0000\u00a6"+
		"\u00a7\u0003^/\u0000\u00a7\u000f\u0001\u0000\u0000\u0000\u00a8\u00ad\u0005"+
		"<\u0000\u0000\u00a9\u00aa\u00059\u0000\u0000\u00aa\u00ac\u0005<\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u0011\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b5\u0003R)\u0000\u00b1\u00b2\u00059\u0000\u0000\u00b2"+
		"\u00b4\u0003R)\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u0013\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005<\u0000\u0000\u00b9\u00ba\u0003d2"+
		"\u0000\u00ba\u0015\u0001\u0000\u0000\u0000\u00bb\u00c7\u0005\u001a\u0000"+
		"\u0000\u00bc\u00c8\u0003\b\u0004\u0000\u00bd\u00c3\u00053\u0000\u0000"+
		"\u00be\u00bf\u0003\b\u0004\u0000\u00bf\u00c0\u0003f3\u0000\u00c0\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c8\u00054\u0000\u0000\u00c7\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c7\u00bd\u0001\u0000\u0000\u0000\u00c8\u0017\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0005\u001b\u0000\u0000\u00ca\u00cb\u0003"+
		"\u001a\r\u0000\u00cb\u0019\u0001\u0000\u0000\u0000\u00cc\u00d9\u0003\u0010"+
		"\b\u0000\u00cd\u00d0\u0003F#\u0000\u00ce\u00cf\u0005-\u0000\u0000\u00cf"+
		"\u00d1\u0003\u0012\t\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00da\u0001\u0000\u0000\u0000\u00d2\u00d5"+
		"\u0003$\u0012\u0000\u00d3\u00d4\u0005-\u0000\u0000\u00d4\u00d6\u0003\u0012"+
		"\t\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u00da\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005-\u0000\u0000"+
		"\u00d8\u00da\u0003\u0012\t\u0000\u00d9\u00cd\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da"+
		"\u001b\u0001\u0000\u0000\u0000\u00db\u00dd\u00057\u0000\u0000\u00dc\u00de"+
		"\u0003\u001e\u000f\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u00058\u0000\u0000\u00e0\u001d\u0001\u0000\u0000\u0000\u00e1\u00e3\u0005"+
		":\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0003 \u0010"+
		"\u0000\u00e5\u00e7\u0005:\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e2\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u001f\u0001\u0000\u0000\u0000\u00ec\u00f7\u0003\u0006\u0003\u0000"+
		"\u00ed\u00f7\u00030\u0018\u0000\u00ee\u00f7\u0003\"\u0011\u0000\u00ef"+
		"\u00f7\u00032\u0019\u0000\u00f0\u00f7\u0005\u0001\u0000\u0000\u00f1\u00f7"+
		"\u0005\u0005\u0000\u0000\u00f2\u00f7\u00038\u001c\u0000\u00f3\u00f7\u0003"+
		"\u001c\u000e\u0000\u00f4\u00f7\u0003<\u001e\u0000\u00f5\u00f7\u0003@ "+
		"\u0000\u00f6\u00ec\u0001\u0000\u0000\u0000\u00f6\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000\u00f6\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f0\u0001\u0000\u0000\u0000\u00f6\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7!\u0001\u0000\u0000\u0000\u00f8\u00fe\u0003\u0004\u0002\u0000"+
		"\u00f9\u00fe\u0003(\u0014\u0000\u00fa\u00fe\u0003\u000e\u0007\u0000\u00fb"+
		"\u00fe\u0003*\u0015\u0000\u00fc\u00fe\u0003&\u0013\u0000\u00fd\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe#\u0001\u0000\u0000\u0000\u00ff\u0106\u0005<\u0000"+
		"\u0000\u0100\u0106\u0003Z-\u0000\u0101\u0102\u00053\u0000\u0000\u0102"+
		"\u0103\u0003$\u0012\u0000\u0103\u0104\u00054\u0000\u0000\u0104\u0106\u0001"+
		"\u0000\u0000\u0000\u0105\u00ff\u0001\u0000\u0000\u0000\u0105\u0100\u0001"+
		"\u0000\u0000\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0106%\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0003R)\u0000\u0108\'\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0003R)\u0000\u010a\u010b\u0007\u0000\u0000\u0000\u010b)"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0003\u0012\t\u0000\u010d\u010e\u0003"+
		",\u0016\u0000\u010e\u010f\u0003\u0012\t\u0000\u010f+\u0001\u0000\u0000"+
		"\u0000\u0110\u0112\u0007\u0001\u0000\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0007\u0002\u0000\u0000\u0114-\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005:\u0000\u0000\u0116/\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0005<\u0000\u0000\u0118\u0119\u0005;\u0000\u0000\u0119\u011a\u0003 "+
		"\u0010\u0000\u011a1\u0001\u0000\u0000\u0000\u011b\u011d\u0005\u0016\u0000"+
		"\u0000\u011c\u011e\u0003\u0012\t\u0000\u011d\u011c\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0001\u0000\u0000\u0000\u011e3\u0001\u0000\u0000\u0000\u011f"+
		"\u0121\u0005\u0001\u0000\u0000\u0120\u0122\u0005<\u0000\u0000\u0121\u0120"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u01225\u0001"+
		"\u0000\u0000\u0000\u0123\u0125\u0005\u0005\u0000\u0000\u0124\u0126\u0005"+
		"<\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u01267\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u000b\u0000"+
		"\u0000\u01289\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0007\u0000\u0000"+
		"\u012a\u012b\u0003R)\u0000\u012b;\u0001\u0000\u0000\u0000\u012c\u0135"+
		"\u0005\u0010\u0000\u0000\u012d\u0136\u0003R)\u0000\u012e\u012f\u0003f"+
		"3\u0000\u012f\u0130\u0003R)\u0000\u0130\u0136\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0003\"\u0011\u0000\u0132\u0133\u0003f3\u0000\u0133\u0134"+
		"\u0003R)\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u012d\u0001\u0000"+
		"\u0000\u0000\u0135\u012e\u0001\u0000\u0000\u0000\u0135\u0131\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u013d\u0003\u001c"+
		"\u000e\u0000\u0138\u013b\u0005\b\u0000\u0000\u0139\u013c\u0003<\u001e"+
		"\u0000\u013a\u013c\u0003\u001c\u000e\u0000\u013b\u0139\u0001\u0000\u0000"+
		"\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000"+
		"\u0000\u013d\u0138\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e=\u0001\u0000\u0000\u0000\u013f\u0144\u0003$\u0012\u0000\u0140"+
		"\u0141\u00059\u0000\u0000\u0141\u0143\u0003$\u0012\u0000\u0142\u0140\u0001"+
		"\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145?\u0001\u0000"+
		"\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u014f\u0005\f\u0000"+
		"\u0000\u0148\u014a\u0003R)\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0001\u0000\u0000\u0000\u014a\u0150\u0001\u0000\u0000\u0000\u014b"+
		"\u0150\u0003B!\u0000\u014c\u014e\u0003D\"\u0000\u014d\u014c\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000"+
		"\u0000\u0000\u014f\u0149\u0001\u0000\u0000\u0000\u014f\u014b\u0001\u0000"+
		"\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0003\u001c\u000e\u0000\u0152A\u0001\u0000\u0000"+
		"\u0000\u0153\u0155\u0003\"\u0011\u0000\u0154\u0153\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156\u0158\u0003f3\u0000\u0157\u0159\u0003R)\u0000\u0158\u0157\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001"+
		"\u0000\u0000\u0000\u015a\u015c\u0003f3\u0000\u015b\u015d\u0003\"\u0011"+
		"\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000"+
		"\u0000\u015dC\u0001\u0000\u0000\u0000\u015e\u015f\u0003\u0012\t\u0000"+
		"\u015f\u0160\u0005-\u0000\u0000\u0160\u0165\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0003\u0010\b\u0000\u0162\u0163\u00052\u0000\u0000\u0163\u0165"+
		"\u0001\u0000\u0000\u0000\u0164\u015e\u0001\u0000\u0000\u0000\u0164\u0161"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u0015\u0000\u0000\u0167\u0168"+
		"\u0003R)\u0000\u0168E\u0001\u0000\u0000\u0000\u0169\u016a\u00055\u0000"+
		"\u0000\u016a\u016b\u0003H$\u0000\u016b\u016c\u00056\u0000\u0000\u016c"+
		"\u016d\u0003$\u0012\u0000\u016dG\u0001\u0000\u0000\u0000\u016e\u016f\u0003"+
		"R)\u0000\u016fI\u0001\u0000\u0000\u0000\u0170\u0171\u0005\r\u0000\u0000"+
		"\u0171\u0172\u0003N\'\u0000\u0172K\u0001\u0000\u0000\u0000\u0173\u0176"+
		"\u0003N\'\u0000\u0174\u0176\u0003$\u0012\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176M\u0001\u0000\u0000"+
		"\u0000\u0177\u0183\u00053\u0000\u0000\u0178\u017d\u0003P(\u0000\u0179"+
		"\u017a\u00059\u0000\u0000\u017a\u017c\u0003P(\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0181\u0001"+
		"\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0182\u0005"+
		"9\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0178\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u00054\u0000\u0000\u0186O\u0001\u0000\u0000\u0000"+
		"\u0187\u0189\u0005<\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0003$\u0012\u0000\u018bQ\u0001\u0000\u0000\u0000\u018c\u018d\u0006"+
		")\uffff\uffff\u0000\u018d\u0193\u0003\u0014\n\u0000\u018e\u0193\u0003"+
		"T*\u0000\u018f\u0193\u0003\\.\u0000\u0190\u0191\u0007\u0003\u0000\u0000"+
		"\u0191\u0193\u0003R)\u0006\u0192\u018c\u0001\u0000\u0000\u0000\u0192\u018e"+
		"\u0001\u0000\u0000\u0000\u0192\u018f\u0001\u0000\u0000\u0000\u0192\u0190"+
		"\u0001\u0000\u0000\u0000\u0193\u01a5\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\n\u0005\u0000\u0000\u0195\u0196\u0007\u0004\u0000\u0000\u0196\u01a4\u0003"+
		"R)\u0006\u0197\u0198\n\u0004\u0000\u0000\u0198\u0199\u0007\u0005\u0000"+
		"\u0000\u0199\u01a4\u0003R)\u0005\u019a\u019b\n\u0003\u0000\u0000\u019b"+
		"\u019c\u0007\u0006\u0000\u0000\u019c\u01a4\u0003R)\u0004\u019d\u019e\n"+
		"\u0002\u0000\u0000\u019e\u019f\u0005&\u0000\u0000\u019f\u01a4\u0003R)"+
		"\u0003\u01a0\u01a1\n\u0001\u0000\u0000\u01a1\u01a2\u0005\'\u0000\u0000"+
		"\u01a2\u01a4\u0003R)\u0002\u01a3\u0194\u0001\u0000\u0000\u0000\u01a3\u0197"+
		"\u0001\u0000\u0000\u0000\u01a3\u019a\u0001\u0000\u0000\u0000\u01a3\u019d"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a0\u0001\u0000\u0000\u0000\u01a4\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6S\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0006*\uffff\uffff\u0000\u01a9\u01aa\u0003"+
		"\\.\u0000\u01aa\u01b2\u0001\u0000\u0000\u0000\u01ab\u01ae\n\u0001\u0000"+
		"\u0000\u01ac\u01af\u0003`0\u0000\u01ad\u01af\u0003d2\u0000\u01ae\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b0\u01ab\u0001\u0000\u0000\u0000\u01b1\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b3U\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b5\u01ba\u0005<\u0000\u0000\u01b6\u01b7\u00059\u0000"+
		"\u0000\u01b7\u01b9\u0005<\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bbW\u0001\u0000\u0000\u0000\u01bc"+
		"\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bf\u0005\u001e\u0000\u0000\u01be"+
		"\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005<\u0000\u0000\u01c1Y\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c5\u0003F#\u0000\u01c3\u01c5\u0003J%\u0000"+
		"\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c5[\u0001\u0000\u0000\u0000\u01c6\u01cd\u0003^/\u0000\u01c7\u01cd"+
		"\u0005<\u0000\u0000\u01c8\u01c9\u00053\u0000\u0000\u01c9\u01ca\u0003R"+
		")\u0000\u01ca\u01cb\u00054\u0000\u0000\u01cb\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cc\u01c6\u0001\u0000\u0000\u0000\u01cc\u01c7\u0001\u0000\u0000\u0000"+
		"\u01cc\u01c8\u0001\u0000\u0000\u0000\u01cd]\u0001\u0000\u0000\u0000\u01ce"+
		"\u01d3\u0005>\u0000\u0000\u01cf\u01d3\u0005?\u0000\u0000\u01d0\u01d3\u0005"+
		"=\u0000\u0000\u01d1\u01d3\u0003b1\u0000\u01d2\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d2\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3_\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u00055\u0000\u0000\u01d5\u01d6\u0003R)\u0000\u01d6\u01d7"+
		"\u00056\u0000\u0000\u01d7a\u0001\u0000\u0000\u0000\u01d8\u01d9\u0007\u0007"+
		"\u0000\u0000\u01d9c\u0001\u0000\u0000\u0000\u01da\u01e3\u00053\u0000\u0000"+
		"\u01db\u01de\u0003\u0012\t\u0000\u01dc\u01dd\u00059\u0000\u0000\u01dd"+
		"\u01df\u0003\u0012\t\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0001\u0000\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01e2"+
		"\u00059\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3\u01db\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u00054\u0000\u0000\u01e6e\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e8\u0007\b\u0000\u0000\u01e8g\u0001\u0000\u0000\u0000"+
		"9jpy|\u0086\u008a\u0096\u009a\u009e\u00a2\u00ad\u00b5\u00c3\u00c7\u00d0"+
		"\u00d5\u00d9\u00dd\u00e2\u00e6\u00ea\u00f6\u00fd\u0105\u0111\u011d\u0121"+
		"\u0125\u0135\u013b\u013d\u0144\u0149\u014d\u014f\u0154\u0158\u015c\u0164"+
		"\u0175\u017d\u0181\u0183\u0188\u0192\u01a3\u01a5\u01ae\u01b2\u01ba\u01be"+
		"\u01c4\u01cc\u01d2\u01de\u01e1\u01e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}