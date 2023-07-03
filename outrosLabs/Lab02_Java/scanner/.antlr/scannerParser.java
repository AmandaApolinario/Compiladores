// Generated from /home/lmscaramussa/Documents/Compiladores/Lab02_Java/scanner/scanner.g by ANTLR 4.9.2
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
		BEGIN=1, BOOL=2, ELSE=3, END=4, FALSE=5, IF=6, INT=7, PROGRAM=8, READ=9, 
		REAL=10, REPEAT=11, STRING=12, THEN=13, TRUE=14, UNTIL=15, VAR=16, WRITE=17, 
		ASSIGN=18, EQ=19, LT=20, PLUS=21, MINUS=22, TIMES=23, OVER=24, LPAR=25, 
		RPAR=26, SEMI=27, ID=28, REAL_VAL=29, INT_VAL=30, STR_VAL=31, WHITESPACE=32, 
		COMMENT=33, UNKNOWN=34;
	public static final int
		RULE_program = 0, RULE_varssect = 1, RULE_vardecl = 2, RULE_typespec = 3, 
		RULE_stmtsect = 4, RULE_stmt = 5, RULE_assignstmt = 6, RULE_ifstmt = 7, 
		RULE_readstmt = 8, RULE_repeatstmt = 9, RULE_writestmt = 10, RULE_expr = 11, 
		RULE_op = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "varssect", "vardecl", "typespec", "stmtsect", "stmt", "assignstmt", 
			"ifstmt", "readstmt", "repeatstmt", "writestmt", "expr", "op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'bool'", "'else'", "'end'", "'false'", "'if'", "'int'", 
			"'program'", "'read'", "'real'", "'repeat'", "'string'", "'then'", "'true'", 
			"'until'", "'var'", "'write'", "':='", "'='", "'<'", "'+'", "'-'", "'*'", 
			"'/'", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGIN", "BOOL", "ELSE", "END", "FALSE", "IF", "INT", "PROGRAM", 
			"READ", "REAL", "REPEAT", "STRING", "THEN", "TRUE", "UNTIL", "VAR", "WRITE", 
			"ASSIGN", "EQ", "LT", "PLUS", "MINUS", "TIMES", "OVER", "LPAR", "RPAR", 
			"SEMI", "ID", "REAL_VAL", "INT_VAL", "STR_VAL", "WHITESPACE", "COMMENT", 
			"UNKNOWN"
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(scannerParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(scannerParser.SEMI, 0); }
		public VarssectContext varssect() {
			return getRuleContext(VarssectContext.class,0);
		}
		public StmtsectContext stmtsect() {
			return getRuleContext(StmtsectContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(PROGRAM);
			setState(27);
			match(ID);
			setState(28);
			match(SEMI);
			setState(29);
			varssect();
			setState(30);
			stmtsect();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarssectContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(scannerParser.VAR, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public VarssectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varssect; }
	}

	public final VarssectContext varssect() throws RecognitionException {
		VarssectContext _localctx = new VarssectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varssect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(VAR);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) {
				{
				{
				setState(33);
				vardecl();
				}
				}
				setState(38);
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

	public static class VardeclContext extends ParserRuleContext {
		public TypespecContext typespec() {
			return getRuleContext(TypespecContext.class,0);
		}
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(scannerParser.SEMI, 0); }
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			typespec();
			setState(40);
			match(ID);
			setState(41);
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

	public static class TypespecContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(scannerParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(scannerParser.INT, 0); }
		public TerminalNode REAL() { return getToken(scannerParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(scannerParser.STRING, 0); }
		public TypespecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespec; }
	}

	public final TypespecContext typespec() throws RecognitionException {
		TypespecContext _localctx = new TypespecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typespec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << REAL) | (1L << STRING))) != 0)) ) {
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

	public static class StmtsectContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(scannerParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(scannerParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtsect; }
	}

	public final StmtsectContext stmtsect() throws RecognitionException {
		StmtsectContext _localctx = new StmtsectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmtsect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(BEGIN);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				stmt();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << READ) | (1L << REPEAT) | (1L << WRITE) | (1L << ID))) != 0) );
			setState(51);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public ReadstmtContext readstmt() {
			return getRuleContext(ReadstmtContext.class,0);
		}
		public RepeatstmtContext repeatstmt() {
			return getRuleContext(RepeatstmtContext.class,0);
		}
		public WritestmtContext writestmt() {
			return getRuleContext(WritestmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				assignstmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				ifstmt();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				readstmt();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				repeatstmt();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				writestmt();
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

	public static class AssignstmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(scannerParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(scannerParser.SEMI, 0); }
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
			setState(61);
			match(ASSIGN);
			setState(62);
			expr(0);
			setState(63);
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

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(scannerParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(scannerParser.THEN, 0); }
		public TerminalNode END() { return getToken(scannerParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(scannerParser.ELSE, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(IF);
			setState(66);
			expr(0);
			setState(67);
			match(THEN);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				stmt();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << READ) | (1L << REPEAT) | (1L << WRITE) | (1L << ID))) != 0) );
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(73);
				match(ELSE);
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					stmt();
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << READ) | (1L << REPEAT) | (1L << WRITE) | (1L << ID))) != 0) );
				}
			}

			setState(81);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadstmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(scannerParser.READ, 0); }
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(scannerParser.SEMI, 0); }
		public ReadstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstmt; }
	}

	public final ReadstmtContext readstmt() throws RecognitionException {
		ReadstmtContext _localctx = new ReadstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_readstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(READ);
			setState(84);
			match(ID);
			setState(85);
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

	public static class RepeatstmtContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(scannerParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(scannerParser.UNTIL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public RepeatstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatstmt; }
	}

	public final RepeatstmtContext repeatstmt() throws RecognitionException {
		RepeatstmtContext _localctx = new RepeatstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repeatstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(REPEAT);
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				stmt();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << READ) | (1L << REPEAT) | (1L << WRITE) | (1L << ID))) != 0) );
			setState(93);
			match(UNTIL);
			setState(94);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WritestmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(scannerParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(scannerParser.SEMI, 0); }
		public WritestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writestmt; }
	}

	public final WritestmtContext writestmt() throws RecognitionException {
		WritestmtContext _localctx = new WritestmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_writestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(WRITE);
			setState(97);
			expr(0);
			setState(98);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(scannerParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(scannerParser.RPAR, 0); }
		public TerminalNode TRUE() { return getToken(scannerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(scannerParser.FALSE, 0); }
		public TerminalNode INT_VAL() { return getToken(scannerParser.INT_VAL, 0); }
		public TerminalNode REAL_VAL() { return getToken(scannerParser.REAL_VAL, 0); }
		public TerminalNode STR_VAL() { return getToken(scannerParser.STR_VAL, 0); }
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(101);
				match(LPAR);
				setState(102);
				expr(0);
				setState(103);
				match(RPAR);
				}
				break;
			case TRUE:
				{
				setState(105);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(106);
				match(FALSE);
				}
				break;
			case INT_VAL:
				{
				setState(107);
				match(INT_VAL);
				}
				break;
			case REAL_VAL:
				{
				setState(108);
				match(REAL_VAL);
				}
				break;
			case STR_VAL:
				{
				setState(109);
				match(STR_VAL);
				}
				break;
			case ID:
				{
				setState(110);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(113);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(114);
					op();
					setState(115);
					expr(9);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(scannerParser.LT, 0); }
		public TerminalNode EQ() { return getToken(scannerParser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(scannerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(scannerParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(scannerParser.TIMES, 0); }
		public TerminalNode OVER() { return getToken(scannerParser.OVER, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << OVER))) != 0)) ) {
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
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\177\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3%\n\3\f"+
		"\3\16\3(\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\6\6\62\n\6\r\6\16\6\63\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\6\tH\n\t\r\t\16\tI\3\t\3\t\6\tN\n\t\r\t\16\tO\5\tR\n\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\6\13\\\n\13\r\13\16\13]\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rr\n\r\3\r\3\r"+
		"\3\r\3\r\7\rx\n\r\f\r\16\r{\13\r\3\16\3\16\3\16\2\3\30\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\4\6\2\4\4\t\t\f\f\16\16\3\2\25\32\2\u0082\2\34"+
		"\3\2\2\2\4\"\3\2\2\2\6)\3\2\2\2\b-\3\2\2\2\n/\3\2\2\2\f<\3\2\2\2\16>\3"+
		"\2\2\2\20C\3\2\2\2\22U\3\2\2\2\24Y\3\2\2\2\26b\3\2\2\2\30q\3\2\2\2\32"+
		"|\3\2\2\2\34\35\7\n\2\2\35\36\7\36\2\2\36\37\7\35\2\2\37 \5\4\3\2 !\5"+
		"\n\6\2!\3\3\2\2\2\"&\7\22\2\2#%\5\6\4\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2"+
		"&\'\3\2\2\2\'\5\3\2\2\2(&\3\2\2\2)*\5\b\5\2*+\7\36\2\2+,\7\35\2\2,\7\3"+
		"\2\2\2-.\t\2\2\2.\t\3\2\2\2/\61\7\3\2\2\60\62\5\f\7\2\61\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\6\2\2\66"+
		"\13\3\2\2\2\67=\5\16\b\28=\5\20\t\29=\5\22\n\2:=\5\24\13\2;=\5\26\f\2"+
		"<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\r\3\2\2\2>?\7\36"+
		"\2\2?@\7\24\2\2@A\5\30\r\2AB\7\35\2\2B\17\3\2\2\2CD\7\b\2\2DE\5\30\r\2"+
		"EG\7\17\2\2FH\5\f\7\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JQ\3\2\2"+
		"\2KM\7\5\2\2LN\5\f\7\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2"+
		"\2QK\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\6\2\2T\21\3\2\2\2UV\7\13\2\2VW\7"+
		"\36\2\2WX\7\35\2\2X\23\3\2\2\2Y[\7\r\2\2Z\\\5\f\7\2[Z\3\2\2\2\\]\3\2\2"+
		"\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\21\2\2`a\5\30\r\2a\25\3\2\2\2bc\7"+
		"\23\2\2cd\5\30\r\2de\7\35\2\2e\27\3\2\2\2fg\b\r\1\2gh\7\33\2\2hi\5\30"+
		"\r\2ij\7\34\2\2jr\3\2\2\2kr\7\20\2\2lr\7\7\2\2mr\7 \2\2nr\7\37\2\2or\7"+
		"!\2\2pr\7\36\2\2qf\3\2\2\2qk\3\2\2\2ql\3\2\2\2qm\3\2\2\2qn\3\2\2\2qo\3"+
		"\2\2\2qp\3\2\2\2ry\3\2\2\2st\f\n\2\2tu\5\32\16\2uv\5\30\r\13vx\3\2\2\2"+
		"ws\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\31\3\2\2\2{y\3\2\2\2|}\t\3\2"+
		"\2}\33\3\2\2\2\13&\63<IOQ]qy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}