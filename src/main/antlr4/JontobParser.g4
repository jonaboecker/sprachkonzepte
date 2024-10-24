// JontobParser.g4
parser grammar JontobParser;

@header {
package org.example.aufgabe2;
import org.example.aufgabe2.JontobLexer;
}

options { tokenVocab=JontobLexer; }

start
    : (line SEMICOLON)* EOF
    ;

line
    : assign | expr | IF LPAREN comp RPAREN LBRACE (line)+ RBRACE
    ;

comp
    : value (EQUAL | NEQUAL | LT | GT) value
    ;

assign
    : VAR (value | expr)
    ;

expr
    : value (ADD | SUB | MUL | DIV) value
    ;

value
    : INT | STRING | VAR
    ;

