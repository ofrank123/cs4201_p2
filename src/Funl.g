grammar Funl;

program : decls* main decls* ;

main : MAIN EQUALS expr where? SEMICOLON;

decls : IDENT args EQUALS expr where? SEMICOLON;

where : WHERE LBRACE decls+ RBRACE ;

args : IDENT* ;

expr : lexpr # LeftExpr
     | lhs=lexpr binop rhs=expr # BinOpExpr
     | MINUS expr # MinusExpr
     ;

lexpr : LAMBDA IDENT ARROW expr # LambdaExpr
      | IF clause=expr THEN then_expr=expr ELSE else_expr=expr # IfExpr
      | aexpr+ # ApplicationExpr
      ;

aexpr : LPAREN expr RPAREN # ParenExpr
      | IDENT # IdentExpr
      | NUMERAL # NumExpr
      ;

binop : AND | OR | EQ | NEQ | LT | LTE | GT | GTE | PLUS | MINUS | DIV | MUL | CONS ;

WS : (' ' | '\t' | '\r'? '\n')+ -> skip;

MAIN : 'main';
WHERE : 'where';
RPAREN : ')';
LPAREN : '(';
RBRACE : '}';
LBRACE : '{';
IF : 'if';
THEN : 'then' ;
ELSE : 'else';
COMMA : ',';
LAMBDA : '\\';
ARROW : '->';
SEMICOLON : ';';

EQ : '==';
EQUALS : '=';

MINUS : '-';
AND : '&&';
OR : '||';
NEQ : '<>';
LT : '<';
GT : '>';
LTE : '<=';
GTE : '>=';
PLUS : '+';
DIV : '/';
MUL : '*';
CONS : '::';

IDENT : LETTER ( LETTER | [0-9] )* ; 
NUMERAL : [0-9]+ ;
LETTER : [a-zA-Z] | '_' ;
