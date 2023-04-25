grammar scanner;

declaration: constDecl | typeDecl | varDecl;
constDecl: CONST (constSpec | L_PAREN (constSpec eos)* R_PAREN);
constSpec: identifierList (type_? ASSIGN expressionList)?;



BREAK            : 'break'              ;
CASE             : 'case'               ;
CHAN             : 'chan'               ;
CONST            : 'const'              ;
CONTINUE         : 'continue'           ;
DEFAULT          : 'default'            ;
DEFER            : 'defer'              ;
ELSE             : 'else'               ;
FALLTHROUGH      : 'fallthrough'        ;
FOR              : 'for'                ;
FUNC             : 'func'               ;
GO               : 'go'                 ;
GOTO             : 'goto'               ;
IF               : 'if'                 ;
IMPORT           : 'import' ~[\r\n]* -> skip; 
INTERFACE        : 'interface'          ;
MAP              : 'map'                ;
PACKAGE          : 'package' ~[\r\n]* -> skip; 
RANGE            : 'range'              ;
RETURN           : 'return'             ;
SELECT           : 'select'             ;
STRUCT           : 'struct'             ;
SWITCH           : 'switch'             ;
TYPE             : 'type'               ;
VAR              : 'var'                ;
FLOAT32          : 'float32'            ; 
FLOAT64          : 'float64'            ; 
STRING           : 'string'             ; 
TRUE             : 'true'               ; 
FALSE            : 'false'              ;



PLUS             : '+'                  ;
MINUS            : '-'                  ;
TIMES            : '*'                  ;
OVER             : '/'                  ;
MOD              : '%'                  ;
PLUSEQ           : '+='                 ;
MINUSEQ          : '-='                 ;
TIMESEQ          : '*='                 ;
OVEREQ           : '/='                 ;
MODEQ            : '%='                 ;
AND              : '&&'                 ;  
OR               : '||'                 ;
PLUSONE          : '++'                 ;
MINUSONE         : '--'                 ;
ISEQUAL          : '=='                 ;
LESSTHAN         : '<'                  ;
MORETHAN         : '>'                  ;
EQUAL            : '='                  ;
NOT              : '!'                  ;
NOTEQUAL         : '!='                 ;
LESSEQTHAN       : '<='                 ;
MOREEQTHAN       : '>='                 ;
ASSIGN           : ':='                 ;
LPAR             : '('                  ;
RPAR             : ')'                  ;
LBRACK           : '['                  ;
RBRACK           : ']'                  ;
LCURLYBRACES     : '{'                  ;
RCURLYBRACES     : '}'                  ;
COMMA            : ','                  ;
DOT              : '.'                  ;
SEMI             : ';'                  ;
COLON            : ':'                  ;

ID               : [a-zA-Z][a-zA-Z0-9_]* ;
REAL_VAL         : [0-9]*[.][0-9]*      ;
INT_VAL          : [0-9]+               ;
STR_VAL          : '"' ~["]* '"'        ;
COMMENT          : '//' ~[\r\n]* -> skip; 
BLOCK_COMMENT    : '/*' .*? '*/' -> skip; 
WHITESPACE       : [ \t\r\n]+           -> skip;
UNKNOWN          : .                    ;