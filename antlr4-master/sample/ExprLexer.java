// Generated from Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADICAO=1, SUBTRACAO=2, MULTI=3, DIVI=4, POW=5, REST_DIVI=6, DIVI_REAL=7, 
		LPARENTESES=8, RPARENTESES=9, COMANDO_MEM=10, COMANDO_RES=11, WS=12, NUMERO_ZERO=13, 
		NUMERO_INTEIRO=14, NUMERO_INTEIRO_NEGATIVO=15, NUMERO_FLOAT=16, NUMERO_FLOAT_NEGATIVO=17, 
		NUMERO_FLOAT_ZERO=18, NUMERO_FLOAT_ZERO_NEGATIVO=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADICAO", "SUBTRACAO", "MULTI", "DIVI", "POW", "REST_DIVI", "DIVI_REAL", 
			"LPARENTESES", "RPARENTESES", "COMANDO_MEM", "COMANDO_RES", "WS", "NUMERO_ZERO", 
			"NUMERO_INTEIRO", "NUMERO_INTEIRO_NEGATIVO", "NUMERO_FLOAT", "NUMERO_FLOAT_NEGATIVO", 
			"NUMERO_FLOAT_ZERO", "NUMERO_FLOAT_ZERO_NEGATIVO"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\6"+
		"\rE\n\r\r\r\16\rF\3\r\3\r\3\16\6\16L\n\16\r\16\16\16M\3\17\3\17\7\17R"+
		"\n\17\f\17\16\17U\13\17\3\20\3\20\3\20\7\20Z\n\20\f\20\16\20]\13\20\3"+
		"\21\6\21`\n\21\r\21\16\21a\3\21\3\21\6\21f\n\21\r\21\16\21g\3\22\3\22"+
		"\6\22l\n\22\r\22\16\22m\3\22\3\22\6\22r\n\22\r\22\16\22s\3\23\6\23w\n"+
		"\23\r\23\16\23x\3\23\3\23\6\23}\n\23\r\23\16\23~\3\24\3\24\6\24\u0083"+
		"\n\24\r\24\16\24\u0084\3\24\3\24\6\24\u0089\n\24\r\24\16\24\u008a\2\2"+
		"\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25\3\2\6\5\2\13\f\17\17\"\"\3\2\62\62\3\2\63;"+
		"\3\2\62;\2\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3"+
		"\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2"+
		"\2\239\3\2\2\2\25;\3\2\2\2\27?\3\2\2\2\31D\3\2\2\2\33K\3\2\2\2\35O\3\2"+
		"\2\2\37V\3\2\2\2!_\3\2\2\2#i\3\2\2\2%v\3\2\2\2\'\u0080\3\2\2\2)*\7-\2"+
		"\2*\4\3\2\2\2+,\7/\2\2,\6\3\2\2\2-.\7,\2\2.\b\3\2\2\2/\60\7\61\2\2\60"+
		"\n\3\2\2\2\61\62\7`\2\2\62\f\3\2\2\2\63\64\7\'\2\2\64\16\3\2\2\2\65\66"+
		"\7~\2\2\66\20\3\2\2\2\678\7*\2\28\22\3\2\2\29:\7+\2\2:\24\3\2\2\2;<\7"+
		"O\2\2<=\7G\2\2=>\7O\2\2>\26\3\2\2\2?@\7T\2\2@A\7G\2\2AB\7U\2\2B\30\3\2"+
		"\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\r"+
		"\2\2I\32\3\2\2\2JL\t\3\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\34"+
		"\3\2\2\2OS\t\4\2\2PR\t\5\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T"+
		"\36\3\2\2\2US\3\2\2\2VW\7/\2\2W[\t\4\2\2XZ\t\5\2\2YX\3\2\2\2Z]\3\2\2\2"+
		"[Y\3\2\2\2[\\\3\2\2\2\\ \3\2\2\2][\3\2\2\2^`\t\5\2\2_^\3\2\2\2`a\3\2\2"+
		"\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2ce\7\60\2\2df\t\4\2\2ed\3\2\2\2fg\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2h\"\3\2\2\2ik\7/\2\2jl\t\5\2\2kj\3\2\2\2lm\3\2"+
		"\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2oq\7\60\2\2pr\t\4\2\2qp\3\2\2\2rs\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2t$\3\2\2\2uw\t\5\2\2vu\3\2\2\2wx\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7\60\2\2{}\t\5\2\2|{\3\2\2\2}~\3\2\2\2~|"+
		"\3\2\2\2~\177\3\2\2\2\177&\3\2\2\2\u0080\u0082\7/\2\2\u0081\u0083\t\5"+
		"\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\60\2\2\u0087\u0089\t"+
		"\5\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b(\3\2\2\2\17\2FMS[agmsx~\u0084\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}