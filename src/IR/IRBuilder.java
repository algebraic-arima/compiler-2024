package src.IR;

import src.AST.Def.*;
import src.AST.Expr.*;
import src.AST.Prog;
import src.AST.Stmt.*;
import src.AST.Stmt.JumpStmt.*;
import src.AST.Stmt.LoopStmt.*;
import src.AST.Stmt.VarDefStmt;
import src.AST.__ASTVisitor;
import src.IR.IRDef.IRClassDef;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRDef.IRGlobalVarDef;
import src.IR.IRInst.*;
import src.utils.Entity.Constant;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;
import src.utils.Scope.GlobalScope;
import src.utils.Scope.Scope;
import src.utils.type.FuncType;
import src.utils.type.Type;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static src.AST.Expr.BinaryArithExpr.BArithOp.*;
import static src.AST.Expr.BinaryLogicExpr.BLogicOp.*;
import static src.AST.Expr.UnaryArithExpr.UArithOp.*;
import static src.AST.Expr.UnaryLogicExpr.ULogicOp.*;
import static src.utils.type.Type.T.*;

public class IRBuilder implements __ASTVisitor {

    IRProg irProg;
    public HashSet<String> globalVar;
    public IRFuncDef mainFunc;
    GlobalScope gScope;
    Scope curScope;
    public HashMap<Register, String> entityMap;
    // temporary register to name
    // the address of variable `a` is stored in %a.addr
    // name to the register name that stores the variable address
    // for change of field, update and restore the map
    public int varCnt;
    public IRBlock curBlock;

    public IRType typeI32 = new IRType().setType(INT);
    public IRType typeI1 = new IRType().setType(BOOL);
    public IRType typePtr = new IRType().setType(STRING);


    public IRBuilder(GlobalScope gScope) {
        irProg = new IRProg();
        globalVar = new HashSet<>();
        entityMap = new HashMap<>();
        varCnt = 0;
        curBlock = null;
        this.gScope = gScope;
        this.curScope = gScope;
        gScope.strLiteral.forEach(s -> irProg.strDef.push(s));
    }

    @Override
    public void visit(Prog node) {
        node.defs.forEach(d -> d.accept(this));
    }

    @Override
    public void visit(FuncDef node) {
        IRFuncDef f = new IRFuncDef("@" + node.funcName);
        irProg.addFuncDef(f);
        f.retType = new IRType(node.retType);
        for (Map.Entry<String, Type> entry : node.funcParams.entrySet()) {
            f.paramTypes.add(new IRType(entry.getValue()));
            f.paramNames.add(entry.getKey());
        }
        curBlock = f.entry;
        curScope = new Scope(curScope);
        curScope.VarList = curScope.getFunc(node.funcName).args;

        node.funcBody.stmts.forEach(d -> d.accept(this));
    }

    @Override
    public void visit(ClassDef node) {

        IRClassDef cd = new IRClassDef(node.className);
        for (VarDef v : node.classMem) {

        }
    }

    @Override
    public void visit(VarDef node) {
        if (curScope.isGlobal()) {
            for (Map.Entry<String, Expr> entry : node.initVals.entrySet()) {
                IRGlobalVarDef g = new IRGlobalVarDef();
                Register addr = new Register();
                entityMap.put(addr, "@" + entry.getKey());
                g.irType = typeI32;
                g.name = "@" + entry.getKey();
                if (entry.getValue() instanceof IntLiteralExpr) {
                    g.value = ((IntLiteralExpr) entry.getValue()).value;
                } else {
                    g.value = 0;
                    IRFuncDef init = new IRFuncDef("@__init_global_" + entry.getKey());
                    curBlock = init.entry;
                    // complete init function
                    irProg.addFuncDef(init);
                }
                irProg.addGVarDef(g);
            }
        } else {
            for (Map.Entry<String, Expr> entry : node.initVals.entrySet()) {
                Register addr = new Register();
                entityMap.put(addr, "%" + entry.getKey());

                if (entry.getValue() != null) {
                    entry.getValue().accept(this);
                }

                Alloca a = new Alloca(typeI32, addr);
                curBlock.addInst(a);
                if (entry.getValue() != null) {
                    Store s = new Store(typeI32, (Register) entry.getValue().entity, addr);
                    curBlock.addInst(s);
                }
            }
        }
    }

    @Override
    public void visit(Constructor node) {

    }

    @Override
    public void visit(BreakStmt node) {

    }

    @Override
    public void visit(ContinueStmt node) {

    }

    @Override
    public void visit(ReturnStmt node) {

    }

    @Override
    public void visit(IfStmt node) {

    }

    @Override
    public void visit(WhileStmt node) {

    }

    @Override
    public void visit(ForStmt node) {

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

    }

    @Override
    public void visit(EmptyStmt node) {
    }

    @Override
    public void visit(ArrayAccessExpr node) {

    }

    @Override
    public void visit(ArrayLiteralExpr node) {

    }

    @Override
    public void visit(AssignExpr node) {
        node.value.accept(this);
        Entity n = node.entity;
        Register res = new Register();
        entityMap.put(res, "%t" + varCnt);
        varCnt++;
        Entity val = node.value.entity;
        if (node.var instanceof VarExpr) {
            Store s = new Store(new IRType(node.var.type), val, res);
            curBlock.insts.add(s);
        } else if (node.var instanceof MemberObjAccessExpr) {

        }

    }

    @Override
    public void visit(BinaryArithExpr node) {
        node.lhs.accept(this);
        node.rhs.accept(this);
        Register res = new Register();
        entityMap.put(res, "%t" + varCnt);
        varCnt++;
        if (node.lhs.type.isInt() && node.rhs.type.isInt()) {
            if (node.op == ADD || node.op == SUB || node.op == MUL || node.op == DIV || node.op == MOD
                    || node.op == BLS || node.op == BRS || node.op == BAND || node.op == BOR || node.op == BXOR) {
                Binary n = new Binary(node.op);
                n.dest = res;
                n.setLhs(node.lhs.entity);
                n.setRhs(node.rhs.entity);
                node.entity = res;
                curBlock.insts.add(n);
            } else {
                Icmp n = new Icmp(node.op);
                n.dest = res;
                n.setLhs(node.lhs.entity);
                n.setRhs(node.rhs.entity);
                node.entity = res;
                curBlock.insts.add(n);
            }
        } else if (node.lhs.type.isString() && node.rhs.type.isString()) {
            if (node.op == ADD) {
                // call strcat
            } else if (node.op == EQ || node.op == NE
                    || node.op == LT || node.op == GT
                    || node.op == LE || node.op == GE) {
                // call strcmp
            }
        } else if (node.lhs.type.isNull() || node.rhs.type.isNull()) {
            Icmp n = new Icmp(node.op);
            n.dest = res;
            if (node.lhs.type.isNull()) {
                n.setLhs(node.rhs.entity);
            } else {
                n.setRhs(node.lhs.entity);
            }
            node.entity = res;
            curBlock.insts.add(n);
        }

    }


    @Override
    public void visit(BinaryLogicExpr node) {
        Register res = new Register();
        if (node.op == AND) {
            IRBlock trueBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".and.rhs");
            IRBlock falseBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".and.end");
            node.lhs.accept(this);
            Br b = new Br(node.lhs.entity, trueBlock, falseBlock);
            curBlock.insts.add(b);
            curBlock = trueBlock;
            node.rhs.accept(this);
            Jmp j = new Jmp(falseBlock);
            curBlock.insts.add(j);
            curBlock = falseBlock;
            Phi p= new Phi();// not completed
            p.dest = res;
            curBlock.addInst(p);
        } else if (node.op == OR) {
            IRBlock trueBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".or.end");
            IRBlock falseBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".or.rhs");
            node.lhs.accept(this);
            Br b = new Br(node.lhs.entity, trueBlock, falseBlock);
            curBlock.insts.add(b);
            curBlock = falseBlock;
            node.rhs.accept(this);
            Jmp j = new Jmp(trueBlock);
            curBlock.insts.add(j);
            curBlock = trueBlock;
            Phi p= new Phi();// not completed
            p.dest = res;
            curBlock.addInst(p);
        }
        node.entity=res;
    }

    @Override
    public void visit(BoolLiteralExpr node) {
        node.entity = new Constant(node.value ? 1 : 0);
    }

    @Override
    public void visit(FmtStrLiteralExpr node) {
        node.exprs.forEach(e -> e.accept(this));
        /// todo: call printf to print all the expr values
    }

    @Override
    public void visit(FuncCallExpr node) {
        FuncType ft = gScope.getFunc(node.funcName);


    }

    @Override
    public void visit(IntLiteralExpr node) {
        node.entity = new Constant(node.value);
    }

    @Override
    public void visit(MemberFuncCallExpr node) {

    }

    @Override
    public void visit(MemberObjAccessExpr node) {
        Type ot = node.obj.type;
        String cn = ot.typeName;
        String fn = node.member;
        int ind = gScope.getClass(cn).getMemberOffset(fn);
        Register res = new Register();
        GetElePtr g = new GetElePtr();
    }

    @Override
    public void visit(NewArrayExpr node) {

    }

    @Override
    public void visit(NewArrayInitExpr node) {

    }

    @Override
    public void visit(NewTypeExpr node) {

    }

    @Override
    public void visit(NullExpr node) {
        node.entity = null;
    }

    @Override
    public void visit(ParenthesesExpr node) {
        node.accept(this);
        node.entity = node.exp.entity;
    }

    @Override
    public void visit(RowExpr node) {
        node.exps.forEach(e -> e.accept(this));
        node.entity = node.exps.getLast().entity;
    }

    @Override
    public void visit(StringLiteralExpr node) {

    }

    @Override
    public void visit(TernaryBranchExpr node) {

    }

    @Override
    public void visit(ThisPtrExpr node) {

    }

    @Override
    public void visit(UnaryArithExpr node) {
        node.expr.accept(this);
        Register res = new Register();
        entityMap.put(res, "%t" + varCnt);
        varCnt++;
        if (node.op == NEG) {
            Binary n = new Binary("sub");
            n.dest = res;
            n.setLhs(0);
            n.setRhs(node.expr.entity);
            node.entity = res;
            curBlock.insts.add(n);
        } else if (node.op == BNOT) {
            Binary n = new Binary("xor");
            n.dest = res;
            n.setRhs(-1);
            n.setLhs(node.expr.entity);
            node.entity = res;
            curBlock.insts.add(n);
        } else if (node.op == LINC || node.op == LDEC
                || node.op == RINC || node.op == RDEC) {
            Binary n = new Binary((node.op == LINC || node.op == RINC) ? "add" : "sub");
            n.dest = res;
            n.setLhs(node.expr.entity);
            n.setRhs(1);
            node.entity = res;
            Store s = new Store(new IRType(node.expr.type),
                    res, (Register) node.expr.entity);
            node.entity = ((node.op == LINC || node.op == LDEC) ?
                    (Register) node.expr.entity : res);
            curBlock.insts.add(n);
            curBlock.insts.add(s);
        }

    }

    @Override
    public void visit(UnaryLogicExpr node) {
        Register res = new Register();
        entityMap.put(res, "%t" + varCnt);
        varCnt++;
        Binary n = new Binary("xor");
        n.dest = res;
        n.setLhs(1);
        n.setRhs(node.expr.entity);
        node.entity = res;
        curBlock.insts.add(n);
    }

    @Override
    public void visit(VarExpr node) {
        Register res = new Register();
        entityMap.put(res, "%t" + varCnt);
        varCnt++;
        Load l = new Load(new IRType(node.type), res, (Register) node.entity);
        node.entity = res;
        curBlock.insts.add(l);
    }
}
