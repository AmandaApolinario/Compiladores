%output "parser.c"          // File name of generated parser.
%defines "parser.h"         // Produces a 'parser.h'
%define parse.error verbose // Give proper messages when a syntax error is found.
%define parse.lac full      // Enable LAC to improve syntax error handling.

%{
#include <stdio.h>
int yylex(void);
void yyerror(char const *s);
%}

%token NUMBER PLUS MINUS TIMES OVER ENTER OPEN_PAREN CLOSE_PAREN ZERO ONE IF ELSE OTHER

%%
line: expr ENTER ;
expr: expr op expr | OPEN_PAREN expr CLOSE_PAREN | NUMBER ;
op: PLUS | MINUS | TIMES | OVER ;

%%
int main(void) {
    if (yyparse() == 0) printf("PARSE SUCCESSFUL!\n");
    else                printf("PARSE FAILED!\n");
    return 0;
}
