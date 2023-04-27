// Generated from /home/lmscaramussa/Documents/Compiladores/T1/scanner.g by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scannerLexer extends Lexer {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u01fc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\7\2\u0098\n\2\f\2\16\2\u009b\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f7\n\21\f\21\16\21\u00fa\13\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0115\n\24"+
		"\f\24\16\24\u0118\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+"+
		"\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B"+
		"\7B\u01bb\nB\fB\16B\u01be\13B\3C\7C\u01c1\nC\fC\16C\u01c4\13C\3C\3C\7"+
		"C\u01c8\nC\fC\16C\u01cb\13C\3D\6D\u01ce\nD\rD\16D\u01cf\3E\3E\7E\u01d4"+
		"\nE\fE\16E\u01d7\13E\3E\3E\3F\3F\3F\3F\7F\u01df\nF\fF\16F\u01e2\13F\3"+
		"F\3F\3G\3G\3G\3G\7G\u01ea\nG\fG\16G\u01ed\13G\3G\3G\3G\3G\3G\3H\6H\u01f5"+
		"\nH\rH\16H\u01f6\3H\3H\3I\3I\3\u01eb\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\3\2\t\4\2\f\f\17\17"+
		"\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\3\2\60\60\3\2$$\5\2\13\f\17\17\"\"\2"+
		"\u0206\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u009c"+
		"\3\2\2\2\7\u00a2\3\2\2\2\t\u00a7\3\2\2\2\13\u00ac\3\2\2\2\r\u00b2\3\2"+
		"\2\2\17\u00bb\3\2\2\2\21\u00c3\3\2\2\2\23\u00c9\3\2\2\2\25\u00ce\3\2\2"+
		"\2\27\u00da\3\2\2\2\31\u00de\3\2\2\2\33\u00e3\3\2\2\2\35\u00e6\3\2\2\2"+
		"\37\u00eb\3\2\2\2!\u00ee\3\2\2\2#\u00fd\3\2\2\2%\u0107\3\2\2\2\'\u010b"+
		"\3\2\2\2)\u011b\3\2\2\2+\u0121\3\2\2\2-\u0128\3\2\2\2/\u012f\3\2\2\2\61"+
		"\u0136\3\2\2\2\63\u013d\3\2\2\2\65\u0142\3\2\2\2\67\u0146\3\2\2\29\u014e"+
		"\3\2\2\2;\u0156\3\2\2\2=\u015d\3\2\2\2?\u0162\3\2\2\2A\u0168\3\2\2\2C"+
		"\u016a\3\2\2\2E\u016c\3\2\2\2G\u016e\3\2\2\2I\u0170\3\2\2\2K\u0172\3\2"+
		"\2\2M\u0175\3\2\2\2O\u0178\3\2\2\2Q\u017b\3\2\2\2S\u017e\3\2\2\2U\u0181"+
		"\3\2\2\2W\u0184\3\2\2\2Y\u0187\3\2\2\2[\u018a\3\2\2\2]\u018d\3\2\2\2_"+
		"\u0190\3\2\2\2a\u0192\3\2\2\2c\u0194\3\2\2\2e\u0196\3\2\2\2g\u0198\3\2"+
		"\2\2i\u019b\3\2\2\2k\u019e\3\2\2\2m\u01a1\3\2\2\2o\u01a4\3\2\2\2q\u01a6"+
		"\3\2\2\2s\u01a8\3\2\2\2u\u01aa\3\2\2\2w\u01ac\3\2\2\2y\u01ae\3\2\2\2{"+
		"\u01b0\3\2\2\2}\u01b2\3\2\2\2\177\u01b4\3\2\2\2\u0081\u01b6\3\2\2\2\u0083"+
		"\u01b8\3\2\2\2\u0085\u01c2\3\2\2\2\u0087\u01cd\3\2\2\2\u0089\u01d1\3\2"+
		"\2\2\u008b\u01da\3\2\2\2\u008d\u01e5\3\2\2\2\u008f\u01f4\3\2\2\2\u0091"+
		"\u01fa\3\2\2\2\u0093\u0099\5\u0083B\2\u0094\u0095\5{>\2\u0095\u0096\5"+
		"\u0083B\2\u0096\u0098\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\4\3\2\2\2\u009b\u0099\3"+
		"\2\2\2\u009c\u009d\7d\2\2\u009d\u009e\7t\2\2\u009e\u009f\7g\2\2\u009f"+
		"\u00a0\7c\2\2\u00a0\u00a1\7m\2\2\u00a1\6\3\2\2\2\u00a2\u00a3\7e\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\b\3\2\2\2\u00a7"+
		"\u00a8\7e\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7p\2\2"+
		"\u00ab\n\3\2\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7p"+
		"\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7v\2\2\u00b1\f\3\2\2\2\u00b2\u00b3"+
		"\7e\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6"+
		"\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7g\2\2"+
		"\u00ba\16\3\2\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7"+
		"h\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2"+
		"\7v\2\2\u00c2\20\3\2\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6"+
		"\7h\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7t\2\2\u00c8\22\3\2\2\2\u00c9\u00ca"+
		"\7g\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\24\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7n\2\2\u00d1"+
		"\u00d2\7n\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\7t\2\2"+
		"\u00d5\u00d6\7q\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7i\2\2\u00d8\u00d9"+
		"\7j\2\2\u00d9\26\3\2\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\30\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\u00e2\7e\2\2\u00e2\32\3\2\2\2\u00e3\u00e4\7i\2\2\u00e4\u00e5"+
		"\7q\2\2\u00e5\34\3\2\2\2\u00e6\u00e7\7i\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9"+
		"\7v\2\2\u00e9\u00ea\7q\2\2\u00ea\36\3\2\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed"+
		"\7h\2\2\u00ed \3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1"+
		"\7r\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7v\2\2\u00f4"+
		"\u00f8\3\2\2\2\u00f5\u00f7\n\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\b\21\2\2\u00fc\"\3\2\2\2\u00fd\u00fe\7k\2\2"+
		"\u00fe\u00ff\7p\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7g\2\2\u0101\u0102"+
		"\7t\2\2\u0102\u0103\7h\2\2\u0103\u0104\7c\2\2\u0104\u0105\7e\2\2\u0105"+
		"\u0106\7g\2\2\u0106$\3\2\2\2\u0107\u0108\7o\2\2\u0108\u0109\7c\2\2\u0109"+
		"\u010a\7r\2\2\u010a&\3\2\2\2\u010b\u010c\7r\2\2\u010c\u010d\7c\2\2\u010d"+
		"\u010e\7e\2\2\u010e\u010f\7m\2\2\u010f\u0110\7c\2\2\u0110\u0111\7i\2\2"+
		"\u0111\u0112\7g\2\2\u0112\u0116\3\2\2\2\u0113\u0115\n\2\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\b\24\2\2\u011a(\3\2\2\2"+
		"\u011b\u011c\7t\2\2\u011c\u011d\7c\2\2\u011d\u011e\7p\2\2\u011e\u011f"+
		"\7i\2\2\u011f\u0120\7g\2\2\u0120*\3\2\2\2\u0121\u0122\7t\2\2\u0122\u0123"+
		"\7g\2\2\u0123\u0124\7v\2\2\u0124\u0125\7w\2\2\u0125\u0126\7t\2\2\u0126"+
		"\u0127\7p\2\2\u0127,\3\2\2\2\u0128\u0129\7u\2\2\u0129\u012a\7g\2\2\u012a"+
		"\u012b\7n\2\2\u012b\u012c\7g\2\2\u012c\u012d\7e\2\2\u012d\u012e\7v\2\2"+
		"\u012e.\3\2\2\2\u012f\u0130\7u\2\2\u0130\u0131\7v\2\2\u0131\u0132\7t\2"+
		"\2\u0132\u0133\7w\2\2\u0133\u0134\7e\2\2\u0134\u0135\7v\2\2\u0135\60\3"+
		"\2\2\2\u0136\u0137\7u\2\2\u0137\u0138\7y\2\2\u0138\u0139\7k\2\2\u0139"+
		"\u013a\7v\2\2\u013a\u013b\7e\2\2\u013b\u013c\7j\2\2\u013c\62\3\2\2\2\u013d"+
		"\u013e\7v\2\2\u013e\u013f\7{\2\2\u013f\u0140\7r\2\2\u0140\u0141\7g\2\2"+
		"\u0141\64\3\2\2\2\u0142\u0143\7x\2\2\u0143\u0144\7c\2\2\u0144\u0145\7"+
		"t\2\2\u0145\66\3\2\2\2\u0146\u0147\7h\2\2\u0147\u0148\7n\2\2\u0148\u0149"+
		"\7q\2\2\u0149\u014a\7c\2\2\u014a\u014b\7v\2\2\u014b\u014c\7\65\2\2\u014c"+
		"\u014d\7\64\2\2\u014d8\3\2\2\2\u014e\u014f\7h\2\2\u014f\u0150\7n\2\2\u0150"+
		"\u0151\7q\2\2\u0151\u0152\7c\2\2\u0152\u0153\7v\2\2\u0153\u0154\78\2\2"+
		"\u0154\u0155\7\66\2\2\u0155:\3\2\2\2\u0156\u0157\7u\2\2\u0157\u0158\7"+
		"v\2\2\u0158\u0159\7t\2\2\u0159\u015a\7k\2\2\u015a\u015b\7p\2\2\u015b\u015c"+
		"\7i\2\2\u015c<\3\2\2\2\u015d\u015e\7v\2\2\u015e\u015f\7t\2\2\u015f\u0160"+
		"\7w\2\2\u0160\u0161\7g\2\2\u0161>\3\2\2\2\u0162\u0163\7h\2\2\u0163\u0164"+
		"\7c\2\2\u0164\u0165\7n\2\2\u0165\u0166\7u\2\2\u0166\u0167\7g\2\2\u0167"+
		"@\3\2\2\2\u0168\u0169\7-\2\2\u0169B\3\2\2\2\u016a\u016b\7/\2\2\u016bD"+
		"\3\2\2\2\u016c\u016d\7,\2\2\u016dF\3\2\2\2\u016e\u016f\7\61\2\2\u016f"+
		"H\3\2\2\2\u0170\u0171\7\'\2\2\u0171J\3\2\2\2\u0172\u0173\7-\2\2\u0173"+
		"\u0174\7?\2\2\u0174L\3\2\2\2\u0175\u0176\7/\2\2\u0176\u0177\7?\2\2\u0177"+
		"N\3\2\2\2\u0178\u0179\7,\2\2\u0179\u017a\7?\2\2\u017aP\3\2\2\2\u017b\u017c"+
		"\7\61\2\2\u017c\u017d\7?\2\2\u017dR\3\2\2\2\u017e\u017f\7\'\2\2\u017f"+
		"\u0180\7?\2\2\u0180T\3\2\2\2\u0181\u0182\7(\2\2\u0182\u0183\7(\2\2\u0183"+
		"V\3\2\2\2\u0184\u0185\7~\2\2\u0185\u0186\7~\2\2\u0186X\3\2\2\2\u0187\u0188"+
		"\7-\2\2\u0188\u0189\7-\2\2\u0189Z\3\2\2\2\u018a\u018b\7/\2\2\u018b\u018c"+
		"\7/\2\2\u018c\\\3\2\2\2\u018d\u018e\7?\2\2\u018e\u018f\7?\2\2\u018f^\3"+
		"\2\2\2\u0190\u0191\7>\2\2\u0191`\3\2\2\2\u0192\u0193\7@\2\2\u0193b\3\2"+
		"\2\2\u0194\u0195\7?\2\2\u0195d\3\2\2\2\u0196\u0197\7#\2\2\u0197f\3\2\2"+
		"\2\u0198\u0199\7#\2\2\u0199\u019a\7?\2\2\u019ah\3\2\2\2\u019b\u019c\7"+
		">\2\2\u019c\u019d\7?\2\2\u019dj\3\2\2\2\u019e\u019f\7@\2\2\u019f\u01a0"+
		"\7?\2\2\u01a0l\3\2\2\2\u01a1\u01a2\7<\2\2\u01a2\u01a3\7?\2\2\u01a3n\3"+
		"\2\2\2\u01a4\u01a5\7*\2\2\u01a5p\3\2\2\2\u01a6\u01a7\7+\2\2\u01a7r\3\2"+
		"\2\2\u01a8\u01a9\7]\2\2\u01a9t\3\2\2\2\u01aa\u01ab\7_\2\2\u01abv\3\2\2"+
		"\2\u01ac\u01ad\7}\2\2\u01adx\3\2\2\2\u01ae\u01af\7\177\2\2\u01afz\3\2"+
		"\2\2\u01b0\u01b1\7.\2\2\u01b1|\3\2\2\2\u01b2\u01b3\7\60\2\2\u01b3~\3\2"+
		"\2\2\u01b4\u01b5\7=\2\2\u01b5\u0080\3\2\2\2\u01b6\u01b7\7<\2\2\u01b7\u0082"+
		"\3\2\2\2\u01b8\u01bc\t\3\2\2\u01b9\u01bb\t\4\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u0084\3\2"+
		"\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c1\t\5\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c9\t\6\2\2\u01c6\u01c8\t\5\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u0086\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01ce\t\5\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u0088\3\2\2\2\u01d1\u01d5\7$\2\2\u01d2\u01d4\n\7\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7$\2\2\u01d9"+
		"\u008a\3\2\2\2\u01da\u01db\7\61\2\2\u01db\u01dc\7\61\2\2\u01dc\u01e0\3"+
		"\2\2\2\u01dd\u01df\n\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2"+
		"\2\2\u01e3\u01e4\bF\2\2\u01e4\u008c\3\2\2\2\u01e5\u01e6\7\61\2\2\u01e6"+
		"\u01e7\7,\2\2\u01e7\u01eb\3\2\2\2\u01e8\u01ea\13\2\2\2\u01e9\u01e8\3\2"+
		"\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01ec\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7,\2\2\u01ef\u01f0\7\61"+
		"\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\bG\2\2\u01f2\u008e\3\2\2\2\u01f3"+
		"\u01f5\t\b\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\bH\2\2\u01f9"+
		"\u0090\3\2\2\2\u01fa\u01fb\13\2\2\2\u01fb\u0092\3\2\2\2\16\2\u0099\u00f8"+
		"\u0116\u01bc\u01c2\u01c9\u01cf\u01d5\u01e0\u01eb\u01f6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}