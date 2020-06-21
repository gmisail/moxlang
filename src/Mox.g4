grammar Mox;

@header {
    package me.gmisail.parser;
}

/*

IMPORTS

import "array"
import "stdlib"

BLOCK

function main() -> int
    print("hello")
end

*/

program: importStatement* block EOF;
block: statement*;
classBlock: (variable | function)*;

statement: classDecl
         | moduleDecl
         | extern
         | variable
         | variableDelete
         | variableAssignmentStatement
         | variableArrayAssignment
         | function
         | functionCall
         | returnStatement
         | ifElseIf
         | whileLoop
         | forLoop
         ;

expr: bool
     | STRING
     | NUM
     | CHAR
     | variableAccess
     | variableArrayAccess
     | functionCall
     | builtInFunctions
     | boundedExpr
     | expr mulDivMod expr
     | expr addSub expr
     | expr bitwise expr
     | expr conditionals expr
     | expr operatorAnd expr
     | expr operatorOr expr
     ;

boundedExpr: '(' expr ')';

classDecl: 'class' NAME classBlock 'end';
moduleDecl: 'module' NAME classBlock 'end';

/* Variables */
variable: 'var' NAME ':' type variableAssignment?;
variableAssignmentStatement: variableAccess variableAssignment;
variableArrayAssignment: variableArrayAccess variableAssignment;
variableAssignment: equals (expr | variableCreate);
variableAccess: NAME ('.' NAME)*;
variableCreate: 'new' NAME '(' functionCallParams ')';
variableDestructor: '!';

variableDelete: 'delete' variableAccess;
variableArrayAccess: variableAccess '[' expr ']';

/* Functions */
function: 'function' NAME funcParams funcReturnType? block 'end';
funcReturnType: '->' type;
funcParam: NAME ':' type;
funcParams: '(' paramList? ')';

builtInFunctions: funcChar | funcSize;
funcSize: '__size' '(' type ')';
funcChar: '__char' '(' STRING ')';

/* External */
extern: funcExtern | varExtern;
funcExtern: 'extern' 'function' NAME funcParams funcReturnType?;
varExtern: 'extern' NAME '->' type;

/* Function Call */
functionCall: NAME ('.' NAME)* '(' functionCallParams ')';
functionCallParam: expr;
functionCallParams: (functionCallParam (',' functionCallParam)*)?;

paramList: funcParam (',' funcParam)*;
returnStatement: 'return' expr?;

/* Control Flow */
ifElseIf: ifStatement block (elseIfStatement block)* (elseStatement block)? 'end';
ifStatement: 'if' '(' expr ')';
elseIfStatement: 'else if' '(' expr ')';
elseStatement: 'else';

whileExpr: '(' expr ')';
whileLoop: 'while' whileExpr block 'end';

forLoop: forRangeLoop;
forFromExpr: 'from' expr;
forToExpr: 'to' expr;
forRangeLoop: 'for' '(' NAME forFromExpr forToExpr')' block 'end';

importStatement: 'import' STRING;

/* Operations */
bitwise: '&' | '|' | '~' | '<<' | '>>';
addSub: '+' | '-';
operatorAnd: 'and';
operatorOr: 'or';
mulDivMod: '*' | '/' | '%';
bool: 'true' | 'false';
equals: '=';

conditionals: '==' | '>=' | '<=' | '!=' | '<' | '>' ;

/* Other */
type: NAME (templateType)?;
templateType: '<' type '>';
nameList: NAME (',' NAME)*;


/*
    Lexer
*/
NAME: [a-zA-Z_][a-zA-Z_0-9]*;
STRING : '"' ~["\r\n]* '"';
CHAR : '\'' ~['] '\'';
NUM: INT | FLOAT;
INT: Digit+;
FLOAT: Digit+ '.' Digit* ExponentPart? | '.' Digit+ ExponentPart? | Digit+ ExponentPart;

fragment Digit : [0-9];
fragment ExponentPart : [eE] [+-]? Digit+;

fragment HexDigit : [0-9a-fA-F];
fragment HexExponentPart : [pP] [+-]? Digit+;

NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
WS: [ \t\u000C\r\n]+ -> skip;

LINE_COMMENT: '#' ~[\r\n]* -> skip;
BLOCK_COMMENT: '##' .*? '##' -> skip;