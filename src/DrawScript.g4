grammar DrawScript;

script: declaration_list WS* '---' WS* property_list WS* '---' WS* instruction_list EOF;
property_list: (property WS*)*;
instruction_list: (instruction WS*)+;
instruction: fill ;
expression: expression OPERATOR expression
            | CONST
            | expressionData;
// Control Structures
for: 'for' expression 'in' interval '{' instruction_list '}';
ifElse: 'if' expression '{' WS* instruction_list '}' ('else {' WS* instruction_list '}')? ;
declaration: CONST ':' expressionData;
declaration_list: (declaration WS*)*;
fill: 'fill' CONST;
expressionData: LITERAL
            | color;
property: PROP ':'  (expression | point | dimension);
color: LITERAL? '|' LITERAL '|' LITERAL?;
dimension: expression '~' expression;
interval: '[' LITERAL ',' LITERAL (']' | '[');
point: '('expression ',' expression')';

PROP: [a-z]+;
CONST: [A-Z]+;
LITERAL: [0-9]+;
OPERATOR: (TIMES | DIV | PLUS | MINUS | MOD);
TIMES: '*';
PLUS: '+';
DIV: '/';
MINUS: '-';
MOD: '%';

COMMENT: '//'~[\r\n]* -> skip;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines