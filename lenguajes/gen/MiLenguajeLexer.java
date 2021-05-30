// Generated from D:/Lenguajes/Lab3/TraductorPSICODER/lenguajes/grammar\MiLenguaje.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, LINE_COMMENT=2, WS=3, TK_MAS=4, TK_MENOS=5, TK_MULT=6, TK_DIV=7, 
		TK_MOD=8, TK_ASIG=9, TK_MENOR=10, TK_MAYOR=11, TK_MENOR_IGUAL=12, TK_MAYOR_IGUAL=13, 
		TK_IGUAL=14, TK_Y=15, TK_O=16, TK_DIF=17, TK_NEG=18, TK_DOSP=19, TK_PYC=20, 
		TK_COMA=21, TK_PUNTO=22, TK_PAR_IZQ=23, TK_PAR_DER=24, TK_COMILLA_SEN=25, 
		TK_COMILLA_DOB=26, FUNCION_PRINCIPAL=27, FIN_PRINCIPAL=28, BOOLEANO=29, 
		CARACTER=30, ENTERO=31, REAL=32, CADENA=33, LEER=34, IMPRIMIR=35, SI=36, 
		ENTONCES=37, FIN_SI=38, SI_NO=39, MIENTRAS=40, HACER=41, FIN_MIENTRAS=42, 
		PARA=43, FIN_PARA=44, SELECCIONAR=45, ENTRE=46, CASO=47, ROMPER=48, DEFECTO=49, 
		FIN_SELECCIONAR=50, ESTRUCTURA=51, FIN_ESTRUCTURA=52, FUNCION=53, RETORNAR=54, 
		FIN_FUNCION=55, FALSO=56, VERDADERO=57, ID=58, TK_ENTERO=59, TK_REAL=60, 
		TK_CADENA=61, TK_CARACTER=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "LINE_COMMENT", "WS", "TK_MAS", "TK_MENOS", "TK_MULT", "TK_DIV", 
			"TK_MOD", "TK_ASIG", "TK_MENOR", "TK_MAYOR", "TK_MENOR_IGUAL", "TK_MAYOR_IGUAL", 
			"TK_IGUAL", "TK_Y", "TK_O", "TK_DIF", "TK_NEG", "TK_DOSP", "TK_PYC", 
			"TK_COMA", "TK_PUNTO", "TK_PAR_IZQ", "TK_PAR_DER", "TK_COMILLA_SEN", 
			"TK_COMILLA_DOB", "FUNCION_PRINCIPAL", "FIN_PRINCIPAL", "BOOLEANO", "CARACTER", 
			"ENTERO", "REAL", "CADENA", "LEER", "IMPRIMIR", "SI", "ENTONCES", "FIN_SI", 
			"SI_NO", "MIENTRAS", "HACER", "FIN_MIENTRAS", "PARA", "FIN_PARA", "SELECCIONAR", 
			"ENTRE", "CASO", "ROMPER", "DEFECTO", "FIN_SELECCIONAR", "ESTRUCTURA", 
			"FIN_ESTRUCTURA", "FUNCION", "RETORNAR", "FIN_FUNCION", "FALSO", "VERDADERO", 
			"ID", "TK_ENTERO", "TK_REAL", "TK_CADENA", "TK_CARACTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'&&'", "'||'", "'!='", "'!'", "':'", 
			"';'", "','", "'.'", "'('", "')'", "'''", "'\"'", "'funcion_principal'", 
			"'fin_principal'", "'booleano'", "'caracter'", "'entero'", "'real'", 
			"'cadena'", "'leer'", "'imprimir'", "'si'", "'entonces'", "'fin_si'", 
			"'si_no'", "'mientras'", "'hacer'", "'fin_mientras'", "'para'", "'fin_para'", 
			"'seleccionar'", "'entre'", "'caso'", "'romper'", "'defecto'", "'fin_seleccionar'", 
			"'estructura'", "'fin_estructura'", "'funcion'", "'retornar'", "'fin_funcion'", 
			"'falso'", "'verdadero'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "LINE_COMMENT", "WS", "TK_MAS", "TK_MENOS", "TK_MULT", 
			"TK_DIV", "TK_MOD", "TK_ASIG", "TK_MENOR", "TK_MAYOR", "TK_MENOR_IGUAL", 
			"TK_MAYOR_IGUAL", "TK_IGUAL", "TK_Y", "TK_O", "TK_DIF", "TK_NEG", "TK_DOSP", 
			"TK_PYC", "TK_COMA", "TK_PUNTO", "TK_PAR_IZQ", "TK_PAR_DER", "TK_COMILLA_SEN", 
			"TK_COMILLA_DOB", "FUNCION_PRINCIPAL", "FIN_PRINCIPAL", "BOOLEANO", "CARACTER", 
			"ENTERO", "REAL", "CADENA", "LEER", "IMPRIMIR", "SI", "ENTONCES", "FIN_SI", 
			"SI_NO", "MIENTRAS", "HACER", "FIN_MIENTRAS", "PARA", "FIN_PARA", "SELECCIONAR", 
			"ENTRE", "CASO", "ROMPER", "DEFECTO", "FIN_SELECCIONAR", "ESTRUCTURA", 
			"FIN_ESTRUCTURA", "FUNCION", "RETORNAR", "FIN_FUNCION", "FALSO", "VERDADERO", 
			"ID", "TK_ENTERO", "TK_REAL", "TK_CADENA", "TK_CARACTER"
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


	public MiLenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u0212\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\7\2\u0084\n\2\f\2\16\2\u0087\13\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0092\n\3\f\3\16\3\u0095\13\3\3\3\3\3"+
		"\3\4\6\4\u009a\n\4\r\4\16\4\u009b\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\7;\u01e9"+
		"\n;\f;\16;\u01ec\13;\3<\3<\5<\u01f0\n<\3<\6<\u01f3\n<\r<\16<\u01f4\3="+
		"\3=\5=\u01f9\n=\3=\6=\u01fc\n=\r=\16=\u01fd\3=\3=\6=\u0202\n=\r=\16=\u0203"+
		"\3>\3>\7>\u0208\n>\f>\16>\u020b\13>\3>\3>\3?\3?\3?\3?\4\u0085\u0209\2"+
		"@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\3\2\7\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62"+
		";C\\aac|\3\2\62;\2\u021b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u008d\3\2\2"+
		"\2\7\u0099\3\2\2\2\t\u009f\3\2\2\2\13\u00a1\3\2\2\2\r\u00a3\3\2\2\2\17"+
		"\u00a5\3\2\2\2\21\u00a7\3\2\2\2\23\u00a9\3\2\2\2\25\u00ab\3\2\2\2\27\u00ad"+
		"\3\2\2\2\31\u00af\3\2\2\2\33\u00b2\3\2\2\2\35\u00b5\3\2\2\2\37\u00b8\3"+
		"\2\2\2!\u00bb\3\2\2\2#\u00be\3\2\2\2%\u00c1\3\2\2\2\'\u00c3\3\2\2\2)\u00c5"+
		"\3\2\2\2+\u00c7\3\2\2\2-\u00c9\3\2\2\2/\u00cb\3\2\2\2\61\u00cd\3\2\2\2"+
		"\63\u00cf\3\2\2\2\65\u00d1\3\2\2\2\67\u00d3\3\2\2\29\u00e5\3\2\2\2;\u00f3"+
		"\3\2\2\2=\u00fc\3\2\2\2?\u0105\3\2\2\2A\u010c\3\2\2\2C\u0111\3\2\2\2E"+
		"\u0118\3\2\2\2G\u011d\3\2\2\2I\u0126\3\2\2\2K\u0129\3\2\2\2M\u0132\3\2"+
		"\2\2O\u0139\3\2\2\2Q\u013f\3\2\2\2S\u0148\3\2\2\2U\u014e\3\2\2\2W\u015b"+
		"\3\2\2\2Y\u0160\3\2\2\2[\u0169\3\2\2\2]\u0175\3\2\2\2_\u017b\3\2\2\2a"+
		"\u0180\3\2\2\2c\u0187\3\2\2\2e\u018f\3\2\2\2g\u019f\3\2\2\2i\u01aa\3\2"+
		"\2\2k\u01b9\3\2\2\2m\u01c1\3\2\2\2o\u01ca\3\2\2\2q\u01d6\3\2\2\2s\u01dc"+
		"\3\2\2\2u\u01e6\3\2\2\2w\u01ef\3\2\2\2y\u01f8\3\2\2\2{\u0205\3\2\2\2}"+
		"\u020e\3\2\2\2\177\u0080\7\61\2\2\u0080\u0081\7,\2\2\u0081\u0085\3\2\2"+
		"\2\u0082\u0084\13\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\7,\2\2\u0089\u008a\7\61\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\b\2\2\2\u008c\4\3\2\2\2\u008d\u008e\7\61\2\2\u008e\u008f\7\61\2"+
		"\2\u008f\u0093\3\2\2\2\u0090\u0092\n\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\b\3\2\2\u0097\6\3\2\2\2\u0098\u009a\t\3\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\4\2\2\u009e\b\3\2\2\2\u009f"+
		"\u00a0\7-\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\7/\2\2\u00a2\f\3\2\2\2\u00a3"+
		"\u00a4\7,\2\2\u00a4\16\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\20\3\2\2\2\u00a7"+
		"\u00a8\7\'\2\2\u00a8\22\3\2\2\2\u00a9\u00aa\7?\2\2\u00aa\24\3\2\2\2\u00ab"+
		"\u00ac\7>\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae\30\3\2\2\2\u00af"+
		"\u00b0\7>\2\2\u00b0\u00b1\7?\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3"+
		"\u00b4\7?\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7?\2\2\u00b6\u00b7\7?\2\2\u00b7"+
		"\36\3\2\2\2\u00b8\u00b9\7(\2\2\u00b9\u00ba\7(\2\2\u00ba \3\2\2\2\u00bb"+
		"\u00bc\7~\2\2\u00bc\u00bd\7~\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7#\2\2\u00bf"+
		"\u00c0\7?\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2&\3\2\2\2\u00c3\u00c4"+
		"\7<\2\2\u00c4(\3\2\2\2\u00c5\u00c6\7=\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7"+
		".\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7\60\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7"+
		"*\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7+\2\2\u00ce\62\3\2\2\2\u00cf\u00d0"+
		"\7)\2\2\u00d0\64\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2\66\3\2\2\2\u00d3\u00d4"+
		"\7h\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7e\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7a\2\2"+
		"\u00db\u00dc\7r\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7k\2\2\u00de\u00df"+
		"\7p\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7r\2\2\u00e2"+
		"\u00e3\7c\2\2\u00e3\u00e4\7n\2\2\u00e48\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6"+
		"\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7a\2\2\u00e9\u00ea\7r\2\2"+
		"\u00ea\u00eb\7t\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee"+
		"\7e\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7c\2\2\u00f1"+
		"\u00f2\7n\2\2\u00f2:\3\2\2\2\u00f3\u00f4\7d\2\2\u00f4\u00f5\7q\2\2\u00f5"+
		"\u00f6\7q\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7c\2\2"+
		"\u00f9\u00fa\7p\2\2\u00fa\u00fb\7q\2\2\u00fb<\3\2\2\2\u00fc\u00fd\7e\2"+
		"\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7c\2\2\u0100\u0101"+
		"\7e\2\2\u0101\u0102\7v\2\2\u0102\u0103\7g\2\2\u0103\u0104\7t\2\2\u0104"+
		">\3\2\2\2\u0105\u0106\7g\2\2\u0106\u0107\7p\2\2\u0107\u0108\7v\2\2\u0108"+
		"\u0109\7g\2\2\u0109\u010a\7t\2\2\u010a\u010b\7q\2\2\u010b@\3\2\2\2\u010c"+
		"\u010d\7t\2\2\u010d\u010e\7g\2\2\u010e\u010f\7c\2\2\u010f\u0110\7n\2\2"+
		"\u0110B\3\2\2\2\u0111\u0112\7e\2\2\u0112\u0113\7c\2\2\u0113\u0114\7f\2"+
		"\2\u0114\u0115\7g\2\2\u0115\u0116\7p\2\2\u0116\u0117\7c\2\2\u0117D\3\2"+
		"\2\2\u0118\u0119\7n\2\2\u0119\u011a\7g\2\2\u011a\u011b\7g\2\2\u011b\u011c"+
		"\7t\2\2\u011cF\3\2\2\2\u011d\u011e\7k\2\2\u011e\u011f\7o\2\2\u011f\u0120"+
		"\7r\2\2\u0120\u0121\7t\2\2\u0121\u0122\7k\2\2\u0122\u0123\7o\2\2\u0123"+
		"\u0124\7k\2\2\u0124\u0125\7t\2\2\u0125H\3\2\2\2\u0126\u0127\7u\2\2\u0127"+
		"\u0128\7k\2\2\u0128J\3\2\2\2\u0129\u012a\7g\2\2\u012a\u012b\7p\2\2\u012b"+
		"\u012c\7v\2\2\u012c\u012d\7q\2\2\u012d\u012e\7p\2\2\u012e\u012f\7e\2\2"+
		"\u012f\u0130\7g\2\2\u0130\u0131\7u\2\2\u0131L\3\2\2\2\u0132\u0133\7h\2"+
		"\2\u0133\u0134\7k\2\2\u0134\u0135\7p\2\2\u0135\u0136\7a\2\2\u0136\u0137"+
		"\7u\2\2\u0137\u0138\7k\2\2\u0138N\3\2\2\2\u0139\u013a\7u\2\2\u013a\u013b"+
		"\7k\2\2\u013b\u013c\7a\2\2\u013c\u013d\7p\2\2\u013d\u013e\7q\2\2\u013e"+
		"P\3\2\2\2\u013f\u0140\7o\2\2\u0140\u0141\7k\2\2\u0141\u0142\7g\2\2\u0142"+
		"\u0143\7p\2\2\u0143\u0144\7v\2\2\u0144\u0145\7t\2\2\u0145\u0146\7c\2\2"+
		"\u0146\u0147\7u\2\2\u0147R\3\2\2\2\u0148\u0149\7j\2\2\u0149\u014a\7c\2"+
		"\2\u014a\u014b\7e\2\2\u014b\u014c\7g\2\2\u014c\u014d\7t\2\2\u014dT\3\2"+
		"\2\2\u014e\u014f\7h\2\2\u014f\u0150\7k\2\2\u0150\u0151\7p\2\2\u0151\u0152"+
		"\7a\2\2\u0152\u0153\7o\2\2\u0153\u0154\7k\2\2\u0154\u0155\7g\2\2\u0155"+
		"\u0156\7p\2\2\u0156\u0157\7v\2\2\u0157\u0158\7t\2\2\u0158\u0159\7c\2\2"+
		"\u0159\u015a\7u\2\2\u015aV\3\2\2\2\u015b\u015c\7r\2\2\u015c\u015d\7c\2"+
		"\2\u015d\u015e\7t\2\2\u015e\u015f\7c\2\2\u015fX\3\2\2\2\u0160\u0161\7"+
		"h\2\2\u0161\u0162\7k\2\2\u0162\u0163\7p\2\2\u0163\u0164\7a\2\2\u0164\u0165"+
		"\7r\2\2\u0165\u0166\7c\2\2\u0166\u0167\7t\2\2\u0167\u0168\7c\2\2\u0168"+
		"Z\3\2\2\2\u0169\u016a\7u\2\2\u016a\u016b\7g\2\2\u016b\u016c\7n\2\2\u016c"+
		"\u016d\7g\2\2\u016d\u016e\7e\2\2\u016e\u016f\7e\2\2\u016f\u0170\7k\2\2"+
		"\u0170\u0171\7q\2\2\u0171\u0172\7p\2\2\u0172\u0173\7c\2\2\u0173\u0174"+
		"\7t\2\2\u0174\\\3\2\2\2\u0175\u0176\7g\2\2\u0176\u0177\7p\2\2\u0177\u0178"+
		"\7v\2\2\u0178\u0179\7t\2\2\u0179\u017a\7g\2\2\u017a^\3\2\2\2\u017b\u017c"+
		"\7e\2\2\u017c\u017d\7c\2\2\u017d\u017e\7u\2\2\u017e\u017f\7q\2\2\u017f"+
		"`\3\2\2\2\u0180\u0181\7t\2\2\u0181\u0182\7q\2\2\u0182\u0183\7o\2\2\u0183"+
		"\u0184\7r\2\2\u0184\u0185\7g\2\2\u0185\u0186\7t\2\2\u0186b\3\2\2\2\u0187"+
		"\u0188\7f\2\2\u0188\u0189\7g\2\2\u0189\u018a\7h\2\2\u018a\u018b\7g\2\2"+
		"\u018b\u018c\7e\2\2\u018c\u018d\7v\2\2\u018d\u018e\7q\2\2\u018ed\3\2\2"+
		"\2\u018f\u0190\7h\2\2\u0190\u0191\7k\2\2\u0191\u0192\7p\2\2\u0192\u0193"+
		"\7a\2\2\u0193\u0194\7u\2\2\u0194\u0195\7g\2\2\u0195\u0196\7n\2\2\u0196"+
		"\u0197\7g\2\2\u0197\u0198\7e\2\2\u0198\u0199\7e\2\2\u0199\u019a\7k\2\2"+
		"\u019a\u019b\7q\2\2\u019b\u019c\7p\2\2\u019c\u019d\7c\2\2\u019d\u019e"+
		"\7t\2\2\u019ef\3\2\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7u\2\2\u01a1\u01a2"+
		"\7v\2\2\u01a2\u01a3\7t\2\2\u01a3\u01a4\7w\2\2\u01a4\u01a5\7e\2\2\u01a5"+
		"\u01a6\7v\2\2\u01a6\u01a7\7w\2\2\u01a7\u01a8\7t\2\2\u01a8\u01a9\7c\2\2"+
		"\u01a9h\3\2\2\2\u01aa\u01ab\7h\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad\7p\2"+
		"\2\u01ad\u01ae\7a\2\2\u01ae\u01af\7g\2\2\u01af\u01b0\7u\2\2\u01b0\u01b1"+
		"\7v\2\2\u01b1\u01b2\7t\2\2\u01b2\u01b3\7w\2\2\u01b3\u01b4\7e\2\2\u01b4"+
		"\u01b5\7v\2\2\u01b5\u01b6\7w\2\2\u01b6\u01b7\7t\2\2\u01b7\u01b8\7c\2\2"+
		"\u01b8j\3\2\2\2\u01b9\u01ba\7h\2\2\u01ba\u01bb\7w\2\2\u01bb\u01bc\7p\2"+
		"\2\u01bc\u01bd\7e\2\2\u01bd\u01be\7k\2\2\u01be\u01bf\7q\2\2\u01bf\u01c0"+
		"\7p\2\2\u01c0l\3\2\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4"+
		"\7v\2\2\u01c4\u01c5\7q\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c7\7p\2\2\u01c7"+
		"\u01c8\7c\2\2\u01c8\u01c9\7t\2\2\u01c9n\3\2\2\2\u01ca\u01cb\7h\2\2\u01cb"+
		"\u01cc\7k\2\2\u01cc\u01cd\7p\2\2\u01cd\u01ce\7a\2\2\u01ce\u01cf\7h\2\2"+
		"\u01cf\u01d0\7w\2\2\u01d0\u01d1\7p\2\2\u01d1\u01d2\7e\2\2\u01d2\u01d3"+
		"\7k\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7p\2\2\u01d5p\3\2\2\2\u01d6\u01d7"+
		"\7h\2\2\u01d7\u01d8\7c\2\2\u01d8\u01d9\7n\2\2\u01d9\u01da\7u\2\2\u01da"+
		"\u01db\7q\2\2\u01dbr\3\2\2\2\u01dc\u01dd\7x\2\2\u01dd\u01de\7g\2\2\u01de"+
		"\u01df\7t\2\2\u01df\u01e0\7f\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7f\2\2"+
		"\u01e2\u01e3\7g\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5\7q\2\2\u01e5t\3\2\2"+
		"\2\u01e6\u01ea\t\4\2\2\u01e7\u01e9\t\5\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec"+
		"\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ebv\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01f0\7/\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01f3\t\6\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5x\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f9\7/\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01fc\t\6\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\5-\27\2\u0200\u0202\t\6\2\2\u0201"+
		"\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204z\3\2\2\2\u0205\u0209\7$\2\2\u0206\u0208\13\2\2\2\u0207\u0206"+
		"\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7$\2\2\u020d|\3\2\2\2\u020e"+
		"\u020f\7)\2\2\u020f\u0210\t\4\2\2\u0210\u0211\7)\2\2\u0211~\3\2\2\2\r"+
		"\2\u0085\u0093\u009b\u01ea\u01ef\u01f4\u01f8\u01fd\u0203\u0209\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}