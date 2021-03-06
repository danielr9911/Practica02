// Generated from SCvamo_a_compilarANTLRLexer.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SCvamo_a_compilarANTLRLexerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		VOID=25, STRING=26, NUMERO=27, ID=28, WS=29, ERROR=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "VOID", 
		"STRING", "NUMERO", "ID", "WS", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'disp'", "'='", "'let'", "'>>='", "'>>'", "'|'", "'{'", "'}'", 
		"'['", "']'", "'('", "','", "')'", "'+'", "'-'", "'*'", "'/'", "'@'", 
		"'_'", "'input'", "'<'", "'>'", "':'", "'Int'", "'()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "VOID", "STRING", "NUMERO", "ID", "WS", "ERROR"
	};
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


	public SCvamo_a_compilarANTLRLexerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SCvamo_a_compilarANTLRLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00a0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\7\33\u0083\n\33\f\33\16\33\u0086\13\33\3\33\3\33\3\34"+
		"\3\34\3\34\7\34\u008d\n\34\f\34\16\34\u0090\13\34\5\34\u0092\n\34\3\35"+
		"\3\35\7\35\u0096\n\35\f\35\16\35\u0099\13\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= \3\2\6\7\2\"\"\60;C\\aac|\4\2C\\c|\6\2\62;C\\aac|\5\2\13"+
		"\f\16\17\"\"\u00a3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5D\3\2\2\2\7F\3\2\2\2\tJ"+
		"\3\2\2\2\13N\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23W\3\2\2\2\25"+
		"Y\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33_\3\2\2\2\35a\3\2\2\2\37c\3\2\2\2"+
		"!e\3\2\2\2#g\3\2\2\2%i\3\2\2\2\'k\3\2\2\2)m\3\2\2\2+s\3\2\2\2-u\3\2\2"+
		"\2/w\3\2\2\2\61y\3\2\2\2\63}\3\2\2\2\65\u0080\3\2\2\2\67\u0091\3\2\2\2"+
		"9\u0093\3\2\2\2;\u009a\3\2\2\2=\u009e\3\2\2\2?@\7f\2\2@A\7k\2\2AB\7u\2"+
		"\2BC\7r\2\2C\4\3\2\2\2DE\7?\2\2E\6\3\2\2\2FG\7n\2\2GH\7g\2\2HI\7v\2\2"+
		"I\b\3\2\2\2JK\7@\2\2KL\7@\2\2LM\7?\2\2M\n\3\2\2\2NO\7@\2\2OP\7@\2\2P\f"+
		"\3\2\2\2QR\7~\2\2R\16\3\2\2\2ST\7}\2\2T\20\3\2\2\2UV\7\177\2\2V\22\3\2"+
		"\2\2WX\7]\2\2X\24\3\2\2\2YZ\7_\2\2Z\26\3\2\2\2[\\\7*\2\2\\\30\3\2\2\2"+
		"]^\7.\2\2^\32\3\2\2\2_`\7+\2\2`\34\3\2\2\2ab\7-\2\2b\36\3\2\2\2cd\7/\2"+
		"\2d \3\2\2\2ef\7,\2\2f\"\3\2\2\2gh\7\61\2\2h$\3\2\2\2ij\7B\2\2j&\3\2\2"+
		"\2kl\7a\2\2l(\3\2\2\2mn\7k\2\2no\7p\2\2op\7r\2\2pq\7w\2\2qr\7v\2\2r*\3"+
		"\2\2\2st\7>\2\2t,\3\2\2\2uv\7@\2\2v.\3\2\2\2wx\7<\2\2x\60\3\2\2\2yz\7"+
		"K\2\2z{\7p\2\2{|\7v\2\2|\62\3\2\2\2}~\7*\2\2~\177\7+\2\2\177\64\3\2\2"+
		"\2\u0080\u0084\7$\2\2\u0081\u0083\t\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7$\2\2\u0088\66\3\2\2\2\u0089\u0092\7\62\2"+
		"\2\u008a\u008e\4\63;\2\u008b\u008d\4\62;\2\u008c\u008b\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008a\3\2\2\2\u00928\3\2\2\2"+
		"\u0093\u0097\t\3\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3\2\2\2\u0096\u0099"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098:\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\t\5\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\36"+
		"\2\2\u009d<\3\2\2\2\u009e\u009f\13\2\2\2\u009f>\3\2\2\2\7\2\u0084\u008e"+
		"\u0091\u0097\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}