// Generated from /home/lmscaramussa/Documents/Compiladores/Lab02_Java/scanner/scanner.g by ANTLR 4.9.2
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u00ba\n\35\f\35\16\35\u00bd"+
		"\13\35\3\36\7\36\u00c0\n\36\f\36\16\36\u00c3\13\36\3\36\3\36\7\36\u00c7"+
		"\n\36\f\36\16\36\u00ca\13\36\3\37\6\37\u00cd\n\37\r\37\16\37\u00ce\3 "+
		"\3 \7 \u00d3\n \f \16 \u00d6\13 \3 \3 \3!\6!\u00db\n!\r!\16!\u00dc\3!"+
		"\3!\3\"\3\"\7\"\u00e3\n\"\f\"\16\"\u00e6\13\"\3\"\3\"\3\"\3\"\3#\3#\2"+
		"\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$\3\2\t\4\2C\\c|\5\2\62;C\\c|\3\2\62;\3\2\60\60\3\2$$\5"+
		"\2\13\f\17\17\"\"\4\2}}\177\177\2\u00f3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5M\3\2\2\2\7R\3\2\2\2\tW\3"+
		"\2\2\2\13[\3\2\2\2\ra\3\2\2\2\17d\3\2\2\2\21h\3\2\2\2\23p\3\2\2\2\25u"+
		"\3\2\2\2\27z\3\2\2\2\31\u0081\3\2\2\2\33\u0088\3\2\2\2\35\u008d\3\2\2"+
		"\2\37\u0092\3\2\2\2!\u0098\3\2\2\2#\u009c\3\2\2\2%\u00a2\3\2\2\2\'\u00a5"+
		"\3\2\2\2)\u00a7\3\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2\2\2\61"+
		"\u00af\3\2\2\2\63\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2\29\u00b7"+
		"\3\2\2\2;\u00c1\3\2\2\2=\u00cc\3\2\2\2?\u00d0\3\2\2\2A\u00da\3\2\2\2C"+
		"\u00e0\3\2\2\2E\u00eb\3\2\2\2GH\7d\2\2HI\7g\2\2IJ\7i\2\2JK\7k\2\2KL\7"+
		"p\2\2L\4\3\2\2\2MN\7d\2\2NO\7q\2\2OP\7q\2\2PQ\7n\2\2Q\6\3\2\2\2RS\7g\2"+
		"\2ST\7n\2\2TU\7u\2\2UV\7g\2\2V\b\3\2\2\2WX\7g\2\2XY\7p\2\2YZ\7f\2\2Z\n"+
		"\3\2\2\2[\\\7h\2\2\\]\7c\2\2]^\7n\2\2^_\7u\2\2_`\7g\2\2`\f\3\2\2\2ab\7"+
		"k\2\2bc\7h\2\2c\16\3\2\2\2de\7k\2\2ef\7p\2\2fg\7v\2\2g\20\3\2\2\2hi\7"+
		"r\2\2ij\7t\2\2jk\7q\2\2kl\7i\2\2lm\7t\2\2mn\7c\2\2no\7o\2\2o\22\3\2\2"+
		"\2pq\7t\2\2qr\7g\2\2rs\7c\2\2st\7f\2\2t\24\3\2\2\2uv\7t\2\2vw\7g\2\2w"+
		"x\7c\2\2xy\7n\2\2y\26\3\2\2\2z{\7t\2\2{|\7g\2\2|}\7r\2\2}~\7g\2\2~\177"+
		"\7c\2\2\177\u0080\7v\2\2\u0080\30\3\2\2\2\u0081\u0082\7u\2\2\u0082\u0083"+
		"\7v\2\2\u0083\u0084\7t\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086"+
		"\u0087\7i\2\2\u0087\32\3\2\2\2\u0088\u0089\7v\2\2\u0089\u008a\7j\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7p\2\2\u008c\34\3\2\2\2\u008d\u008e\7v\2\2\u008e"+
		"\u008f\7t\2\2\u008f\u0090\7w\2\2\u0090\u0091\7g\2\2\u0091\36\3\2\2\2\u0092"+
		"\u0093\7w\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095\u0096\7k\2\2"+
		"\u0096\u0097\7n\2\2\u0097 \3\2\2\2\u0098\u0099\7x\2\2\u0099\u009a\7c\2"+
		"\2\u009a\u009b\7t\2\2\u009b\"\3\2\2\2\u009c\u009d\7y\2\2\u009d\u009e\7"+
		"t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7g\2\2\u00a1$"+
		"\3\2\2\2\u00a2\u00a3\7<\2\2\u00a3\u00a4\7?\2\2\u00a4&\3\2\2\2\u00a5\u00a6"+
		"\7?\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7>\2\2\u00a8*\3\2\2\2\u00a9\u00aa\7"+
		"-\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac.\3\2\2\2\u00ad\u00ae\7,"+
		"\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0\62\3\2\2\2\u00b1\u00b2"+
		"\7*\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7+\2\2\u00b4\66\3\2\2\2\u00b5\u00b6"+
		"\7=\2\2\u00b68\3\2\2\2\u00b7\u00bb\t\2\2\2\u00b8\u00ba\t\3\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		":\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\t\4\2\2\u00bf\u00be\3\2\2\2"+
		"\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c8\t\5\2\2\u00c5\u00c7\t\4\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9<\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\t\4\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		">\3\2\2\2\u00d0\u00d4\7$\2\2\u00d1\u00d3\n\6\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8@\3\2\2\2\u00d9\u00db"+
		"\t\7\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b!\2\2\u00dfB\3\2\2\2\u00e0"+
		"\u00e4\7}\2\2\u00e1\u00e3\n\b\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\7\177\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b"+
		"\"\2\2\u00eaD\3\2\2\2\u00eb\u00ec\13\2\2\2\u00ecF\3\2\2\2\n\2\u00bb\u00c1"+
		"\u00c8\u00ce\u00d4\u00dc\u00e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}