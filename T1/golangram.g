grammar golangram;

begin: ((functionDecl | declaration) eos)* EOF;

functionDecl: FUNC ID (parameters block?);

declaration: (constDecl | typeDecl | varDecl);

typeSpec: ID ASSIGN? type_;

constDecl: CONST (constSpec | LPAR (constSpec eos)* RPAR);

constSpec: idList (type_? ASSIGN expressionList)?;

declareAssignment: ID DECLARE_ASSIGN basicLit;

idList: ID (COMMA ID)*;

expressionList: expression (COMMA expression)*;

typeDecl: TYPE (typeSpec | LPAR (typeSpec eos)* RPAR);

varDecl: VAR varSpec;

varSpec:
	idList (
		type_ (ASSIGN expressionList)?
		| ASSIGN expressionList
);

block: LCURLYBRACES statementList? RCURLYBRACES;

statementList: ((SEMI?) statement (SEMI?))+;

statement:
	declaration
	| labeledStmt
	| simpleStmt
	| returnStmt
	| BREAK
	| CONTINUE
	| fallthroughStmt
	| block
	| ifStmt
	| switchStmt
	| forStmt;

simpleStmt: incDecStmt #simpleIncDecStmt
    | declareAssignment #simpleDeclareAssignment
	| assignment #simpleAssignment
	| expressionStmt #simpleExpressionStmt
	; 

type_: ID | 
		typeLit | 
		LPAR type_ RPAR;

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
)? (ASSIGN | DECLARE_ASSIGN);


emptyStmt: SEMI;

labeledStmt: ID COLON statement;

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
		| idList DECLARE_ASSIGN
	)? RANGE expression;
    

arrayType: LBRACK arrayLength RBRACK elementType;

arrayLength: expression;

elementType: type_;

functionType: FUNC parameters;

result: parameters | type_;

parameters:
	LPAR (parameterDecl (COMMA parameterDecl)* COMMA?)? RPAR;

parameterDecl: ID? type_;

expression:
	primaryExpr
	| operand
	| unary_op = (
		PLUS
		| TIMES
		| MINUS
		| OVER
		| NOT
	) expression
	| expression mul_op = (
		TIMES
		| OVER
		| MOD
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

primaryExpr:
	operand
	| primaryExpr (
		(DOT ID)
		| index
		| arguments
	);

identifierList: ID (COMMA ID)*;

embeddedField: TIMES? ID;

typeLit:
	arrayType
	| functionType
;

operand: basicLit #operandBasicLit
		| ID #operandID
		| LPAR expression RPAR #operandLRPAR
		;

basicLit:
	INT_VAL #intVal
	| STR_VAL #strVal
	| REAL_VAL #realVal;

index: LBRACK expression RBRACK;

arguments:
	LPAR (
		(expressionList (COMMA expressionList)?) COMMA?
	)? RPAR;

eos:
	SEMI
	| EOF
	| EOS
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
ISEQUAL           : '=='                 ;
LESSTHAN         : '<'                  ;
MORETHAN         : '>'                  ;
ASSIGN            : '='                  ;
NOT              : '!'                  ;
NOTEQUAL         : '!='                 ;
LESSEQTHAN       : '<='                 ;
MOREEQTHAN       : '>='                 ;
DECLARE_ASSIGN   : ':='                 ;
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