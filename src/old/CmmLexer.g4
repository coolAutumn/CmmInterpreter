lexer grammar CmmLexer;

@header{
    package tokenanalysis;
}

Type : 'int' | 'double';


LeftBracket:'{';
RightBracket:'}';

Iden : ([a-z]|[A-Z]) (([A-Z]|[a-z]|'_'|[0-9])*([A-Z]|[a-z]|[0-9]))*;


LeftSquareBracket : '[';
RightSquareBracket: ']';



IntConstant :   '0' | ([1-9][0-9]*) ;
DoubleConstant :   ('0')? ('.'[0-9]*) |  ([1-9][0-9]* )('.'[0-9]*);

LeftParenthesis:'(';
RightParenthesis:')';

Compare: '==' |'<'|'<='|'>'|'>='|'!=';
Boolean: 'true' | 'false' ;

If:'if';
Else:'else';
While: 'while';
Read:'read';
Write:'write';


Add : '+';
Minus : '-';
Multiply: '*';
Divide : '/';

Equal:'=';
