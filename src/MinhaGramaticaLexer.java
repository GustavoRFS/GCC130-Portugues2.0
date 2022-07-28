// Generated from .\src\MinhaGramatica.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinhaGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ALG=2, TIPO=3, ATR=4, A=5, AP=6, FP=7, ESC=8, ID=9, NUM=10, OP_ARIT=11, 
		WS=12, ErrorChar=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ALG", "TIPO", "ATR", "A", "AP", "FP", "ESC", "ID", "NUM", "OP_ARIT", 
			"LETRA", "DIGITO", "WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARACOES'", "'ALGORITMO'", null, "'atribuir'", "'a'", "'('", 
			"')'", "'ESCREVA'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ALG", "TIPO", "ATR", "A", "AP", "FP", "ESC", "ID", "NUM", 
			"OP_ARIT", "WS", "ErrorChar"
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


	public MinhaGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MinhaGramatica.g4"; }

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
		"\u0004\u0000\rz\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\bY\b\b\n\b\f\b\\\t\b\u0001\t\u0004\t_\b\t\u000b"+
		"\t\f\t`\u0001\t\u0001\t\u0004\te\b\t\u000b\t\f\tf\u0003\ti\b\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0005\rr\b\r"+
		"\n\r\f\ru\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0000\u0000\u000f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\u0000\u0019\u0000\u001b"+
		"\f\u001d\r\u0001\u0000\u0004\u0003\u0000*+--//\u0002\u0000AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  ~\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000"+
		"\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005<\u0001\u0000\u0000\u0000"+
		"\u0007>\u0001\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000bI\u0001"+
		"\u0000\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000fM\u0001\u0000\u0000"+
		"\u0000\u0011U\u0001\u0000\u0000\u0000\u0013^\u0001\u0000\u0000\u0000\u0015"+
		"j\u0001\u0000\u0000\u0000\u0017l\u0001\u0000\u0000\u0000\u0019n\u0001"+
		"\u0000\u0000\u0000\u001bs\u0001\u0000\u0000\u0000\u001dx\u0001\u0000\u0000"+
		"\u0000\u001f \u0005D\u0000\u0000 !\u0005E\u0000\u0000!\"\u0005C\u0000"+
		"\u0000\"#\u0005L\u0000\u0000#$\u0005A\u0000\u0000$%\u0005R\u0000\u0000"+
		"%&\u0005A\u0000\u0000&\'\u0005C\u0000\u0000\'(\u0005O\u0000\u0000()\u0005"+
		"E\u0000\u0000)*\u0005S\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005"+
		"A\u0000\u0000,-\u0005L\u0000\u0000-.\u0005G\u0000\u0000./\u0005O\u0000"+
		"\u0000/0\u0005R\u0000\u000001\u0005I\u0000\u000012\u0005T\u0000\u0000"+
		"23\u0005M\u0000\u000034\u0005O\u0000\u00004\u0004\u0001\u0000\u0000\u0000"+
		"56\u0005i\u0000\u000067\u0005n\u0000\u00007=\u0005t\u0000\u000089\u0005"+
		"r\u0000\u00009:\u0005e\u0000\u0000:;\u0005a\u0000\u0000;=\u0005l\u0000"+
		"\u0000<5\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000\u0000=\u0006\u0001"+
		"\u0000\u0000\u0000>?\u0005a\u0000\u0000?@\u0005t\u0000\u0000@A\u0005r"+
		"\u0000\u0000AB\u0005i\u0000\u0000BC\u0005b\u0000\u0000CD\u0005u\u0000"+
		"\u0000DE\u0005i\u0000\u0000EF\u0005r\u0000\u0000F\b\u0001\u0000\u0000"+
		"\u0000GH\u0005a\u0000\u0000H\n\u0001\u0000\u0000\u0000IJ\u0005(\u0000"+
		"\u0000J\f\u0001\u0000\u0000\u0000KL\u0005)\u0000\u0000L\u000e\u0001\u0000"+
		"\u0000\u0000MN\u0005E\u0000\u0000NO\u0005S\u0000\u0000OP\u0005C\u0000"+
		"\u0000PQ\u0005R\u0000\u0000QR\u0005E\u0000\u0000RS\u0005V\u0000\u0000"+
		"ST\u0005A\u0000\u0000T\u0010\u0001\u0000\u0000\u0000UZ\u0003\u0017\u000b"+
		"\u0000VY\u0003\u0019\f\u0000WY\u0003\u0017\u000b\u0000XV\u0001\u0000\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0012\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]_\u0003\u0019\f\u0000^]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ah\u0001\u0000\u0000\u0000bd\u0005.\u0000\u0000ce\u0003\u0019"+
		"\f\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hb\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0014\u0001\u0000\u0000"+
		"\u0000jk\u0007\u0000\u0000\u0000k\u0016\u0001\u0000\u0000\u0000lm\u0007"+
		"\u0001\u0000\u0000m\u0018\u0001\u0000\u0000\u0000no\u0007\u0002\u0000"+
		"\u0000o\u001a\u0001\u0000\u0000\u0000pr\u0007\u0003\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vw\u0006\r\u0000\u0000w\u001c\u0001\u0000\u0000\u0000xy\t\u0000"+
		"\u0000\u0000y\u001e\u0001\u0000\u0000\u0000\b\u0000<XZ`fhs\u0001\u0006"+
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