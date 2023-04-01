%{
#include <stdio.h>
#include <ctype.h>

int count = 0; 

void reservedToken(){
    //transform to uppercase
    char* reserved = yytext;
    
    printf("%d: %s -> ",count,reserved);

    for(int i = 0; reserved[i]; i++){
        reserved[i] = toupper(reserved[i]);
    }

    printf("%s\n",reserved);
    
}

%}

%%
begin       { reservedToken(); }
bool        { reservedToken(); }
else        { reservedToken(); }
end         { reservedToken(); }
false       { reservedToken(); }
if          { reservedToken(); }
int         { reservedToken(); }
program     { reservedToken(); }
read        { reservedToken(); }
real        { reservedToken(); }
repeat      { reservedToken(); }
string      { reservedToken(); }
then        { reservedToken(); }
true        { reservedToken(); }
until       { reservedToken(); }
var         { reservedToken(); }
write       { reservedToken(); }
.    { /* ignore white space */ }
\n          { count++; }

%%

