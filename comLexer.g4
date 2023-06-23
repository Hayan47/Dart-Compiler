lexer grammar comLexer;

EO: '<EOF>';
FUNCTION: ('function');
OPEN_BRACKET: '(';
CLOSE_BRACKET: ')';
SEMICOLEN: ';';
COLON: ':';
SPACE: (' ' | '\t' | '\n' | '\r')->skip;
AND: '&';
COMMA: ',';
DOT: '.';
PLUS: '+';
OPERATION: ( EQUAL | EQUAL_EQUAL | GT | LT | LTE | GTE | PLUS | MINUS | MUL | DIV | NOT | NOT_EQUAL | QU | AND_AND | OR_OR);
AND_AND: '&&';
EQUAL: '=';

EQUAL_EQUAL: '==';
OPEN_SQAURE_BRACKET: '{';
CLOSE_SQAURE_BRACKET: '}';
ARROW_FUN: '=>';
GT: '>';
LT: '<';
LTE: '<=';
GTE: '>=';
ME: '-=';
PE: '+=';
MINUS: '-';

MUL: '*';
DIV: '/';
NOT: '!';
NOT_EQUAL: '!=';
OR: '|';
OR_OR: '||';
QU: '?';
FOR: 'for';
WHILE:'while';
IF: 'if';
ELSE:'else';

LIST: 'List';
CHILDREN: 'children:';
CONTAINER: 'Container';
C_PROPERTIES: ( 'width:' | 'height:' | 'child:');
TEXT: 'Text';
TextFormFiled: 'TextFormField';
BUTTON: 'Button';
ONPRESSED: 'onPressed:';
NAVIGATOR: 'Navigator.push';
LABEL: 'Label:';
CONTROLLER: 'Controller:';

LISTT: 'Listt';
KEYWORD: ('static'|'this.'|'return'|'class'|'final'|'new');
DATA_TYPE: ('long' | 'var' | 'string' | 'double' | 'int' | 'float' | 'char' | 'array' | 'list' );
//IDENTIFIER:('a'..'z')|('A'..'Z');
PARAMETER: (DIGITS | VAR | LONG | DOUBLE | STRING | TEXT | CONTAINER);

COT:'"';
STRING: (('a'..'z') | ('0'..'9') | DOT | '_')+;
VAR: ('a'..'z')+ ;
DIGITS:('0'..'9');
LONG: DIGITS*;
DOUBLE:DIGITS+DOT+(DIGITS+)?;

OPEN_ARRAY_BRACKET: '[';
CLOSE_ARRAY_BRACKET: ']';





