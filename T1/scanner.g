grammar scanner;

declaration: constDecl | typeDecl | varDecl;
constDecl: CONST (constSpec | LPAR (constSpec eos)* RPAR);
constSpec: IDList (type_? ASSIGN expressionList)?;
IDList: ID (COMMA ID)*;
expressionList: expression (COMMA expression)*;
typeDecl: TYPE (typeSpec | LPAR (typeSpec eos)* RPAR);
typeSpec: ID ASSIGN? type_;
functionDecl: FUNC ID (signature block?);
methodDecl: FUNC receiver ID ( signature block?);
receiver: parameters;
varDecl: VAR (varSpec | LPAR (varSpec eos)* RPAR);
varSpec:
	IDList (
		type_ (ASSIGN expressionList)?
		| ASSIGN expressionList
	);
block: LCURLYBRACES statementList? RCURLYBRACES;
statementList: ((SEMI?) statement eos)+;

statement:
	declaration
	| labeledStmt
	| simpleStmt
	| returnStmt
	| breakStmt
	| continueStmt
	| fallthroughStmt
	| block
	| ifStmt
	| switchStmt
	| forStmt;

simpleStmt:
	incDecStmt
	| assignment
	| expressionStmt;

type_: typeName | LPAR type_ RPAR;

typeName: qualifiedIdent | ID;

qualifiedIdent: ID DOT ID;

expressionStmt: expression;
incDecStmt: expression (PLUSONE | MINUSONE);

assignment: expressionList assign_op expressionList;

assign_op: (
	PLUS
	| MINUS
	| OR
	| TIMES
	| OVER
    | MOD
)? ASSIGN;


emptyStmt: SEMI;

labeledStmt: ID COLON statement?;

returnStmt: RETURN expressionList?;

breakStmt: BREAK ID?;
continueStmt: CONTINUE ID?;

gotoStmt: GOTO ID;

fallthroughStmt: FALLTHROUGH;

deferStmt: DEFER expression;

ifStmt:
	IF ( expression
			| eos expression
			| simpleStmt eos expression
			) block (
		ELSE (ifStmt | block)
	)?;

switchStmt: exprSwitchStmt | typeSwitchStmt;

exprSwitchStmt:
	SWITCH (expression?
					| simpleStmt? eos expression?
					) LCURLYBRACES exprCaseClause* RCURLYBRACES;

exprCaseClause: exprSwitchCase COLON statementList?;

exprSwitchCase: CASE expressionList | DEFAULT;

typeSwitchStmt:
	SWITCH ( typeSwitchGuard
					| eos typeSwitchGuard
					| simpleStmt eos typeSwitchGuard)
					 LCURLYBRACES typeCaseClause* RCURLYBRACES;

typeSwitchGuard: (ID ASSIGN)? operand DOT LPAR TYPE RPAR;

typeCaseClause: typeSwitchCase COLON statementList?;

typeSwitchCase: CASE typeList | DEFAULT;

typeList: (type_) (COMMA (type_))*;

forStmt: FOR (expression? | forClause | rangeClause?) block;

forClause:
	initStmt = simpleStmt? eos expression? eos postStmt = simpleStmt?;

rangeClause: (
		expressionList ASSIGN
		| IDList ASSIGN
	)? RANGE expression;
    

arrayType: LBRACK arrayLength RBRACK elementType;

arrayLength: expression;

elementType: type_;

methodSpec:
	ID parameters result
	| ID parameters;

functionType: FUNC signature;

signature:
	parameters result
	| parameters;

result: parameters | type_;

parameters:
	LPAR (parameterDecl (COMMA parameterDecl)* COMMA?)? RPAR;

parameterDecl: IDList? type_;

expression:
	operand
	| unary_op = (
		PLUS
		| MINUS
		| NOT
		| TIMES
	) expression
	| expression add_op = (PLUS | MINUS | OR) expression
	| expression rel_op = (
		ISEQUAL
		| NOTEQUAL
		| LESSTHAN
		| LESSEQTHAN
		| MORETHAN
		| MOREEQTHAN
	) expression
	| expression AND expression
	| expression OR expression;

identifierList: ID (COMMA ID)*;

embeddedField: TIMES? typeName;

typeLit:
	arrayType
	| functionType
;

operand: ID | LPAR expression RPAR;

eos:
	SEMI
	| EOF
;

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