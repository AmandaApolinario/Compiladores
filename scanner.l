%{
#include <stdio.h>
#include <ctype.h>

void reservedToken(){
    //transform to uppercase
    char* reserved = yytext;
    
    printf("%d: %s -> ",yylineno, reserved);

    for(int i = 0; reserved[i]; i++){
        reserved[i] = toupper(reserved[i]);
    }

    printf("%s\n",reserved);
    
}

void printValue(char* symbol, char* lex){
    printf("%d: %s -> %s\n",yylineno, symbol, lex);
}

%}

%option yylineno

%%
begin                { reservedToken(); }
bool                 { reservedToken(); }
else                 { reservedToken(); }
end                  { reservedToken(); }
false                { reservedToken(); }
if                   { reservedToken(); }
int                  { reservedToken(); }
program              { reservedToken(); }
read                 { reservedToken(); }
real                 { reservedToken(); }
repeat               { reservedToken(); }
string               { reservedToken(); }
then                 { reservedToken(); }
true                 { reservedToken(); }
until                { reservedToken(); }
var                  { reservedToken(); }
write                { reservedToken(); }
[:][=]               { printValue(yytext, "ASSIGN") ;}
[=]                  { printValue(yytext, "EQ") ;}
[<]                  { printValue(yytext, "LT") ;}
[+]                  { printValue(yytext, "PLUS") ;}
[-]                  { printValue(yytext, "MINUS") ;}
[*]                  { printValue(yytext, "TIMES") ;}
[/]                  { printValue(yytext, "SLASH") ;}
[(]                  { printValue(yytext, "LPAR") ;}
[)]                  { printValue(yytext, "RPAR") ;}
[;]                  { printValue(yytext, "SEMI") ;}
[A-Za-z][A-Za-z0-9]* { printValue(yytext, "ID") ;}
[0-9]*               { printValue(yytext, "INT_VAL") ;}
["][^"]*["]          { printValue(yytext, "STR_VAL"); }
\n                   {}
[{][^\{\}]*[}]       {}
.                    { /* ignore white space */ }

%%

