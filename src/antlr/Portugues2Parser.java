// Generated from Portugues2.g4 by ANTLR 4.10.1

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, TEXTO=38, 
		COMENTARIO=39, ID=40, NUM=41, LETRA=42, DIGITO=43, WS=44, ErrorChar=45;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_identificacao = 2, RULE_codigo = 3, 
		RULE_comando = 4, RULE_expressaoarit = 5, RULE_expressaobool = 6, RULE_atribuicao = 7, 
		RULE_entradasaida = 8, RULE_expressaocondicional = 9, RULE_expressaorepeticao = 10, 
		RULE_vouf = 11, RULE_cod = 12, RULE_dec = 13, RULE_tipo = 14, RULE_v = 15, 
		RULE_f = 16, RULE_atr = 17, RULE_ap = 18, RULE_fp = 19, RULE_ac = 20, 
		RULE_fc = 21, RULE_pev = 22, RULE_op_arit = 23, RULE_op_rel = 24, RULE_op_bol = 25, 
		RULE_cond = 26, RULE_condsenao = 27, RULE_rep = 28, RULE_ler = 29, RULE_escrever = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "identificacao", "codigo", "comando", "expressaoarit", 
			"expressaobool", "atribuicao", "entradasaida", "expressaocondicional", 
			"expressaorepeticao", "vouf", "cod", "dec", "tipo", "v", "f", "atr", 
			"ap", "fp", "ac", "fc", "pev", "op_arit", "op_rel", "op_bol", "cond", 
			"condsenao", "rep", "ler", "escrever"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CODIGO'", "'DECLARACOES'", "'int'", "'flutuante'", "'texto'", 
			"'vouf'", "'v'", "'f'", "'=D'", "'('", "')'", "'{'", "'}'", "';'", "'+'", 
			"'-'", "'*'", "'/'", "'//'", "'%'", "'=='", "'<'", "'>'", "'<='", "'>='", 
			"'!='", "'e'", "'ou'", "'xou'", "'nao'", "'se'", "'senao se'", "'senao'", 
			"'para'", "'enquanto'", "'RECEBA'", "'TOMI'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TEXTO", "COMENTARIO", "ID", "NUM", "LETRA", "DIGITO", "WS", 
			"ErrorChar"
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

	public static class ProgramaContext extends ParserRuleContext {
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	 
		public ProgramaContext() { }
		public void copyFrom(ProgramaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NProgramaContext extends ProgramaContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public NProgramaContext(ProgramaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			_localctx = new NProgramaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			declaracoes();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(63);
				codigo();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	 
		public DeclaracoesContext() { }
		public void copyFrom(DeclaracoesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NDeclaracoesContext extends DeclaracoesContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public List<IdentificacaoContext> identificacao() {
			return getRuleContexts(IdentificacaoContext.class);
		}
		public IdentificacaoContext identificacao(int i) {
			return getRuleContext(IdentificacaoContext.class,i);
		}
		public NDeclaracoesContext(DeclaracoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			_localctx = new NDeclaracoesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			dec();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				{
				setState(70);
				identificacao();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class IdentificacaoContext extends ParserRuleContext {
		public IdentificacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificacao; }
	 
		public IdentificacaoContext() { }
		public void copyFrom(IdentificacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NIdentificacaoContext extends IdentificacaoContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(Portugues2Parser.ID, 0); }
		public PevContext pev() {
			return getRuleContext(PevContext.class,0);
		}
		public NIdentificacaoContext(IdentificacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNIdentificacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNIdentificacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNIdentificacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificacaoContext identificacao() throws RecognitionException {
		IdentificacaoContext _localctx = new IdentificacaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identificacao);
		try {
			_localctx = new NIdentificacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			tipo();
			setState(77);
			match(ID);
			setState(78);
			pev();
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

	public static class CodigoContext extends ParserRuleContext {
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
	 
		public CodigoContext() { }
		public void copyFrom(CodigoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NCodigoContext extends CodigoContext {
		public CodContext cod() {
			return getRuleContext(CodContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public NCodigoContext(CodigoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_codigo);
		int _la;
		try {
			_localctx = new NCodigoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			cod();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << TEXTO) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				{
				setState(81);
				comando();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NComandoContext extends ComandoContext {
		public PevContext pev() {
			return getRuleContext(PevContext.class,0);
		}
		public EntradasaidaContext entradasaida() {
			return getRuleContext(EntradasaidaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ExpressaocondicionalContext expressaocondicional() {
			return getRuleContext(ExpressaocondicionalContext.class,0);
		}
		public ExpressaorepeticaoContext expressaorepeticao() {
			return getRuleContext(ExpressaorepeticaoContext.class,0);
		}
		public NComandoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			_localctx = new NComandoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__35:
			case T__36:
			case TEXTO:
			case ID:
			case NUM:
				{
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
				case T__36:
					{
					setState(87);
					entradasaida();
					}
					break;
				case T__6:
				case T__7:
				case TEXTO:
				case ID:
				case NUM:
					{
					setState(88);
					atribuicao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(91);
				pev();
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				{
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__30:
				case T__31:
				case T__32:
					{
					setState(93);
					expressaocondicional();
					}
					break;
				case T__33:
				case T__34:
					{
					setState(94);
					expressaorepeticao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ExpressaoaritContext extends ParserRuleContext {
		public ExpressaoaritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoarit; }
	 
		public ExpressaoaritContext() { }
		public void copyFrom(ExpressaoaritContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NExpressaoAritContext extends ExpressaoaritContext {
		public Op_aritContext op_arit() {
			return getRuleContext(Op_aritContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Portugues2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Portugues2Parser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(Portugues2Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Portugues2Parser.NUM, i);
		}
		public NExpressaoAritContext(ExpressaoaritContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNExpressaoArit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNExpressaoArit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNExpressaoArit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoaritContext expressaoarit() throws RecognitionException {
		ExpressaoaritContext _localctx = new ExpressaoaritContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressaoarit);
		int _la;
		try {
			_localctx = new NExpressaoAritContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(100);
			op_arit();
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
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

	public static class ExpressaoboolContext extends ParserRuleContext {
		public ExpressaoboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaobool; }
	 
		public ExpressaoboolContext() { }
		public void copyFrom(ExpressaoboolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NExpressaoBoolContext extends ExpressaoboolContext {
		public Op_relContext op_rel() {
			return getRuleContext(Op_relContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Portugues2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Portugues2Parser.ID, i);
		}
		public List<VoufContext> vouf() {
			return getRuleContexts(VoufContext.class);
		}
		public VoufContext vouf(int i) {
			return getRuleContext(VoufContext.class,i);
		}
		public List<ExpressaoaritContext> expressaoarit() {
			return getRuleContexts(ExpressaoaritContext.class);
		}
		public ExpressaoaritContext expressaoarit(int i) {
			return getRuleContext(ExpressaoaritContext.class,i);
		}
		public List<TerminalNode> NUM() { return getTokens(Portugues2Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Portugues2Parser.NUM, i);
		}
		public NExpressaoBoolContext(ExpressaoboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNExpressaoBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNExpressaoBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNExpressaoBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoboolContext expressaobool() throws RecognitionException {
		ExpressaoboolContext _localctx = new ExpressaoboolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressaobool);
		try {
			_localctx = new NExpressaoBoolContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(103);
					match(ID);
					}
					break;
				case T__6:
				case T__7:
					{
					setState(104);
					vouf();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(107);
					match(ID);
					}
					break;
				case 2:
					{
					setState(108);
					expressaoarit();
					}
					break;
				case 3:
					{
					setState(109);
					vouf();
					}
					break;
				case 4:
					{
					setState(110);
					match(NUM);
					}
					break;
				}
				setState(113);
				op_rel();
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(114);
					match(ID);
					}
					break;
				case 2:
					{
					setState(115);
					expressaoarit();
					}
					break;
				case 3:
					{
					setState(116);
					vouf();
					}
					break;
				case 4:
					{
					setState(117);
					match(NUM);
					}
					break;
				}
				}
				break;
			}
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NAtribuicaoContext extends AtribuicaoContext {
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public TerminalNode ID() { return getToken(Portugues2Parser.ID, 0); }
		public TerminalNode NUM() { return getToken(Portugues2Parser.NUM, 0); }
		public TerminalNode TEXTO() { return getToken(Portugues2Parser.TEXTO, 0); }
		public ExpressaoaritContext expressaoarit() {
			return getRuleContext(ExpressaoaritContext.class,0);
		}
		public ExpressaoboolContext expressaobool() {
			return getRuleContext(ExpressaoboolContext.class,0);
		}
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public NAtribuicaoContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atribuicao);
		try {
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(122);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(123);
				match(TEXTO);
				}
				break;
			case 3:
				{
				setState(124);
				expressaoarit();
				}
				break;
			case 4:
				{
				setState(125);
				expressaobool();
				}
				break;
			case 5:
				{
				setState(126);
				v();
				}
				break;
			case 6:
				{
				setState(127);
				f();
				}
				break;
			}
			setState(130);
			atr();
			setState(131);
			match(ID);
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

	public static class EntradasaidaContext extends ParserRuleContext {
		public EntradasaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entradasaida; }
	 
		public EntradasaidaContext() { }
		public void copyFrom(EntradasaidaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NEntradaSaidaContext extends EntradasaidaContext {
		public LerContext ler() {
			return getRuleContext(LerContext.class,0);
		}
		public EscreverContext escrever() {
			return getRuleContext(EscreverContext.class,0);
		}
		public TerminalNode ID() { return getToken(Portugues2Parser.ID, 0); }
		public TerminalNode NUM() { return getToken(Portugues2Parser.NUM, 0); }
		public TerminalNode TEXTO() { return getToken(Portugues2Parser.TEXTO, 0); }
		public ExpressaoaritContext expressaoarit() {
			return getRuleContext(ExpressaoaritContext.class,0);
		}
		public ExpressaoboolContext expressaobool() {
			return getRuleContext(ExpressaoboolContext.class,0);
		}
		public NEntradaSaidaContext(EntradasaidaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNEntradaSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNEntradaSaida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNEntradaSaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradasaidaContext entradasaida() throws RecognitionException {
		EntradasaidaContext _localctx = new EntradasaidaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_entradasaida);
		try {
			_localctx = new NEntradaSaidaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				{
				setState(133);
				ler();
				}
				break;
			case T__36:
				{
				setState(134);
				escrever();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(137);
				match(ID);
				}
				break;
			case 2:
				{
				setState(138);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(139);
				match(TEXTO);
				}
				break;
			case 4:
				{
				setState(140);
				expressaoarit();
				}
				break;
			case 5:
				{
				setState(141);
				expressaobool();
				}
				break;
			}
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

	public static class ExpressaocondicionalContext extends ParserRuleContext {
		public ExpressaocondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaocondicional; }
	 
		public ExpressaocondicionalContext() { }
		public void copyFrom(ExpressaocondicionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NExpressaoCondicional2Context extends ExpressaocondicionalContext {
		public CondsenaoContext condsenao() {
			return getRuleContext(CondsenaoContext.class,0);
		}
		public AcContext ac() {
			return getRuleContext(AcContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public FcContext fc() {
			return getRuleContext(FcContext.class,0);
		}
		public NExpressaoCondicional2Context(ExpressaocondicionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNExpressaoCondicional2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNExpressaoCondicional2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNExpressaoCondicional2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NExpressaoRepeticao1Context extends ExpressaocondicionalContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public FpContext fp() {
			return getRuleContext(FpContext.class,0);
		}
		public AcContext ac() {
			return getRuleContext(AcContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public FcContext fc() {
			return getRuleContext(FcContext.class,0);
		}
		public ExpressaoboolContext expressaobool() {
			return getRuleContext(ExpressaoboolContext.class,0);
		}
		public NExpressaoRepeticao1Context(ExpressaocondicionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNExpressaoRepeticao1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNExpressaoRepeticao1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNExpressaoRepeticao1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaocondicionalContext expressaocondicional() throws RecognitionException {
		ExpressaocondicionalContext _localctx = new ExpressaocondicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressaocondicional);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
				_localctx = new NExpressaoRepeticao1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				cond();
				setState(145);
				ap();
				{
				setState(146);
				expressaobool();
				}
				setState(147);
				fp();
				setState(148);
				ac();
				setState(149);
				comando();
				setState(150);
				fc();
				}
				break;
			case T__32:
				_localctx = new NExpressaoCondicional2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				condsenao();
				setState(153);
				ac();
				setState(154);
				comando();
				setState(155);
				fc();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpressaorepeticaoContext extends ParserRuleContext {
		public ExpressaorepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaorepeticao; }
	 
		public ExpressaorepeticaoContext() { }
		public void copyFrom(ExpressaorepeticaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NExpressaoRepeticaoContext extends ExpressaorepeticaoContext {
		public RepContext rep() {
			return getRuleContext(RepContext.class,0);
		}
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public FpContext fp() {
			return getRuleContext(FpContext.class,0);
		}
		public AcContext ac() {
			return getRuleContext(AcContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public FcContext fc() {
			return getRuleContext(FcContext.class,0);
		}
		public ExpressaoboolContext expressaobool() {
			return getRuleContext(ExpressaoboolContext.class,0);
		}
		public NExpressaoRepeticaoContext(ExpressaorepeticaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNExpressaoRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNExpressaoRepeticao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNExpressaoRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaorepeticaoContext expressaorepeticao() throws RecognitionException {
		ExpressaorepeticaoContext _localctx = new ExpressaorepeticaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressaorepeticao);
		try {
			_localctx = new NExpressaoRepeticaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			rep();
			setState(160);
			ap();
			{
			setState(161);
			expressaobool();
			}
			setState(162);
			fp();
			setState(163);
			ac();
			setState(164);
			comando();
			setState(165);
			fc();
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

	public static class VoufContext extends ParserRuleContext {
		public VoufContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vouf; }
	 
		public VoufContext() { }
		public void copyFrom(VoufContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NFContext extends VoufContext {
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public NFContext(VoufContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NVContext extends VoufContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public NVContext(VoufContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterNV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitNV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitNV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoufContext vouf() throws RecognitionException {
		VoufContext _localctx = new VoufContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vouf);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new NFContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				v();
				}
				break;
			case T__7:
				_localctx = new NVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				f();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CodContext extends ParserRuleContext {
		public CodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterCod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitCod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitCod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodContext cod() throws RecognitionException {
		CodContext _localctx = new CodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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

	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__1);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class VContext extends ParserRuleContext {
		public VContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_v);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__6);
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

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_f);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__7);
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

	public static class AtrContext extends ParserRuleContext {
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitAtr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitAtr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__8);
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

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__9);
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

	public static class FpContext extends ParserRuleContext {
		public FpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterFp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitFp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitFp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FpContext fp() throws RecognitionException {
		FpContext _localctx = new FpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__10);
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

	public static class AcContext extends ParserRuleContext {
		public AcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterAc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitAc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitAc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcContext ac() throws RecognitionException {
		AcContext _localctx = new AcContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__11);
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

	public static class FcContext extends ParserRuleContext {
		public FcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterFc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitFc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitFc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FcContext fc() throws RecognitionException {
		FcContext _localctx = new FcContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__12);
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

	public static class PevContext extends ParserRuleContext {
		public PevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pev; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterPev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitPev(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitPev(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PevContext pev() throws RecognitionException {
		PevContext _localctx = new PevContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__13);
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

	public static class Op_aritContext extends ParserRuleContext {
		public Op_aritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_arit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterOp_arit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitOp_arit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitOp_arit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_aritContext op_arit() throws RecognitionException {
		Op_aritContext _localctx = new Op_aritContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_op_arit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Op_relContext extends ParserRuleContext {
		public Op_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterOp_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitOp_rel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitOp_rel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relContext op_rel() throws RecognitionException {
		Op_relContext _localctx = new Op_relContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_op_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Op_bolContext extends ParserRuleContext {
		public Op_bolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_bol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterOp_bol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitOp_bol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitOp_bol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_bolContext op_bol() throws RecognitionException {
		Op_bolContext _localctx = new Op_bolContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_bol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__31) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class CondsenaoContext extends ParserRuleContext {
		public CondsenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condsenao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterCondsenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitCondsenao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitCondsenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondsenaoContext condsenao() throws RecognitionException {
		CondsenaoContext _localctx = new CondsenaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condsenao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__32);
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

	public static class RepContext extends ParserRuleContext {
		public RepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterRep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitRep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitRep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepContext rep() throws RecognitionException {
		RepContext _localctx = new RepContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class LerContext extends ParserRuleContext {
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterLer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitLer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitLer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__35);
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

	public static class EscreverContext extends ParserRuleContext {
		public EscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).enterEscrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Portugues2Listener ) ((Portugues2Listener)listener).exitEscrever(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Portugues2Visitor ) return ((Portugues2Visitor<? extends T>)visitor).visitEscrever(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscreverContext escrever() throws RecognitionException {
		EscreverContext _localctx = new EscreverContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_escrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__36);
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
		"\u0004\u0001-\u00d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0005\u0000A\b\u0000\n\u0000\f\u0000D\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0005\u0001H\b\u0001\n\u0001\f\u0001K\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0005\u0003S\b\u0003\n\u0003\f\u0003V\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004Z\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004`\b\u0004\u0003\u0004b\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006j\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006p\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006w\b"+
		"\u0006\u0003\u0006y\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0081\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u0088\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u008f\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u009e\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0003\u000b\u00aa\b\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0000\u0000\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<\u0000\u0007\u0001\u0000"+
		"()\u0001\u0000\u0003\u0006\u0001\u0000\u000f\u0014\u0001\u0000\u0015\u001a"+
		"\u0001\u0000\u001b\u001e\u0001\u0000\u001f \u0001\u0000\"#\u00cc\u0000"+
		">\u0001\u0000\u0000\u0000\u0002E\u0001\u0000\u0000\u0000\u0004L\u0001"+
		"\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000"+
		"\u0000\nc\u0001\u0000\u0000\u0000\fx\u0001\u0000\u0000\u0000\u000e\u0080"+
		"\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000\u0000\u0000\u0012\u009d"+
		"\u0001\u0000\u0000\u0000\u0014\u009f\u0001\u0000\u0000\u0000\u0016\u00a9"+
		"\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000\u0000\u0000\u001a\u00ad"+
		"\u0001\u0000\u0000\u0000\u001c\u00af\u0001\u0000\u0000\u0000\u001e\u00b1"+
		"\u0001\u0000\u0000\u0000 \u00b3\u0001\u0000\u0000\u0000\"\u00b5\u0001"+
		"\u0000\u0000\u0000$\u00b7\u0001\u0000\u0000\u0000&\u00b9\u0001\u0000\u0000"+
		"\u0000(\u00bb\u0001\u0000\u0000\u0000*\u00bd\u0001\u0000\u0000\u0000,"+
		"\u00bf\u0001\u0000\u0000\u0000.\u00c1\u0001\u0000\u0000\u00000\u00c3\u0001"+
		"\u0000\u0000\u00002\u00c5\u0001\u0000\u0000\u00004\u00c7\u0001\u0000\u0000"+
		"\u00006\u00c9\u0001\u0000\u0000\u00008\u00cb\u0001\u0000\u0000\u0000:"+
		"\u00cd\u0001\u0000\u0000\u0000<\u00cf\u0001\u0000\u0000\u0000>B\u0003"+
		"\u0002\u0001\u0000?A\u0003\u0006\u0003\u0000@?\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000C\u0001\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EI\u0003"+
		"\u001a\r\u0000FH\u0003\u0004\u0002\u0000GF\u0001\u0000\u0000\u0000HK\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"J\u0003\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0003\u001c"+
		"\u000e\u0000MN\u0005(\u0000\u0000NO\u0003,\u0016\u0000O\u0005\u0001\u0000"+
		"\u0000\u0000PT\u0003\u0018\f\u0000QS\u0003\b\u0004\u0000RQ\u0001\u0000"+
		"\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000U\u0007\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000WZ\u0003\u0010\b\u0000XZ\u0003\u000e\u0007\u0000YW\u0001\u0000\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0003,\u0016"+
		"\u0000\\b\u0001\u0000\u0000\u0000]`\u0003\u0012\t\u0000^`\u0003\u0014"+
		"\n\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`b\u0001\u0000"+
		"\u0000\u0000aY\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000b\t\u0001"+
		"\u0000\u0000\u0000cd\u0007\u0000\u0000\u0000de\u0003.\u0017\u0000ef\u0007"+
		"\u0000\u0000\u0000f\u000b\u0001\u0000\u0000\u0000gj\u0005(\u0000\u0000"+
		"hj\u0003\u0016\u000b\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000"+
		"\u0000jy\u0001\u0000\u0000\u0000kp\u0005(\u0000\u0000lp\u0003\n\u0005"+
		"\u0000mp\u0003\u0016\u000b\u0000np\u0005)\u0000\u0000ok\u0001\u0000\u0000"+
		"\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qv\u00030\u0018\u0000rw\u0005(\u0000"+
		"\u0000sw\u0003\n\u0005\u0000tw\u0003\u0016\u000b\u0000uw\u0005)\u0000"+
		"\u0000vr\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vu\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xi\u0001"+
		"\u0000\u0000\u0000xo\u0001\u0000\u0000\u0000y\r\u0001\u0000\u0000\u0000"+
		"z\u0081\u0005)\u0000\u0000{\u0081\u0005&\u0000\u0000|\u0081\u0003\n\u0005"+
		"\u0000}\u0081\u0003\f\u0006\u0000~\u0081\u0003\u001e\u000f\u0000\u007f"+
		"\u0081\u0003 \u0010\u0000\u0080z\u0001\u0000\u0000\u0000\u0080{\u0001"+
		"\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0003\"\u0011\u0000\u0083"+
		"\u0084\u0005(\u0000\u0000\u0084\u000f\u0001\u0000\u0000\u0000\u0085\u0088"+
		"\u0003:\u001d\u0000\u0086\u0088\u0003<\u001e\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008e\u0001\u0000"+
		"\u0000\u0000\u0089\u008f\u0005(\u0000\u0000\u008a\u008f\u0005)\u0000\u0000"+
		"\u008b\u008f\u0005&\u0000\u0000\u008c\u008f\u0003\n\u0005\u0000\u008d"+
		"\u008f\u0003\f\u0006\u0000\u008e\u0089\u0001\u0000\u0000\u0000\u008e\u008a"+
		"\u0001\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0011"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u00034\u001a\u0000\u0091\u0092\u0003"+
		"$\u0012\u0000\u0092\u0093\u0003\f\u0006\u0000\u0093\u0094\u0003&\u0013"+
		"\u0000\u0094\u0095\u0003(\u0014\u0000\u0095\u0096\u0003\b\u0004\u0000"+
		"\u0096\u0097\u0003*\u0015\u0000\u0097\u009e\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u00036\u001b\u0000\u0099\u009a\u0003(\u0014\u0000\u009a\u009b\u0003"+
		"\b\u0004\u0000\u009b\u009c\u0003*\u0015\u0000\u009c\u009e\u0001\u0000"+
		"\u0000\u0000\u009d\u0090\u0001\u0000\u0000\u0000\u009d\u0098\u0001\u0000"+
		"\u0000\u0000\u009e\u0013\u0001\u0000\u0000\u0000\u009f\u00a0\u00038\u001c"+
		"\u0000\u00a0\u00a1\u0003$\u0012\u0000\u00a1\u00a2\u0003\f\u0006\u0000"+
		"\u00a2\u00a3\u0003&\u0013\u0000\u00a3\u00a4\u0003(\u0014\u0000\u00a4\u00a5"+
		"\u0003\b\u0004\u0000\u00a5\u00a6\u0003*\u0015\u0000\u00a6\u0015\u0001"+
		"\u0000\u0000\u0000\u00a7\u00aa\u0003\u001e\u000f\u0000\u00a8\u00aa\u0003"+
		" \u0010\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0001"+
		"\u0000\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0002"+
		"\u0000\u0000\u00ae\u001b\u0001\u0000\u0000\u0000\u00af\u00b0\u0007\u0001"+
		"\u0000\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0007"+
		"\u0000\u0000\u00b2\u001f\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\b\u0000"+
		"\u0000\u00b4!\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\t\u0000\u0000"+
		"\u00b6#\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\n\u0000\u0000\u00b8"+
		"%\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u000b\u0000\u0000\u00ba\'"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\f\u0000\u0000\u00bc)\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005\r\u0000\u0000\u00be+\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\u000e\u0000\u0000\u00c0-\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0007\u0002\u0000\u0000\u00c2/\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0007\u0003\u0000\u0000\u00c41\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0007\u0004\u0000\u0000\u00c63\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0007\u0005\u0000\u0000\u00c85\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"!\u0000\u0000\u00ca7\u0001\u0000\u0000\u0000\u00cb\u00cc\u0007\u0006\u0000"+
		"\u0000\u00cc9\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005$\u0000\u0000\u00ce"+
		";\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005%\u0000\u0000\u00d0=\u0001"+
		"\u0000\u0000\u0000\u000fBITY_aiovx\u0080\u0087\u008e\u009d\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}