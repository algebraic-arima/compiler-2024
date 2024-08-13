package src.Semantic;

import src.AST.ASTVisitor;
import src.AST.Def.*;
import src.AST.Expr.*;
import src.AST.Prog;
import src.AST.Stmt.*;
import src.AST.Stmt.JumpStmt.*;
import src.AST.Stmt.LoopStmt.*;
import src.utils.Scope.*;
import src.utils.error.*;
import src.utils.type.ClassType;
import src.utils.type.FuncType;
import src.utils.type.Type;

import java.lang.module.FindException;
import java.util.Map;
import java.util.Objects;

import static src.AST.Expr.BinaryArithExpr.BArithOp.*;
import static src.utils.type.Type.T.*;

public class SemanticChecker implements ASTVisitor {

    public Scope curScope;
    public GlobalScope gScope;
    public String cur_f = null, cur_c = null;
    public boolean hasReturn = false;
    public boolean hasMain = false;

    public void RollBack() {
        if (curScope.parent == null) return;
        curScope.VarList = null;
        curScope.FuncList = null;
        curScope = curScope.parent;
    }

    public SemanticChecker(GlobalScope g) {
        gScope = g;
        curScope = gScope;
    }

    @Override
    public void visit(Prog node) {
        node.defs.forEach(d -> d.accept(this));
        if (!hasMain) {
//            throw new error("function main not found", node.pos);
            throw new FunctionMainError(node.pos);
        }
    }

    @Override
    public void visit(FuncDef node) {
        String res = cur_f;
        cur_f = node.funcName;
        curScope = new Scope(curScope);
        if (node.funcType.hasClass()) {
            String cn = node.funcType.typeName;
            ClassType ct = gScope.getClass(cn);
            if (ct == null) {
//                throw new error("no such return type", node.pos);
                throw new UndefinedIdentifier(node.pos);
            }
        }
        curScope.VarList = curScope.getFunc(node.funcName).args;
        node.funcBody.accept(this);
        if (!node.funcType.isVoid() && !hasReturn && !node.funcName.equals("main")) {
//            throw new error("non-void non-main function must have a return statement", node.pos);
            throw new MissingReturnStmt(node.pos);
        }
        if (node.funcName.equals("main")) {
            if (!node.funcType.isInt()) {
//                throw new error("main function must return int type", node.pos);
                throw new FunctionMainError(node.pos);
            }
            if (!node.funcParams.isEmpty()) {
//                throw new error("main function must have no params", node.pos);
                throw new FunctionMainError(node.pos);
            }
            if (!hasMain) {
                hasMain = true;
            }
        }
        hasReturn = false;
        cur_f = res;
        RollBack();
    }

    @Override
    public void visit(ClassDef node) {
        String res = cur_c;
        cur_c = node.className;
        curScope = new Scope(curScope);
        curScope.VarList = gScope.getClass(node.className).fields;
        curScope.addVar("this", new Type(node.className), node.pos);
        curScope.FuncList = gScope.getClass(node.className).methods;
        if (node.constructor != null) node.constructor.accept(this);
        node.classFunc.forEach(d -> d.accept(this));
        curScope.FuncList = null;
        curScope.VarList = null;
        curScope = curScope.parent;//leak?
        cur_c = res;
        RollBack();
    }

    @Override
    public void visit(VarDef node) {
        if (node.type.hasClass()) {
            if (gScope.getClass(node.type.typeName) == null) {
//                throw new error("invalid variable definition: class not defined", node.pos);
                throw new UndefinedIdentifier(node.pos);
            }
        }
        if (node.type.atomType == VOID) {
//            throw new error("invalid variable definition: void type", node.pos);
            throw new InvalidType(node.pos);
        }
        for (Map.Entry<String, Expr> entry : node.initVals.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().accept(this);
                if (!entry.getValue().type.equals(node.type)) {
                    if (!(entry.getValue().type.isNull() && node.type.isArray()) &&
                            !(entry.getValue().type.isNull() && node.type.isClass())) {
//                        throw new error("variable definition: type not match", node.pos);
                        throw new TypeMismatch(node.pos);
                    }
                }
            }
            if (!curScope.VarList.containsKey(entry.getKey())) {
                curScope.addVar(entry.getKey(), node.type, node.pos);
            } else {
//                throw new error("variable definition: variable already defined in current scope", node.pos);
                throw new MultipleDefinitions(node.pos);
            }
        }
    }

    @Override
    public void visit(Constructor node) {
        String res = cur_f;
        cur_f = node.className;
        // check whether constructor name is the same as class name
        if (cur_c == null || !cur_c.equals(node.className)) {
            throw new error("constructor and class name not match", node.pos);
        }
        curScope = new Scope(curScope);
        node.funcBody.accept(this);
        curScope.VarList = null;
        curScope = curScope.parent;
        cur_c = res;
        hasReturn = false;
    }

    @Override
    public void visit(BreakStmt node) {
        if (!curScope.isLOOP) {
//            throw new error("Break not in loop", node.pos);
            throw new InvalidControlFlow(node.pos);
        }
    }

    @Override
    public void visit(ContinueStmt node) {
        if (!curScope.isLOOP) {
//            throw new error("Continue not in loop", node.pos);
            throw new InvalidControlFlow(node.pos);
        }
    }

    @Override
    public void visit(ReturnStmt node) {
        // stmts only appear in functions
        // check return type
        if (node.retExpr != null) {
            node.retExpr.accept(this);
        }
        if (cur_f.equals(cur_c)) {
            if (node.retExpr != null) {
                throw new error("constructor must not have return value", node.pos);
            }
            hasReturn = true;
            return;
        }
        Type retTypa = curScope.getFunc(cur_f).retType;
        if (retTypa.isVoid()) {
            if (node.retExpr != null) {
//                throw new error("void function must not have return value", node.pos);
                throw new TypeMismatch(node.pos);
            }
        } else {
            if (node.retExpr == null) {
//                throw new error("non-void function must have a return value", node.pos);
                throw new TypeMismatch(node.pos);
            }
            if (!node.retExpr.type.equals(retTypa) &&
                    !(node.retExpr.type.isNull() && (retTypa.isArray() || retTypa.isString() || retTypa.hasClass()))) {
//                throw new error("return type not match", node.pos);
                throw new TypeMismatch(node.pos);
            }
        }
        hasReturn = true;
    }

    @Override
    public void visit(IfStmt node) {
        node.condition.accept(this);
        if (!node.condition.type.isBool()) {
//            throw new error("if condition should be bool", node.pos);
        throw new InvalidType(node.pos);
        }
        curScope = new Scope(curScope);

        if (node.trueStmt != null) {
            node.trueStmt.accept(this);
        }

        RollBack();

        curScope = new Scope(curScope);
        if (node.falseStmt != null) {
            node.falseStmt.accept(this);
        }

        RollBack();
    }

    @Override
    public void visit(WhileStmt node) {
        curScope = new Scope(curScope);
        curScope.isLOOP = true;
        node.cond.accept(this);
        if (!node.cond.type.isBool()) {
//            throw new error("while condition should be bool", node.pos);
            throw new InvalidType(node.pos);
        }
        if (node.body != null) node.body.accept(this);
        RollBack();
    }

    @Override
    public void visit(ForStmt node) {
        curScope = new Scope(curScope);
        curScope.isLOOP = true;
        if (node.init != null)
            node.init.accept(this);
        if (node.cond != null) {
            node.cond.accept(this);
            if (!node.cond.type.isBool()) {
//                throw new error("for condition should be bool", node.pos);
                throw new InvalidType(node.pos);
            }
        }
        if (node.update != null)
            node.update.accept(this);
        if (node.body != null)
            node.body.accept(this);
        RollBack();
    }

    @Override
    public void visit(VarDefStmt node) {
        node.varDef.accept(this);
    }

    @Override
    public void visit(ExprStmt node) {
        node.expr.accept(this);
    }

    @Override
    public void visit(BlockStmt node) {
        curScope = new Scope(curScope);
        curScope.isLOOP = curScope.parent.isLOOP;// inherit loop status
        node.stmts.forEach(d -> d.accept(this));
        RollBack();
    }

    @Override
    public void visit(EmptyStmt node) {
    }

    @Override
    public void visit(ArrayAccessExpr node) {
        if (node.array instanceof NewArrayExpr) {
            throw new error("naked new array indexed", node.pos);
        }
        node.array.accept(this);
        node.index.accept(this);
        if (!node.index.type.isInt()) {
//            throw new error("index of array should be int", node.pos);
            throw new InvalidType(node.pos);
        }
        if (node.array.type.dim == 0) {
//            throw new error("array access on non-array", node.pos);
            throw new DimensionError(node.pos);
        }
        node.type = new Type(node.array.type.typeName, node.array.type.dim - 1);
//        node.isLvalue = node.array.isLvalue;
        node.isLvalue = true;
    }

    @Override
    public void visit(ArrayLiteralExpr node) {
        Type a = new Type("null");
        for (Expr e : node.elements) {
            e.accept(this);
            if (!a.isNull() && !a.equals(e.type) && !e.type.isNull()) {
                throw new error("Array literal invalid with different types", node.pos);
            }
            if (!e.type.isNull()) {
                a = e.type;
            }
        }
        node.type = new Type((a.isNull() ? "null" : a.typeName), (a.isNull() ? 0 : a.dim) + 1);
        node.isLvalue = false;
    }

    @Override
    public void visit(AssignExpr node) {
        node.var.accept(this);
        node.value.accept(this);
        if (!node.var.type.equals(node.value.type)) {
            if (!(node.value.type.isNull() && node.var.type.isArray()) &&
                    !(node.value.type.isNull() && node.var.type.isClass())) {
//                throw new error("AssignExpr: type not match", node.pos);
                throw new TypeMismatch(node.pos);
            }
        }
        if (!node.var.isLvalue) {
            throw new error("AssignExpr: left operand not assignable", node.pos);
        }
        node.type = node.var.type;
        node.isLvalue = false;
    }

    @Override
    public void visit(BinaryArithExpr node) {
        // many bugs here
        node.lhs.accept(this);
        node.rhs.accept(this);
        if ((node.lhs.type.isArray() | node.lhs.type.isClass()) && node.rhs.type.isNull()) {
            if (!(node.op == EQ || node.op == NE)) {
//                throw new error("only '==' and '!=' can be used to compare an array and null", node.pos);
                throw new TypeMismatch(node.pos);
            }
            node.type = boolType;
            node.isLvalue = false;
            return;
        } else if (!node.lhs.type.equals(node.rhs.type)) {
//            throw new error("lhs and rhs type does not match", node.pos);
            throw new TypeMismatch(node.pos);
        }  // type should be the same

        if (node.lhs.type.isInt()) {

        } else if (node.lhs.type.isString()) {
            if (node.op == SUB || node.op == MUL || node.op == DIV
                    || node.op == MOD || node.op == BLS || node.op == BRS
                    || node.op == BAND || node.op == BOR || node.op == BXOR) {
//                throw new error("string invalid operation", node.pos);
                throw new InvalidType(node.pos);
            }
        } else if (node.lhs.type.isBool()) {
            if (!(node.op == EQ || node.op == NE)) {
//                throw new error("bool invalid operation", node.pos);
                throw new InvalidType(node.pos);
            }
        } else if (node.lhs.type.isArray()) {

        } else if (node.lhs.type.isNull()) {

        } else if (node.lhs.type.hasClass()) {
            if (!(node.op == EQ || node.op == NE)) {
//                throw new error("array invalid operation", node.pos);
                throw new InvalidType(node.pos);
            }
        } else {
//            throw new error("type invalid for binary expression", node.pos);
            throw new InvalidType(node.pos);
        }
        node.type = node.lhs.type;
        if (node.op == EQ || node.op == NE ||
                node.op == LT || node.op == GT ||
                node.op == LE || node.op == GE)
            node.type = boolType;
        node.isLvalue = false;
    }

    @Override
    public void visit(BinaryLogicExpr node) {
        /// todo: how to support short circuit
        node.lhs.accept(this);
        node.rhs.accept(this);
        if (!node.lhs.type.isBool()) {
//            throw new error("lhs of binary logic expr should be bool", node.pos);
            throw new InvalidType(node.pos);
        }
        if (!node.rhs.type.isBool()) {
//            throw new error("rhs of binary logic expr should be bool", node.pos);
            throw new InvalidType(node.pos);
        }
        node.type = boolType;
        node.isLvalue = false;
    }

    @Override
    public void visit(BoolLiteralExpr node) {
        node.type = boolType;
        node.isLvalue = false;
    }

    @Override
    public void visit(FmtStrLiteralExpr node) {
        for (Expr e : node.exprs) {
            e.accept(this);
            if (!e.type.isInt() && !e.type.isString() && !e.type.isBool()) {
//                throw new error("Formatted string: invalid type", node.pos);
                throw new InvalidType(node.pos);
            }
        }
        node.type = stringType;
        node.isLvalue = false;
    }

    @Override
    public void visit(FuncCallExpr node) {
        if (curScope.getFunc(node.funcName) == null) {
//            throw new error("FuncCall: function not defined", node.pos);
            throw new UndefinedIdentifier(node.pos);
        }
        if (curScope.getFunc(node.funcName).args.size() != node.args.exps.size()) {
//            throw new error("FuncCall: number of arguments not match", node.pos);
            throw new TypeMismatch(node.pos);
        }
        int i = 0;
        for (Map.Entry<String, Type> entry : curScope.getFunc(node.funcName).args.entrySet()) {
            node.args.exps.get(i).accept(this);
            if (!entry.getValue().equals(node.args.exps.get(i).type) &&
                    !(node.args.exps.get(i).type.isNull() && (entry.getValue().isClass() || entry.getValue().isArray() || entry.getValue().isString()))) {
//                throw new error("FuncCall: type of arguments not match", node.pos);
                throw new TypeMismatch(node.pos);
            }
            ++i;
        }
        node.type = curScope.getFunc(node.funcName).retType;
        node.isLvalue = false;
        // only int and bool are copied by value ...?
    }

    @Override
    public void visit(IntLiteralExpr node) {
        node.type = intType;
        node.isLvalue = false;
    }

    @Override
    public void visit(MemberFuncCallExpr node) {
        node.obj.accept(this);
        if (!node.obj.type.isClass() && !node.obj.type.isString() && !node.obj.type.isArray()) {
//            throw new error("MemberFuncCall: object should be class, array or string", node.pos);
            throw new InvalidType(node.pos);
        }
        if (node.obj.type.isArray() && node.funcName.equals("size")) {
            node.type = intType;
            node.isLvalue = false;
            return;
        }
        String cn = node.obj.type.typeName;
        if (gScope.getClass(cn) == null) {
//            throw new error("MemberFuncCall: class not defined", node.pos);
            throw new UndefinedIdentifier(node.pos);
        }
        if (gScope.getClass(cn).methods.get(node.funcName) == null) {
//            throw new error("MemberFuncCall: method not defined", node.pos);
            throw new UndefinedIdentifier(node.pos);
        }
        FuncType ft = gScope.getClass(cn).methods.get(node.funcName);
        if (ft.args.size() != node.args.exps.size()) {
//            throw new error("MemberFuncCall: number of arguments not match", node.pos);
            throw new TypeMismatch(node.pos);
        }
        int i = 0;
        for (Map.Entry<String, Type> entry : ft.args.entrySet()) {
            node.args.exps.get(i).accept(this);
            if (!entry.getValue().equals(node.args.exps.get(i).type) &&
                    !(node.args.exps.get(i).type.isNull() && (entry.getValue().isClass() || entry.getValue().isArray() || entry.getValue().isString()))) {
//                throw new error("MemberFuncCall: type of arguments not match", node.pos);
                throw new TypeMismatch(node.pos);
            }
            ++i;
        }
        node.type = ft.retType;
        node.isLvalue = false;
        // func return cannot be assigned
    }

    @Override
    public void visit(MemberObjAccessExpr node) {
        node.obj.accept(this);
        if (!node.obj.type.isClass()) {
//            throw new error("MemberObjAccessExpr: object should be class", node.pos);
            throw new InvalidType(node.pos);
        }
        String cn = node.obj.type.typeName;
        if (gScope.getClass(cn) == null) {
//            throw new error("MemberObjAccessExpr: class not defined", node.pos);
            throw new UndefinedIdentifier(node.pos);

        }
        if (gScope.getClass(cn).fields.get(node.member) == null) {
//            throw new error("MemberObjAccessExpr: field not defined", node.pos);
            throw new UndefinedIdentifier(node.pos);
        }
        node.type = gScope.getClass(cn).fields.get(node.member);
//        node.isLvalue = node.obj.isLvalue;
        node.isLvalue = true;
    }

    @Override
    public void visit(NewArrayExpr node) {
        if (node.type.isVoid()) {
//            throw new error("you should not new a void type", node.pos);
            throw new InvalidType(node.pos);
        }
        if (node.type.hasClass()) {
            if (gScope.getClass(node.type.typeName) == null) {
//                throw new error("invalid variable definition: class not defined", node.pos);
                throw new UndefinedIdentifier(node.pos);
            }
        }
        for (Expr e : node.len) {
            if (e == null) continue;
            e.accept(this);
            if (!e.type.isInt()) {
//                throw new error("NewArrayExpr: dimension should be int", node.pos);
                throw new InvalidType(node.pos);
            }
        }
        node.isLvalue = false;
    }

    @Override
    public void visit(NewArrayInitExpr node) {
        if (node.type.isVoid()) {
//            throw new error("you should not new a void type", node.pos);
            throw new InvalidType(node.pos);
        }
        node.init.accept(this);
        if (!Objects.equals(node.type.dim, node.init.type.dim)) {
//            throw new error("NewArrayInitExpr: dimension not match", node.pos);
            throw new TypeMismatch(node.pos);
        }
        node.isLvalue = false;
    }

    @Override
    public void visit(NewTypeExpr node) {
        if (node.type.isVoid()) {
//            throw new error("you should not new a void type", node.pos);
            throw new InvalidType(node.pos);
        }
        if (node.type.hasClass()) {
            if (gScope.getClass(node.type.typeName) == null) {
//                throw new error("invalid variable definition: class not defined", node.pos);
                throw new UndefinedIdentifier(node.pos);
            }
        }
        node.isLvalue = false;
    }

    @Override
    public void visit(NullExpr node) {
        node.type = new Type("null");
        node.isLvalue = false;
    }

    @Override
    public void visit(ParenthesesExpr node) {
        node.exp.accept(this);
        node.isLvalue = node.exp.isLvalue;
        node.type = node.exp.type;
    }

    @Override
    public void visit(RowExpr node) {
        node.exps.forEach(d -> d.accept(this));
    }

    @Override
    public void visit(StringLiteralExpr node) {
        node.type = stringType;
        node.isLvalue = false;
    }

    @Override
    public void visit(TernaryBranchExpr node) {
        node.cond.accept(this);
        node.trueBranch.accept(this);
        node.falseBranch.accept(this);
        if (!node.cond.type.isBool()) {
//            throw new error("TernaryBranchExpr: condition should be bool", node.pos);
            throw new InvalidType(node.pos);
        }
        if (!node.trueBranch.type.equals(node.falseBranch.type) && !node.trueBranch.type.isNull() && !node.falseBranch.type.isNull()) {
//            throw new error("TernaryBranchExpr: type not match", node.pos);
            throw new TypeMismatch(node.pos);
            // can match null
        }
        node.type = node.trueBranch.type;
        node.isLvalue = false;
    }

    @Override
    public void visit(ThisPtrExpr node) {
        Type t = curScope.getVar("this");
        if (t == null) {
            throw new error("'this' ptr used out of class", node.pos);
        }
        node.type = t;
        node.isLvalue = false;
    }

    @Override
    public void visit(UnaryArithExpr node) {
        node.expr.accept(this);
        if (!node.expr.type.isInt()) {
//            throw new error("UnaryArithExpr should be int", node.pos);
            throw new InvalidType(node.pos);
        }
        if (node.op == UnaryArithExpr.UArithOp.RDEC || node.op == UnaryArithExpr.UArithOp.RINC
                || node.op == UnaryArithExpr.UArithOp.LDEC || node.op == UnaryArithExpr.UArithOp.LINC) {
            if (!node.expr.isLvalue) {
//                throw new error("rvalue inc/dec by suffix", node.pos);
                throw new TypeMismatch(node.pos);
            }
        }
        node.type = intType;
        node.isLvalue = node.op == UnaryArithExpr.UArithOp.LDEC || node.op == UnaryArithExpr.UArithOp.LINC;
    }

    @Override
    public void visit(UnaryLogicExpr node) {
        node.expr.accept(this);
        if (!node.expr.type.isBool()) {
//            throw new error("UnaryLogicExpr should be bool", node.pos);
            throw new InvalidType(node.pos);
        }
        node.type = boolType;
        node.isLvalue = false;
    }

    @Override
    public void visit(VarExpr node) {
        Type t = curScope.getVar(node.varName);
        if (t == null) {
//            throw new error("variable not defined", node.pos);
            throw new UndefinedIdentifier(node.pos);
        }
        node.type = t;
        node.isLvalue = true;
    }

}
