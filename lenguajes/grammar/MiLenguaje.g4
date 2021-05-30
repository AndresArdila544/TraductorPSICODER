grammar MiLenguaje;

commands    : command commands
            | EOF
            |
            ;

command     : conditional
            | repeat
            | printexpr
            | VAR ID 'as' expr SMCOLON
            ;

conditional : 'if' expr ROP expr 'then' commands 'endif';
repeat        : 'repeat' expr 'times' commands 'endrepeat';
printexpr    : 'print' expr SMCOLON ;

expr:    expr MULOP expr
    |    expr SUMOP expr
    |    DOUBLE
    |    PIZQ expr PDER
    |     ID
    ;

COMMENT         : '/*' .*? '*/' -> skip ;
LINE_COMMENT     : '//' ~[\r\n]* -> skip ;
WS        : [ \t\r\n]+ -> skip ;
VAR        : 'var';
PIZQ    : '(' ;
PDER    : ')' ;
ROP        : ( '<' | '<=' | '>=' | '>' | '==' | '!=' ) ;
SMCOLON : ';' ;
MULOP    : ( '*' | '/' );
SUMOP    : ('+' | '-') ;
DOUBLE    : [0-9]+( | [.][0-9]+);
ID         : [a-zA-Z][a-zA-Z0-9_]* ;

// Tokens
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
TK_COMILLA_SEN : '\'';
TK_COMILLA_DOB : '\"';
TK_PYC : ';';
TK_COMA : ',';
TK_PUNTO : '.';
TK_PAR_IZQ : '(';
TK_PAR_DER : ')';

funcion_principal: "funcion_principal"
fin_principal

booleano
caracter
entero
real
cadena
entero

leer
imprimir

si
entonces
fin_si
si_no

mientras
hacer
fin_mientras

para
fin_para

seleccionar
entre
caso
romper
defecto
fin_seleccionar

estructura
fin_estructura

funcion
retornar
fin_funcion

falso
verdadero
