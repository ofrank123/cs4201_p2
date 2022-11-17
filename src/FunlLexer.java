// Generated from Funl.g by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, MAIN=2, WHERE=3, RPAREN=4, LPAREN=5, RBRACE=6, LBRACE=7, IF=8, THEN=9, 
		ELSE=10, COMMA=11, LAMBDA=12, ARROW=13, SEMICOLON=14, EQ=15, EQUALS=16, 
		MINUS=17, AND=18, OR=19, NEQ=20, LT=21, GT=22, LTE=23, GTE=24, PLUS=25, 
		DIV=26, MUL=27, CONS=28, IDENT=29, NUMERAL=30, LETTER=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "MAIN", "WHERE", "RPAREN", "LPAREN", "RBRACE", "LBRACE", "IF", 
			"THEN", "ELSE", "COMMA", "LAMBDA", "ARROW", "SEMICOLON", "EQ", "EQUALS", 
			"MINUS", "AND", "OR", "NEQ", "LT", "GT", "LTE", "GTE", "PLUS", "DIV", 
			"MUL", "CONS", "IDENT", "NUMERAL", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'main'", "'where'", "')'", "'('", "'}'", "'{'", "'if'", 
			"'then'", "'else'", "','", "'\\'", "'->'", "';'", "'=='", "'='", "'-'", 
			"'&&'", "'||'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'/'", "'*'", 
			"'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "MAIN", "WHERE", "RPAREN", "LPAREN", "RBRACE", "LBRACE", 
			"IF", "THEN", "ELSE", "COMMA", "LAMBDA", "ARROW", "SEMICOLON", "EQ", 
			"EQUALS", "MINUS", "AND", "OR", "NEQ", "LT", "GT", "LTE", "GTE", "PLUS", 
			"DIV", "MUL", "CONS", "IDENT", "NUMERAL", "LETTER"
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


	public FunlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Funl.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00a8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\5\2D\n\2\3\2\6\2G\n\2\r\2\16\2H\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u009c"+
		"\n\36\f\36\16\36\u009f\13\36\3\37\6\37\u00a2\n\37\r\37\16\37\u00a3\3 "+
		"\5 \u00a7\n \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!\3\2\5\4\2\13\13\"\"\3\2\62;\5\2C\\aac|\2\u00ad\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\3F\3\2\2\2\5L\3\2\2\2\7Q\3\2\2\2\tW\3\2\2\2"+
		"\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21_\3\2\2\2\23b\3\2\2\2\25g\3\2\2"+
		"\2\27l\3\2\2\2\31n\3\2\2\2\33p\3\2\2\2\35s\3\2\2\2\37u\3\2\2\2!x\3\2\2"+
		"\2#z\3\2\2\2%|\3\2\2\2\'\177\3\2\2\2)\u0082\3\2\2\2+\u0085\3\2\2\2-\u0087"+
		"\3\2\2\2/\u0089\3\2\2\2\61\u008c\3\2\2\2\63\u008f\3\2\2\2\65\u0091\3\2"+
		"\2\2\67\u0093\3\2\2\29\u0095\3\2\2\2;\u0098\3\2\2\2=\u00a1\3\2\2\2?\u00a6"+
		"\3\2\2\2AG\t\2\2\2BD\7\17\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EG\7\f\2\2"+
		"FA\3\2\2\2FC\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\b\2\2\2"+
		"K\4\3\2\2\2LM\7o\2\2MN\7c\2\2NO\7k\2\2OP\7p\2\2P\6\3\2\2\2QR\7y\2\2RS"+
		"\7j\2\2ST\7g\2\2TU\7t\2\2UV\7g\2\2V\b\3\2\2\2WX\7+\2\2X\n\3\2\2\2YZ\7"+
		"*\2\2Z\f\3\2\2\2[\\\7\177\2\2\\\16\3\2\2\2]^\7}\2\2^\20\3\2\2\2_`\7k\2"+
		"\2`a\7h\2\2a\22\3\2\2\2bc\7v\2\2cd\7j\2\2de\7g\2\2ef\7p\2\2f\24\3\2\2"+
		"\2gh\7g\2\2hi\7n\2\2ij\7u\2\2jk\7g\2\2k\26\3\2\2\2lm\7.\2\2m\30\3\2\2"+
		"\2no\7^\2\2o\32\3\2\2\2pq\7/\2\2qr\7@\2\2r\34\3\2\2\2st\7=\2\2t\36\3\2"+
		"\2\2uv\7?\2\2vw\7?\2\2w \3\2\2\2xy\7?\2\2y\"\3\2\2\2z{\7/\2\2{$\3\2\2"+
		"\2|}\7(\2\2}~\7(\2\2~&\3\2\2\2\177\u0080\7~\2\2\u0080\u0081\7~\2\2\u0081"+
		"(\3\2\2\2\u0082\u0083\7>\2\2\u0083\u0084\7@\2\2\u0084*\3\2\2\2\u0085\u0086"+
		"\7>\2\2\u0086,\3\2\2\2\u0087\u0088\7@\2\2\u0088.\3\2\2\2\u0089\u008a\7"+
		">\2\2\u008a\u008b\7?\2\2\u008b\60\3\2\2\2\u008c\u008d\7@\2\2\u008d\u008e"+
		"\7?\2\2\u008e\62\3\2\2\2\u008f\u0090\7-\2\2\u0090\64\3\2\2\2\u0091\u0092"+
		"\7\61\2\2\u0092\66\3\2\2\2\u0093\u0094\7,\2\2\u00948\3\2\2\2\u0095\u0096"+
		"\7<\2\2\u0096\u0097\7<\2\2\u0097:\3\2\2\2\u0098\u009d\5? \2\u0099\u009c"+
		"\5? \2\u009a\u009c\t\3\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e<\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u00a0\u00a2\t\3\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4>\3\2\2\2\u00a5"+
		"\u00a7\t\4\2\2\u00a6\u00a5\3\2\2\2\u00a7@\3\2\2\2\n\2CFH\u009b\u009d\u00a3"+
		"\u00a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}