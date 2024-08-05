grammar MxParser;

import MxLexer;

prog: def+ EOF? ;

def: funcdef | classdef | vardef ;

funcdef: type ID LPAR (type ID (COMMA type ID)*)? RPAR stmts ;

classdef: CLASS ID LBCE (vardef | funcdef)* (ID LPAR RPAR stmts)? (vardef | funcdef)* RBCE SEMI ;

vardef: type ID (ASSIGN expr)? (COMMA ID (ASSIGN expr)?)* SEMI ;

stmts: LBCE stmt* RBCE ;

stmt:
    stmts
    | vardef
    | expr SEMI
    | IF LPAR expr RPAR stmt (ELSE stmt)?
    | FOR LPAR expr? SEMI expr? SEMI expr? RPAR (stmt|stmts)
    | WHILE LPAR expr RPAR (stmt|stmts)
    | BREAK SEMI
    | CONTINUE SEMI
    | RETURN expr? SEMI
    | SEMI
    ;

expr:
    LPAR expr RPAR # Parentheses
    | expr MEMB ID LPAR rowexpr? RPAR # MemberFuncAccess
    | expr MEMB ID # MemberObjAccess
    | expr LBKT expr RBKT # ArrayAccess
    | ID LPAR rowexpr? RPAR # FuncCall
    | expr op=(SDEC|SINC) # PreSelf
    | op=(SDEC|SINC) expr # PostSelf
    | op=(SUB|NOT|BNOT) expr # UnaryExp
    | expr op=(DIV|MUL) expr # BinaryExp
    | expr op=MOD expr # BinaryExp
    | expr op=(ADD|SUB) expr # BinaryExp
    | expr op=(BLS|BRS) expr # BinaryExp
    | expr op=(LT|GT|LEQ|GEQ) expr # BinaryExp
    | expr op=(EQ|NEQ) expr # BinaryExp
    | expr op=BAND expr # BinaryExp
    | expr op=BXOR expr # BinaryExp
    | expr op=BOR expr # BinaryExp
    | expr op=AND expr # BinaryExp
    | expr op=OR expr # BinaryExp
    | <assoc = right> expr op=QUES expr op=COLON expr # TernaryExp
    | <assoc = right> expr op=ASSIGN expr # AssignExp
    | NEW atomtype indbrackets+ # NewArray
    | NEW ID (LPAR RPAR)? # NewClass
    | THIS # ThisPointer
    | ID # VarAccess
    | literal # Constant
    | fmtstr # FormatString
    ;

rowexpr: expr (COMMA expr)*;
indbrackets: LBKT expr? RBKT;
type: atomtype | arraytype;
atomtype: INT | BOOL | STRING | ID | VOID;
arraytype: atomtype (LBKT INTCONST? RBKT)+;

literal: INTCONST | STRINGCONST | (TRUE | FALSE) | NULL | arrayliteral;
arrayliteral: LBCE (literal (COMMA literal)*)? RBCE ;

fmtstr: (FMTSTRBGN (expr (FMTSTRBODY expr)*) FMTSTREND) | FMTSTRPURE ;
