lexer grammar JontobLexer;

@header {
package org.example.aufgabe2;
}

// Tokens
// Operators
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
EQUAL: '=';
NEQUAL: '!';
LT: '<';
GT: '>';

// Keywords
IF: 'if';

//Seperators
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
SEMICOLON: ';';

//Literals
INT: 'int'[0-9]+;
STRING: 'string"' ~["]* '"';

//Identifiers
VAR: 'var'[a-zA-Z0-9]+;

WS: [ \t\r\n]+ -> channel(HIDDEN);

InvalidChar: . ;
