lexer grammar AbfahrtLexer;

@header {
package org.example.aufgabe1;
}

TIME: ([01][0-9]|[2][0-9])':'[0-5][0-9];
BUS: 'Bus';
TRAIN: 'RE';
VEHICLENUMBER: [0-9]+;
SHIP: 'KAT';
TO: 'nach';
DAYS: (('Mo' | 'Di' | 'Mi' | 'Do' | 'Fr' | 'Sa' | 'So') ('-' ('Mo' | 'Di' | 'Mi' | 'Do' | 'Fr' | 'Sa' | 'So'))?) | 'täglich';
EXCEPT: 'nicht';
DAY: [0-3]?[0-9] '.';
MONTH: ('Jan' | 'Feb' | 'Mär' | 'Apr' | 'Mai' | 'Jun' | 'Jul' | 'Aug' | 'Sep' | 'Okt' | 'Nov' | 'Dez')','?;
UNTIL: '-';
SEPERATOR: [,;];
TARGET: [a-zA-ZäöüÄÖÜß/,()]+;
WS: [ \t\r\n]+ -> skip;