lexer grammar AbfahrtLexer;

@header {
package org.example.aufgabe1;
}

TIME: ([01][0-9]|[2][0-3])':'[0-5][0-9];
VEHICLE: 'Bus' | 'RE' | 'KAT';
VEHICLENUMBER: [0-9]+;
TO: 'nach';
DAYS: (('Mo' | 'Di' | 'Mi' | 'Do' | 'Fr' | 'Sa' | 'So') (' - ' ('Mo' | 'Di' | 'Mi' | 'Do' | 'Fr' | 'Sa' | 'So'))?','?) | 'täglich';
EXCEPT: 'nicht';
DAY: [0-3]?[0-9] '.';
MONTH: ('Jan' | 'Feb' | 'Mär' | 'Apr' | 'Mai' | 'Jun' | 'Jul' | 'Aug' | 'Sep' | 'Okt' | 'Nov' | 'Dez')','?;
SEPERATOR: [,;];
TARGET: [a-zA-ZäöüÄÖÜß/,()]+;
WS: [ \t\r\n]+ -> channel(HIDDEN);