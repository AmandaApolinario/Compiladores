lexer grammar scanner;

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