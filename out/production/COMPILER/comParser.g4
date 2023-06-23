parser grammar comParser;

options {tokenVocab = comLexer ; }

program:((dec | loop | conditions | function | class | exp | call_function | list | list_as_parameter | listwedget )+ | EO | container | text  );

dec:space* DATA_TYPE space* identifier space* ((OPERATION identifier))? SEMICOLEN;
exp: space* identifier space* exp1 space*;
exp1:OPERATION space* identifier (OPERATION identifier)* SEMICOLEN;
conditions:if (else_if)* (else)?;
if:space* IF space* bracket space* identifier OPERATION identifier (OPERATION identifier OPERATION identifier)* bracket space* if_body;
if_body:space* square_bracket space* textFormField* space* button? space* (program)* space* square_bracket;
else_if:ELSE if;
else:ELSE if_body;
for:FOR space* bracket (init)? exp? increment_section? bracket for_body;
init:dec|exp;
increment_section:(identifier OPERATION OPERATION)|(identifier OPERATION identifier OPERATION identifier);
for_body:space* square_bracket space* (program)+ space* square_bracket;
while: WHILE bracket identifier OPERATION identifier (OPERATION identifier OPERATION identifier)* bracket while_body;
while_body:for_body;
function:DATA_TYPE identifier bracket (dec)* bracket function_body;
function_body:for_body;
class: KEYWORD identifier class_body;
class_body: square_bracket program* constructor? program* square_bracket program?;
constructor:identifier bracket constructor_header* bracket constructor_body;
constructor_header: DATA_TYPE identifier (COMMA DATA_TYPE identifier)*;
constructor_body:square_bracket (KEYWORD? (init))+ square_bracket;
loop:for | while;
identifier:PARAMETER;
call_function : space* identifier space* bracket space* header_body space* bracket space* SEMICOLEN;
space:SPACE;
header_body:((identifier) + (COMMA + identifier)*)?;
bracket:OPEN_BRACKET | CLOSE_BRACKET;
square_bracket: OPEN_SQAURE_BRACKET | CLOSE_SQAURE_BRACKET;
array_bracket: OPEN_ARRAY_BRACKET | CLOSE_ARRAY_BRACKET;

list: DATA_TYPE space* identifier space* OPERATION space* KEYWORD space* LIST space* bracket space* identifier space* bracket space* SEMICOLEN;
list_as_parameter: identifier array_bracket identifier array_bracket OPERATION identifier SEMICOLEN;

container: space* CONTAINER space* bracket space* (C_PROPERTIES space* text space* COMMA)?  (C_PROPERTIES space* identifier space* COMMA space*)* bracket space* COMMA program?;

text: space* TEXT space* bracket space* COT space* identifier space* COT space* (PLUS space* identifier space*)? bracket space* program?;

listwedget: space* LISTT space* bracket space* CHILDREN space* array_bracket space* (container space* COMMA space* | text space* COMMA space* | textFormField space* COMMA space*)* (button space* COMMA space*)* space* if? space* array_bracket space* bracket;

textFormField: space* TextFormFiled space* bracket space* (LABEL space* identifier)? space* COMMA space* (CONTROLLER space* identifier)? space* bracket space* program?;

button: space* BUTTON space* bracket space* LABEL space* identifier space* COMMA space* (ONPRESSED NAVIGATOR space* bracket space* identifier space* bracket)? space* bracket program?;