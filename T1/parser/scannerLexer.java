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
public class scannerLexer extends Lexer {
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
		COMMENT=63, BLOCK_COMMENT=64, WHITESPACE=65, UNKNOWN=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BREAK", "CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", "DEFER", "ELSE", 
			"FALLTHROUGH", "FOR", "FUNC", "GO", "GOTO", "IF", "IMPORT", "INTERFACE", 
			"MAP", "PACKAGE", "RANGE", "RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", 
			"VAR", "PLUS", "MINUS", "TIMES", "OVER", "MOD", "PLUSEQ", "MINUSEQ", 
			"TIMESEQ", "OVEREQ", "MODEQ", "AND", "OR", "PLUSONE", "MINUSONE", "ISEQUAL", 
			"LESSTHAN", "MORETHAN", "ASSIGN", "NOT", "NOTEQUAL", "LESSEQTHAN", "MOREEQTHAN", 
			"DECLARE_ASSIGN", "LPAR", "RPAR", "LBRACK", "RBRACK", "LCURLYBRACES", 
			"RCURLYBRACES", "COMMA", "DOT", "SEMI", "COLON", "ID", "REAL_VAL", "INT_VAL", 
			"STR_VAL", "COMMENT", "BLOCK_COMMENT", "WHITESPACE", "UNKNOWN"
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
			"STR_VAL", "COMMENT", "BLOCK_COMMENT", "WHITESPACE", "UNKNOWN"
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


	public scannerLexer(CharStream input) {
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
		"\u0004\u0000B\u01c3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00e0\b\u000e\n\u000e\f\u000e\u00e3\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00fe\b\u0011\n\u0011\f\u0011\u0101\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u0001"+
		"4\u00014\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u0001"+
		"9\u00019\u0001:\u0001:\u0005:\u0182\b:\n:\f:\u0185\t:\u0001;\u0005;\u0188"+
		"\b;\n;\f;\u018b\t;\u0001;\u0001;\u0005;\u018f\b;\n;\f;\u0192\t;\u0001"+
		"<\u0004<\u0195\b<\u000b<\f<\u0196\u0001=\u0001=\u0005=\u019b\b=\n=\f="+
		"\u019e\t=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0005>\u01a6\b>\n"+
		">\f>\u01a9\t>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0005?\u01b1\b"+
		"?\n?\f?\u01b4\t?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0004@\u01bc"+
		"\b@\u000b@\f@\u01bd\u0001@\u0001@\u0001A\u0001A\u0001\u01b2\u0000B\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K"+
		"&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u007f@\u0081A\u0083"+
		"B\u0001\u0000\u0007\u0002\u0000\n\n\r\r\u0002\u0000AZaz\u0004\u000009"+
		"AZ__az\u0001\u000009\u0001\u0000..\u0001\u0000\"\"\u0003\u0000\t\n\r\r"+
		"  \u01cc\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
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
		"\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000"+
		"\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000"+
		"\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O"+
		"\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000"+
		"\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000"+
		"\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]"+
		"\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000"+
		"\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000"+
		"\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k"+
		"\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000"+
		"\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000"+
		"\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000y"+
		"\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001\u0000"+
		"\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001\u0000"+
		"\u0000\u0000\u0000\u0083\u0001\u0000\u0000\u0000\u0001\u0085\u0001\u0000"+
		"\u0000\u0000\u0003\u008b\u0001\u0000\u0000\u0000\u0005\u0090\u0001\u0000"+
		"\u0000\u0000\u0007\u0095\u0001\u0000\u0000\u0000\t\u009b\u0001\u0000\u0000"+
		"\u0000\u000b\u00a4\u0001\u0000\u0000\u0000\r\u00ac\u0001\u0000\u0000\u0000"+
		"\u000f\u00b2\u0001\u0000\u0000\u0000\u0011\u00b7\u0001\u0000\u0000\u0000"+
		"\u0013\u00c3\u0001\u0000\u0000\u0000\u0015\u00c7\u0001\u0000\u0000\u0000"+
		"\u0017\u00cc\u0001\u0000\u0000\u0000\u0019\u00cf\u0001\u0000\u0000\u0000"+
		"\u001b\u00d4\u0001\u0000\u0000\u0000\u001d\u00d7\u0001\u0000\u0000\u0000"+
		"\u001f\u00e6\u0001\u0000\u0000\u0000!\u00f0\u0001\u0000\u0000\u0000#\u00f4"+
		"\u0001\u0000\u0000\u0000%\u0104\u0001\u0000\u0000\u0000\'\u010a\u0001"+
		"\u0000\u0000\u0000)\u0111\u0001\u0000\u0000\u0000+\u0118\u0001\u0000\u0000"+
		"\u0000-\u011f\u0001\u0000\u0000\u0000/\u0126\u0001\u0000\u0000\u00001"+
		"\u012b\u0001\u0000\u0000\u00003\u012f\u0001\u0000\u0000\u00005\u0131\u0001"+
		"\u0000\u0000\u00007\u0133\u0001\u0000\u0000\u00009\u0135\u0001\u0000\u0000"+
		"\u0000;\u0137\u0001\u0000\u0000\u0000=\u0139\u0001\u0000\u0000\u0000?"+
		"\u013c\u0001\u0000\u0000\u0000A\u013f\u0001\u0000\u0000\u0000C\u0142\u0001"+
		"\u0000\u0000\u0000E\u0145\u0001\u0000\u0000\u0000G\u0148\u0001\u0000\u0000"+
		"\u0000I\u014b\u0001\u0000\u0000\u0000K\u014e\u0001\u0000\u0000\u0000M"+
		"\u0151\u0001\u0000\u0000\u0000O\u0154\u0001\u0000\u0000\u0000Q\u0157\u0001"+
		"\u0000\u0000\u0000S\u0159\u0001\u0000\u0000\u0000U\u015b\u0001\u0000\u0000"+
		"\u0000W\u015d\u0001\u0000\u0000\u0000Y\u015f\u0001\u0000\u0000\u0000["+
		"\u0162\u0001\u0000\u0000\u0000]\u0165\u0001\u0000\u0000\u0000_\u0168\u0001"+
		"\u0000\u0000\u0000a\u016b\u0001\u0000\u0000\u0000c\u016d\u0001\u0000\u0000"+
		"\u0000e\u016f\u0001\u0000\u0000\u0000g\u0171\u0001\u0000\u0000\u0000i"+
		"\u0173\u0001\u0000\u0000\u0000k\u0175\u0001\u0000\u0000\u0000m\u0177\u0001"+
		"\u0000\u0000\u0000o\u0179\u0001\u0000\u0000\u0000q\u017b\u0001\u0000\u0000"+
		"\u0000s\u017d\u0001\u0000\u0000\u0000u\u017f\u0001\u0000\u0000\u0000w"+
		"\u0189\u0001\u0000\u0000\u0000y\u0194\u0001\u0000\u0000\u0000{\u0198\u0001"+
		"\u0000\u0000\u0000}\u01a1\u0001\u0000\u0000\u0000\u007f\u01ac\u0001\u0000"+
		"\u0000\u0000\u0081\u01bb\u0001\u0000\u0000\u0000\u0083\u01c1\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005b\u0000\u0000\u0086\u0087\u0005r\u0000\u0000"+
		"\u0087\u0088\u0005e\u0000\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a"+
		"\u0005k\u0000\u0000\u008a\u0002\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"c\u0000\u0000\u008c\u008d\u0005a\u0000\u0000\u008d\u008e\u0005s\u0000"+
		"\u0000\u008e\u008f\u0005e\u0000\u0000\u008f\u0004\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0005c\u0000\u0000\u0091\u0092\u0005h\u0000\u0000\u0092\u0093"+
		"\u0005a\u0000\u0000\u0093\u0094\u0005n\u0000\u0000\u0094\u0006\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005c\u0000\u0000\u0096\u0097\u0005o\u0000\u0000"+
		"\u0097\u0098\u0005n\u0000\u0000\u0098\u0099\u0005s\u0000\u0000\u0099\u009a"+
		"\u0005t\u0000\u0000\u009a\b\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"c\u0000\u0000\u009c\u009d\u0005o\u0000\u0000\u009d\u009e\u0005n\u0000"+
		"\u0000\u009e\u009f\u0005t\u0000\u0000\u009f\u00a0\u0005i\u0000\u0000\u00a0"+
		"\u00a1\u0005n\u0000\u0000\u00a1\u00a2\u0005u\u0000\u0000\u00a2\u00a3\u0005"+
		"e\u0000\u0000\u00a3\n\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005d\u0000"+
		"\u0000\u00a5\u00a6\u0005e\u0000\u0000\u00a6\u00a7\u0005f\u0000\u0000\u00a7"+
		"\u00a8\u0005a\u0000\u0000\u00a8\u00a9\u0005u\u0000\u0000\u00a9\u00aa\u0005"+
		"l\u0000\u0000\u00aa\u00ab\u0005t\u0000\u0000\u00ab\f\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005d\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000\u00ae"+
		"\u00af\u0005f\u0000\u0000\u00af\u00b0\u0005e\u0000\u0000\u00b0\u00b1\u0005"+
		"r\u0000\u0000\u00b1\u000e\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005e\u0000"+
		"\u0000\u00b3\u00b4\u0005l\u0000\u0000\u00b4\u00b5\u0005s\u0000\u0000\u00b5"+
		"\u00b6\u0005e\u0000\u0000\u00b6\u0010\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005f\u0000\u0000\u00b8\u00b9\u0005a\u0000\u0000\u00b9\u00ba\u0005l"+
		"\u0000\u0000\u00ba\u00bb\u0005l\u0000\u0000\u00bb\u00bc\u0005t\u0000\u0000"+
		"\u00bc\u00bd\u0005h\u0000\u0000\u00bd\u00be\u0005r\u0000\u0000\u00be\u00bf"+
		"\u0005o\u0000\u0000\u00bf\u00c0\u0005u\u0000\u0000\u00c0\u00c1\u0005g"+
		"\u0000\u0000\u00c1\u00c2\u0005h\u0000\u0000\u00c2\u0012\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005f\u0000\u0000\u00c4\u00c5\u0005o\u0000\u0000\u00c5"+
		"\u00c6\u0005r\u0000\u0000\u00c6\u0014\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005f\u0000\u0000\u00c8\u00c9\u0005u\u0000\u0000\u00c9\u00ca\u0005n"+
		"\u0000\u0000\u00ca\u00cb\u0005c\u0000\u0000\u00cb\u0016\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0005g\u0000\u0000\u00cd\u00ce\u0005o\u0000\u0000\u00ce"+
		"\u0018\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005g\u0000\u0000\u00d0\u00d1"+
		"\u0005o\u0000\u0000\u00d1\u00d2\u0005t\u0000\u0000\u00d2\u00d3\u0005o"+
		"\u0000\u0000\u00d3\u001a\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005i\u0000"+
		"\u0000\u00d5\u00d6\u0005f\u0000\u0000\u00d6\u001c\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0005i\u0000\u0000\u00d8\u00d9\u0005m\u0000\u0000\u00d9\u00da"+
		"\u0005p\u0000\u0000\u00da\u00db\u0005o\u0000\u0000\u00db\u00dc\u0005r"+
		"\u0000\u0000\u00dc\u00dd\u0005t\u0000\u0000\u00dd\u00e1\u0001\u0000\u0000"+
		"\u0000\u00de\u00e0\b\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0006\u000e\u0000\u0000"+
		"\u00e5\u001e\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005i\u0000\u0000\u00e7"+
		"\u00e8\u0005n\u0000\u0000\u00e8\u00e9\u0005t\u0000\u0000\u00e9\u00ea\u0005"+
		"e\u0000\u0000\u00ea\u00eb\u0005r\u0000\u0000\u00eb\u00ec\u0005f\u0000"+
		"\u0000\u00ec\u00ed\u0005a\u0000\u0000\u00ed\u00ee\u0005c\u0000\u0000\u00ee"+
		"\u00ef\u0005e\u0000\u0000\u00ef \u0001\u0000\u0000\u0000\u00f0\u00f1\u0005"+
		"m\u0000\u0000\u00f1\u00f2\u0005a\u0000\u0000\u00f2\u00f3\u0005p\u0000"+
		"\u0000\u00f3\"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005p\u0000\u0000"+
		"\u00f5\u00f6\u0005a\u0000\u0000\u00f6\u00f7\u0005c\u0000\u0000\u00f7\u00f8"+
		"\u0005k\u0000\u0000\u00f8\u00f9\u0005a\u0000\u0000\u00f9\u00fa\u0005g"+
		"\u0000\u0000\u00fa\u00fb\u0005e\u0000\u0000\u00fb\u00ff\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fe\b\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0006\u0011\u0000\u0000"+
		"\u0103$\u0001\u0000\u0000\u0000\u0104\u0105\u0005r\u0000\u0000\u0105\u0106"+
		"\u0005a\u0000\u0000\u0106\u0107\u0005n\u0000\u0000\u0107\u0108\u0005g"+
		"\u0000\u0000\u0108\u0109\u0005e\u0000\u0000\u0109&\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0005r\u0000\u0000\u010b\u010c\u0005e\u0000\u0000\u010c\u010d"+
		"\u0005t\u0000\u0000\u010d\u010e\u0005u\u0000\u0000\u010e\u010f\u0005r"+
		"\u0000\u0000\u010f\u0110\u0005n\u0000\u0000\u0110(\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005s\u0000\u0000\u0112\u0113\u0005e\u0000\u0000\u0113\u0114"+
		"\u0005l\u0000\u0000\u0114\u0115\u0005e\u0000\u0000\u0115\u0116\u0005c"+
		"\u0000\u0000\u0116\u0117\u0005t\u0000\u0000\u0117*\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0005s\u0000\u0000\u0119\u011a\u0005t\u0000\u0000\u011a\u011b"+
		"\u0005r\u0000\u0000\u011b\u011c\u0005u\u0000\u0000\u011c\u011d\u0005c"+
		"\u0000\u0000\u011d\u011e\u0005t\u0000\u0000\u011e,\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0005s\u0000\u0000\u0120\u0121\u0005w\u0000\u0000\u0121\u0122"+
		"\u0005i\u0000\u0000\u0122\u0123\u0005t\u0000\u0000\u0123\u0124\u0005c"+
		"\u0000\u0000\u0124\u0125\u0005h\u0000\u0000\u0125.\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0005t\u0000\u0000\u0127\u0128\u0005y\u0000\u0000\u0128\u0129"+
		"\u0005p\u0000\u0000\u0129\u012a\u0005e\u0000\u0000\u012a0\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0005v\u0000\u0000\u012c\u012d\u0005a\u0000\u0000"+
		"\u012d\u012e\u0005r\u0000\u0000\u012e2\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0005+\u0000\u0000\u01304\u0001\u0000\u0000\u0000\u0131\u0132\u0005-"+
		"\u0000\u0000\u01326\u0001\u0000\u0000\u0000\u0133\u0134\u0005*\u0000\u0000"+
		"\u01348\u0001\u0000\u0000\u0000\u0135\u0136\u0005/\u0000\u0000\u0136:"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0005%\u0000\u0000\u0138<\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0005+\u0000\u0000\u013a\u013b\u0005=\u0000\u0000"+
		"\u013b>\u0001\u0000\u0000\u0000\u013c\u013d\u0005-\u0000\u0000\u013d\u013e"+
		"\u0005=\u0000\u0000\u013e@\u0001\u0000\u0000\u0000\u013f\u0140\u0005*"+
		"\u0000\u0000\u0140\u0141\u0005=\u0000\u0000\u0141B\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0005/\u0000\u0000\u0143\u0144\u0005=\u0000\u0000\u0144D"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0005%\u0000\u0000\u0146\u0147\u0005"+
		"=\u0000\u0000\u0147F\u0001\u0000\u0000\u0000\u0148\u0149\u0005&\u0000"+
		"\u0000\u0149\u014a\u0005&\u0000\u0000\u014aH\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0005|\u0000\u0000\u014c\u014d\u0005|\u0000\u0000\u014dJ\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0005+\u0000\u0000\u014f\u0150\u0005+\u0000"+
		"\u0000\u0150L\u0001\u0000\u0000\u0000\u0151\u0152\u0005-\u0000\u0000\u0152"+
		"\u0153\u0005-\u0000\u0000\u0153N\u0001\u0000\u0000\u0000\u0154\u0155\u0005"+
		"=\u0000\u0000\u0155\u0156\u0005=\u0000\u0000\u0156P\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005<\u0000\u0000\u0158R\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0005>\u0000\u0000\u015aT\u0001\u0000\u0000\u0000\u015b\u015c\u0005"+
		"=\u0000\u0000\u015cV\u0001\u0000\u0000\u0000\u015d\u015e\u0005!\u0000"+
		"\u0000\u015eX\u0001\u0000\u0000\u0000\u015f\u0160\u0005!\u0000\u0000\u0160"+
		"\u0161\u0005=\u0000\u0000\u0161Z\u0001\u0000\u0000\u0000\u0162\u0163\u0005"+
		"<\u0000\u0000\u0163\u0164\u0005=\u0000\u0000\u0164\\\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0005>\u0000\u0000\u0166\u0167\u0005=\u0000\u0000\u0167"+
		"^\u0001\u0000\u0000\u0000\u0168\u0169\u0005:\u0000\u0000\u0169\u016a\u0005"+
		"=\u0000\u0000\u016a`\u0001\u0000\u0000\u0000\u016b\u016c\u0005(\u0000"+
		"\u0000\u016cb\u0001\u0000\u0000\u0000\u016d\u016e\u0005)\u0000\u0000\u016e"+
		"d\u0001\u0000\u0000\u0000\u016f\u0170\u0005[\u0000\u0000\u0170f\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0005]\u0000\u0000\u0172h\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0005{\u0000\u0000\u0174j\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0005}\u0000\u0000\u0176l\u0001\u0000\u0000\u0000\u0177\u0178\u0005"+
		",\u0000\u0000\u0178n\u0001\u0000\u0000\u0000\u0179\u017a\u0005.\u0000"+
		"\u0000\u017ap\u0001\u0000\u0000\u0000\u017b\u017c\u0005;\u0000\u0000\u017c"+
		"r\u0001\u0000\u0000\u0000\u017d\u017e\u0005:\u0000\u0000\u017et\u0001"+
		"\u0000\u0000\u0000\u017f\u0183\u0007\u0001\u0000\u0000\u0180\u0182\u0007"+
		"\u0002\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0185\u0001"+
		"\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001"+
		"\u0000\u0000\u0000\u0184v\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0186\u0188\u0007\u0003\u0000\u0000\u0187\u0186\u0001\u0000"+
		"\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0001\u0000"+
		"\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u0190\u0007\u0004"+
		"\u0000\u0000\u018d\u018f\u0007\u0003\u0000\u0000\u018e\u018d\u0001\u0000"+
		"\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191x\u0001\u0000\u0000"+
		"\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0195\u0007\u0003\u0000"+
		"\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197z\u0001\u0000\u0000\u0000\u0198\u019c\u0005\"\u0000\u0000"+
		"\u0199\u019b\b\u0005\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b"+
		"\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0001\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\"\u0000\u0000\u01a0|"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005/\u0000\u0000\u01a2\u01a3\u0005"+
		"/\u0000\u0000\u01a3\u01a7\u0001\u0000\u0000\u0000\u01a4\u01a6\b\u0000"+
		"\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0006>\u0000\u0000\u01ab~\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0005/\u0000\u0000\u01ad\u01ae\u0005*\u0000\u0000\u01ae\u01b2"+
		"\u0001\u0000\u0000\u0000\u01af\u01b1\t\u0000\u0000\u0000\u01b0\u01af\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005"+
		"*\u0000\u0000\u01b6\u01b7\u0005/\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0006?\u0000\u0000\u01b9\u0080\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bc\u0007\u0006\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0006@\u0000\u0000\u01c0\u0082\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\t\u0000\u0000\u0000\u01c2\u0084\u0001\u0000\u0000\u0000\u000b\u0000"+
		"\u00e1\u00ff\u0183\u0189\u0190\u0196\u019c\u01a7\u01b2\u01bd\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}