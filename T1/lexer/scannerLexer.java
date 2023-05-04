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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDList", "BREAK", "CASE", "CHAN", "CONST", "CONTINUE", "DEFAULT", "DEFER", 
			"ELSE", "FALLTHROUGH", "FOR", "FUNC", "GO", "GOTO", "IF", "IMPORT", "INTERFACE", 
			"MAP", "PACKAGE", "RANGE", "RETURN", "SELECT", "STRUCT", "SWITCH", "TYPE", 
			"VAR", "FLOAT32", "FLOAT64", "STRING", "TRUE", "FALSE", "PLUS", "MINUS", 
			"TIMES", "OVER", "MOD", "PLUSEQ", "MINUSEQ", "TIMESEQ", "OVEREQ", "MODEQ", 
			"AND", "OR", "PLUSONE", "MINUSONE", "ISEQUAL", "LESSTHAN", "MORETHAN", 
			"EQUAL", "NOT", "NOTEQUAL", "LESSEQTHAN", "MOREEQTHAN", "ASSIGN", "LPAR", 
			"RPAR", "LBRACK", "RBRACK", "LCURLYBRACES", "RCURLYBRACES", "COMMA", 
			"DOT", "SEMI", "COLON", "ID", "REAL_VAL", "INT_VAL", "STR_VAL", "COMMENT", 
			"BLOCK_COMMENT", "WHITESPACE", "UNKNOWN"
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
		"\u0004\u0000H\u01fa\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u0096\b\u0000\n\u0000\f\u0000\u0099\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00f5\b\u000f\n\u000f\f\u000f"+
		"\u00f8\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0113\b\u0012\n\u0012\f\u0012\u0116"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u0001"+
		"0\u00011\u00011\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u0001"+
		"8\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001"+
		"=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0005@\u01b9\b@\n@\f@\u01bc"+
		"\t@\u0001A\u0005A\u01bf\bA\nA\fA\u01c2\tA\u0001A\u0001A\u0005A\u01c6\b"+
		"A\nA\fA\u01c9\tA\u0001B\u0004B\u01cc\bB\u000bB\fB\u01cd\u0001C\u0001C"+
		"\u0005C\u01d2\bC\nC\fC\u01d5\tC\u0001C\u0001C\u0001D\u0001D\u0001D\u0001"+
		"D\u0005D\u01dd\bD\nD\fD\u01e0\tD\u0001D\u0001D\u0001E\u0001E\u0001E\u0001"+
		"E\u0005E\u01e8\bE\nE\fE\u01eb\tE\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"F\u0004F\u01f3\bF\u000bF\fF\u01f4\u0001F\u0001F\u0001G\u0001G\u0001\u01e9"+
		"\u0000H\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u007f@\u0081"+
		"A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0001\u0000\u0007\u0002"+
		"\u0000\n\n\r\r\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u000009\u0001"+
		"\u0000..\u0001\u0000\"\"\u0003\u0000\t\n\r\r  \u0204\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q"+
		"\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000"+
		"\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000"+
		"\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_"+
		"\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000"+
		"\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000"+
		"\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m"+
		"\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000"+
		"\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000"+
		"\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{"+
		"\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001"+
		"\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083\u0001"+
		"\u0000\u0000\u0000\u0000\u0085\u0001\u0000\u0000\u0000\u0000\u0087\u0001"+
		"\u0000\u0000\u0000\u0000\u0089\u0001\u0000\u0000\u0000\u0000\u008b\u0001"+
		"\u0000\u0000\u0000\u0000\u008d\u0001\u0000\u0000\u0000\u0000\u008f\u0001"+
		"\u0000\u0000\u0000\u0001\u0091\u0001\u0000\u0000\u0000\u0003\u009a\u0001"+
		"\u0000\u0000\u0000\u0005\u00a0\u0001\u0000\u0000\u0000\u0007\u00a5\u0001"+
		"\u0000\u0000\u0000\t\u00aa\u0001\u0000\u0000\u0000\u000b\u00b0\u0001\u0000"+
		"\u0000\u0000\r\u00b9\u0001\u0000\u0000\u0000\u000f\u00c1\u0001\u0000\u0000"+
		"\u0000\u0011\u00c7\u0001\u0000\u0000\u0000\u0013\u00cc\u0001\u0000\u0000"+
		"\u0000\u0015\u00d8\u0001\u0000\u0000\u0000\u0017\u00dc\u0001\u0000\u0000"+
		"\u0000\u0019\u00e1\u0001\u0000\u0000\u0000\u001b\u00e4\u0001\u0000\u0000"+
		"\u0000\u001d\u00e9\u0001\u0000\u0000\u0000\u001f\u00ec\u0001\u0000\u0000"+
		"\u0000!\u00fb\u0001\u0000\u0000\u0000#\u0105\u0001\u0000\u0000\u0000%"+
		"\u0109\u0001\u0000\u0000\u0000\'\u0119\u0001\u0000\u0000\u0000)\u011f"+
		"\u0001\u0000\u0000\u0000+\u0126\u0001\u0000\u0000\u0000-\u012d\u0001\u0000"+
		"\u0000\u0000/\u0134\u0001\u0000\u0000\u00001\u013b\u0001\u0000\u0000\u0000"+
		"3\u0140\u0001\u0000\u0000\u00005\u0144\u0001\u0000\u0000\u00007\u014c"+
		"\u0001\u0000\u0000\u00009\u0154\u0001\u0000\u0000\u0000;\u015b\u0001\u0000"+
		"\u0000\u0000=\u0160\u0001\u0000\u0000\u0000?\u0166\u0001\u0000\u0000\u0000"+
		"A\u0168\u0001\u0000\u0000\u0000C\u016a\u0001\u0000\u0000\u0000E\u016c"+
		"\u0001\u0000\u0000\u0000G\u016e\u0001\u0000\u0000\u0000I\u0170\u0001\u0000"+
		"\u0000\u0000K\u0173\u0001\u0000\u0000\u0000M\u0176\u0001\u0000\u0000\u0000"+
		"O\u0179\u0001\u0000\u0000\u0000Q\u017c\u0001\u0000\u0000\u0000S\u017f"+
		"\u0001\u0000\u0000\u0000U\u0182\u0001\u0000\u0000\u0000W\u0185\u0001\u0000"+
		"\u0000\u0000Y\u0188\u0001\u0000\u0000\u0000[\u018b\u0001\u0000\u0000\u0000"+
		"]\u018e\u0001\u0000\u0000\u0000_\u0190\u0001\u0000\u0000\u0000a\u0192"+
		"\u0001\u0000\u0000\u0000c\u0194\u0001\u0000\u0000\u0000e\u0196\u0001\u0000"+
		"\u0000\u0000g\u0199\u0001\u0000\u0000\u0000i\u019c\u0001\u0000\u0000\u0000"+
		"k\u019f\u0001\u0000\u0000\u0000m\u01a2\u0001\u0000\u0000\u0000o\u01a4"+
		"\u0001\u0000\u0000\u0000q\u01a6\u0001\u0000\u0000\u0000s\u01a8\u0001\u0000"+
		"\u0000\u0000u\u01aa\u0001\u0000\u0000\u0000w\u01ac\u0001\u0000\u0000\u0000"+
		"y\u01ae\u0001\u0000\u0000\u0000{\u01b0\u0001\u0000\u0000\u0000}\u01b2"+
		"\u0001\u0000\u0000\u0000\u007f\u01b4\u0001\u0000\u0000\u0000\u0081\u01b6"+
		"\u0001\u0000\u0000\u0000\u0083\u01c0\u0001\u0000\u0000\u0000\u0085\u01cb"+
		"\u0001\u0000\u0000\u0000\u0087\u01cf\u0001\u0000\u0000\u0000\u0089\u01d8"+
		"\u0001\u0000\u0000\u0000\u008b\u01e3\u0001\u0000\u0000\u0000\u008d\u01f2"+
		"\u0001\u0000\u0000\u0000\u008f\u01f8\u0001\u0000\u0000\u0000\u0091\u0097"+
		"\u0003\u0081@\u0000\u0092\u0093\u0003y<\u0000\u0093\u0094\u0003\u0081"+
		"@\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0092\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0002\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005b\u0000\u0000"+
		"\u009b\u009c\u0005r\u0000\u0000\u009c\u009d\u0005e\u0000\u0000\u009d\u009e"+
		"\u0005a\u0000\u0000\u009e\u009f\u0005k\u0000\u0000\u009f\u0004\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005c\u0000\u0000\u00a1\u00a2\u0005a\u0000\u0000"+
		"\u00a2\u00a3\u0005s\u0000\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4\u0006"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005c\u0000\u0000\u00a6\u00a7\u0005"+
		"h\u0000\u0000\u00a7\u00a8\u0005a\u0000\u0000\u00a8\u00a9\u0005n\u0000"+
		"\u0000\u00a9\b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005c\u0000\u0000"+
		"\u00ab\u00ac\u0005o\u0000\u0000\u00ac\u00ad\u0005n\u0000\u0000\u00ad\u00ae"+
		"\u0005s\u0000\u0000\u00ae\u00af\u0005t\u0000\u0000\u00af\n\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005c\u0000\u0000\u00b1\u00b2\u0005o\u0000\u0000"+
		"\u00b2\u00b3\u0005n\u0000\u0000\u00b3\u00b4\u0005t\u0000\u0000\u00b4\u00b5"+
		"\u0005i\u0000\u0000\u00b5\u00b6\u0005n\u0000\u0000\u00b6\u00b7\u0005u"+
		"\u0000\u0000\u00b7\u00b8\u0005e\u0000\u0000\u00b8\f\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005d\u0000\u0000\u00ba\u00bb\u0005e\u0000\u0000\u00bb"+
		"\u00bc\u0005f\u0000\u0000\u00bc\u00bd\u0005a\u0000\u0000\u00bd\u00be\u0005"+
		"u\u0000\u0000\u00be\u00bf\u0005l\u0000\u0000\u00bf\u00c0\u0005t\u0000"+
		"\u0000\u00c0\u000e\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005d\u0000\u0000"+
		"\u00c2\u00c3\u0005e\u0000\u0000\u00c3\u00c4\u0005f\u0000\u0000\u00c4\u00c5"+
		"\u0005e\u0000\u0000\u00c5\u00c6\u0005r\u0000\u0000\u00c6\u0010\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0005e\u0000\u0000\u00c8\u00c9\u0005l\u0000\u0000"+
		"\u00c9\u00ca\u0005s\u0000\u0000\u00ca\u00cb\u0005e\u0000\u0000\u00cb\u0012"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005f\u0000\u0000\u00cd\u00ce\u0005"+
		"a\u0000\u0000\u00ce\u00cf\u0005l\u0000\u0000\u00cf\u00d0\u0005l\u0000"+
		"\u0000\u00d0\u00d1\u0005t\u0000\u0000\u00d1\u00d2\u0005h\u0000\u0000\u00d2"+
		"\u00d3\u0005r\u0000\u0000\u00d3\u00d4\u0005o\u0000\u0000\u00d4\u00d5\u0005"+
		"u\u0000\u0000\u00d5\u00d6\u0005g\u0000\u0000\u00d6\u00d7\u0005h\u0000"+
		"\u0000\u00d7\u0014\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005f\u0000\u0000"+
		"\u00d9\u00da\u0005o\u0000\u0000\u00da\u00db\u0005r\u0000\u0000\u00db\u0016"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005f\u0000\u0000\u00dd\u00de\u0005"+
		"u\u0000\u0000\u00de\u00df\u0005n\u0000\u0000\u00df\u00e0\u0005c\u0000"+
		"\u0000\u00e0\u0018\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005g\u0000\u0000"+
		"\u00e2\u00e3\u0005o\u0000\u0000\u00e3\u001a\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005g\u0000\u0000\u00e5\u00e6\u0005o\u0000\u0000\u00e6\u00e7\u0005"+
		"t\u0000\u0000\u00e7\u00e8\u0005o\u0000\u0000\u00e8\u001c\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005i\u0000\u0000\u00ea\u00eb\u0005f\u0000\u0000\u00eb"+
		"\u001e\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005i\u0000\u0000\u00ed\u00ee"+
		"\u0005m\u0000\u0000\u00ee\u00ef\u0005p\u0000\u0000\u00ef\u00f0\u0005o"+
		"\u0000\u0000\u00f0\u00f1\u0005r\u0000\u0000\u00f1\u00f2\u0005t\u0000\u0000"+
		"\u00f2\u00f6\u0001\u0000\u0000\u0000\u00f3\u00f5\b\u0000\u0000\u0000\u00f4"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0006\u000f\u0000\u0000\u00fa \u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0005i\u0000\u0000\u00fc\u00fd\u0005n\u0000\u0000\u00fd\u00fe\u0005t"+
		"\u0000\u0000\u00fe\u00ff\u0005e\u0000\u0000\u00ff\u0100\u0005r\u0000\u0000"+
		"\u0100\u0101\u0005f\u0000\u0000\u0101\u0102\u0005a\u0000\u0000\u0102\u0103"+
		"\u0005c\u0000\u0000\u0103\u0104\u0005e\u0000\u0000\u0104\"\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005m\u0000\u0000\u0106\u0107\u0005a\u0000\u0000"+
		"\u0107\u0108\u0005p\u0000\u0000\u0108$\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0005p\u0000\u0000\u010a\u010b\u0005a\u0000\u0000\u010b\u010c\u0005c"+
		"\u0000\u0000\u010c\u010d\u0005k\u0000\u0000\u010d\u010e\u0005a\u0000\u0000"+
		"\u010e\u010f\u0005g\u0000\u0000\u010f\u0110\u0005e\u0000\u0000\u0110\u0114"+
		"\u0001\u0000\u0000\u0000\u0111\u0113\b\u0000\u0000\u0000\u0112\u0111\u0001"+
		"\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0006"+
		"\u0012\u0000\u0000\u0118&\u0001\u0000\u0000\u0000\u0119\u011a\u0005r\u0000"+
		"\u0000\u011a\u011b\u0005a\u0000\u0000\u011b\u011c\u0005n\u0000\u0000\u011c"+
		"\u011d\u0005g\u0000\u0000\u011d\u011e\u0005e\u0000\u0000\u011e(\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0005r\u0000\u0000\u0120\u0121\u0005e\u0000"+
		"\u0000\u0121\u0122\u0005t\u0000\u0000\u0122\u0123\u0005u\u0000\u0000\u0123"+
		"\u0124\u0005r\u0000\u0000\u0124\u0125\u0005n\u0000\u0000\u0125*\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005s\u0000\u0000\u0127\u0128\u0005e\u0000"+
		"\u0000\u0128\u0129\u0005l\u0000\u0000\u0129\u012a\u0005e\u0000\u0000\u012a"+
		"\u012b\u0005c\u0000\u0000\u012b\u012c\u0005t\u0000\u0000\u012c,\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0005s\u0000\u0000\u012e\u012f\u0005t\u0000"+
		"\u0000\u012f\u0130\u0005r\u0000\u0000\u0130\u0131\u0005u\u0000\u0000\u0131"+
		"\u0132\u0005c\u0000\u0000\u0132\u0133\u0005t\u0000\u0000\u0133.\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005s\u0000\u0000\u0135\u0136\u0005w\u0000"+
		"\u0000\u0136\u0137\u0005i\u0000\u0000\u0137\u0138\u0005t\u0000\u0000\u0138"+
		"\u0139\u0005c\u0000\u0000\u0139\u013a\u0005h\u0000\u0000\u013a0\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005t\u0000\u0000\u013c\u013d\u0005y\u0000"+
		"\u0000\u013d\u013e\u0005p\u0000\u0000\u013e\u013f\u0005e\u0000\u0000\u013f"+
		"2\u0001\u0000\u0000\u0000\u0140\u0141\u0005v\u0000\u0000\u0141\u0142\u0005"+
		"a\u0000\u0000\u0142\u0143\u0005r\u0000\u0000\u01434\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0005f\u0000\u0000\u0145\u0146\u0005l\u0000\u0000\u0146"+
		"\u0147\u0005o\u0000\u0000\u0147\u0148\u0005a\u0000\u0000\u0148\u0149\u0005"+
		"t\u0000\u0000\u0149\u014a\u00053\u0000\u0000\u014a\u014b\u00052\u0000"+
		"\u0000\u014b6\u0001\u0000\u0000\u0000\u014c\u014d\u0005f\u0000\u0000\u014d"+
		"\u014e\u0005l\u0000\u0000\u014e\u014f\u0005o\u0000\u0000\u014f\u0150\u0005"+
		"a\u0000\u0000\u0150\u0151\u0005t\u0000\u0000\u0151\u0152\u00056\u0000"+
		"\u0000\u0152\u0153\u00054\u0000\u0000\u01538\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005s\u0000\u0000\u0155\u0156\u0005t\u0000\u0000\u0156\u0157\u0005"+
		"r\u0000\u0000\u0157\u0158\u0005i\u0000\u0000\u0158\u0159\u0005n\u0000"+
		"\u0000\u0159\u015a\u0005g\u0000\u0000\u015a:\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0005t\u0000\u0000\u015c\u015d\u0005r\u0000\u0000\u015d\u015e\u0005"+
		"u\u0000\u0000\u015e\u015f\u0005e\u0000\u0000\u015f<\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0005f\u0000\u0000\u0161\u0162\u0005a\u0000\u0000\u0162"+
		"\u0163\u0005l\u0000\u0000\u0163\u0164\u0005s\u0000\u0000\u0164\u0165\u0005"+
		"e\u0000\u0000\u0165>\u0001\u0000\u0000\u0000\u0166\u0167\u0005+\u0000"+
		"\u0000\u0167@\u0001\u0000\u0000\u0000\u0168\u0169\u0005-\u0000\u0000\u0169"+
		"B\u0001\u0000\u0000\u0000\u016a\u016b\u0005*\u0000\u0000\u016bD\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0005/\u0000\u0000\u016dF\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0005%\u0000\u0000\u016fH\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0005+\u0000\u0000\u0171\u0172\u0005=\u0000\u0000\u0172J\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0005-\u0000\u0000\u0174\u0175\u0005=\u0000"+
		"\u0000\u0175L\u0001\u0000\u0000\u0000\u0176\u0177\u0005*\u0000\u0000\u0177"+
		"\u0178\u0005=\u0000\u0000\u0178N\u0001\u0000\u0000\u0000\u0179\u017a\u0005"+
		"/\u0000\u0000\u017a\u017b\u0005=\u0000\u0000\u017bP\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0005%\u0000\u0000\u017d\u017e\u0005=\u0000\u0000\u017e"+
		"R\u0001\u0000\u0000\u0000\u017f\u0180\u0005&\u0000\u0000\u0180\u0181\u0005"+
		"&\u0000\u0000\u0181T\u0001\u0000\u0000\u0000\u0182\u0183\u0005|\u0000"+
		"\u0000\u0183\u0184\u0005|\u0000\u0000\u0184V\u0001\u0000\u0000\u0000\u0185"+
		"\u0186\u0005+\u0000\u0000\u0186\u0187\u0005+\u0000\u0000\u0187X\u0001"+
		"\u0000\u0000\u0000\u0188\u0189\u0005-\u0000\u0000\u0189\u018a\u0005-\u0000"+
		"\u0000\u018aZ\u0001\u0000\u0000\u0000\u018b\u018c\u0005=\u0000\u0000\u018c"+
		"\u018d\u0005=\u0000\u0000\u018d\\\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0005<\u0000\u0000\u018f^\u0001\u0000\u0000\u0000\u0190\u0191\u0005>"+
		"\u0000\u0000\u0191`\u0001\u0000\u0000\u0000\u0192\u0193\u0005=\u0000\u0000"+
		"\u0193b\u0001\u0000\u0000\u0000\u0194\u0195\u0005!\u0000\u0000\u0195d"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0005!\u0000\u0000\u0197\u0198\u0005"+
		"=\u0000\u0000\u0198f\u0001\u0000\u0000\u0000\u0199\u019a\u0005<\u0000"+
		"\u0000\u019a\u019b\u0005=\u0000\u0000\u019bh\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0005>\u0000\u0000\u019d\u019e\u0005=\u0000\u0000\u019ej\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0005:\u0000\u0000\u01a0\u01a1\u0005=\u0000"+
		"\u0000\u01a1l\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005(\u0000\u0000\u01a3"+
		"n\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005)\u0000\u0000\u01a5p\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0005[\u0000\u0000\u01a7r\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0005]\u0000\u0000\u01a9t\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0005{\u0000\u0000\u01abv\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005"+
		"}\u0000\u0000\u01adx\u0001\u0000\u0000\u0000\u01ae\u01af\u0005,\u0000"+
		"\u0000\u01afz\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005.\u0000\u0000\u01b1"+
		"|\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005;\u0000\u0000\u01b3~\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0005:\u0000\u0000\u01b5\u0080\u0001\u0000"+
		"\u0000\u0000\u01b6\u01ba\u0007\u0001\u0000\u0000\u01b7\u01b9\u0007\u0002"+
		"\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u0082\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000"+
		"\u0000\u0000\u01bd\u01bf\u0007\u0003\u0000\u0000\u01be\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c7\u0007\u0004"+
		"\u0000\u0000\u01c4\u01c6\u0007\u0003\u0000\u0000\u01c5\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u0084\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cc\u0007\u0003"+
		"\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000"+
		"\u0000\u0000\u01ce\u0086\u0001\u0000\u0000\u0000\u01cf\u01d3\u0005\"\u0000"+
		"\u0000\u01d0\u01d2\b\u0005\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005\"\u0000\u0000\u01d7"+
		"\u0088\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005/\u0000\u0000\u01d9\u01da"+
		"\u0005/\u0000\u0000\u01da\u01de\u0001\u0000\u0000\u0000\u01db\u01dd\b"+
		"\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01e0\u0001"+
		"\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01de\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0006D\u0000\u0000\u01e2\u008a\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0005/\u0000\u0000\u01e4\u01e5\u0005*\u0000\u0000"+
		"\u01e5\u01e9\u0001\u0000\u0000\u0000\u01e6\u01e8\t\u0000\u0000\u0000\u01e7"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ea\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea"+
		"\u01ec\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0005*\u0000\u0000\u01ed\u01ee\u0005/\u0000\u0000\u01ee\u01ef\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0006E\u0000\u0000\u01f0\u008c\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f3\u0007\u0006\u0000\u0000\u01f2\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0006F\u0000\u0000\u01f7\u008e\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f9\t\u0000\u0000\u0000\u01f9\u0090\u0001\u0000\u0000\u0000"+
		"\f\u0000\u0097\u00f6\u0114\u01ba\u01c0\u01c7\u01cd\u01d3\u01de\u01e9\u01f4"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}