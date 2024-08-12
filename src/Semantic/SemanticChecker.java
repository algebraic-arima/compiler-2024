package src.Semantic;

import src.AST.ASTVisitor;
import src.AST.Def.*;
import src.AST.Expr.*;
import src.AST.Prog;
import src.AST.Stmt.*;
import src.AST.Stmt.JumpStmt.*;
import src.AST.Stmt.LoopStmt.*;
import src.utils.Scope.*;
import src.utils.error.error;
import src.utils.type.FuncType;
import src.utils.type.Type;

import java.util.Map;
import java.util.Objects;

import static src.AST.Expr.BinaryArithExpr.BArithOp.*;
import static src.utils.type.Type.T.*;

public class SemanticChecker implements ASTVisitor {

    public Scope curScope;
    public GlobalScope gScope;

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
    }

    @Override
    public void visit(FuncDef node) {
        curScope = new Scope(curScope);
        curScope.VarList = curScope.getFunc(node.funcName).args;
        node.funcBody.accept(this);
    }

    @Override
    public void visit(ClassDef node) {
        curScope = new Scope(curScope);
        curScope.VarList = gScope.getClass(node.className).fields;
        curScope.addVar("this", new Type(node.className), node.pos);
        curScope.FuncList = gScope.getClass(node.className).methods;
        if (node.constructor != null) node.constructor.accept(this);
        node.classFunc.forEach(d -> d.accept(this));
        curScope.FuncList = null;
        curScope.VarList = null;
        curScope = curScope.parent;
//leak?
    }

    @Override
    public void visit(VarDef node) {
        if (node.type.hasClass()) {
            if (gScope.getClass(node.type.typeName) == null) {
                throw new error("invalid variable definition: class not defined", node.pos);
            }
        }
        if (node.type.atomType == VOID) {
            throw new error("invalid variable definition: void type", node.pos);
        }
        for (Map.Entry<String, Expr> entry : node.initVals.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().accept(this);
                if (!entry.getValue().type.equals(node.type)) {
                    if (!(entry.getValue().type.isNull() && node.type.isArray()) &&
                            !(entry.getValue().type.isNull() && node.type.isClass())) {
                        throw new error("variable definition: type not match", node.pos);
                    }
                }
            }
            if (!curScope.VarList.containsKey(entry.getKey())) {
                curScope.addVar(entry.getKey(), node.type, node.pos);
            } else {
                throw new error("variable definition: variable already defined in current scope", node.pos);
            }
        }
    }

    @Override
    public void visit(Constructor node) {
        /// todo: check whether constructor name is the same as class name
        curScope = new Scope(curScope);
        node.funcBody.accept(this);
        curScope.VarList = null;
        curScope = curScope.parent;
    }

    @Override
    public void visit(BreakStmt node) {
        if (!curScope.isLOOP) {
            throw new error("Break not in loop", node.pos);
        }
    }

    @Override
    public void visit(ContinueStmt node) {
        if (!curScope.isLOOP) {
            throw new error("Continue not in loop", node.pos);
        }
    }

    @Override
    public void visit(ReturnStmt node) {
        // stmts only appear in functions
        /// todo: check return type
        if (node.retExpr != null) {
            node.retExpr.accept(this);

        }
    }

    @Override
    public void visit(IfStmt node) {
        node.condition.accept(this);
        if (!node.condition.type.isBool()) {
            throw new error("if condition should be bool", node.pos);
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
            throw new error("while condition should be bool", node.pos);
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
                throw new error("for condition should be bool", node.pos);
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
        node.array.accept(this);
        node.index.accept(this);
        if (!node.index.type.isInt()) {
            throw new error("index of array should be int", node.pos);
        }
        if (node.array.type.dim == 0) {
            throw new error("array access on non-array", node.pos);
        }
        node.type = new Type(node.array.type.typeName, node.array.type.dim - 1);
        node.isLvalue = node.array.isLvalue;
    }

    @Override
    public void visit(ArrayLiteralExpr node) {
        Type a = null;
        for (Expr e : node.elements) {
            e.accept(this);
            if (a != null && !a.equals(e.type)) {
                throw new error("Array literal invalid with different dimensions", node.pos);
            }
            a = e.type;
        }
        node.type = new Type(node.elements.getFirst().type.typeName, (a == null ? 0 : a.dim) + 1);
        node.isLvalue = false;
    }

    @Override
    public void visit(AssignExpr node) {
        node.var.accept(this);
        node.value.accept(this);
        if (!node.var.type.equals(node.value.type)) {
            if (!(node.value.type.isNull() && node.var.type.isArray()) &&
                    !(node.value.type.isNull() && node.var.type.isClass())) {
                throw new error("AssignExpr: type not match", node.pos);
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
        if (node.lhs.type.isArray() && node.rhs.type.isNull()) {
            if (!(node.op == EQ || node.op == NE)) {
                throw new error("only '==' and '!=' can be used to compare an array and null", node.pos);
            }
            node.type = boolType;
            node.isLvalue = false;
            return;
        } else if (!node.lhs.type.equals(node.rhs.type)) {
            throw new error("lhs and rhs type does not match", node.pos);
        }  // type should be the same

        if (node.lhs.type.isInt()) {

        } else if (node.lhs.type.isString()) {
            if (node.op == SUB || node.op == MUL || node.op == DIV
                    || node.op == MOD || node.op == BLS || node.op == BRS
                    || node.op == BAND || node.op == BOR || node.op == BXOR) {
                throw new error("string invalid operation", node.pos);
            }
        } else if (node.lhs.type.isBool()) {
            if (!(node.op == EQ || node.op == NE)) {
                throw new error("bool invalid operation", node.pos);
            }
        } else if (node.lhs.type.isArray()) {

        } else if (node.lhs.type.hasClass()) {

        } else {
            throw new error("type invalid for binary expression", node.pos);
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
            throw new error("lhs of binary logic expr should be bool", node.pos);
        }
        if (!node.rhs.type.isBool()) {
            throw new error("rhs of binary logic expr should be bool", node.pos);
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
                throw new error("Formatted string: invalid type", node.pos);
            }
        }
        node.type = stringType;
        node.isLvalue = false;
    }

    @Override
    public void visit(FuncCallExpr node) {
        if (curScope.getFunc(node.funcName) == null) {
            throw new error("FuncCall: function not defined", node.pos);
        }
        if (curScope.getFunc(node.funcName).args.size() != node.args.exps.size()) {
            throw new error("FuncCall: number of arguments not match", node.pos);
        }
        int i = 0;
        for (Map.Entry<String, Type> entry : curScope.getFunc(node.funcName).args.entrySet()) {
            node.args.exps.get(i).accept(this);
            if (!entry.getValue().equals(node.args.exps.get(i).type)) {
                throw new error("FuncCall: type of arguments not match", node.pos);
            }
            ++i;
        }
        node.type = curScope.getFunc(node.funcName).retType;
        node.isLvalue = !(node.type.isInt() || node.type.isBool());
        // only int and bool are copied by value
    }

    @Override
    public void visit(IntLiteralExpr node) {
        node.type = intType;
        node.isLvalue = false;
    }

    @Override
    public void visit(MemberFuncCallExpr node) {
        node.obj.accept(this);
        if (!node.obj.type.isClass() && !node.obj.type.isString()) {
            throw new error("MemberFuncCall: object should be class or string", node.pos);
        }
        String cn = node.obj.type.typeName;
        if (gScope.getClass(cn) == null) {
            throw new error("MemberFuncCall: class not defined", node.pos);
        }
        if (gScope.getClass(cn).methods.get(node.funcName) == null) {
            throw new error("MemberFuncCall: method not defined", node.pos);
        }
        FuncType ft = gScope.getClass(cn).methods.get(node.funcName);
        if (ft.args.size() != node.args.exps.size()) {
            throw new error("MemberFuncCall: number of arguments not match", node.pos);
        }
        int i = 0;
        for (Map.Entry<String, Type> entry : ft.args.entrySet()) {
            node.args.exps.get(i).accept(this);
            if (!entry.getValue().equals(node.args.exps.get(i).type)) {
                throw new error("MemberFuncCall: type of arguments not match", node.pos);
            }
            ++i;
        }
        node.type = ft.retType;
        node.isLvalue = !(node.type.isInt() || node.type.isBool());
    }

    @Override
    public void visit(MemberObjAccessExpr node) {
        node.obj.accept(this);
        if (!node.obj.type.isClass()) {
            throw new error("MemberObjAccessExpr: object should be class", node.pos);
        }
        String cn = node.obj.type.typeName;
        if (gScope.getClass(cn) == null) {
            throw new error("MemberObjAccessExpr: class not defined", node.pos);
        }
        if (gScope.getClass(cn).fields.get(node.member) == null) {
            throw new error("MemberObjAccessExpr: field not defined", node.pos);
        }
        node.type = gScope.getClass(cn).fields.get(node.member);
        node.isLvalue = true;
    }

    @Override
    public void visit(NewArrayExpr node) {
        for (Expr e : node.len) {
            if (e == null) continue;
            e.accept(this);
            if (!e.type.isInt()) {
                throw new error("NewArrayExpr: dimension should be int", node.pos);
            }
        }
        node.isLvalue = false;
    }

    @Override
    public void visit(NewArrayInitExpr node) {
        node.init.accept(this);
        if (!Objects.equals(node.type.dim, node.init.type.dim)) {
            throw new error("NewArrayInitExpr: dimension not match", node.pos);
        }
        node.isLvalue = false;
    }

    @Override
    public void visit(NewTypeExpr node) {
        if (node.type.hasClass()) {
            if (gScope.getClass(node.type.typeName) == null) {
                throw new error("invalid variable definition: class not defined", node.pos);
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
            throw new error("TernaryBranchExpr: condition should be bool", node.pos);
        }
        if (!node.trueBranch.type.equals(node.falseBranch.type)) {
            throw new error("TernaryBranchExpr: type not match", node.pos);
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
            throw new error("UnaryArithExpr should be int", node.pos);
        }
        if (!(node.op == UnaryArithExpr.UArithOp.LDEC || node.op == UnaryArithExpr.UArithOp.LINC)) {
            if (!node.expr.isLvalue) {
                throw new error("rvalue", node.pos);
            }
        }
        node.type = intType;
        node.isLvalue = node.op == UnaryArithExpr.UArithOp.LDEC || node.op == UnaryArithExpr.UArithOp.LINC;
    }

    @Override
    public void visit(UnaryLogicExpr node) {
        node.expr.accept(this);
        if (!node.expr.type.isBool()) {
            throw new error("UnaryLogicExpr should be bool", node.pos);
        }
        node.type = boolType;
        node.isLvalue = false;
    }

    @Override
    public void visit(VarExpr node) {
        Type t = curScope.getVar(node.varName);
        if (t == null) {
            throw new error("variable not defined", node.pos);
        }
        node.type = t;
        node.isLvalue = true;
    }

}
