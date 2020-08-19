parser grammar matrizParser;

options { tokenVocab=matrizLexer; }

sentencia:sentencias*;
sentencias
    :   asignacion pc      #Asigna
    |   e pc                #Operacion
    |   imprime pc         #Imprim
    ;
imprime
    :   IMPRIME LPAREN e RPAREN
    ;
asignacion
	:	 ID EQ e
	;
pc:';';
e
 	:   e pow <assoc=right> INT      #Potencias
    |   e mult e                        #Multiplicacion
    |   e div  e                        #Divicion
    |   e resta e                       #Minus
 	|   e suma e                        #Plus
 	|   LPAREN e RPAREN                 #Paren
 	|   TRANS '(' e')'                  #Trans
 	|   arrayInitializer                #R1
    |   ID                              #Variable
    |   INT                             #Int
 	;
suma:PLUS;
resta:MINUS;
div:DIV;
mult:MULT;
pow:POW;

arrayInitializer
    :	'{' variableInitializerList '}' #R2
    ;
variableInitializerList
    :	variableInitializer (',' variableInitializer)*  #R3
    ;
variableInitializer
    :	arrayInitializer        #Damearry
    |   INT                     #DAMEint
    ;
