grammar DrawScript;

script: declaration_list WS* '---' WS* property_list WS* '---' WS* instruction_list EOF;
declaration_list: (declaration WS*)*;
declaration: CONST ':' expressionData;
property_list: (property WS*)*;
property: PROP ':'  (background | point | dimension);

/* Instruções */
instruction_list: (instruction WS*)+;
instruction: fill
            | for
            | ifElse
            | figure
            | border;

    // Control Structures
for: 'for' variable 'in' interval '{' instruction_list '}';
ifElse: 'if' boolean '{' WS* instruction_list '}' alternative?;
alternative: 'else {' WS* instruction_list '}';
    // Figuras
figure: rectangle
       | square
       | circle
       | elipse
       | line;
rectangle: 'rectangle' point dimension;
square: 'square' point expression;
circle: 'circle' point expression;
elipse: 'elipse' point dimension;
line: 'line' point point;
border: 'border' figure;
fill: 'fill' CONST;

/* Expressions */
expression: expressionAdd;

expressionAdd: expressionMult ((OPERATORADD) expressionMult)*;

expressionMult: expressionAtom ((OPERATORMULT) expressionAtom)*;

expressionAtom: expressionData
                | variable
                | constant
                | '(' expression ')';

expressionData: LITERAL
            | color;
constant: CONST;
variable: PROP;
    // Tipos de dados
boolean: (expression LOGICOPERATOR expression);
point: '('expression ',' expression')';
dimension: expression '~' expression;
background: expression;
interval: OPEN_INTERVAL expression ',' expression (OPEN_INTERVAL | CLOSE_INTERVAL);
color: LITERAL? '|' LITERAL '|' LITERAL?;

OPERATORADD:(PLUS|MINUS);
OPERATORMULT:(TIMES | DIV | MOD);
LOGICOPERATOR:(EQUAL | DIF | LESS | GREATER);

PROP: [a-z]+;
CONST: [A-Z]+;
LITERAL: [0-9]+;
OPEN_INTERVAL: '[';
CLOSE_INTERVAL: ']';
BOOL: ('true' | 'false');
OPERATOR: (TIMES | DIV | PLUS | MINUS | MOD);
TIMES: '*';
PLUS: '+';
DIV: '/';
MINUS: '-';
MOD: '%';
EQUAL: '=';
DIF: '!=';
LESS: '<';
GREATER: '>';

COMMENT: '//'~[\r\n]* -> skip;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines