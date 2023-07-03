grammar scanner;

program:
    PROGRAM ID SEMI varssect stmtsect
;

varssect:
    VAR vardecl*
;

vardecl:
    typespec ID SEMI
;

typespec:
    BOOL 
    | INT 
    | REAL 
    | STRING
;

stmtsect:
    BEGIN stmt+ END
;

stmt:
    assignstmt 
    | ifstmt 
    | readstmt 
    | repeatstmt 
    | writestmt
;

assignstmt:
    ID ASSIGN expr SEMI
;

ifstmt:
    IF expr THEN stmt+ (ELSE stmt+)? END
;

readstmt:
    READ ID SEMI
;

repeatstmt:
    REPEAT stmt+ UNTIL expr
;

writestmt:
    WRITE expr SEMI
;

expr:
    expr op expr 
    | LPAR expr RPAR 
    | TRUE 
    | FALSE 
    | INT_VAL 
    | REAL_VAL 
    | STR_VAL 
    | ID
;

op: 
    LT 
    | EQ 
    | PLUS 
    | MINUS 
    | TIMES 
    | OVER
;

BEGIN        : 'begin'              ;
BOOL         : 'bool'               ;
ELSE         : 'else'               ;
END          : 'end'                ;
FALSE        : 'false'              ;
IF           : 'if'                 ;
INT          : 'int'                ;
PROGRAM      : 'program'            ;
READ         : 'read'               ;
REAL         : 'real'               ;
REPEAT       : 'repeat'             ;
STRING       : 'string'             ;
THEN         : 'then'               ;
TRUE         : 'true'               ;
UNTIL        : 'until'              ;
VAR          : 'var'                ;
WRITE        : 'write'              ;
ASSIGN       : ':='                 ;
EQ           : '='                  ;
LT           : '<'                  ;
PLUS         : '+'                  ;
MINUS        : '-'                  ;
TIMES        : '*'                  ;
OVER         : '/'                  ;
LPAR         : '('                  ;
RPAR         : ')'                  ;
SEMI         : ';'                  ;
ID           : [a-zA-Z][a-zA-Z0-9]* ;
REAL_VAL     : [0-9]*[.][0-9]*      ;
INT_VAL      : [0-9]+               ;
STR_VAL      : '"' ~["]* '"'        ;
WHITESPACE   : [ \t\r\n]+           -> skip;
COMMENT      : '{' ~[{}]* '}'       -> skip;
UNKNOWN      : .                    ;
