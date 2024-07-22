grammar Mx;

prog:
    def+ EOF?
    ;


def:
    funcdef
    | classdef
    | vardef
    ;

funcdef:
    (type|VOID) IDENTIFIER '()' stmtsuite
    | (type|VOID) IDENTIFIER '(' type IDENTIFIER (',' type IDENTIFIER)* ')' stmtsuite
    ;

classdef:
    CLASS IDENTIFIER '{};'
    | CLASS IDENTIFIER '{' (vardef | funcdef)* (IDENTIFIER '()' stmtsuite)? (vardef | funcdef)* '};'
    ;

vardef:
    type IDENTIFIER ('=' expr)? (',' IDENTIFIER ('=' expr)?)* ';'
    ;


stmtsuite:
    '{}'
    |'{' stmt+ '}'
    ;

stmt:
    ';'
    | def
    | expr ';'
    | type ';'
    | stmtsuite
    | IF '(' expr ')' (stmt|stmtsuite) ('else' (stmt|stmtsuite))?
    | FOR '(' expr? ';' expr? ';' expr? ')' (stmt|stmtsuite)
    | WHILE '(' expr ')' stmtsuite
    | BREAK ';'
    | CONTINUE ';'
    | RETURN expr? ';'
    ;

expr:
    literal # Constant
    | IDENTIFIER # Variable
    | IDENTIFIER '()' # FunctionCall
    | IDENTIFIER ('(' expr (',' expr)* ')') # FunctionCall
    | THIS # ThisPointer
    | (IDENTIFIER|THIS '.') IDENTIFIER #MemberAccess
    | (IDENTIFIER|THIS '.') IDENTIFIER '()' # MemberFunctionCall
    | (IDENTIFIER|THIS '.') IDENTIFIER ('(' expr (',' expr)* ')') # MemberFunctionCall
    | IDENTIFIER ('[' expr ']')+ # ArrayAccess
    | NEW atomtype ('['(expr)?']')+ # NewArray
    | NEW atomtype # NewType
    | NEW IDENTIFIER ('()')? # NewClass
    | expr op=('++'|'--') # PreIncDec
    | op=('++'|'--') expr # PostIncDec
    | op=('-'|'!'|'~') expr # UnaryExp
    | expr op=('/'|'*') expr # BinaryExp
    | expr op='%' expr # BinaryExp
    | expr op=('+'|'-') expr # BinaryExp
    | expr op=('<<'|'>>') expr # BinaryExp
    | expr op=('<'|'>'|'<='|'>=') expr # BinaryExp
    | expr op=('=='|'!=') expr # BinaryExp
    | expr op='&' expr # BinaryExp
    | expr op='^' expr # BinaryExp
    | expr op='|' expr # BinaryExp
    | expr op='&&' expr # BinaryExp
    | expr op='||' expr # BinaryExp
    | <assoc=right> expr '?' expr ':' expr # TernaryExp
    | <assoc=right> expr '=' expr # AssignExp
    | '(' expr ')' # Parentheses
    ;


atomtype: INT | BOOL | STRING | IDENTIFIER;
arraytype: atomtype ('[' INTCONST? ']')+;

type: atomtype | arraytype;


// constants
//const:
//    (TRUE|FALSE) # BoolConst
//    | INTCONST  # IntConst
//    | STRINGCONST # StringConst
//    | ARRAYCONST # ArrayConst
//    | NULL # NullConst
//    ;

literal: INTCONST | STRINGCONST | TRUE | FALSE | NULL | arrayliteral;
arrayliteral: '{' (literal (',' literal)*)? '}';

INTCONST: ([1-9][0-9]*)|'0';
STRINGCONST: '"' (
    ~[\u0000-\u001F\u007F"\\]
    | ' '
    | '\\\\'
    | '\\'
    | '\\n'
    )*? '"';

//void, bool, int, string, new, class, null, true, false, this, if, else, for, while, break, continue, return
VOID: 'void';
BOOL: 'bool';
INT: 'int';
STRING: 'string';
NEW: 'new';
CLASS: 'class';
NULL: 'null';
TRUE: 'true';
FALSE: 'false';
THIS: 'this';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
BREAK: 'break';
CONTINUE: 'continue';
RETURN: 'return';

IDENTIFIER: [a-zA-Z][a-zA-Z_0-9]*;

// omitted
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: ('//'.*?'\n'|'/*'.*?'*/') -> skip;







