// Generated from Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADICAO=1, SUBTRACAO=2, MULTI=3, DIVI=4, POW=5, REST_DIVI=6, DIVI_REAL=7, 
		LPARENTESES=8, RPARENTESES=9, COMANDO_MEM=10, COMANDO_RES=11, WS=12, NUMERO_ZERO=13, 
		NUMERO_INTEIRO=14, NUMERO_INTEIRO_NEGATIVO=15, NUMERO_FLOAT=16, NUMERO_FLOAT_NEGATIVO=17, 
		NUMERO_FLOAT_ZERO=18, NUMERO_FLOAT_ZERO_NEGATIVO=19;
	public static final int
		RULE_prog = 0, RULE_linha = 1, RULE_expressao = 2, RULE_operador = 3, 
		RULE_divisoes_inteiros = 4, RULE_potencia = 5, RULE_numero = 6, RULE_numeros_inteiros = 7, 
		RULE_numeros_floats = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "linha", "expressao", "operador", "divisoes_inteiros", "potencia", 
			"numero", "numeros_inteiros", "numeros_floats"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'|'", "'('", "')'", 
			"'MEM'", "'RES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADICAO", "SUBTRACAO", "MULTI", "DIVI", "POW", "REST_DIVI", "DIVI_REAL", 
			"LPARENTESES", "RPARENTESES", "COMANDO_MEM", "COMANDO_RES", "WS", "NUMERO_ZERO", 
			"NUMERO_INTEIRO", "NUMERO_INTEIRO_NEGATIVO", "NUMERO_FLOAT", "NUMERO_FLOAT_NEGATIVO", 
			"NUMERO_FLOAT_ZERO", "NUMERO_FLOAT_ZERO_NEGATIVO"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<LinhaContext> linha() {
			return getRuleContexts(LinhaContext.class);
		}
		public LinhaContext linha(int i) {
			return getRuleContext(LinhaContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPARENTESES) | (1L << COMANDO_MEM) | (1L << NUMERO_ZERO) | (1L << NUMERO_INTEIRO) | (1L << NUMERO_INTEIRO_NEGATIVO) | (1L << NUMERO_FLOAT) | (1L << NUMERO_FLOAT_NEGATIVO) | (1L << NUMERO_FLOAT_ZERO) | (1L << NUMERO_FLOAT_ZERO_NEGATIVO))) != 0)) {
				{
				{
				setState(18);
				linha();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
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

	public static class LinhaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public LinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLinha(this);
		}
	}

	public final LinhaContext linha() throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			expressao(0);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode NUMERO_INTEIRO() { return getToken(ExprParser.NUMERO_INTEIRO, 0); }
		public TerminalNode COMANDO_RES() { return getToken(ExprParser.COMANDO_RES, 0); }
		public TerminalNode LPARENTESES() { return getToken(ExprParser.LPARENTESES, 0); }
		public List<Numeros_inteirosContext> numeros_inteiros() {
			return getRuleContexts(Numeros_inteirosContext.class);
		}
		public Numeros_inteirosContext numeros_inteiros(int i) {
			return getRuleContext(Numeros_inteirosContext.class,i);
		}
		public Divisoes_inteirosContext divisoes_inteiros() {
			return getRuleContext(Divisoes_inteirosContext.class,0);
		}
		public TerminalNode RPARENTESES() { return getToken(ExprParser.RPARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public TerminalNode COMANDO_MEM() { return getToken(ExprParser.COMANDO_MEM, 0); }
		public List<Numeros_floatsContext> numeros_floats() {
			return getRuleContexts(Numeros_floatsContext.class);
		}
		public Numeros_floatsContext numeros_floats(int i) {
			return getRuleContext(Numeros_floatsContext.class,i);
		}
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(29);
				numero();
				}
				break;
			case 2:
				{
				setState(30);
				match(NUMERO_INTEIRO);
				setState(31);
				match(COMANDO_RES);
				}
				break;
			case 3:
				{
				setState(32);
				match(LPARENTESES);
				setState(33);
				numeros_inteiros();
				setState(34);
				numeros_inteiros();
				setState(35);
				divisoes_inteiros();
				setState(36);
				match(RPARENTESES);
				}
				break;
			case 4:
				{
				setState(38);
				numeros_inteiros();
				setState(39);
				numeros_inteiros();
				setState(40);
				divisoes_inteiros();
				}
				break;
			case 5:
				{
				setState(42);
				match(LPARENTESES);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPARENTESES) | (1L << COMANDO_MEM) | (1L << NUMERO_ZERO) | (1L << NUMERO_INTEIRO) | (1L << NUMERO_INTEIRO_NEGATIVO) | (1L << NUMERO_FLOAT) | (1L << NUMERO_FLOAT_NEGATIVO) | (1L << NUMERO_FLOAT_ZERO) | (1L << NUMERO_FLOAT_ZERO_NEGATIVO))) != 0)) {
					{
					{
					setState(43);
					expressao(0);
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(RPARENTESES);
				}
				break;
			case 6:
				{
				setState(50);
				match(LPARENTESES);
				setState(51);
				expressao(0);
				setState(52);
				operador();
				setState(53);
				match(RPARENTESES);
				}
				break;
			case 7:
				{
				setState(55);
				match(LPARENTESES);
				setState(56);
				expressao(0);
				setState(57);
				divisoes_inteiros();
				setState(58);
				match(RPARENTESES);
				}
				break;
			case 8:
				{
				setState(60);
				match(COMANDO_MEM);
				}
				break;
			case 9:
				{
				setState(61);
				match(COMANDO_MEM);
				setState(62);
				expressao(0);
				setState(63);
				operador();
				}
				break;
			case 10:
				{
				setState(65);
				numeros_floats();
				setState(66);
				numeros_floats();
				setState(67);
				operador();
				}
				break;
			case 11:
				{
				setState(69);
				match(LPARENTESES);
				setState(70);
				match(COMANDO_RES);
				setState(71);
				expressao(0);
				setState(72);
				operador();
				setState(73);
				match(RPARENTESES);
				}
				break;
			case 12:
				{
				setState(75);
				match(LPARENTESES);
				setState(76);
				expressao(0);
				setState(77);
				match(COMANDO_RES);
				setState(78);
				operador();
				setState(79);
				match(RPARENTESES);
				}
				break;
			case 13:
				{
				setState(81);
				match(LPARENTESES);
				setState(82);
				match(COMANDO_MEM);
				setState(83);
				match(COMANDO_RES);
				setState(84);
				match(RPARENTESES);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(87);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(88);
						expressao(0);
						setState(89);
						operador();
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(91);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(92);
						operador();
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(93);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(94);
						divisoes_inteiros();
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(95);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(96);
						expressao(0);
						setState(97);
						operador();
						}
						break;
					case 5:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(99);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(100);
						match(COMANDO_MEM);
						}
						break;
					case 6:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(101);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(102);
						numeros_inteiros();
						setState(103);
						potencia();
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode ADICAO() { return getToken(ExprParser.ADICAO, 0); }
		public TerminalNode SUBTRACAO() { return getToken(ExprParser.SUBTRACAO, 0); }
		public TerminalNode MULTI() { return getToken(ExprParser.MULTI, 0); }
		public TerminalNode DIVI_REAL() { return getToken(ExprParser.DIVI_REAL, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADICAO) | (1L << SUBTRACAO) | (1L << MULTI) | (1L << DIVI_REAL))) != 0)) ) {
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

	public static class Divisoes_inteirosContext extends ParserRuleContext {
		public TerminalNode DIVI() { return getToken(ExprParser.DIVI, 0); }
		public TerminalNode REST_DIVI() { return getToken(ExprParser.REST_DIVI, 0); }
		public Divisoes_inteirosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisoes_inteiros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDivisoes_inteiros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDivisoes_inteiros(this);
		}
	}

	public final Divisoes_inteirosContext divisoes_inteiros() throws RecognitionException {
		Divisoes_inteirosContext _localctx = new Divisoes_inteirosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_divisoes_inteiros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==DIVI || _la==REST_DIVI) ) {
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

	public static class PotenciaContext extends ParserRuleContext {
		public TerminalNode POW() { return getToken(ExprParser.POW, 0); }
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPotencia(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(POW);
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUMERO_INTEIRO() { return getToken(ExprParser.NUMERO_INTEIRO, 0); }
		public TerminalNode NUMERO_INTEIRO_NEGATIVO() { return getToken(ExprParser.NUMERO_INTEIRO_NEGATIVO, 0); }
		public TerminalNode NUMERO_FLOAT() { return getToken(ExprParser.NUMERO_FLOAT, 0); }
		public TerminalNode NUMERO_FLOAT_NEGATIVO() { return getToken(ExprParser.NUMERO_FLOAT_NEGATIVO, 0); }
		public TerminalNode NUMERO_ZERO() { return getToken(ExprParser.NUMERO_ZERO, 0); }
		public TerminalNode NUMERO_FLOAT_ZERO() { return getToken(ExprParser.NUMERO_FLOAT_ZERO, 0); }
		public TerminalNode NUMERO_FLOAT_ZERO_NEGATIVO() { return getToken(ExprParser.NUMERO_FLOAT_ZERO_NEGATIVO, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO_ZERO) | (1L << NUMERO_INTEIRO) | (1L << NUMERO_INTEIRO_NEGATIVO) | (1L << NUMERO_FLOAT) | (1L << NUMERO_FLOAT_NEGATIVO) | (1L << NUMERO_FLOAT_ZERO) | (1L << NUMERO_FLOAT_ZERO_NEGATIVO))) != 0)) ) {
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

	public static class Numeros_inteirosContext extends ParserRuleContext {
		public TerminalNode NUMERO_INTEIRO() { return getToken(ExprParser.NUMERO_INTEIRO, 0); }
		public TerminalNode NUMERO_INTEIRO_NEGATIVO() { return getToken(ExprParser.NUMERO_INTEIRO_NEGATIVO, 0); }
		public Numeros_inteirosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeros_inteiros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumeros_inteiros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumeros_inteiros(this);
		}
	}

	public final Numeros_inteirosContext numeros_inteiros() throws RecognitionException {
		Numeros_inteirosContext _localctx = new Numeros_inteirosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numeros_inteiros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==NUMERO_INTEIRO || _la==NUMERO_INTEIRO_NEGATIVO) ) {
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

	public static class Numeros_floatsContext extends ParserRuleContext {
		public TerminalNode NUMERO_FLOAT() { return getToken(ExprParser.NUMERO_FLOAT, 0); }
		public TerminalNode NUMERO_FLOAT_NEGATIVO() { return getToken(ExprParser.NUMERO_FLOAT_NEGATIVO, 0); }
		public TerminalNode NUMERO_FLOAT_ZERO() { return getToken(ExprParser.NUMERO_FLOAT_ZERO, 0); }
		public TerminalNode NUMERO_FLOAT_ZERO_NEGATIVO() { return getToken(ExprParser.NUMERO_FLOAT_ZERO_NEGATIVO, 0); }
		public Numeros_floatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeros_floats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumeros_floats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumeros_floats(this);
		}
	}

	public final Numeros_floatsContext numeros_floats() throws RecognitionException {
		Numeros_floatsContext _localctx = new Numeros_floatsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numeros_floats);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO_FLOAT) | (1L << NUMERO_FLOAT_NEGATIVO) | (1L << NUMERO_FLOAT_ZERO) | (1L << NUMERO_FLOAT_ZERO_NEGATIVO))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4X\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4l\n\4\f\4\16\4o\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\2\3\6\13\2\4\6\b\n\f\16\20\22\2\7\4\2\3\5\t\t\4\2\6\6\b\b\3"+
		"\2\17\25\3\2\20\21\3\2\22\25\2\u0087\2\27\3\2\2\2\4\34\3\2\2\2\6W\3\2"+
		"\2\2\bp\3\2\2\2\nr\3\2\2\2\ft\3\2\2\2\16v\3\2\2\2\20x\3\2\2\2\22z\3\2"+
		"\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2"+
		"\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34\35\5\6"+
		"\4\2\35\5\3\2\2\2\36\37\b\4\1\2\37X\5\16\b\2 !\7\20\2\2!X\7\r\2\2\"#\7"+
		"\n\2\2#$\5\20\t\2$%\5\20\t\2%&\5\n\6\2&\'\7\13\2\2\'X\3\2\2\2()\5\20\t"+
		"\2)*\5\20\t\2*+\5\n\6\2+X\3\2\2\2,\60\7\n\2\2-/\5\6\4\2.-\3\2\2\2/\62"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63X\7\13"+
		"\2\2\64\65\7\n\2\2\65\66\5\6\4\2\66\67\5\b\5\2\678\7\13\2\28X\3\2\2\2"+
		"9:\7\n\2\2:;\5\6\4\2;<\5\n\6\2<=\7\13\2\2=X\3\2\2\2>X\7\f\2\2?@\7\f\2"+
		"\2@A\5\6\4\2AB\5\b\5\2BX\3\2\2\2CD\5\22\n\2DE\5\22\n\2EF\5\b\5\2FX\3\2"+
		"\2\2GH\7\n\2\2HI\7\r\2\2IJ\5\6\4\2JK\5\b\5\2KL\7\13\2\2LX\3\2\2\2MN\7"+
		"\n\2\2NO\5\6\4\2OP\7\r\2\2PQ\5\b\5\2QR\7\13\2\2RX\3\2\2\2ST\7\n\2\2TU"+
		"\7\f\2\2UV\7\r\2\2VX\7\13\2\2W\36\3\2\2\2W \3\2\2\2W\"\3\2\2\2W(\3\2\2"+
		"\2W,\3\2\2\2W\64\3\2\2\2W9\3\2\2\2W>\3\2\2\2W?\3\2\2\2WC\3\2\2\2WG\3\2"+
		"\2\2WM\3\2\2\2WS\3\2\2\2Xm\3\2\2\2YZ\f\24\2\2Z[\5\6\4\2[\\\5\b\5\2\\l"+
		"\3\2\2\2]^\f\16\2\2^l\5\b\5\2_`\f\f\2\2`l\5\n\6\2ab\f\13\2\2bc\5\6\4\2"+
		"cd\5\b\5\2dl\3\2\2\2ef\f\t\2\2fl\7\f\2\2gh\f\7\2\2hi\5\20\t\2ij\5\f\7"+
		"\2jl\3\2\2\2kY\3\2\2\2k]\3\2\2\2k_\3\2\2\2ka\3\2\2\2ke\3\2\2\2kg\3\2\2"+
		"\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\7\3\2\2\2om\3\2\2\2pq\t\2\2\2q\t\3\2"+
		"\2\2rs\t\3\2\2s\13\3\2\2\2tu\7\7\2\2u\r\3\2\2\2vw\t\4\2\2w\17\3\2\2\2"+
		"xy\t\5\2\2y\21\3\2\2\2z{\t\6\2\2{\23\3\2\2\2\7\27\60Wkm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}