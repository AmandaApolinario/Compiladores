// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class scanner extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BEGIN", "BOOL", "ELSE", "END", "FALSE", "IF", "INT", "PROGRAM", "READ", 
			"REAL", "REPEAT", "STRING", "THEN", "TRUE", "UNTIL", "VAR", "WRITE", 
			"ASSIGN", "EQ", "LT", "PLUS", "MINUS", "TIMES", "OVER", "LPAR", "RPAR", 
			"SEMI", "ID", "REAL_VAL", "INT_VAL", "STR_VAL", "WHITESPACE", "COMMENT", 
			"UNKNOWN"
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


	public scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "scanner.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\"\u00eb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u00b8\b\u001b\n\u001b\f\u001b"+
		"\u00bb\t\u001b\u0001\u001c\u0005\u001c\u00be\b\u001c\n\u001c\f\u001c\u00c1"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u00c5\b\u001c\n\u001c\f\u001c"+
		"\u00c8\t\u001c\u0001\u001d\u0004\u001d\u00cb\b\u001d\u000b\u001d\f\u001d"+
		"\u00cc\u0001\u001e\u0001\u001e\u0005\u001e\u00d1\b\u001e\n\u001e\f\u001e"+
		"\u00d4\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0004\u001f\u00d9\b"+
		"\u001f\u000b\u001f\f\u001f\u00da\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0005 \u00e1\b \n \f \u00e4\t \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0000\u0000\"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"\u0001\u0000\u0007\u0002\u0000AZaz\u0003\u000009AZaz\u0001\u0000"+
		"09\u0001\u0000..\u0001\u0000\"\"\u0003\u0000\t\n\r\r  \u0002\u0000{{}"+
		"}\u00f1\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0001E\u0001\u0000"+
		"\u0000\u0000\u0003K\u0001\u0000\u0000\u0000\u0005P\u0001\u0000\u0000\u0000"+
		"\u0007U\u0001\u0000\u0000\u0000\tY\u0001\u0000\u0000\u0000\u000b_\u0001"+
		"\u0000\u0000\u0000\rb\u0001\u0000\u0000\u0000\u000ff\u0001\u0000\u0000"+
		"\u0000\u0011n\u0001\u0000\u0000\u0000\u0013s\u0001\u0000\u0000\u0000\u0015"+
		"x\u0001\u0000\u0000\u0000\u0017\u007f\u0001\u0000\u0000\u0000\u0019\u0086"+
		"\u0001\u0000\u0000\u0000\u001b\u008b\u0001\u0000\u0000\u0000\u001d\u0090"+
		"\u0001\u0000\u0000\u0000\u001f\u0096\u0001\u0000\u0000\u0000!\u009a\u0001"+
		"\u0000\u0000\u0000#\u00a0\u0001\u0000\u0000\u0000%\u00a3\u0001\u0000\u0000"+
		"\u0000\'\u00a5\u0001\u0000\u0000\u0000)\u00a7\u0001\u0000\u0000\u0000"+
		"+\u00a9\u0001\u0000\u0000\u0000-\u00ab\u0001\u0000\u0000\u0000/\u00ad"+
		"\u0001\u0000\u0000\u00001\u00af\u0001\u0000\u0000\u00003\u00b1\u0001\u0000"+
		"\u0000\u00005\u00b3\u0001\u0000\u0000\u00007\u00b5\u0001\u0000\u0000\u0000"+
		"9\u00bf\u0001\u0000\u0000\u0000;\u00ca\u0001\u0000\u0000\u0000=\u00ce"+
		"\u0001\u0000\u0000\u0000?\u00d8\u0001\u0000\u0000\u0000A\u00de\u0001\u0000"+
		"\u0000\u0000C\u00e9\u0001\u0000\u0000\u0000EF\u0005b\u0000\u0000FG\u0005"+
		"e\u0000\u0000GH\u0005g\u0000\u0000HI\u0005i\u0000\u0000IJ\u0005n\u0000"+
		"\u0000J\u0002\u0001\u0000\u0000\u0000KL\u0005b\u0000\u0000LM\u0005o\u0000"+
		"\u0000MN\u0005o\u0000\u0000NO\u0005l\u0000\u0000O\u0004\u0001\u0000\u0000"+
		"\u0000PQ\u0005e\u0000\u0000QR\u0005l\u0000\u0000RS\u0005s\u0000\u0000"+
		"ST\u0005e\u0000\u0000T\u0006\u0001\u0000\u0000\u0000UV\u0005e\u0000\u0000"+
		"VW\u0005n\u0000\u0000WX\u0005d\u0000\u0000X\b\u0001\u0000\u0000\u0000"+
		"YZ\u0005f\u0000\u0000Z[\u0005a\u0000\u0000[\\\u0005l\u0000\u0000\\]\u0005"+
		"s\u0000\u0000]^\u0005e\u0000\u0000^\n\u0001\u0000\u0000\u0000_`\u0005"+
		"i\u0000\u0000`a\u0005f\u0000\u0000a\f\u0001\u0000\u0000\u0000bc\u0005"+
		"i\u0000\u0000cd\u0005n\u0000\u0000de\u0005t\u0000\u0000e\u000e\u0001\u0000"+
		"\u0000\u0000fg\u0005p\u0000\u0000gh\u0005r\u0000\u0000hi\u0005o\u0000"+
		"\u0000ij\u0005g\u0000\u0000jk\u0005r\u0000\u0000kl\u0005a\u0000\u0000"+
		"lm\u0005m\u0000\u0000m\u0010\u0001\u0000\u0000\u0000no\u0005r\u0000\u0000"+
		"op\u0005e\u0000\u0000pq\u0005a\u0000\u0000qr\u0005d\u0000\u0000r\u0012"+
		"\u0001\u0000\u0000\u0000st\u0005r\u0000\u0000tu\u0005e\u0000\u0000uv\u0005"+
		"a\u0000\u0000vw\u0005l\u0000\u0000w\u0014\u0001\u0000\u0000\u0000xy\u0005"+
		"r\u0000\u0000yz\u0005e\u0000\u0000z{\u0005p\u0000\u0000{|\u0005e\u0000"+
		"\u0000|}\u0005a\u0000\u0000}~\u0005t\u0000\u0000~\u0016\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005s\u0000\u0000\u0080\u0081\u0005t\u0000\u0000\u0081"+
		"\u0082\u0005r\u0000\u0000\u0082\u0083\u0005i\u0000\u0000\u0083\u0084\u0005"+
		"n\u0000\u0000\u0084\u0085\u0005g\u0000\u0000\u0085\u0018\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005t\u0000\u0000\u0087\u0088\u0005h\u0000\u0000\u0088"+
		"\u0089\u0005e\u0000\u0000\u0089\u008a\u0005n\u0000\u0000\u008a\u001a\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005t\u0000\u0000\u008c\u008d\u0005r\u0000"+
		"\u0000\u008d\u008e\u0005u\u0000\u0000\u008e\u008f\u0005e\u0000\u0000\u008f"+
		"\u001c\u0001\u0000\u0000\u0000\u0090\u0091\u0005u\u0000\u0000\u0091\u0092"+
		"\u0005n\u0000\u0000\u0092\u0093\u0005t\u0000\u0000\u0093\u0094\u0005i"+
		"\u0000\u0000\u0094\u0095\u0005l\u0000\u0000\u0095\u001e\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005v\u0000\u0000\u0097\u0098\u0005a\u0000\u0000\u0098"+
		"\u0099\u0005r\u0000\u0000\u0099 \u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"w\u0000\u0000\u009b\u009c\u0005r\u0000\u0000\u009c\u009d\u0005i\u0000"+
		"\u0000\u009d\u009e\u0005t\u0000\u0000\u009e\u009f\u0005e\u0000\u0000\u009f"+
		"\"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005:\u0000\u0000\u00a1\u00a2"+
		"\u0005=\u0000\u0000\u00a2$\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005="+
		"\u0000\u0000\u00a4&\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005<\u0000\u0000"+
		"\u00a6(\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005+\u0000\u0000\u00a8*"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005-\u0000\u0000\u00aa,\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005*\u0000\u0000\u00ac.\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005/\u0000\u0000\u00ae0\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005(\u0000\u0000\u00b02\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005)"+
		"\u0000\u0000\u00b24\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005;\u0000\u0000"+
		"\u00b46\u0001\u0000\u0000\u0000\u00b5\u00b9\u0007\u0000\u0000\u0000\u00b6"+
		"\u00b8\u0007\u0001\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba8\u0001\u0000\u0000\u0000\u00bb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bc\u00be\u0007\u0002\u0000\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c6"+
		"\u0007\u0003\u0000\u0000\u00c3\u00c5\u0007\u0002\u0000\u0000\u00c4\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7:\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cb\u0007"+
		"\u0002\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd<\u0001\u0000\u0000\u0000\u00ce\u00d2\u0005\""+
		"\u0000\u0000\u00cf\u00d1\b\u0004\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\"\u0000\u0000"+
		"\u00d6>\u0001\u0000\u0000\u0000\u00d7\u00d9\u0007\u0005\u0000\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0006\u001f\u0000\u0000\u00dd"+
		"@\u0001\u0000\u0000\u0000\u00de\u00e2\u0005{\u0000\u0000\u00df\u00e1\b"+
		"\u0006\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005}\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0006 \u0000\u0000\u00e8B\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\t\u0000\u0000\u0000\u00eaD\u0001\u0000\u0000\u0000\b\u0000"+
		"\u00b9\u00bf\u00c6\u00cc\u00d2\u00da\u00e2\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}