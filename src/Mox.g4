grammar Mox;

@header {
    package me.gmisail.parser;
}

program: block EOF;
block: statement*;
classBlock: (variable | function)*;

statement: classDecl
         | moduleDecl
         | variable
         | variableDelete
         | variableAssignmentStatement
         | function
         | functionCall
         | returnStatement
         | ifElseIf
         | whileLoop
         ;

expr: bool
     | STRING
     | NUM
     | variableAccess
     | functionCall
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
moduleDecl: 'moduleNode' NAME classBlock 'end';

/* Variables */
variable: 'var' NAME ':' type variableAssignment?;
variableAssignmentStatement: NAME variableAssignment;
variableAssignment: ' = ' (expr | variableCreate);
variableAccess: NAME ('.' NAME)*;
variableCreate: 'new' NAME '(' functionCallParams ')';
variableDelete: 'delete' variableAccess;

/* Functions */
function: 'function' NAME funcParams funcReturnType? block 'end';
funcReturnType: '->' type;
funcParam: NAME ':' type;
funcParams: '(' paramList? ')';

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
forLoop: 'for' '(' NAME 'in' NAME ')' block 'end';

/* Operations */
bitwise: '&' | '|' | '~' | '<<' | '>>';
addSub: '+' | '-';
operatorAnd: 'and';
operatorOr: 'or';
mulDivMod: '*' | '/' | '%';
bool: 'true' | 'false';

conditionals: '==' | '>=' | '<=' | '!=';

/* Other */
type: NAME (templateType)?;
templateType: '<' type '>';
nameList: NAME (',' NAME)*;

/*
    Lexer
*/
NAME: [a-zA-Z_][a-zA-Z_0-9]*;
STRING : '"' ~ ["\r\n]* '"';
NUM: INT | FLOAT;
INT: Digit+;
FLOAT: Digit+ '.' Digit* ExponentPart? | '.' Digit+ ExponentPart? | Digit+ ExponentPart;

fragment Digit : [0-9];
fragment ExponentPart : [eE] [+-]? Digit+;

fragment HexDigit : [0-9a-fA-F];
fragment HexExponentPart : [pP] [+-]? Digit+;

NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
WS: [ \t\u000C\r\n]+ -> skip;