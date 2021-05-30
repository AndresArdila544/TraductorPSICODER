// Generated from D:/Lenguajes/Lab3/TraductorPSICODER/lenguajes/grammar\MiLenguaje.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_funcandstruct = 1, RULE_declarearguments = 2, RULE_declareargumentslist = 3, 
		RULE_mainfunction = 4, RULE_type = 5, RULE_standardtype = 6, RULE_funccontent = 7, 
		RULE_structcontent = 8, RULE_expression = 9, RULE_term = 10, RULE_value = 11, 
		RULE_argumentlist = 12, RULE_binaryoperator = 13, RULE_unaryoperator = 14, 
		RULE_declarationlist = 15, RULE_instructionlist = 16, RULE_instruction = 17, 
		RULE_conditional = 18, RULE_whilePSI = 19, RULE_forPSI = 20, RULE_dowhile = 21, 
		RULE_switchPSI = 22, RULE_caselist = 23, RULE_expressionlist = 24, RULE_structurelist = 25, 
		RULE_stinstructionlist = 26, RULE_fninstructionlist = 27, RULE_ifinstructionlist = 28, 
		RULE_whinstructionlist = 29, RULE_frinstructionlist = 30, RULE_dwinstructionlist = 31, 
		RULE_swinstructionlist = 32, RULE_dwinstruction = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "funcandstruct", "declarearguments", "declareargumentslist", 
			"mainfunction", "type", "standardtype", "funccontent", "structcontent", 
			"expression", "term", "value", "argumentlist", "binaryoperator", "unaryoperator", 
			"declarationlist", "instructionlist", "instruction", "conditional", "whilePSI", 
			"forPSI", "dowhile", "switchPSI", "caselist", "expressionlist", "structurelist", 
			"stinstructionlist", "fninstructionlist", "ifinstructionlist", "whinstructionlist", 
			"frinstructionlist", "dwinstructionlist", "swinstructionlist", "dwinstruction"
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

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<FuncandstructContext> funcandstruct() {
			return getRuleContexts(FuncandstructContext.class);
		}
		public FuncandstructContext funcandstruct(int i) {
			return getRuleContext(FuncandstructContext.class,i);
		}
		public MainfunctionContext mainfunction() {
			return getRuleContext(MainfunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiLenguajeParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			funcandstruct();
			setState(69);
			mainfunction();
			setState(70);
			funcandstruct();
			setState(71);
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

	public static class FuncandstructContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(MiLenguajeParser.FUNCION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(MiLenguajeParser.TK_PAR_IZQ, 0); }
		public DeclareargumentsContext declarearguments() {
			return getRuleContext(DeclareargumentsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(MiLenguajeParser.TK_PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(MiLenguajeParser.HACER, 0); }
		public FunccontentContext funccontent() {
			return getRuleContext(FunccontentContext.class,0);
		}
		public TerminalNode FIN_FUNCION() { return getToken(MiLenguajeParser.FIN_FUNCION, 0); }
		public FuncandstructContext funcandstruct() {
			return getRuleContext(FuncandstructContext.class,0);
		}
		public TerminalNode ESTRUCTURA() { return getToken(MiLenguajeParser.ESTRUCTURA, 0); }
		public StructcontentContext structcontent() {
			return getRuleContext(StructcontentContext.class,0);
		}
		public TerminalNode FIN_ESTRUCTURA() { return getToken(MiLenguajeParser.FIN_ESTRUCTURA, 0); }
		public FuncandstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcandstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFuncandstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFuncandstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFuncandstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncandstructContext funcandstruct() throws RecognitionException {
		FuncandstructContext _localctx = new FuncandstructContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcandstruct);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(FUNCION);
				setState(74);
				type();
				setState(75);
				match(ID);
				setState(76);
				match(TK_PAR_IZQ);
				setState(77);
				declarearguments();
				setState(78);
				match(TK_PAR_DER);
				setState(79);
				match(HACER);
				setState(80);
				funccontent();
				setState(81);
				match(FIN_FUNCION);
				setState(82);
				funcandstruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(FUNCION);
				setState(85);
				type();
				setState(86);
				match(ID);
				setState(87);
				match(TK_PAR_IZQ);
				setState(88);
				match(TK_PAR_DER);
				setState(89);
				match(HACER);
				setState(90);
				funccontent();
				setState(91);
				match(FIN_FUNCION);
				setState(92);
				funcandstruct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(ESTRUCTURA);
				setState(95);
				match(ID);
				setState(96);
				structcontent();
				setState(97);
				match(FIN_ESTRUCTURA);
				setState(98);
				funcandstruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
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

	public static class DeclareargumentsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public DeclareargumentslistContext declareargumentslist() {
			return getRuleContext(DeclareargumentslistContext.class,0);
		}
		public DeclareargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarearguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDeclarearguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDeclarearguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDeclarearguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareargumentsContext declarearguments() throws RecognitionException {
		DeclareargumentsContext _localctx = new DeclareargumentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarearguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			type();
			setState(104);
			match(ID);
			setState(105);
			declareargumentslist();
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

	public static class DeclareargumentslistContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(MiLenguajeParser.TK_COMA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public DeclareargumentslistContext declareargumentslist() {
			return getRuleContext(DeclareargumentslistContext.class,0);
		}
		public DeclareargumentslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareargumentslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDeclareargumentslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDeclareargumentslist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDeclareargumentslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareargumentslistContext declareargumentslist() throws RecognitionException {
		DeclareargumentslistContext _localctx = new DeclareargumentslistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declareargumentslist);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(TK_COMA);
				setState(108);
				type();
				setState(109);
				match(ID);
				setState(110);
				declareargumentslist();
				}
				break;
			case TK_PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MainfunctionContext extends ParserRuleContext {
		public TerminalNode FUNCION_PRINCIPAL() { return getToken(MiLenguajeParser.FUNCION_PRINCIPAL, 0); }
		public InstructionlistContext instructionlist() {
			return getRuleContext(InstructionlistContext.class,0);
		}
		public TerminalNode FIN_PRINCIPAL() { return getToken(MiLenguajeParser.FIN_PRINCIPAL, 0); }
		public MainfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterMainfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitMainfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitMainfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainfunctionContext mainfunction() throws RecognitionException {
		MainfunctionContext _localctx = new MainfunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(FUNCION_PRINCIPAL);
			setState(116);
			instructionlist();
			setState(117);
			match(FIN_PRINCIPAL);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(MiLenguajeParser.BOOLEANO, 0); }
		public TerminalNode CARACTER() { return getToken(MiLenguajeParser.CARACTER, 0); }
		public TerminalNode ENTERO() { return getToken(MiLenguajeParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(MiLenguajeParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(MiLenguajeParser.CADENA, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << CARACTER) | (1L << ENTERO) | (1L << REAL) | (1L << CADENA) | (1L << ID))) != 0)) ) {
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

	public static class StandardtypeContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(MiLenguajeParser.BOOLEANO, 0); }
		public TerminalNode CARACTER() { return getToken(MiLenguajeParser.CARACTER, 0); }
		public TerminalNode ENTERO() { return getToken(MiLenguajeParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(MiLenguajeParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(MiLenguajeParser.CADENA, 0); }
		public StandardtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStandardtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStandardtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStandardtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardtypeContext standardtype() throws RecognitionException {
		StandardtypeContext _localctx = new StandardtypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_standardtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << CARACTER) | (1L << ENTERO) | (1L << REAL) | (1L << CADENA))) != 0)) ) {
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

	public static class FunccontentContext extends ParserRuleContext {
		public FninstructionlistContext fninstructionlist() {
			return getRuleContext(FninstructionlistContext.class,0);
		}
		public TerminalNode RETORNAR() { return getToken(MiLenguajeParser.RETORNAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(MiLenguajeParser.TK_PYC, 0); }
		public TerminalNode ROMPER() { return getToken(MiLenguajeParser.ROMPER, 0); }
		public FunccontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFunccontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFunccontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFunccontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccontentContext funccontent() throws RecognitionException {
		FunccontentContext _localctx = new FunccontentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funccontent);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				fninstructionlist();
				setState(124);
				match(RETORNAR);
				setState(125);
				expression(0);
				setState(126);
				match(TK_PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				fninstructionlist();
				setState(129);
				match(ROMPER);
				setState(130);
				match(TK_PYC);
				}
				break;
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

	public static class StructcontentContext extends ParserRuleContext {
		public StandardtypeContext standardtype() {
			return getRuleContext(StandardtypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public DeclarationlistContext declarationlist() {
			return getRuleContext(DeclarationlistContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(MiLenguajeParser.TK_PYC, 0); }
		public StructcontentContext structcontent() {
			return getRuleContext(StructcontentContext.class,0);
		}
		public TerminalNode TK_ASIG() { return getToken(MiLenguajeParser.TK_ASIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StructcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStructcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStructcontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStructcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructcontentContext structcontent() throws RecognitionException {
		StructcontentContext _localctx = new StructcontentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_structcontent);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				standardtype();
				setState(135);
				match(ID);
				setState(136);
				declarationlist();
				setState(137);
				match(TK_PYC);
				setState(138);
				structcontent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				standardtype();
				setState(141);
				match(ID);
				setState(142);
				match(TK_ASIG);
				setState(143);
				expression(0);
				setState(144);
				declarationlist();
				setState(145);
				match(TK_PYC);
				setState(146);
				structcontent();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(ID);
				setState(149);
				match(ID);
				setState(150);
				declarationlist();
				setState(151);
				match(TK_PYC);
				setState(152);
				structcontent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(ID);
				setState(155);
				match(ID);
				setState(156);
				match(TK_ASIG);
				setState(157);
				expression(0);
				setState(158);
				declarationlist();
				setState(159);
				match(TK_PYC);
				setState(160);
				structcontent();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BinaryoperatorContext binaryoperator() {
			return getRuleContext(BinaryoperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(168);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(169);
					binaryoperator();
					setState(170);
					term();
					}
					} 
				}
				setState(176);
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

	public static class TermContext extends ParserRuleContext {
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_MENOS:
			case TK_NEG:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				unaryoperator();
				setState(178);
				value();
				}
				break;
			case TK_PAR_IZQ:
			case FALSO:
			case VERDADERO:
			case ID:
			case TK_ENTERO:
			case TK_REAL:
			case TK_CADENA:
			case TK_CARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TK_PAR_IZQ() { return getToken(MiLenguajeParser.TK_PAR_IZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(MiLenguajeParser.TK_PAR_DER, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public StructurelistContext structurelist() {
			return getRuleContext(StructurelistContext.class,0);
		}
		public TerminalNode TK_ENTERO() { return getToken(MiLenguajeParser.TK_ENTERO, 0); }
		public TerminalNode TK_REAL() { return getToken(MiLenguajeParser.TK_REAL, 0); }
		public TerminalNode TK_CADENA() { return getToken(MiLenguajeParser.TK_CADENA, 0); }
		public TerminalNode TK_CARACTER() { return getToken(MiLenguajeParser.TK_CARACTER, 0); }
		public TerminalNode FALSO() { return getToken(MiLenguajeParser.FALSO, 0); }
		public TerminalNode VERDADERO() { return getToken(MiLenguajeParser.VERDADERO, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(TK_PAR_IZQ);
				setState(184);
				expression(0);
				setState(185);
				match(TK_PAR_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(ID);
				setState(188);
				structurelist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(TK_ENTERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(TK_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(TK_CADENA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				match(TK_CARACTER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				match(FALSO);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(194);
				match(VERDADERO);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(195);
				match(ID);
				setState(196);
				match(TK_PAR_IZQ);
				setState(197);
				expression(0);
				setState(198);
				argumentlist();
				setState(199);
				match(TK_PAR_DER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(201);
				match(ID);
				setState(202);
				match(TK_PAR_IZQ);
				setState(203);
				match(TK_PAR_DER);
				}
				break;
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

	public static class ArgumentlistContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(MiLenguajeParser.TK_COMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterArgumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitArgumentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitArgumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argumentlist);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(TK_COMA);
				setState(207);
				expression(0);
				setState(208);
				argumentlist();
				}
				break;
			case TK_PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BinaryoperatorContext extends ParserRuleContext {
		public TerminalNode TK_MAS() { return getToken(MiLenguajeParser.TK_MAS, 0); }
		public TerminalNode TK_MENOS() { return getToken(MiLenguajeParser.TK_MENOS, 0); }
		public TerminalNode TK_MULT() { return getToken(MiLenguajeParser.TK_MULT, 0); }
		public TerminalNode TK_DIV() { return getToken(MiLenguajeParser.TK_DIV, 0); }
		public TerminalNode TK_MOD() { return getToken(MiLenguajeParser.TK_MOD, 0); }
		public TerminalNode TK_ASIG() { return getToken(MiLenguajeParser.TK_ASIG, 0); }
		public TerminalNode TK_MENOR() { return getToken(MiLenguajeParser.TK_MENOR, 0); }
		public TerminalNode TK_MAYOR() { return getToken(MiLenguajeParser.TK_MAYOR, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(MiLenguajeParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(MiLenguajeParser.TK_MAYOR_IGUAL, 0); }
		public TerminalNode TK_IGUAL() { return getToken(MiLenguajeParser.TK_IGUAL, 0); }
		public TerminalNode TK_Y() { return getToken(MiLenguajeParser.TK_Y, 0); }
		public TerminalNode TK_O() { return getToken(MiLenguajeParser.TK_O, 0); }
		public TerminalNode TK_DIF() { return getToken(MiLenguajeParser.TK_DIF, 0); }
		public BinaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBinaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBinaryoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBinaryoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryoperatorContext binaryoperator() throws RecognitionException {
		BinaryoperatorContext _localctx = new BinaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_binaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MAS) | (1L << TK_MENOS) | (1L << TK_MULT) | (1L << TK_DIV) | (1L << TK_MOD) | (1L << TK_ASIG) | (1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL) | (1L << TK_IGUAL) | (1L << TK_Y) | (1L << TK_O) | (1L << TK_DIF))) != 0)) ) {
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

	public static class UnaryoperatorContext extends ParserRuleContext {
		public TerminalNode TK_NEG() { return getToken(MiLenguajeParser.TK_NEG, 0); }
		public TerminalNode TK_MENOS() { return getToken(MiLenguajeParser.TK_MENOS, 0); }
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterUnaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitUnaryoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitUnaryoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==TK_MENOS || _la==TK_NEG) ) {
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

	public static class DeclarationlistContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(MiLenguajeParser.TK_COMA, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public DeclarationlistContext declarationlist() {
			return getRuleContext(DeclarationlistContext.class,0);
		}
		public TerminalNode TK_ASIG() { return getToken(MiLenguajeParser.TK_ASIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDeclarationlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDeclarationlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationlistContext declarationlist() throws RecognitionException {
		DeclarationlistContext _localctx = new DeclarationlistContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declarationlist);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(TK_COMA);
				setState(218);
				match(ID);
				setState(219);
				declarationlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(TK_COMA);
				setState(221);
				match(ID);
				setState(222);
				match(TK_ASIG);
				setState(223);
				expression(0);
				setState(224);
				declarationlist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	public static class InstructionlistContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionlistContext instructionlist() {
			return getRuleContext(InstructionlistContext.class,0);
		}
		public InstructionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInstructionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInstructionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInstructionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionlistContext instructionlist() throws RecognitionException {
		InstructionlistContext _localctx = new InstructionlistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_instructionlist);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO:
			case CARACTER:
			case ENTERO:
			case REAL:
			case CADENA:
			case LEER:
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case HACER:
			case PARA:
			case SELECCIONAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				instruction();
				setState(230);
				instructionlist();
				}
				break;
			case FIN_PRINCIPAL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InstructionContext extends ParserRuleContext {
		public StandardtypeContext standardtype() {
			return getRuleContext(StandardtypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public DeclarationlistContext declarationlist() {
			return getRuleContext(DeclarationlistContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(MiLenguajeParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(MiLenguajeParser.TK_ASIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StructurelistContext structurelist() {
			return getRuleContext(StructurelistContext.class,0);
		}
		public TerminalNode TK_PAR_IZQ() { return getToken(MiLenguajeParser.TK_PAR_IZQ, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(MiLenguajeParser.TK_PAR_DER, 0); }
		public TerminalNode LEER() { return getToken(MiLenguajeParser.LEER, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public WhilePSIContext whilePSI() {
			return getRuleContext(WhilePSIContext.class,0);
		}
		public ForPSIContext forPSI() {
			return getRuleContext(ForPSIContext.class,0);
		}
		public DowhileContext dowhile() {
			return getRuleContext(DowhileContext.class,0);
		}
		public SwitchPSIContext switchPSI() {
			return getRuleContext(SwitchPSIContext.class,0);
		}
		public TerminalNode IMPRIMIR() { return getToken(MiLenguajeParser.IMPRIMIR, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_instruction);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				standardtype();
				setState(236);
				match(ID);
				setState(237);
				declarationlist();
				setState(238);
				match(TK_PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				standardtype();
				setState(241);
				match(ID);
				setState(242);
				match(TK_ASIG);
				setState(243);
				expression(0);
				setState(244);
				declarationlist();
				setState(245);
				match(TK_PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(ID);
				setState(248);
				match(ID);
				setState(249);
				declarationlist();
				setState(250);
				match(TK_PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				match(ID);
				setState(253);
				match(ID);
				setState(254);
				match(TK_ASIG);
				setState(255);
				expression(0);
				setState(256);
				declarationlist();
				setState(257);
				match(TK_PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(ID);
				setState(260);
				match(TK_ASIG);
				setState(261);
				expression(0);
				setState(262);
				match(TK_PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				match(ID);
				setState(265);
				structurelist();
				setState(266);
				match(TK_ASIG);
				setState(267);
				expression(0);
				setState(268);
				match(TK_PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				match(ID);
				setState(271);
				match(TK_PAR_IZQ);
				setState(272);
				expression(0);
				setState(273);
				argumentlist();
				setState(274);
				match(TK_PAR_DER);
				setState(275);
				match(TK_PYC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
				match(ID);
				setState(278);
				match(TK_PAR_IZQ);
				setState(279);
				match(TK_PAR_DER);
				setState(280);
				match(TK_PYC);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(281);
				match(LEER);
				setState(282);
				match(TK_PAR_IZQ);
				setState(283);
				match(ID);
				setState(284);
				match(TK_PAR_DER);
				setState(285);
				match(TK_PYC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(286);
				match(LEER);
				setState(287);
				match(TK_PAR_IZQ);
				setState(288);
				match(ID);
				setState(289);
				structurelist();
				setState(290);
				match(TK_PAR_DER);
				setState(291);
				match(TK_PYC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(293);
				conditional();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(294);
				whilePSI();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(295);
				forPSI();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(296);
				dowhile();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(297);
				switchPSI();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(298);
				match(IMPRIMIR);
				setState(299);
				match(TK_PAR_IZQ);
				setState(300);
				expression(0);
				setState(301);
				expressionlist();
				setState(302);
				match(TK_PAR_DER);
				setState(303);
				match(TK_PYC);
				}
				break;
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(MiLenguajeParser.SI, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(MiLenguajeParser.TK_PAR_IZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(MiLenguajeParser.TK_PAR_DER, 0); }
		public TerminalNode ENTONCES() { return getToken(MiLenguajeParser.ENTONCES, 0); }
		public List<IfinstructionlistContext> ifinstructionlist() {
			return getRuleContexts(IfinstructionlistContext.class);
		}
		public IfinstructionlistContext ifinstructionlist(int i) {
			return getRuleContext(IfinstructionlistContext.class,i);
		}
		public TerminalNode FIN_SI() { return getToken(MiLenguajeParser.FIN_SI, 0); }
		public TerminalNode SI_NO() { return getToken(MiLenguajeParser.SI_NO, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditional);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(SI);
				setState(308);
				match(TK_PAR_IZQ);
				setState(309);
				expression(0);
				setState(310);
				match(TK_PAR_DER);
				setState(311);
				match(ENTONCES);
				setState(312);
				ifinstructionlist();
				setState(313);
				match(FIN_SI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(SI);
				setState(316);
				match(TK_PAR_IZQ);
				setState(317);
				expression(0);
				setState(318);
				match(TK_PAR_DER);
				setState(319);
				match(ENTONCES);
				setState(320);
				ifinstructionlist();
				setState(321);
				match(SI_NO);
				setState(322);
				ifinstructionlist();
				setState(323);
				match(FIN_SI);
				}
				break;
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

	public static class WhilePSIContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(MiLenguajeParser.MIENTRAS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(MiLenguajeParser.TK_PAR_IZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(MiLenguajeParser.TK_PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(MiLenguajeParser.HACER, 0); }
		public WhinstructionlistContext whinstructionlist() {
			return getRuleContext(WhinstructionlistContext.class,0);
		}
		public TerminalNode FIN_MIENTRAS() { return getToken(MiLenguajeParser.FIN_MIENTRAS, 0); }
		public WhilePSIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilePSI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterWhilePSI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitWhilePSI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitWhilePSI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilePSIContext whilePSI() throws RecognitionException {
		WhilePSIContext _localctx = new WhilePSIContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whilePSI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(MIENTRAS);
			setState(328);
			match(TK_PAR_IZQ);
			setState(329);
			expression(0);
			setState(330);
			match(TK_PAR_DER);
			setState(331);
			match(HACER);
			setState(332);
			whinstructionlist();
			setState(333);
			match(FIN_MIENTRAS);
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

	public static class ForPSIContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(MiLenguajeParser.PARA, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(MiLenguajeParser.TK_PAR_IZQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> TK_PYC() { return getTokens(MiLenguajeParser.TK_PYC); }
		public TerminalNode TK_PYC(int i) {
			return getToken(MiLenguajeParser.TK_PYC, i);
		}
		public TerminalNode TK_PAR_DER() { return getToken(MiLenguajeParser.TK_PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(MiLenguajeParser.HACER, 0); }
		public FrinstructionlistContext frinstructionlist() {
			return getRuleContext(FrinstructionlistContext.class,0);
		}
		public TerminalNode FIN_PARA() { return getToken(MiLenguajeParser.FIN_PARA, 0); }
		public StandardtypeContext standardtype() {
			return getRuleContext(StandardtypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(MiLenguajeParser.TK_ASIG, 0); }
		public DeclarationlistContext declarationlist() {
			return getRuleContext(DeclarationlistContext.class,0);
		}
		public ForPSIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forPSI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterForPSI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitForPSI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitForPSI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForPSIContext forPSI() throws RecognitionException {
		ForPSIContext _localctx = new ForPSIContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forPSI);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(PARA);
				setState(336);
				match(TK_PAR_IZQ);
				setState(337);
				expression(0);
				setState(338);
				match(TK_PYC);
				setState(339);
				expression(0);
				setState(340);
				match(TK_PYC);
				setState(341);
				expression(0);
				setState(342);
				match(TK_PAR_DER);
				setState(343);
				match(HACER);
				setState(344);
				frinstructionlist();
				setState(345);
				match(FIN_PARA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(PARA);
				setState(348);
				match(TK_PAR_IZQ);
				setState(349);
				standardtype();
				setState(350);
				match(ID);
				setState(351);
				match(TK_ASIG);
				setState(352);
				expression(0);
				setState(353);
				declarationlist();
				setState(354);
				match(TK_PYC);
				setState(355);
				expression(0);
				setState(356);
				match(TK_PYC);
				setState(357);
				expression(0);
				setState(358);
				match(TK_PAR_DER);
				setState(359);
				match(HACER);
				setState(360);
				frinstructionlist();
				setState(361);
				match(FIN_PARA);
				}
				break;
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

	public static class DowhileContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(MiLenguajeParser.HACER, 0); }
		public DwinstructionlistContext dwinstructionlist() {
			return getRuleContext(DwinstructionlistContext.class,0);
		}
		public TerminalNode MIENTRAS() { return getToken(MiLenguajeParser.MIENTRAS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(MiLenguajeParser.TK_PAR_IZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(MiLenguajeParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(MiLenguajeParser.TK_PYC, 0); }
		public DowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(HACER);
			setState(366);
			dwinstructionlist();
			setState(367);
			match(MIENTRAS);
			setState(368);
			match(TK_PAR_IZQ);
			setState(369);
			expression(0);
			setState(370);
			match(TK_PAR_DER);
			setState(371);
			match(TK_PYC);
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

	public static class SwitchPSIContext extends ParserRuleContext {
		public TerminalNode SELECCIONAR() { return getToken(MiLenguajeParser.SELECCIONAR, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(MiLenguajeParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(MiLenguajeParser.TK_PAR_DER, 0); }
		public TerminalNode ENTRE() { return getToken(MiLenguajeParser.ENTRE, 0); }
		public CaselistContext caselist() {
			return getRuleContext(CaselistContext.class,0);
		}
		public TerminalNode FIN_SELECCIONAR() { return getToken(MiLenguajeParser.FIN_SELECCIONAR, 0); }
		public SwitchPSIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchPSI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSwitchPSI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSwitchPSI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSwitchPSI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchPSIContext switchPSI() throws RecognitionException {
		SwitchPSIContext _localctx = new SwitchPSIContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switchPSI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(SELECCIONAR);
			setState(374);
			match(TK_PAR_IZQ);
			setState(375);
			match(ID);
			setState(376);
			match(TK_PAR_DER);
			setState(377);
			match(ENTRE);
			setState(378);
			caselist();
			setState(379);
			match(FIN_SELECCIONAR);
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

	public static class CaselistContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(MiLenguajeParser.CASO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TK_DOSP() { return getToken(MiLenguajeParser.TK_DOSP, 0); }
		public SwinstructionlistContext swinstructionlist() {
			return getRuleContext(SwinstructionlistContext.class,0);
		}
		public TerminalNode ROMPER() { return getToken(MiLenguajeParser.ROMPER, 0); }
		public TerminalNode TK_PYC() { return getToken(MiLenguajeParser.TK_PYC, 0); }
		public CaselistContext caselist() {
			return getRuleContext(CaselistContext.class,0);
		}
		public TerminalNode DEFECTO() { return getToken(MiLenguajeParser.DEFECTO, 0); }
		public CaselistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caselist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCaselist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCaselist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCaselist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaselistContext caselist() throws RecognitionException {
		CaselistContext _localctx = new CaselistContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caselist);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(CASO);
				setState(382);
				expression(0);
				setState(383);
				match(TK_DOSP);
				setState(384);
				swinstructionlist();
				setState(385);
				match(ROMPER);
				setState(386);
				match(TK_PYC);
				setState(387);
				caselist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(CASO);
				setState(390);
				expression(0);
				setState(391);
				match(TK_DOSP);
				setState(392);
				swinstructionlist();
				setState(393);
				caselist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(DEFECTO);
				setState(396);
				match(TK_DOSP);
				setState(397);
				swinstructionlist();
				setState(398);
				caselist();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(DEFECTO);
				setState(401);
				match(TK_DOSP);
				setState(402);
				swinstructionlist();
				setState(403);
				match(ROMPER);
				setState(404);
				match(TK_PYC);
				setState(405);
				caselist();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
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

	public static class ExpressionlistContext extends ParserRuleContext {
		public TerminalNode TK_COMA() { return getToken(MiLenguajeParser.TK_COMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpressionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpressionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionlist);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(TK_COMA);
				setState(411);
				expression(0);
				setState(412);
				expressionlist();
				}
				break;
			case TK_PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StructurelistContext extends ParserRuleContext {
		public TerminalNode TK_PUNTO() { return getToken(MiLenguajeParser.TK_PUNTO, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public StructurelistContext structurelist() {
			return getRuleContext(StructurelistContext.class,0);
		}
		public StructurelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structurelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStructurelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStructurelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStructurelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructurelistContext structurelist() throws RecognitionException {
		StructurelistContext _localctx = new StructurelistContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_structurelist);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(TK_PUNTO);
				setState(418);
				match(ID);
				setState(419);
				structurelist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
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

	public static class StinstructionlistContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public StinstructionlistContext stinstructionlist() {
			return getRuleContext(StinstructionlistContext.class,0);
		}
		public StinstructionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stinstructionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStinstructionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStinstructionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStinstructionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StinstructionlistContext stinstructionlist() throws RecognitionException {
		StinstructionlistContext _localctx = new StinstructionlistContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_stinstructionlist);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				instruction();
				setState(424);
				stinstructionlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
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

	public static class FninstructionlistContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public FninstructionlistContext fninstructionlist() {
			return getRuleContext(FninstructionlistContext.class,0);
		}
		public FninstructionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fninstructionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFninstructionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFninstructionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFninstructionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FninstructionlistContext fninstructionlist() throws RecognitionException {
		FninstructionlistContext _localctx = new FninstructionlistContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fninstructionlist);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO:
			case CARACTER:
			case ENTERO:
			case REAL:
			case CADENA:
			case LEER:
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case HACER:
			case PARA:
			case SELECCIONAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				instruction();
				setState(430);
				fninstructionlist();
				}
				break;
			case ROMPER:
			case RETORNAR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IfinstructionlistContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public IfinstructionlistContext ifinstructionlist() {
			return getRuleContext(IfinstructionlistContext.class,0);
		}
		public IfinstructionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifinstructionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIfinstructionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIfinstructionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIfinstructionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfinstructionlistContext ifinstructionlist() throws RecognitionException {
		IfinstructionlistContext _localctx = new IfinstructionlistContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifinstructionlist);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO:
			case CARACTER:
			case ENTERO:
			case REAL:
			case CADENA:
			case LEER:
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case HACER:
			case PARA:
			case SELECCIONAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				instruction();
				setState(436);
				ifinstructionlist();
				}
				break;
			case FIN_SI:
			case SI_NO:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class WhinstructionlistContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public WhinstructionlistContext whinstructionlist() {
			return getRuleContext(WhinstructionlistContext.class,0);
		}
		public WhinstructionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whinstructionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterWhinstructionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitWhinstructionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitWhinstructionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhinstructionlistContext whinstructionlist() throws RecognitionException {
		WhinstructionlistContext _localctx = new WhinstructionlistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whinstructionlist);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO:
			case CARACTER:
			case ENTERO:
			case REAL:
			case CADENA:
			case LEER:
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case HACER:
			case PARA:
			case SELECCIONAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				instruction();
				setState(442);
				whinstructionlist();
				}
				break;
			case FIN_MIENTRAS:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FrinstructionlistContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public FrinstructionlistContext frinstructionlist() {
			return getRuleContext(FrinstructionlistContext.class,0);
		}
		public FrinstructionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frinstructionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFrinstructionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFrinstructionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFrinstructionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrinstructionlistContext frinstructionlist() throws RecognitionException {
		FrinstructionlistContext _localctx = new FrinstructionlistContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_frinstructionlist);
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO:
			case CARACTER:
			case ENTERO:
			case REAL:
			case CADENA:
			case LEER:
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case HACER:
			case PARA:
			case SELECCIONAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				instruction();
				setState(448);
				frinstructionlist();
				}
				break;
			case FIN_PARA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DwinstructionlistContext extends ParserRuleContext {
		public DwinstructionContext dwinstruction() {
			return getRuleContext(DwinstructionContext.class,0);
		}
		public DwinstructionlistContext dwinstructionlist() {
			return getRuleContext(DwinstructionlistContext.class,0);
		}
		public TerminalNode ROMPER() { return getToken(MiLenguajeParser.ROMPER, 0); }
		public TerminalNode TK_PYC() { return getToken(MiLenguajeParser.TK_PYC, 0); }
		public DwinstructionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dwinstructionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDwinstructionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDwinstructionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDwinstructionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DwinstructionlistContext dwinstructionlist() throws RecognitionException {
		DwinstructionlistContext _localctx = new DwinstructionlistContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dwinstructionlist);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				dwinstruction();
				setState(454);
				dwinstructionlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(ROMPER);
				setState(457);
				match(TK_PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	public static class SwinstructionlistContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public SwinstructionlistContext swinstructionlist() {
			return getRuleContext(SwinstructionlistContext.class,0);
		}
		public SwinstructionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swinstructionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSwinstructionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSwinstructionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSwinstructionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwinstructionlistContext swinstructionlist() throws RecognitionException {
		SwinstructionlistContext _localctx = new SwinstructionlistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_swinstructionlist);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEANO:
			case CARACTER:
			case ENTERO:
			case REAL:
			case CADENA:
			case LEER:
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case HACER:
			case PARA:
			case SELECCIONAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				instruction();
				setState(462);
				swinstructionlist();
				}
				break;
			case CASO:
			case ROMPER:
			case DEFECTO:
			case FIN_SELECCIONAR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DwinstructionContext extends ParserRuleContext {
		public StandardtypeContext standardtype() {
			return getRuleContext(StandardtypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public DeclarationlistContext declarationlist() {
			return getRuleContext(DeclarationlistContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(MiLenguajeParser.TK_PYC, 0); }
		public TerminalNode TK_ASIG() { return getToken(MiLenguajeParser.TK_ASIG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LEER() { return getToken(MiLenguajeParser.LEER, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(MiLenguajeParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(MiLenguajeParser.TK_PAR_DER, 0); }
		public StructurelistContext structurelist() {
			return getRuleContext(StructurelistContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public WhilePSIContext whilePSI() {
			return getRuleContext(WhilePSIContext.class,0);
		}
		public ForPSIContext forPSI() {
			return getRuleContext(ForPSIContext.class,0);
		}
		public DowhileContext dowhile() {
			return getRuleContext(DowhileContext.class,0);
		}
		public SwitchPSIContext switchPSI() {
			return getRuleContext(SwitchPSIContext.class,0);
		}
		public TerminalNode IMPRIMIR() { return getToken(MiLenguajeParser.IMPRIMIR, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public DwinstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dwinstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDwinstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDwinstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDwinstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DwinstructionContext dwinstruction() throws RecognitionException {
		DwinstructionContext _localctx = new DwinstructionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dwinstruction);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				standardtype();
				setState(468);
				match(ID);
				setState(469);
				declarationlist();
				setState(470);
				match(TK_PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				standardtype();
				setState(473);
				match(ID);
				setState(474);
				match(TK_ASIG);
				setState(475);
				expression(0);
				setState(476);
				declarationlist();
				setState(477);
				match(TK_PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(LEER);
				setState(480);
				match(TK_PAR_IZQ);
				setState(481);
				match(ID);
				setState(482);
				match(TK_PAR_DER);
				setState(483);
				match(TK_PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				match(LEER);
				setState(485);
				match(TK_PAR_IZQ);
				setState(486);
				match(ID);
				setState(487);
				structurelist();
				setState(488);
				match(TK_PAR_DER);
				setState(489);
				match(TK_PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				conditional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(492);
				whilePSI();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				forPSI();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(494);
				dowhile();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(495);
				switchPSI();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(496);
				match(IMPRIMIR);
				setState(497);
				match(TK_PAR_IZQ);
				setState(498);
				expression(0);
				setState(499);
				expressionlist();
				setState(500);
				match(TK_PAR_DER);
				setState(501);
				match(TK_PYC);
				}
				break;
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
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u01fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3h\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5t\n\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0087\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a6\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00af\n\13\f\13\16\13\u00b2\13"+
		"\13\3\f\3\f\3\f\3\f\5\f\u00b8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00cf\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00d6\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e6\n\21\3\22\3\22\3\22\3\22"+
		"\5\22\u00ec\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0134\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0148\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u016e\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u019b\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u01a2\n\32\3\33\3\33\3\33\3\33\5\33\u01a8"+
		"\n\33\3\34\3\34\3\34\3\34\5\34\u01ae\n\34\3\35\3\35\3\35\3\35\5\35\u01b4"+
		"\n\35\3\36\3\36\3\36\3\36\5\36\u01ba\n\36\3\37\3\37\3\37\3\37\5\37\u01c0"+
		"\n\37\3 \3 \3 \3 \5 \u01c6\n \3!\3!\3!\3!\3!\3!\5!\u01ce\n!\3\"\3\"\3"+
		"\"\3\"\5\"\u01d4\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01fa\n"+
		"#\3#\2\3\24$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BD\2\6\4\2\37#<<\3\2\37#\3\2\6\23\4\2\7\7\24\24\2\u0219\2F\3\2"+
		"\2\2\4g\3\2\2\2\6i\3\2\2\2\bs\3\2\2\2\nu\3\2\2\2\fy\3\2\2\2\16{\3\2\2"+
		"\2\20\u0086\3\2\2\2\22\u00a5\3\2\2\2\24\u00a7\3\2\2\2\26\u00b7\3\2\2\2"+
		"\30\u00ce\3\2\2\2\32\u00d5\3\2\2\2\34\u00d7\3\2\2\2\36\u00d9\3\2\2\2 "+
		"\u00e5\3\2\2\2\"\u00eb\3\2\2\2$\u0133\3\2\2\2&\u0147\3\2\2\2(\u0149\3"+
		"\2\2\2*\u016d\3\2\2\2,\u016f\3\2\2\2.\u0177\3\2\2\2\60\u019a\3\2\2\2\62"+
		"\u01a1\3\2\2\2\64\u01a7\3\2\2\2\66\u01ad\3\2\2\28\u01b3\3\2\2\2:\u01b9"+
		"\3\2\2\2<\u01bf\3\2\2\2>\u01c5\3\2\2\2@\u01cd\3\2\2\2B\u01d3\3\2\2\2D"+
		"\u01f9\3\2\2\2FG\5\4\3\2GH\5\n\6\2HI\5\4\3\2IJ\7\2\2\3J\3\3\2\2\2KL\7"+
		"\67\2\2LM\5\f\7\2MN\7<\2\2NO\7\31\2\2OP\5\6\4\2PQ\7\32\2\2QR\7+\2\2RS"+
		"\5\20\t\2ST\79\2\2TU\5\4\3\2Uh\3\2\2\2VW\7\67\2\2WX\5\f\7\2XY\7<\2\2Y"+
		"Z\7\31\2\2Z[\7\32\2\2[\\\7+\2\2\\]\5\20\t\2]^\79\2\2^_\5\4\3\2_h\3\2\2"+
		"\2`a\7\65\2\2ab\7<\2\2bc\5\22\n\2cd\7\66\2\2de\5\4\3\2eh\3\2\2\2fh\3\2"+
		"\2\2gK\3\2\2\2gV\3\2\2\2g`\3\2\2\2gf\3\2\2\2h\5\3\2\2\2ij\5\f\7\2jk\7"+
		"<\2\2kl\5\b\5\2l\7\3\2\2\2mn\7\27\2\2no\5\f\7\2op\7<\2\2pq\5\b\5\2qt\3"+
		"\2\2\2rt\3\2\2\2sm\3\2\2\2sr\3\2\2\2t\t\3\2\2\2uv\7\35\2\2vw\5\"\22\2"+
		"wx\7\36\2\2x\13\3\2\2\2yz\t\2\2\2z\r\3\2\2\2{|\t\3\2\2|\17\3\2\2\2}~\5"+
		"8\35\2~\177\78\2\2\177\u0080\5\24\13\2\u0080\u0081\7\26\2\2\u0081\u0087"+
		"\3\2\2\2\u0082\u0083\58\35\2\u0083\u0084\7\62\2\2\u0084\u0085\7\26\2\2"+
		"\u0085\u0087\3\2\2\2\u0086}\3\2\2\2\u0086\u0082\3\2\2\2\u0087\21\3\2\2"+
		"\2\u0088\u0089\5\16\b\2\u0089\u008a\7<\2\2\u008a\u008b\5 \21\2\u008b\u008c"+
		"\7\26\2\2\u008c\u008d\5\22\n\2\u008d\u00a6\3\2\2\2\u008e\u008f\5\16\b"+
		"\2\u008f\u0090\7<\2\2\u0090\u0091\7\13\2\2\u0091\u0092\5\24\13\2\u0092"+
		"\u0093\5 \21\2\u0093\u0094\7\26\2\2\u0094\u0095\5\22\n\2\u0095\u00a6\3"+
		"\2\2\2\u0096\u0097\7<\2\2\u0097\u0098\7<\2\2\u0098\u0099\5 \21\2\u0099"+
		"\u009a\7\26\2\2\u009a\u009b\5\22\n\2\u009b\u00a6\3\2\2\2\u009c\u009d\7"+
		"<\2\2\u009d\u009e\7<\2\2\u009e\u009f\7\13\2\2\u009f\u00a0\5\24\13\2\u00a0"+
		"\u00a1\5 \21\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\5\22\n\2\u00a3\u00a6\3"+
		"\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u0088\3\2\2\2\u00a5\u008e\3\2\2\2\u00a5"+
		"\u0096\3\2\2\2\u00a5\u009c\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\23\3\2\2"+
		"\2\u00a7\u00a8\b\13\1\2\u00a8\u00a9\5\26\f\2\u00a9\u00b0\3\2\2\2\u00aa"+
		"\u00ab\f\4\2\2\u00ab\u00ac\5\34\17\2\u00ac\u00ad\5\26\f\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5\36\20"+
		"\2\u00b4\u00b5\5\30\r\2\u00b5\u00b8\3\2\2\2\u00b6\u00b8\5\30\r\2\u00b7"+
		"\u00b3\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\27\3\2\2\2\u00b9\u00ba\7\31\2"+
		"\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc\7\32\2\2\u00bc\u00cf\3\2\2\2\u00bd"+
		"\u00be\7<\2\2\u00be\u00cf\5\64\33\2\u00bf\u00cf\7=\2\2\u00c0\u00cf\7>"+
		"\2\2\u00c1\u00cf\7?\2\2\u00c2\u00cf\7@\2\2\u00c3\u00cf\7:\2\2\u00c4\u00cf"+
		"\7;\2\2\u00c5\u00c6\7<\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00c8\5\24\13\2"+
		"\u00c8\u00c9\5\32\16\2\u00c9\u00ca\7\32\2\2\u00ca\u00cf\3\2\2\2\u00cb"+
		"\u00cc\7<\2\2\u00cc\u00cd\7\31\2\2\u00cd\u00cf\7\32\2\2\u00ce\u00b9\3"+
		"\2\2\2\u00ce\u00bd\3\2\2\2\u00ce\u00bf\3\2\2\2\u00ce\u00c0\3\2\2\2\u00ce"+
		"\u00c1\3\2\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c4\3\2"+
		"\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00d1"+
		"\7\27\2\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\5\32\16\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\33\3\2\2\2\u00d7\u00d8\t\4\2\2\u00d8\35\3\2\2\2\u00d9\u00da\t\5\2\2\u00da"+
		"\37\3\2\2\2\u00db\u00dc\7\27\2\2\u00dc\u00dd\7<\2\2\u00dd\u00e6\5 \21"+
		"\2\u00de\u00df\7\27\2\2\u00df\u00e0\7<\2\2\u00e0\u00e1\7\13\2\2\u00e1"+
		"\u00e2\5\24\13\2\u00e2\u00e3\5 \21\2\u00e3\u00e6\3\2\2\2\u00e4\u00e6\3"+
		"\2\2\2\u00e5\u00db\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"!\3\2\2\2\u00e7\u00e8\5$\23\2\u00e8\u00e9\5\"\22\2\u00e9\u00ec\3\2\2\2"+
		"\u00ea\u00ec\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec#\3"+
		"\2\2\2\u00ed\u00ee\5\16\b\2\u00ee\u00ef\7<\2\2\u00ef\u00f0\5 \21\2\u00f0"+
		"\u00f1\7\26\2\2\u00f1\u0134\3\2\2\2\u00f2\u00f3\5\16\b\2\u00f3\u00f4\7"+
		"<\2\2\u00f4\u00f5\7\13\2\2\u00f5\u00f6\5\24\13\2\u00f6\u00f7\5 \21\2\u00f7"+
		"\u00f8\7\26\2\2\u00f8\u0134\3\2\2\2\u00f9\u00fa\7<\2\2\u00fa\u00fb\7<"+
		"\2\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\7\26\2\2\u00fd\u0134\3\2\2\2\u00fe"+
		"\u00ff\7<\2\2\u00ff\u0100\7<\2\2\u0100\u0101\7\13\2\2\u0101\u0102\5\24"+
		"\13\2\u0102\u0103\5 \21\2\u0103\u0104\7\26\2\2\u0104\u0134\3\2\2\2\u0105"+
		"\u0106\7<\2\2\u0106\u0107\7\13\2\2\u0107\u0108\5\24\13\2\u0108\u0109\7"+
		"\26\2\2\u0109\u0134\3\2\2\2\u010a\u010b\7<\2\2\u010b\u010c\5\64\33\2\u010c"+
		"\u010d\7\13\2\2\u010d\u010e\5\24\13\2\u010e\u010f\7\26\2\2\u010f\u0134"+
		"\3\2\2\2\u0110\u0111\7<\2\2\u0111\u0112\7\31\2\2\u0112\u0113\5\24\13\2"+
		"\u0113\u0114\5\32\16\2\u0114\u0115\7\32\2\2\u0115\u0116\7\26\2\2\u0116"+
		"\u0134\3\2\2\2\u0117\u0118\7<\2\2\u0118\u0119\7\31\2\2\u0119\u011a\7\32"+
		"\2\2\u011a\u0134\7\26\2\2\u011b\u011c\7$\2\2\u011c\u011d\7\31\2\2\u011d"+
		"\u011e\7<\2\2\u011e\u011f\7\32\2\2\u011f\u0134\7\26\2\2\u0120\u0121\7"+
		"$\2\2\u0121\u0122\7\31\2\2\u0122\u0123\7<\2\2\u0123\u0124\5\64\33\2\u0124"+
		"\u0125\7\32\2\2\u0125\u0126\7\26\2\2\u0126\u0134\3\2\2\2\u0127\u0134\5"+
		"&\24\2\u0128\u0134\5(\25\2\u0129\u0134\5*\26\2\u012a\u0134\5,\27\2\u012b"+
		"\u0134\5.\30\2\u012c\u012d\7%\2\2\u012d\u012e\7\31\2\2\u012e\u012f\5\24"+
		"\13\2\u012f\u0130\5\62\32\2\u0130\u0131\7\32\2\2\u0131\u0132\7\26\2\2"+
		"\u0132\u0134\3\2\2\2\u0133\u00ed\3\2\2\2\u0133\u00f2\3\2\2\2\u0133\u00f9"+
		"\3\2\2\2\u0133\u00fe\3\2\2\2\u0133\u0105\3\2\2\2\u0133\u010a\3\2\2\2\u0133"+
		"\u0110\3\2\2\2\u0133\u0117\3\2\2\2\u0133\u011b\3\2\2\2\u0133\u0120\3\2"+
		"\2\2\u0133\u0127\3\2\2\2\u0133\u0128\3\2\2\2\u0133\u0129\3\2\2\2\u0133"+
		"\u012a\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u012c\3\2\2\2\u0134%\3\2\2\2"+
		"\u0135\u0136\7&\2\2\u0136\u0137\7\31\2\2\u0137\u0138\5\24\13\2\u0138\u0139"+
		"\7\32\2\2\u0139\u013a\7\'\2\2\u013a\u013b\5:\36\2\u013b\u013c\7(\2\2\u013c"+
		"\u0148\3\2\2\2\u013d\u013e\7&\2\2\u013e\u013f\7\31\2\2\u013f\u0140\5\24"+
		"\13\2\u0140\u0141\7\32\2\2\u0141\u0142\7\'\2\2\u0142\u0143\5:\36\2\u0143"+
		"\u0144\7)\2\2\u0144\u0145\5:\36\2\u0145\u0146\7(\2\2\u0146\u0148\3\2\2"+
		"\2\u0147\u0135\3\2\2\2\u0147\u013d\3\2\2\2\u0148\'\3\2\2\2\u0149\u014a"+
		"\7*\2\2\u014a\u014b\7\31\2\2\u014b\u014c\5\24\13\2\u014c\u014d\7\32\2"+
		"\2\u014d\u014e\7+\2\2\u014e\u014f\5<\37\2\u014f\u0150\7,\2\2\u0150)\3"+
		"\2\2\2\u0151\u0152\7-\2\2\u0152\u0153\7\31\2\2\u0153\u0154\5\24\13\2\u0154"+
		"\u0155\7\26\2\2\u0155\u0156\5\24\13\2\u0156\u0157\7\26\2\2\u0157\u0158"+
		"\5\24\13\2\u0158\u0159\7\32\2\2\u0159\u015a\7+\2\2\u015a\u015b\5> \2\u015b"+
		"\u015c\7.\2\2\u015c\u016e\3\2\2\2\u015d\u015e\7-\2\2\u015e\u015f\7\31"+
		"\2\2\u015f\u0160\5\16\b\2\u0160\u0161\7<\2\2\u0161\u0162\7\13\2\2\u0162"+
		"\u0163\5\24\13\2\u0163\u0164\5 \21\2\u0164\u0165\7\26\2\2\u0165\u0166"+
		"\5\24\13\2\u0166\u0167\7\26\2\2\u0167\u0168\5\24\13\2\u0168\u0169\7\32"+
		"\2\2\u0169\u016a\7+\2\2\u016a\u016b\5> \2\u016b\u016c\7.\2\2\u016c\u016e"+
		"\3\2\2\2\u016d\u0151\3\2\2\2\u016d\u015d\3\2\2\2\u016e+\3\2\2\2\u016f"+
		"\u0170\7+\2\2\u0170\u0171\5@!\2\u0171\u0172\7*\2\2\u0172\u0173\7\31\2"+
		"\2\u0173\u0174\5\24\13\2\u0174\u0175\7\32\2\2\u0175\u0176\7\26\2\2\u0176"+
		"-\3\2\2\2\u0177\u0178\7/\2\2\u0178\u0179\7\31\2\2\u0179\u017a\7<\2\2\u017a"+
		"\u017b\7\32\2\2\u017b\u017c\7\60\2\2\u017c\u017d\5\60\31\2\u017d\u017e"+
		"\7\64\2\2\u017e/\3\2\2\2\u017f\u0180\7\61\2\2\u0180\u0181\5\24\13\2\u0181"+
		"\u0182\7\25\2\2\u0182\u0183\5B\"\2\u0183\u0184\7\62\2\2\u0184\u0185\7"+
		"\26\2\2\u0185\u0186\5\60\31\2\u0186\u019b\3\2\2\2\u0187\u0188\7\61\2\2"+
		"\u0188\u0189\5\24\13\2\u0189\u018a\7\25\2\2\u018a\u018b\5B\"\2\u018b\u018c"+
		"\5\60\31\2\u018c\u019b\3\2\2\2\u018d\u018e\7\63\2\2\u018e\u018f\7\25\2"+
		"\2\u018f\u0190\5B\"\2\u0190\u0191\5\60\31\2\u0191\u019b\3\2\2\2\u0192"+
		"\u0193\7\63\2\2\u0193\u0194\7\25\2\2\u0194\u0195\5B\"\2\u0195\u0196\7"+
		"\62\2\2\u0196\u0197\7\26\2\2\u0197\u0198\5\60\31\2\u0198\u019b\3\2\2\2"+
		"\u0199\u019b\3\2\2\2\u019a\u017f\3\2\2\2\u019a\u0187\3\2\2\2\u019a\u018d"+
		"\3\2\2\2\u019a\u0192\3\2\2\2\u019a\u0199\3\2\2\2\u019b\61\3\2\2\2\u019c"+
		"\u019d\7\27\2\2\u019d\u019e\5\24\13\2\u019e\u019f\5\62\32\2\u019f\u01a2"+
		"\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019c\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2"+
		"\63\3\2\2\2\u01a3\u01a4\7\30\2\2\u01a4\u01a5\7<\2\2\u01a5\u01a8\5\64\33"+
		"\2\u01a6\u01a8\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\65"+
		"\3\2\2\2\u01a9\u01aa\5$\23\2\u01aa\u01ab\5\66\34\2\u01ab\u01ae\3\2\2\2"+
		"\u01ac\u01ae\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\67"+
		"\3\2\2\2\u01af\u01b0\5$\23\2\u01b0\u01b1\58\35\2\u01b1\u01b4\3\2\2\2\u01b2"+
		"\u01b4\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b49\3\2\2\2"+
		"\u01b5\u01b6\5$\23\2\u01b6\u01b7\5:\36\2\u01b7\u01ba\3\2\2\2\u01b8\u01ba"+
		"\3\2\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba;\3\2\2\2\u01bb"+
		"\u01bc\5$\23\2\u01bc\u01bd\5<\37\2\u01bd\u01c0\3\2\2\2\u01be\u01c0\3\2"+
		"\2\2\u01bf\u01bb\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0=\3\2\2\2\u01c1\u01c2"+
		"\5$\23\2\u01c2\u01c3\5> \2\u01c3\u01c6\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5"+
		"\u01c1\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6?\3\2\2\2\u01c7\u01c8\5D#\2\u01c8"+
		"\u01c9\5@!\2\u01c9\u01ce\3\2\2\2\u01ca\u01cb\7\62\2\2\u01cb\u01ce\7\26"+
		"\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c7\3\2\2\2\u01cd\u01ca\3\2\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01ceA\3\2\2\2\u01cf\u01d0\5$\23\2\u01d0\u01d1\5B\"\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d2\3\2"+
		"\2\2\u01d4C\3\2\2\2\u01d5\u01d6\5\16\b\2\u01d6\u01d7\7<\2\2\u01d7\u01d8"+
		"\5 \21\2\u01d8\u01d9\7\26\2\2\u01d9\u01fa\3\2\2\2\u01da\u01db\5\16\b\2"+
		"\u01db\u01dc\7<\2\2\u01dc\u01dd\7\13\2\2\u01dd\u01de\5\24\13\2\u01de\u01df"+
		"\5 \21\2\u01df\u01e0\7\26\2\2\u01e0\u01fa\3\2\2\2\u01e1\u01e2\7$\2\2\u01e2"+
		"\u01e3\7\31\2\2\u01e3\u01e4\7<\2\2\u01e4\u01e5\7\32\2\2\u01e5\u01fa\7"+
		"\26\2\2\u01e6\u01e7\7$\2\2\u01e7\u01e8\7\31\2\2\u01e8\u01e9\7<\2\2\u01e9"+
		"\u01ea\5\64\33\2\u01ea\u01eb\7\32\2\2\u01eb\u01ec\7\26\2\2\u01ec\u01fa"+
		"\3\2\2\2\u01ed\u01fa\5&\24\2\u01ee\u01fa\5(\25\2\u01ef\u01fa\5*\26\2\u01f0"+
		"\u01fa\5,\27\2\u01f1\u01fa\5.\30\2\u01f2\u01f3\7%\2\2\u01f3\u01f4\7\31"+
		"\2\2\u01f4\u01f5\5\24\13\2\u01f5\u01f6\5\62\32\2\u01f6\u01f7\7\32\2\2"+
		"\u01f7\u01f8\7\26\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01d5\3\2\2\2\u01f9\u01da"+
		"\3\2\2\2\u01f9\u01e1\3\2\2\2\u01f9\u01e6\3\2\2\2\u01f9\u01ed\3\2\2\2\u01f9"+
		"\u01ee\3\2\2\2\u01f9\u01ef\3\2\2\2\u01f9\u01f0\3\2\2\2\u01f9\u01f1\3\2"+
		"\2\2\u01f9\u01f2\3\2\2\2\u01faE\3\2\2\2\32gs\u0086\u00a5\u00b0\u00b7\u00ce"+
		"\u00d5\u00e5\u00eb\u0133\u0147\u016d\u019a\u01a1\u01a7\u01ad\u01b3\u01b9"+
		"\u01bf\u01c5\u01cd\u01d3\u01f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}