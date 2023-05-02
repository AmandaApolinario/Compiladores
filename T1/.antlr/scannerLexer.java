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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01c5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00e2\n\20\f\20\16\20\u00e5\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u0100\n\23\f\23\16\23\u0103\13\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\7<\u0184\n<\f<\16<\u0187\13<\3=\7"+
		"=\u018a\n=\f=\16=\u018d\13=\3=\3=\7=\u0191\n=\f=\16=\u0194\13=\3>\6>\u0197"+
		"\n>\r>\16>\u0198\3?\3?\7?\u019d\n?\f?\16?\u01a0\13?\3?\3?\3@\3@\3@\3@"+
		"\7@\u01a8\n@\f@\16@\u01ab\13@\3@\3@\3A\3A\3A\3A\7A\u01b3\nA\fA\16A\u01b6"+
		"\13A\3A\3A\3A\3A\3A\3B\6B\u01be\nB\rB\16B\u01bf\3B\3B\3C\3C\3\u01b4\2"+
		"D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\3\2\t\4\2\f\f\17\17\4\2C\\c"+
		"|\6\2\62;C\\aac|\3\2\62;\3\2\60\60\3\2$$\5\2\13\f\17\17\"\"\2\u01ce\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\3\u0087\3\2\2\2\5\u008d\3\2\2\2\7\u0092\3\2\2\2\t\u0097\3\2\2"+
		"\2\13\u009d\3\2\2\2\r\u00a6\3\2\2\2\17\u00ae\3\2\2\2\21\u00b4\3\2\2\2"+
		"\23\u00b9\3\2\2\2\25\u00c5\3\2\2\2\27\u00c9\3\2\2\2\31\u00ce\3\2\2\2\33"+
		"\u00d1\3\2\2\2\35\u00d6\3\2\2\2\37\u00d9\3\2\2\2!\u00e8\3\2\2\2#\u00f2"+
		"\3\2\2\2%\u00f6\3\2\2\2\'\u0106\3\2\2\2)\u010c\3\2\2\2+\u0113\3\2\2\2"+
		"-\u011a\3\2\2\2/\u0121\3\2\2\2\61\u0128\3\2\2\2\63\u012d\3\2\2\2\65\u0131"+
		"\3\2\2\2\67\u0133\3\2\2\29\u0135\3\2\2\2;\u0137\3\2\2\2=\u0139\3\2\2\2"+
		"?\u013b\3\2\2\2A\u013e\3\2\2\2C\u0141\3\2\2\2E\u0144\3\2\2\2G\u0147\3"+
		"\2\2\2I\u014a\3\2\2\2K\u014d\3\2\2\2M\u0150\3\2\2\2O\u0153\3\2\2\2Q\u0156"+
		"\3\2\2\2S\u0159\3\2\2\2U\u015b\3\2\2\2W\u015d\3\2\2\2Y\u015f\3\2\2\2["+
		"\u0161\3\2\2\2]\u0164\3\2\2\2_\u0167\3\2\2\2a\u016a\3\2\2\2c\u016d\3\2"+
		"\2\2e\u016f\3\2\2\2g\u0171\3\2\2\2i\u0173\3\2\2\2k\u0175\3\2\2\2m\u0177"+
		"\3\2\2\2o\u0179\3\2\2\2q\u017b\3\2\2\2s\u017d\3\2\2\2u\u017f\3\2\2\2w"+
		"\u0181\3\2\2\2y\u018b\3\2\2\2{\u0196\3\2\2\2}\u019a\3\2\2\2\177\u01a3"+
		"\3\2\2\2\u0081\u01ae\3\2\2\2\u0083\u01bd\3\2\2\2\u0085\u01c3\3\2\2\2\u0087"+
		"\u0088\7d\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a\u008b\7c\2\2"+
		"\u008b\u008c\7m\2\2\u008c\4\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7c"+
		"\2\2\u008f\u0090\7u\2\2\u0090\u0091\7g\2\2\u0091\6\3\2\2\2\u0092\u0093"+
		"\7e\2\2\u0093\u0094\7j\2\2\u0094\u0095\7c\2\2\u0095\u0096\7p\2\2\u0096"+
		"\b\3\2\2\2\u0097\u0098\7e\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a"+
		"\u009b\7u\2\2\u009b\u009c\7v\2\2\u009c\n\3\2\2\2\u009d\u009e\7e\2\2\u009e"+
		"\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7k\2\2"+
		"\u00a2\u00a3\7p\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7g\2\2\u00a5\f\3\2"+
		"\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa"+
		"\7c\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7v\2\2\u00ad"+
		"\16\3\2\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7h\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7t\2\2\u00b3\20\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8\22\3\2\2\2\u00b9"+
		"\u00ba\7h\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7n\2\2"+
		"\u00bd\u00be\7v\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7q\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7i\2\2\u00c3\u00c4\7j\2\2\u00c4"+
		"\24\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7t\2\2\u00c8"+
		"\26\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7p\2\2\u00cc"+
		"\u00cd\7e\2\2\u00cd\30\3\2\2\2\u00ce\u00cf\7i\2\2\u00cf\u00d0\7q\2\2\u00d0"+
		"\32\3\2\2\2\u00d1\u00d2\7i\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7v\2\2\u00d4"+
		"\u00d5\7q\2\2\u00d5\34\3\2\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7h\2\2\u00d8"+
		"\36\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7r\2\2\u00dc"+
		"\u00dd\7q\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7v\2\2\u00df\u00e3\3\2\2"+
		"\2\u00e0\u00e2\n\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\b\20\2\2\u00e7 \3\2\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea"+
		"\u00eb\7v\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7h\2\2"+
		"\u00ee\u00ef\7c\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7g\2\2\u00f1\"\3\2"+
		"\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7r\2\2\u00f5$\3"+
		"\2\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7e\2\2\u00f9"+
		"\u00fa\7m\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7i\2\2\u00fc\u00fd\7g\2\2"+
		"\u00fd\u0101\3\2\2\2\u00fe\u0100\n\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0105\b\23\2\2\u0105&\3\2\2\2\u0106\u0107\7t\2\2"+
		"\u0107\u0108\7c\2\2\u0108\u0109\7p\2\2\u0109\u010a\7i\2\2\u010a\u010b"+
		"\7g\2\2\u010b(\3\2\2\2\u010c\u010d\7t\2\2\u010d\u010e\7g\2\2\u010e\u010f"+
		"\7v\2\2\u010f\u0110\7w\2\2\u0110\u0111\7t\2\2\u0111\u0112\7p\2\2\u0112"+
		"*\3\2\2\2\u0113\u0114\7u\2\2\u0114\u0115\7g\2\2\u0115\u0116\7n\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7e\2\2\u0118\u0119\7v\2\2\u0119,\3\2\2\2\u011a"+
		"\u011b\7u\2\2\u011b\u011c\7v\2\2\u011c\u011d\7t\2\2\u011d\u011e\7w\2\2"+
		"\u011e\u011f\7e\2\2\u011f\u0120\7v\2\2\u0120.\3\2\2\2\u0121\u0122\7u\2"+
		"\2\u0122\u0123\7y\2\2\u0123\u0124\7k\2\2\u0124\u0125\7v\2\2\u0125\u0126"+
		"\7e\2\2\u0126\u0127\7j\2\2\u0127\60\3\2\2\2\u0128\u0129\7v\2\2\u0129\u012a"+
		"\7{\2\2\u012a\u012b\7r\2\2\u012b\u012c\7g\2\2\u012c\62\3\2\2\2\u012d\u012e"+
		"\7x\2\2\u012e\u012f\7c\2\2\u012f\u0130\7t\2\2\u0130\64\3\2\2\2\u0131\u0132"+
		"\7-\2\2\u0132\66\3\2\2\2\u0133\u0134\7/\2\2\u01348\3\2\2\2\u0135\u0136"+
		"\7,\2\2\u0136:\3\2\2\2\u0137\u0138\7\61\2\2\u0138<\3\2\2\2\u0139\u013a"+
		"\7\'\2\2\u013a>\3\2\2\2\u013b\u013c\7-\2\2\u013c\u013d\7?\2\2\u013d@\3"+
		"\2\2\2\u013e\u013f\7/\2\2\u013f\u0140\7?\2\2\u0140B\3\2\2\2\u0141\u0142"+
		"\7,\2\2\u0142\u0143\7?\2\2\u0143D\3\2\2\2\u0144\u0145\7\61\2\2\u0145\u0146"+
		"\7?\2\2\u0146F\3\2\2\2\u0147\u0148\7\'\2\2\u0148\u0149\7?\2\2\u0149H\3"+
		"\2\2\2\u014a\u014b\7(\2\2\u014b\u014c\7(\2\2\u014cJ\3\2\2\2\u014d\u014e"+
		"\7~\2\2\u014e\u014f\7~\2\2\u014fL\3\2\2\2\u0150\u0151\7-\2\2\u0151\u0152"+
		"\7-\2\2\u0152N\3\2\2\2\u0153\u0154\7/\2\2\u0154\u0155\7/\2\2\u0155P\3"+
		"\2\2\2\u0156\u0157\7?\2\2\u0157\u0158\7?\2\2\u0158R\3\2\2\2\u0159\u015a"+
		"\7>\2\2\u015aT\3\2\2\2\u015b\u015c\7@\2\2\u015cV\3\2\2\2\u015d\u015e\7"+
		"?\2\2\u015eX\3\2\2\2\u015f\u0160\7#\2\2\u0160Z\3\2\2\2\u0161\u0162\7#"+
		"\2\2\u0162\u0163\7?\2\2\u0163\\\3\2\2\2\u0164\u0165\7>\2\2\u0165\u0166"+
		"\7?\2\2\u0166^\3\2\2\2\u0167\u0168\7@\2\2\u0168\u0169\7?\2\2\u0169`\3"+
		"\2\2\2\u016a\u016b\7<\2\2\u016b\u016c\7?\2\2\u016cb\3\2\2\2\u016d\u016e"+
		"\7*\2\2\u016ed\3\2\2\2\u016f\u0170\7+\2\2\u0170f\3\2\2\2\u0171\u0172\7"+
		"]\2\2\u0172h\3\2\2\2\u0173\u0174\7_\2\2\u0174j\3\2\2\2\u0175\u0176\7}"+
		"\2\2\u0176l\3\2\2\2\u0177\u0178\7\177\2\2\u0178n\3\2\2\2\u0179\u017a\7"+
		".\2\2\u017ap\3\2\2\2\u017b\u017c\7\60\2\2\u017cr\3\2\2\2\u017d\u017e\7"+
		"=\2\2\u017et\3\2\2\2\u017f\u0180\7<\2\2\u0180v\3\2\2\2\u0181\u0185\t\3"+
		"\2\2\u0182\u0184\t\4\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186x\3\2\2\2\u0187\u0185\3\2\2\2"+
		"\u0188\u018a\t\5\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u0192\t\6\2\2\u018f\u0191\t\5\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193z\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0195\u0197\t\5\2\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199|\3\2\2\2\u019a\u019e\7$\2\2\u019b"+
		"\u019d\n\7\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u01a2\7$\2\2\u01a2~\3\2\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a5\7\61\2\2"+
		"\u01a5\u01a9\3\2\2\2\u01a6\u01a8\n\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ac\u01ad\b@\2\2\u01ad\u0080\3\2\2\2\u01ae\u01af\7\61"+
		"\2\2\u01af\u01b0\7,\2\2\u01b0\u01b4\3\2\2\2\u01b1\u01b3\13\2\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\7,\2\2\u01b8"+
		"\u01b9\7\61\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\bA\2\2\u01bb\u0082\3\2"+
		"\2\2\u01bc\u01be\t\b\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\bB"+
		"\2\2\u01c2\u0084\3\2\2\2\u01c3\u01c4\13\2\2\2\u01c4\u0086\3\2\2\2\r\2"+
		"\u00e3\u0101\u0185\u018b\u0192\u0198\u019e\u01a9\u01b4\u01bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}