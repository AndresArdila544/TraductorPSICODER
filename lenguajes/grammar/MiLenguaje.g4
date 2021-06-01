grammar MiLenguaje;


program :  funcandstruct mainfunction funcandstruct EOF;



funcandstruct : FUNCION type ID TK_PAR_IZQ declarearguments TK_PAR_DER HACER funccontent FIN_FUNCION funcandstruct
              |FUNCION type ID TK_PAR_IZQ TK_PAR_DER HACER funccontent FIN_FUNCION funcandstruct
              |ESTRUCTURA ID structcontent FIN_ESTRUCTURA funcandstruct
              |
              ;

declarearguments : type ID declareargumentslist;
declareargumentslist :TK_COMA type ID declareargumentslist
|
;

mainfunction : FUNCION_PRINCIPAL instructionlist FIN_PRINCIPAL;

type : BOOLEANO
| CARACTER
| ENTERO
| REAL
| CADENA
| ID;

standardtype :BOOLEANO
|CARACTER
|ENTERO
|REAL
|CADENA;

funccontent:fninstructionlist RETORNAR expression TK_PYC
| fninstructionlist ROMPER TK_PYC;

structcontent : standardtype ID declarationlist TK_PYC structcontent
|standardtype ID TK_ASIG expression declarationlist TK_PYC structcontent
|ID ID declarationlist TK_PYC structcontent
|ID ID TK_ASIG expression declarationlist TK_PYC structcontent
|;

expression : expression binaryoperator term
| term;

term : unaryoperator value
|value;

value :TK_PAR_IZQ expression TK_PAR_DER
| ID structurelist
|TK_ENTERO
|TK_REAL
|TK_CADENA
|TK_CARACTER
|FALSO
|VERDADERO
|ID TK_PAR_IZQ expression argumentlist TK_PAR_DER
|ID TK_PAR_IZQ TK_PAR_DER;

argumentlist : TK_COMA expression argumentlist
|;

binaryoperator : TK_MAS
| TK_MENOS
|TK_MULT
| TK_DIV
|TK_MOD
|TK_ASIG
|TK_MENOR
|TK_MAYOR
|TK_MENOR_IGUAL
|TK_MAYOR_IGUAL
|TK_IGUAL
|TK_Y
|TK_O
|TK_DIF
|TK_ASIG;

unaryoperator:TK_NEG
|TK_MENOS;

declarationlist : TK_COMA ID declarationlist
|TK_COMA ID TK_ASIG expression declarationlist
|;

instructionlist : instruction instructionlist
|;

instruction : standardtype ID declarationlist TK_PYC
|standardtype ID TK_ASIG expression declarationlist TK_PYC
|ID ID declarationlist TK_PYC
|ID ID TK_ASIG expression declarationlist TK_PYC
|ID TK_ASIG expression TK_PYC
| ID structurelist TK_ASIG expression TK_PYC
| ID TK_PAR_IZQ expression argumentlist TK_PAR_DER TK_PYC
| ID TK_PAR_IZQ TK_PAR_DER TK_PYC
| LEER TK_PAR_IZQ ID TK_PAR_DER TK_PYC
| LEER TK_PAR_IZQ ID structurelist TK_PAR_DER TK_PYC
|conditional
|whilePSI
|forPSI
|dowhile
|switchPSI
|IMPRIMIR TK_PAR_IZQ expression expressionlist TK_PAR_DER TK_PYC;

conditional : SI TK_PAR_IZQ expression TK_PAR_DER ENTONCES ifinstructionlist FIN_SI
| SI TK_PAR_IZQ expression TK_PAR_DER ENTONCES ifinstructionlist SI_NO ifinstructionlist FIN_SI;

whilePSI : MIENTRAS TK_PAR_IZQ expression TK_PAR_DER HACER whinstructionlist FIN_MIENTRAS;

forPSI : PARA TK_PAR_IZQ ID TK_ASIG expression declarationlist TK_PYC expression TK_PYC expression TK_PAR_DER HACER frinstructionlist FIN_PARA
|PARA TK_PAR_IZQ expression TK_PYC expression TK_PYC expression TK_PAR_DER HACER frinstructionlist FIN_PARA
|PARA TK_PAR_IZQ standardtype ID TK_ASIG expression declarationlist TK_PYC expression TK_PYC expression TK_PAR_DER HACER frinstructionlist FIN_PARA;

dowhile : HACER dwinstructionlist MIENTRAS TK_PAR_IZQ expression TK_PAR_DER TK_PYC;

switchPSI : SELECCIONAR TK_PAR_IZQ ID TK_PAR_DER ENTRE caselist FIN_SELECCIONAR;
caselist : CASO expression TK_DOSP swinstructionlist ROMPER TK_PYC caselist
| CASO expression TK_DOSP swinstructionlist caselist
| DEFECTO TK_DOSP swinstructionlist caselist
|DEFECTO TK_DOSP swinstructionlist ROMPER TK_PYC caselist
|;

expressionlist : TK_COMA expression expressionlist
|;

structurelist : TK_PUNTO ID structurelist
|;

stinstructionlist : instruction stinstructionlist
|;

fninstructionlist : instruction fninstructionlist
|;

ifinstructionlist : instruction ifinstructionlist
|;

whinstructionlist : instruction whinstructionlist
|;

frinstructionlist : instruction frinstructionlist
|;

dwinstructionlist : instruction dwinstructionlist
| ROMPER TK_PYC
|;

swinstructionlist : instruction swinstructionlist
|;


COMMENT         : '/*' .*? '*/' -> skip ;
LINE_COMMENT     : '//' ~[\r\n]* -> skip ;
WS        : [ \t\r\n]+ -> skip ;

TK_MAS : '+';
TK_MENOS : '-';
TK_MULT : '*';
TK_DIV : '/';
TK_MOD : '%';
TK_ASIG : '=';
TK_MENOR : '<';
TK_MAYOR : '>';
TK_MENOR_IGUAL : '<=';
TK_MAYOR_IGUAL : '>=';
TK_IGUAL : '==';
TK_Y : '&&';
TK_O : '||';
TK_DIF : '!=';
TK_NEG : '!';
TK_DOSP : ':';
TK_PYC : ';';
TK_COMA : ',';
TK_PUNTO : '.';
TK_PAR_IZQ : '(';
TK_PAR_DER : ')';
TK_COMILLA_SEN : '\'';
TK_COMILLA_DOB : '"';

FUNCION_PRINCIPAL: 'funcion_principal';
FIN_PRINCIPAL: 'fin_principal';

BOOLEANO:'booleano';
CARACTER:'caracter';
ENTERO:'entero';
REAL:'real';
CADENA:'cadena';

LEER:'leer';
IMPRIMIR:'imprimir';

SI:'si';
ENTONCES:'entonces';
FIN_SI:'fin_si';
SI_NO:'si_no';

MIENTRAS:'mientras';
HACER:'hacer';
FIN_MIENTRAS:'fin_mientras';

PARA: 'para';
FIN_PARA: 'fin_para';

SELECCIONAR: 'seleccionar';
ENTRE: 'entre';
CASO: 'caso';
ROMPER: 'romper';
DEFECTO: 'defecto';
FIN_SELECCIONAR: 'fin_seleccionar';

ESTRUCTURA: 'estructura';
FIN_ESTRUCTURA: 'fin_estructura';

FUNCION: 'funcion';
RETORNAR: 'retornar';
FIN_FUNCION: 'fin_funcion';

FALSO: 'falso';
VERDADERO: 'verdadero';

ID : [a-zA-Z][a-zA-Z0-9_]* ;
TK_ENTERO : (|'-')[0-9]+ ;
TK_REAL : (|'-')[0-9]+ TK_PUNTO [0-9]+;
TK_CADENA              : '"' .*? '"';
TK_CARACTER               : '\''[a-zA-Z]'\'';