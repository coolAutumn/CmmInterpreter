grammar Cmm;

@header{
    package tokenanalysis;
}


If : 'if';
Else : 'else';
While : 'while';
Read : 'read';
Write :'write';

Type : 'int' | 'double';

LeftBracket:'{';
RightBracket:'}';

LeftSquareBracket : '[';
RightSquareBracket: ']';

LeftParenthesis:'(';
RightParenthesis:')';

Compare: '==' |'<'|'<='|'>'|'>='|'!=';
Boolean: 'true' | 'false' ;

Add : '+';
Minus : '-';
Multiply: '*';
Divide : '/';

Equal:'=';
Semicolon:';';
Comma:',';

IntConstant :   '0' | ([1-9][0-9]*) ;
DoubleConstant :   ('0')? ('.'[0-9]*) |  ([1-9][0-9]* )('.'[0-9]*);
Ident : ([a-z]|[A-Z]) (([A-Z]|[a-z]|'_'|[0-9])*([A-Z]|[a-z]|[0-9]))*;


Ws:[\t|\n|\r|' ']+ -> skip;
Note:( ('/*'.*?'*/') | ('//'.*? '\r'?'\n'?EOF) )-> skip;   //忽略注释




prog        :	  stmt+;

stmt	    : 	 whileStmt | ifStmt |
                 (
                  varDecl |
                  assignStmt |
                  readStmt |
                  writeStmt ) Semicolon   ;

varDecl	    :	Type varList;

var         :   Ident  LeftSquareBracket IntConstant RightSquareBracket | Ident ;

varList		:	var (Comma var )* ;

ifStmt		:	If LeftParenthesis exprStmt RightParenthesis LeftBracket (prog)? RightBracket (Else LeftBracket (prog)? RightBracket)? ;

whileStmt	:	While LeftParenthesis exprStmt RightParenthesis LeftBracket (prog)? RightBracket;

readStmt	:	Read  LeftParenthesis var RightParenthesis;

writeStmt	:	Write LeftParenthesis var RightParenthesis;

assignStmt	:  var Equal exprStmt ;

constants	:	IntConstant | DoubleConstant | Boolean ;

exprStmt :        expr  | ( LeftParenthesis expr RightParenthesis)   ;

expr	    :       constants expr|
                    Ident expr |
                    Add expr |
                    Minus expr |
                    Multiply expr |
                    Divide expr |
                    Compare expr |
                    constants |
                    Ident
                     ;






