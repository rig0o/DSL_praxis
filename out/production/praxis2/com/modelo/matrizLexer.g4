lexer grammar matrizLexer;

PC:';';
LCOR:'[';
RCOR:']';
LKEY:'{';
RKEY:'}';
LPAREN:'(';
RPAREN:')';
COMA:',';
EQ: '=';
PLUS:'+';
MINUS:'-';
MULT:'*';
DIV:'/';
POW:'^';
TRANS:'T'|'transpuesta';
IMPRIME:'print'|'PRINT';

WS:[ \r\n\t]->skip;
ID:LETTER (LETTER)*;
INT:DIGIT;
fragment
DIGIT:[0-9];
fragment
LETTER : [a-z][a-zA-Z_]* ;