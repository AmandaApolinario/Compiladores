%output "parser.c"          // File name of generated parser.
%defines "parser.h"         // Produces a 'parser.h'
%define parse.error verbose // Give proper messages when a syntax error is found.
%define parse.lac full      // Enable LAC to improve syntax error handling.

%{
#include <stdio.h>
int yylex(void);
void yyerror(char const *s);
%}

%token A OPEN_PAREN CLOSE_PAREN

%%

expression: OPEN_PAREN expression CLOSE_PAREN  | A ;

%%

int main() {
  if (yyparse() == 0) {
    printf("VALID\n");
  } else {
    printf("SYNTAX ERROR: unbalanced parenthes\n");
  }
  return 0;
}

