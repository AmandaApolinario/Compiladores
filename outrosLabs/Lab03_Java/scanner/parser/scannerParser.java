// Generated from java-escape by ANTLR 4.11.1

    package parser;

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitVarssect(this);
			else return visitor.visitChildren(this);
		}
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
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 5252L) != 0) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypespecContext extends ParserRuleContext {
		public TypespecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespec; }
	 
		public TypespecContext() { }
		public void copyFrom(TypespecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeStrContext extends TypespecContext {
		public TerminalNode STRING() { return getToken(scannerParser.STRING, 0); }
		public TypeStrContext(TypespecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitTypeStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIntContext extends TypespecContext {
		public TerminalNode INT() { return getToken(scannerParser.INT, 0); }
		public TypeIntContext(TypespecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeRealContext extends TypespecContext {
		public TerminalNode REAL() { return getToken(scannerParser.REAL, 0); }
		public TypeRealContext(TypespecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitTypeReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoolContext extends TypespecContext {
		public TerminalNode BOOL() { return getToken(scannerParser.BOOL, 0); }
		public TypeBoolContext(TypespecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypespecContext typespec() throws RecognitionException {
		TypespecContext _localctx = new TypespecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typespec);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(BOOL);
				}
				break;
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new TypeRealContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(REAL);
				}
				break;
			case STRING:
				_localctx = new TypeStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(STRING);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitStmtsect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsectContext stmtsect() throws RecognitionException {
		StmtsectContext _localctx = new StmtsectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmtsect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(BEGIN);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				stmt();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 268569152L) != 0 );
			setState(55);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				assignstmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				ifstmt();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				readstmt();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				repeatstmt();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitAssignstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(65);
			match(ASSIGN);
			setState(66);
			expr(0);
			setState(67);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IF);
			setState(70);
			expr(0);
			setState(71);
			match(THEN);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				stmt();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 268569152L) != 0 );
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(77);
				match(ELSE);
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					stmt();
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 268569152L) != 0 );
				}
			}

			setState(85);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReadstmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(scannerParser.READ, 0); }
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(scannerParser.SEMI, 0); }
		public ReadstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitReadstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadstmtContext readstmt() throws RecognitionException {
		ReadstmtContext _localctx = new ReadstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_readstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(READ);
			setState(88);
			match(ID);
			setState(89);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitRepeatstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatstmtContext repeatstmt() throws RecognitionException {
		RepeatstmtContext _localctx = new RepeatstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repeatstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(REPEAT);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				stmt();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 268569152L) != 0 );
			setState(97);
			match(UNTIL);
			setState(98);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitWritestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritestmtContext writestmt() throws RecognitionException {
		WritestmtContext _localctx = new WritestmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_writestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(WRITE);
			setState(101);
			expr(0);
			setState(102);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolTrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(scannerParser.TRUE, 0); }
		public BoolTrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitBoolTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpOperationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpOperationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitExpOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolFalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(scannerParser.FALSE, 0); }
		public BoolFalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitBoolFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpRealContext extends ExprContext {
		public TerminalNode REAL_VAL() { return getToken(scannerParser.REAL_VAL, 0); }
		public ExpRealContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitExpReal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpIntContext extends ExprContext {
		public TerminalNode INT_VAL() { return getToken(scannerParser.INT_VAL, 0); }
		public ExpIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitExpInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(scannerParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(scannerParser.RPAR, 0); }
		public ExpParContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitExpPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpStrContext extends ExprContext {
		public TerminalNode STR_VAL() { return getToken(scannerParser.STR_VAL, 0); }
		public ExpStrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitExpStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpIdContext extends ExprContext {
		public TerminalNode ID() { return getToken(scannerParser.ID, 0); }
		public ExpIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitExpId(this);
			else return visitor.visitChildren(this);
		}
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
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new ExpParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105);
				match(LPAR);
				setState(106);
				expr(0);
				setState(107);
				match(RPAR);
				}
				break;
			case TRUE:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(FALSE);
				}
				break;
			case INT_VAL:
				{
				_localctx = new ExpIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(INT_VAL);
				}
				break;
			case REAL_VAL:
				{
				_localctx = new ExpRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(REAL_VAL);
				}
				break;
			case STR_VAL:
				{
				_localctx = new ExpStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(STR_VAL);
				}
				break;
			case ID:
				{
				_localctx = new ExpIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpOperationContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(117);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(118);
					op();
					setState(119);
					expr(9);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof scannerVisitor ) return ((scannerVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0) ) {
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
		"\u0004\u0001\"\u0081\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001#\b\u0001\n\u0001\f\u0001"+
		"&\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00030\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0004\u00044\b\u0004\u000b\u0004\f\u00045\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005?\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007J\b"+
		"\u0007\u000b\u0007\f\u0007K\u0001\u0007\u0001\u0007\u0004\u0007P\b\u0007"+
		"\u000b\u0007\f\u0007Q\u0003\u0007T\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t^\b\t\u000b\t\f\t_\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bt\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bz\b\u000b\n\u000b\f\u000b"+
		"}\t\u000b\u0001\f\u0001\f\u0001\f\u0000\u0001\u0016\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000"+
		"\u0013\u0018\u0087\u0000\u001a\u0001\u0000\u0000\u0000\u0002 \u0001\u0000"+
		"\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000"+
		"\u0000\b1\u0001\u0000\u0000\u0000\n>\u0001\u0000\u0000\u0000\f@\u0001"+
		"\u0000\u0000\u0000\u000eE\u0001\u0000\u0000\u0000\u0010W\u0001\u0000\u0000"+
		"\u0000\u0012[\u0001\u0000\u0000\u0000\u0014d\u0001\u0000\u0000\u0000\u0016"+
		"s\u0001\u0000\u0000\u0000\u0018~\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\b\u0000\u0000\u001b\u001c\u0005\u001c\u0000\u0000\u001c\u001d\u0005\u001b"+
		"\u0000\u0000\u001d\u001e\u0003\u0002\u0001\u0000\u001e\u001f\u0003\b\u0004"+
		"\u0000\u001f\u0001\u0001\u0000\u0000\u0000 $\u0005\u0010\u0000\u0000!"+
		"#\u0003\u0004\u0002\u0000\"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000"+
		"\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\u0003\u0001"+
		"\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0003\u0006\u0003\u0000"+
		"()\u0005\u001c\u0000\u0000)*\u0005\u001b\u0000\u0000*\u0005\u0001\u0000"+
		"\u0000\u0000+0\u0005\u0002\u0000\u0000,0\u0005\u0007\u0000\u0000-0\u0005"+
		"\n\u0000\u0000.0\u0005\f\u0000\u0000/+\u0001\u0000\u0000\u0000/,\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000\u0000"+
		"0\u0007\u0001\u0000\u0000\u000013\u0005\u0001\u0000\u000024\u0003\n\u0005"+
		"\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005"+
		"\u0004\u0000\u00008\t\u0001\u0000\u0000\u00009?\u0003\f\u0006\u0000:?"+
		"\u0003\u000e\u0007\u0000;?\u0003\u0010\b\u0000<?\u0003\u0012\t\u0000="+
		"?\u0003\u0014\n\u0000>9\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000"+
		">;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000"+
		"\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0005\u001c\u0000\u0000AB\u0005"+
		"\u0012\u0000\u0000BC\u0003\u0016\u000b\u0000CD\u0005\u001b\u0000\u0000"+
		"D\r\u0001\u0000\u0000\u0000EF\u0005\u0006\u0000\u0000FG\u0003\u0016\u000b"+
		"\u0000GI\u0005\r\u0000\u0000HJ\u0003\n\u0005\u0000IH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LS\u0001\u0000\u0000\u0000MO\u0005\u0003\u0000\u0000NP\u0003"+
		"\n\u0005\u0000ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000"+
		"SM\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UV\u0005\u0004\u0000\u0000V\u000f\u0001\u0000\u0000\u0000WX\u0005"+
		"\t\u0000\u0000XY\u0005\u001c\u0000\u0000YZ\u0005\u001b\u0000\u0000Z\u0011"+
		"\u0001\u0000\u0000\u0000[]\u0005\u000b\u0000\u0000\\^\u0003\n\u0005\u0000"+
		"]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u000f"+
		"\u0000\u0000bc\u0003\u0016\u000b\u0000c\u0013\u0001\u0000\u0000\u0000"+
		"de\u0005\u0011\u0000\u0000ef\u0003\u0016\u000b\u0000fg\u0005\u001b\u0000"+
		"\u0000g\u0015\u0001\u0000\u0000\u0000hi\u0006\u000b\uffff\uffff\u0000"+
		"ij\u0005\u0019\u0000\u0000jk\u0003\u0016\u000b\u0000kl\u0005\u001a\u0000"+
		"\u0000lt\u0001\u0000\u0000\u0000mt\u0005\u000e\u0000\u0000nt\u0005\u0005"+
		"\u0000\u0000ot\u0005\u001e\u0000\u0000pt\u0005\u001d\u0000\u0000qt\u0005"+
		"\u001f\u0000\u0000rt\u0005\u001c\u0000\u0000sh\u0001\u0000\u0000\u0000"+
		"sm\u0001\u0000\u0000\u0000sn\u0001\u0000\u0000\u0000so\u0001\u0000\u0000"+
		"\u0000sp\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000"+
		"\u0000\u0000t{\u0001\u0000\u0000\u0000uv\n\b\u0000\u0000vw\u0003\u0018"+
		"\f\u0000wx\u0003\u0016\u000b\txz\u0001\u0000\u0000\u0000yu\u0001\u0000"+
		"\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|\u0017\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000~\u007f\u0007\u0000\u0000\u0000\u007f\u0019\u0001\u0000\u0000\u0000"+
		"\n$/5>KQS_s{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}