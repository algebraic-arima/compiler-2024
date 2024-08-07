parser grammar Mx;

@header{
    package src.parser;
}

options {
    tokenVocab = Lex;
}

prog: def+ EOF? ;

def: funcdef | classdef | vardef ;

funcdef: type ID LPAR (type ID (COMMA type ID)*)? RPAR stmts ;

classdef: CLASS ID LBCE (vardef | funcdef)* (ID LPAR RPAR stmts)? (vardef | funcdef)* RBCE SEMI ;

vardef: type ID (ASSIGN expr)? (COMMA ID (ASSIGN expr)?)* SEMI ;

stmts: LBCE stmt* RBCE ;

jmpstmt:
    IF LPAR expr RPAR stmt (ELSE stmt)? # IfStmt
    | BREAK SEMI # BreakStmt
    | CONTINUE SEMI # ContinueStmt
    | RETURN expr? SEMI # ReturnStmt
    ;

lpstmt:
    FOR LPAR rowexpr? SEMI rowexpr? SEMI rowexpr? RPAR stmt # ForStmt
    | WHILE LPAR expr RPAR stmt # WhileStmt
    ;

stmt:
    stmts
    | vardef
    | rowexpr SEMI
    | lpstmt
    | jmpstmt
    | SEMI
    ;

expr:
    LPAR expr RPAR # Parentheses
    | expr MEMB ID LPAR rowexpr? RPAR # MemberFuncCall
    | expr MEMB ID # MemberObjAccess
    | expr LBKT expr RBKT # ArrayAccess
    | ID LPAR rowexpr? RPAR # FuncCall
    | expr op=(SDEC|SINC) # RUnaryExp
    | op=(SDEC|SINC) expr # LUnaryExp
    | op=(SUB|NOT|BNOT) expr # LUnaryExp
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
    | NEW atomtype indbrackets+ arrayliteral? # NewArray
    | NEW ID (LPAR RPAR)? # NewClass
    | THIS # ThisPtr
    | ID # VarAccess
    | literal # Constant
    | fmtstr # FormatString
    ;

rowexpr: expr (COMMA expr)*;
indbrackets: LBKT expr? RBKT;

type: atomtype | arraytype;
atomtype: INT | BOOL | STRING | ID | VOID;
arraytype: atomtype (LBKT expr? RBKT)+;

literal: INTCONST | STRINGCONST | (TRUE | FALSE) | NULL | arrayliteral;
arrayliteral: LBCE rowexpr? RBCE ;

fmtstr: (FMTSTRBGN (expr (FMTSTRBODY expr)*) FMTSTREND) | FMTSTRPURE ;
