%option outfile="scanner.c"
%option noyywrap
%option nounput
%option noinput

%{
#include "parser.h" // For the token types from bison.
%}

%%

"a"     { return A; }
"("     { return OPEN_PAREN; }
")"     { return CLOSE_PAREN; }
"\n"    { /* ignore enter */ }
" "     { /* ignore spaces */ }
.       { printf("LEXICAL ERROR: Unknown symbol %s\n", yytext);
          exit(EXIT_FAILURE); }
