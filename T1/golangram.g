grammar golangram;

begin: ((functionDecl | methodDecl | declaration) eos)* EOF;

functionDecl: FUNC ID (signature block?);

declaration: (constDecl | typeDecl | varDecl);

typeSpec: ID ASSIGN? type_;

constDecl: CONST (constSpec | LPAR (constSpec eos)* RPAR);

constSpec: idList (type_? ASSIGN expressionList)?;

idList: ID (COMMA ID)*;

expressionList: expression (COMMA expression)*;

typeDecl: TYPE (typeSpec | LPAR (typeSpec eos)* RPAR);

methodDecl: FUNC receiver ID ( signature block?);

receiver: parameters;

varDecl: VAR (varSpec | LPAR (varSpec eos)* RPAR);

varSpec:
	idList (
		type_ (ASSIGN expressionList)
		| ASSIGN expressionList
);

block: LCURLYBRACES statementList? RCURLYBRACES;

statementList: ((SEMI?) statement (SEMI?))+;

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
      sendStmt
    | incDecStmt
	| assignment
	| expressionStmt;

type_: typeName | typeLit | LPAR type_ RPAR;

typeName: qualifiedIdent | ID;

qualifiedIdent: ID DOT ID;

expressionStmt: expression;

sendStmt: channel = expression RECEIVE expression;

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

sliceType: LBRACK RBRACK elementType;

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

parameterDecl: idList? type_;

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
		| slice_
		| arguments
	);

identifierList: ID (COMMA ID)*;

embeddedField: TIMES? typeName;

typeLit:
	arrayType
	| functionType
	| sliceType
;

operand: basicLit | ID | LPAR expression RPAR;

basicLit:
	INT_VAL
	| STR_VAL
	| REAL_VAL;

index: LBRACK expression RBRACK;

slice_:
	LBRACK (
		expression? COLON expression?
		| expression? COLON expression COLON expression
	) RBRACK;

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