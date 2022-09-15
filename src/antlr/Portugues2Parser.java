// Generated from src/antlr/Portugues2.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Portugues2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PROGRAMA=2, DECLARACOES=3, IDENTIFICACAO=4, CODIGO=5, COMANDO=6, 
		EXPRESSAOARIT=7, EXPRESSAOBOOL=8, ATRIBUICAO=9, ENTRADASAIDA=10, EXPRESSAOCONDICIONAL=11, 
		EXPRESSAOREPETICAO=12, VOUF=13, COD=14, DEC=15, TIPO=16, V=17, F=18, TEXTO=19, 
		ATR=20, AP=21, FP=22, AC=23, FC=24, PEV=25, OP_ARIT=26, OP_REL=27, OP_BOL=28, 
		COND=29, CONDSENAO=30, REP=31, LER=32, ESCREVER=33, COMENTARIO=34, ID=35, 
		NUM=36, WS=37, ErrorChar=38;
	public static final int
		RULE_x = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"x"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", null, null, null, null, null, null, null, null, null, null, 
			null, null, "'CODIGO'", "'DECLARACOES'", null, "'v'", "'f'", null, "'=D'", 
			"'('", "')'", "'{'", "'}'", "';'", null, null, null, null, "'senao'", 
			null, "'RECEBA'", "'TOMI'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PROGRAMA", "DECLARACOES", "IDENTIFICACAO", "CODIGO", "COMANDO", 
			"EXPRESSAOARIT", "EXPRESSAOBOOL", "ATRIBUICAO", "ENTRADASAIDA", "EXPRESSAOCONDICIONAL", 
			"EXPRESSAOREPETICAO", "VOUF", "COD", "DEC", "TIPO", "V", "F", "TEXTO", 
			"ATR", "AP", "FP", "AC", "FC", "PEV", "OP_ARIT", "OP_REL", "OP_BOL", 
			"COND", "CONDSENAO", "REP", "LER", "ESCREVER", "COMENTARIO", "ID", "NUM", 
			"WS", "ErrorChar"
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
	public String getGrammarFileName() { return "Portugues2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Portugues2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class XContext extends ParserRuleContext {
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitX(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(T__0);
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

	public static final String _serializedATN =
		"\u0004\u0001&\u0005\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0002\u0001\u0000"+
		"\u0000\u0000\u0002\u0003\u0005\u0001\u0000\u0000\u0003\u0001\u0001\u0000"+
		"\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}