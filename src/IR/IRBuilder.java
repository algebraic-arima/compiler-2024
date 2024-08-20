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
import static src.utils.type.Type.T.*;


public class IRBuilder implements __ASTVisitor {

    public IRProg irProg;
    public HashSet<String> globalVar;
    GlobalScope gScope;
    Scope curScope;
    //    public HashMap<Register, String> entityMap;
    // temporary register to name
    // the address of variable `a` is stored in %a.addr
    // name to the register name that stores the variable address
    // for change of field, update and restore the map
    public int varCnt;
    public String curClassDef = null;
    public IRBlock curBlock;
    public IRFuncDef curFunc;

    public IRBlock breakBlock = null, contBlock = null;


    public IRType typeI32 = new IRType().setType(INT);
    public IRType typeI1 = new IRType().setType(BOOL);
    public IRType typePtr = new IRType().setType(STRING);


    public void RollBack() {
        if (curScope.parent == null) return;
        curScope.VarList = null;
        curScope.FuncList = null;
        curScope = curScope.parent;
    }

    public IRBuilder(GlobalScope gScope) {
        irProg = new IRProg();
        globalVar = new HashSet<>();
        for (Map.Entry<String, Type> e : gScope.VarList.entrySet()) {
            globalVar.add(e.getKey());
        }
//        entityMap = new HashMap<>();
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
        if (curScope.isGlobal()) {
            IRFuncDef f = new IRFuncDef("@" + node.funcName);
            irProg.addFuncDef(f);
            f.retType = new IRType(node.retType);
            curBlock = new IRBlock("entry");
            curFunc = f;
            for (Map.Entry<String, Type> entry : node.funcParams.entrySet()) {
                f.paramTypes.add(new IRType(entry.getValue()));
                f.paramNames.add("%" + entry.getKey() + ".val");
                Register r = new Register("%" + entry.getKey());
                curBlock.addInst(new Alloca(new IRType(entry.getValue()), r));
                curBlock.addInst(new Store(new IRType(entry.getValue()),
                        new Register("%" + entry.getKey() + ".val"), r));
            }

            curScope = new Scope(curScope);
            curScope.VarList = curScope.getFunc(node.funcName).args;

            node.funcBody.stmts.forEach(d -> d.accept(this));

            if (node.retType.isVoid()) {
                curBlock.addInst(new Ret());
            }

            curFunc.addBlock(curBlock);
            RollBack();
        } else {
            IRFuncDef f = new IRFuncDef("@" + curClassDef + "::" + node.funcName);
            irProg.addFuncDef(f);
            f.retType = new IRType(node.retType);
            curBlock = new IRBlock("entry");
            curFunc = f;
            f.paramTypes.add(typePtr);
            f.paramNames.add("%this.val");
            for (Map.Entry<String, Type> entry : node.funcParams.entrySet()) {
                f.paramTypes.add(new IRType(entry.getValue()));
                f.paramNames.add("%" + entry.getKey() + ".val");
                Register r = new Register("%" + entry.getKey());
                curBlock.addInst(new Alloca(new IRType(entry.getValue()), r));
                curBlock.addInst(new Store(new IRType(entry.getValue()),
                        new Register("%" + entry.getKey() + ".val"), r));
            }

            curScope = new Scope(curScope);
            curScope.VarList = gScope.getClass(curClassDef).methods.get(node.funcName).args;

            Register originThisReg = new Register("%this");
            Register thisReg = new Register("%this1");
            curBlock.addInst(new Alloca(typePtr, originThisReg));
            curBlock.addInst(new Store(typePtr, new Register("%this.val"), originThisReg));
            curBlock.addInst(new Load(typePtr, originThisReg, thisReg));

            int m = 0;
            for (Map.Entry<String, Type> e : gScope.getClass(curClassDef).fields.entrySet()) {
                GetElePtr g = new GetElePtr(curClassDef, e.getValue().typeName, thisReg, new Register("%" + curClassDef + "::" + e.getKey()), 0, m);
                curBlock.addInst(g);
                m++;
            }

            node.funcBody.stmts.forEach(d -> d.accept(this));

            if (node.retType.isVoid()) {
                curBlock.addInst(new Ret());
            }

            curFunc.addBlock(curBlock);
            RollBack();
        }
    }

    @Override
    public void visit(ClassDef node) {
        curScope = new Scope(curScope);
        curScope.VarList = gScope.getClass(node.className).fields;
        curClassDef = node.className;
        IRClassDef cd = new IRClassDef(node.className);
        curBlock = new IRBlock("entry");
        curFunc = new IRFuncDef("@" + node.className + "::" + node.className);
        curFunc.paramNames.add("%this.val");
        curFunc.paramTypes.add(typePtr);
        Register originThisReg = new Register("%this");
        Register thisReg = new Register("%this1");
        curBlock.addInst(new Alloca(typePtr, originThisReg));
        curBlock.addInst(new Store(typePtr, new Register("%this.val"), originThisReg));
        curBlock.addInst(new Load(typePtr, originThisReg, thisReg));

        int m = 0;
        for (Map.Entry<String, Type> e : gScope.getClass(curClassDef).fields.entrySet()) {
            GetElePtr g = new GetElePtr(curClassDef, e.getValue().typeName, thisReg, new Register("%" + curClassDef + "::" + e.getKey()), 0, m);
            curBlock.addInst(g);
            m++;
        }

        for (VarDef v : node.classMem) {
            for (Map.Entry<String, Expr> entry : v.initVals.entrySet()) {
                cd.fields.add(new IRType(v.type));
                if (entry.getValue() != null) {
                    Register reg = new Register("%" + node.className + "::" + entry.getKey());
                    entry.getValue().accept(this);
                    Store s = new Store(new IRType(v.type), entry.getValue().entity, reg);
                    curBlock.addInst(s);
                }
            }
        }
        node.constructor.accept(this);
        curBlock.addInst(new Ret());
        curFunc.addBlock(curBlock);
        irProg.addClassDef(cd);
        irProg.addFuncDef(curFunc);
        node.classFunc.forEach(d -> d.accept(this));
        curClassDef = null;
        RollBack();
    }

    @Override
    public void visit(VarDef node) {
        if (curScope.isGlobal()) {
            for (Map.Entry<String, Expr> entry : node.initVals.entrySet()) {
                IRGlobalVarDef g = new IRGlobalVarDef();
                Register addr = new Register(node.type, "@" + entry.getKey());
//                entityMap.put(addr, "@" + entry.getKey());
                g.irType = typeI32;
                g.name = "@" + entry.getKey();
                if (entry.getValue() instanceof IntLiteralExpr) {
                    g.value = ((IntLiteralExpr) entry.getValue()).value;
                } else {
                    g.value = 0;
                    IRFuncDef init = new IRFuncDef("@__init_global_" + entry.getKey());
                    curBlock = new IRBlock("entry");
                    curFunc = init;
                    entry.getValue().accept(this);
                    curBlock.addInst(new Store(new IRType(node.type), entry.getValue().entity, new Register(g.name)));
                    curBlock.addInst(new Ret());
                    curFunc.addBlock(curBlock);
                    irProg.addFuncDef(init);
                }
                irProg.addGVarDef(g);
            }
        } else {
            for (Map.Entry<String, Expr> entry : node.initVals.entrySet()) {
                Register addr = new Register(node.type, "%" + entry.getKey());
//                entityMap.put(addr, "%" + entry.getKey());

                if (entry.getValue() != null) {
                    entry.getValue().accept(this);
                }

                if (node.type.isInt() || node.type.isBool()) {
                    Alloca a = new Alloca(typeI32, addr);
                    curBlock.addInst(a);
                    if (entry.getValue() != null) {
                        Store s = new Store(typeI32, entry.getValue().entity, addr);
                        curBlock.addInst(s);
                    }
                } else if (node.type.isClass() || node.type.isString()) {
                    Alloca a = new Alloca(typePtr, addr);
                    curBlock.addInst(a);
                    if (entry.getValue() != null) {
                        Store s = new Store(typePtr, entry.getValue().entity, addr);
                        curBlock.addInst(s);
                    }
                }
            }
        }
    }

    @Override
    public void visit(Constructor node) {
        node.funcBody.stmts.forEach(d -> d.accept(this));
    }

    @Override
    public void visit(BreakStmt node) {
        Jmp j = new Jmp(breakBlock);
        curBlock.insts.add(j);
    }

    @Override
    public void visit(ContinueStmt node) {
        Jmp j = new Jmp(contBlock);
        curBlock.insts.add(j);
    }

    @Override
    public void visit(ReturnStmt node) {
        if (node.retExpr != null) {
            node.retExpr.accept(this);
            Ret r = new Ret(node.retExpr.entity.type, node.retExpr.entity);
            curBlock.insts.add(r);
        } else {
            Ret r = new Ret();
            curBlock.insts.add(r);
        }
    }

    @Override
    public void visit(IfStmt node) {
        node.condition.accept(this);
        if (node.falseStmt == null) {
            IRBlock thenBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".if.then");
            IRBlock endBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".if.end");
            Br b = new Br(node.condition.entity, thenBlock, endBlock);
            curBlock.insts.add(b);
            curFunc.addBlock(curBlock);
            curBlock = thenBlock;
            node.trueStmt.accept(this);
            Jmp j = new Jmp(endBlock);
            curBlock.insts.add(j);
            curFunc.addBlock(curBlock);
            curBlock = endBlock;
        } else {
            IRBlock thenBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".if.then");
            IRBlock elseBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".if.else");
            IRBlock endBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".if.end");
            Br b = new Br(node.condition.entity, thenBlock, elseBlock);
            curBlock.insts.add(b);
            curFunc.addBlock(curBlock);
            curBlock = thenBlock;
            node.trueStmt.accept(this);
            Jmp j = new Jmp(endBlock);
            curBlock.insts.add(j);
            curFunc.addBlock(curBlock);
            curBlock = elseBlock;
            node.falseStmt.accept(this);
            j = new Jmp(endBlock);
            curBlock.insts.add(j);
            curFunc.addBlock(curBlock);
            curBlock = endBlock;
        }
    }

    @Override
    public void visit(WhileStmt node) {
        if (node.body == null) return;
        IRBlock condBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".while.cond");
        IRBlock bodyBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".while.body");
        IRBlock endBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".while.end");
        IRBlock tmpBreak = breakBlock, tmpCont = contBlock;
        breakBlock = endBlock;
        contBlock = condBlock;
        Jmp j = new Jmp(condBlock);
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = condBlock;
        node.cond.accept(this);
        Br b = new Br(node.cond.entity, bodyBlock, endBlock);
        curBlock.addInst(b);
        curFunc.addBlock(curBlock);
        curBlock = bodyBlock;
        node.body.accept(this);
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = endBlock;
        breakBlock = tmpBreak;
        contBlock = tmpCont;
    }

    @Override
    public void visit(ForStmt node) {
        if (node.body == null) return;
        if (node.init != null) {
            node.init.accept(this);
        }
        IRBlock condBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".for.cond");
        IRBlock bodyBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".for.body");
        IRBlock endBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".for.end");
        IRBlock tmpBreak = breakBlock, tmpCont = contBlock;
        breakBlock = endBlock;
        contBlock = condBlock;

        Jmp j = new Jmp(condBlock);
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = condBlock;
        if (node.cond != null) {
            node.cond.accept(this);
            Br b = new Br(node.cond.entity, bodyBlock, endBlock);
            curBlock.addInst(b);
            curFunc.addBlock(curBlock);
            curBlock = bodyBlock;
        }
        node.body.accept(this);
        if (node.update != null) {
            node.update.accept(this);
        }
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = endBlock;

        breakBlock = tmpBreak;
        contBlock = tmpCont;
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
        node.stmts.forEach(s -> s.accept(this));
        curScope = curScope.parent;
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
//        Entity n = node.entity;
        Entity val = node.value.entity;
        if (node.var instanceof VarExpr) {
            boolean isg = globalVar.contains(((VarExpr) node.var).varName);
            Store s = new Store(new IRType(node.var.type), val,
                    new Register((isg ? "@" : "%") + ((VarExpr) node.var).varName));
            curBlock.addInst(s);
        } else if (node.var instanceof MemberObjAccessExpr) {
            node.var.accept(this);
            Store s = new Store(new IRType(node.var.type), val, (Register) node.var.entity);
            curBlock.addInst(s);
        }
    }

    @Override
    public void visit(BinaryArithExpr node) {
        node.lhs.accept(this);
        node.rhs.accept(this);
        Register res = new Register(node.type, "%t" + varCnt);
//        entityMap.put(res, "%t" + varCnt);
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
                Call c = new Call("string.add", node.lhs.type, res);
                c.args.add(node.lhs.entity);
                c.args.add(node.rhs.entity);
                c.argTypes.add(new IRType(node.lhs.type));
                c.argTypes.add(new IRType(node.rhs.type));
                node.entity = res;
                node.entity.type = c.retType;
                curBlock.insts.add(c);
            } else if (node.op == EQ || node.op == NE
                    || node.op == LT || node.op == GT
                    || node.op == LE || node.op == GE) {

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
        Register res = new Register(node.type, "%t" + varCnt);
//        entityMap.put(res, "%t" + varCnt);
        varCnt++;
        if (node.op == AND) {
            Phi p = new Phi(res, boolType);
            p.addList(new Constant(0), curBlock.label.label);
            IRBlock trueBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".and.rhs");
            IRBlock falseBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".and.end");
            node.lhs.accept(this);
            Br b = new Br(node.lhs.entity, trueBlock, falseBlock);
            curBlock.insts.add(b);
            curFunc.addBlock(curBlock);
            curBlock = trueBlock;
            node.rhs.accept(this);
            p.addList(node.rhs.entity, curBlock.label.label);
            Jmp j = new Jmp(falseBlock);
            curBlock.insts.add(j);
            curFunc.addBlock(curBlock);
            curBlock = falseBlock;
            curBlock.addInst(p);
        } else if (node.op == OR) {
            Phi p = new Phi(res, boolType);
            p.addList(new Constant(1), curBlock.label.label);
            IRBlock trueBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".or.end");
            IRBlock falseBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".or.rhs");
            node.lhs.accept(this);
            Br b = new Br(node.lhs.entity, trueBlock, falseBlock);
            curBlock.insts.add(b);
            curFunc.addBlock(curBlock);
            curBlock = falseBlock;
            node.rhs.accept(this);
            p.addList(node.rhs.entity, curBlock.label.label);
            Jmp j = new Jmp(trueBlock);
            curBlock.insts.add(j);
            curFunc.addBlock(curBlock);
            curBlock = trueBlock;
            curBlock.addInst(p);
            curFunc.addBlock(falseBlock);
        }
        node.entity = res;
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

        Call c = null;
        if (node.type.isVoid()) {
            c = new Call(node.funcName, ft.retType, null);
            node.entity = null;
        } else {
            Register res = new Register(node.type, "%t" + varCnt);
            c = new Call(node.funcName, ft.retType, res);
            varCnt++;
            node.entity = res;
        }
        for (Expr e : node.args.exps) {
            e.accept(this);
            c.args.add(e.entity);
            c.argTypes.add(new IRType(e.type));
        }
        curBlock.insts.add(c);
    }

    @Override
    public void visit(IntLiteralExpr node) {
        node.entity = new Constant(node.value);
    }

    @Override
    public void visit(MemberFuncCallExpr node) {
        FuncType ft = gScope.getClass(node.obj.type.typeName).methods.get(node.funcName);
        Call c = null;
        if (node.type.isVoid()) {
            c = new Call("@" + node.obj.type.typeName + "::" + node.funcName, ft.retType, null);
            node.entity = null;
        } else {
            Register res = new Register(node.type, "%t" + varCnt);
            c = new Call("@" + node.obj.type.typeName + "::" + node.funcName, ft.retType, res);
            varCnt++;
            node.entity = res;
        }
        for (Expr e : node.args.exps) {
            e.accept(this);
            c.args.add(e.entity);
            c.argTypes.add(new IRType(e.type));
        }
        curBlock.insts.add(c);
    }

    @Override
    public void visit(MemberObjAccessExpr node) {
        node.obj.accept(this);
        Register res_offset_addr = new Register(node.type, "%t" + varCnt);
        varCnt++;
        Register res = new Register(node.type, "%t" + varCnt);
        varCnt++;

//        Register res_member = new Register(node.type, "%" + node.obj.type.typeName + "." + node.member);
//
//        // res stores the address of the object
//        varCnt++;
//        Load l = new Load(new IRType(node.type), (Register) node.obj.entity, res);
//        curBlock.addInst(l);

        GetElePtr g = new GetElePtr(node.obj.type.typeName, node.type.typeName, (Register) node.obj.entity, res_offset_addr,
                0, gScope.getClass(node.obj.type.typeName).getMemberOffset(node.member));
        curBlock.addInst(g);
        Load ll = new Load(new IRType(node.type.typeName), res_offset_addr, res);
        curBlock.addInst(ll);
        node.entity = res;
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
        node.exp.accept(this);
        node.entity = node.exp.entity;
    }

    @Override
    public void visit(RowExpr node) {
        node.exps.forEach(e -> e.accept(this));
        node.entity = node.exps.getLast().entity;
    }

    @Override
    public void visit(StringLiteralExpr node) {
        int index = gScope.strLiteral.indexOf(node.value);
        node.entity = new Register("@constStr-" + index);
    }

    @Override
    public void visit(TernaryBranchExpr node) {
        node.cond.accept(this);
        IRBlock trueBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".ternary.true");
        IRBlock falseBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".ternary.false");
        IRBlock endBlock = new IRBlock(node.pos.row + "." + node.pos.column + ".ternary.end");
        Br b = new Br(node.cond.entity, trueBlock, falseBlock);
        curBlock.addInst(b);
        curFunc.addBlock(curBlock);
        curBlock = trueBlock;
        node.trueBranch.accept(this);
        Jmp j = new Jmp(endBlock);
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = falseBlock;
        node.falseBranch.accept(this);
        curBlock.addInst(j);
        curFunc.addBlock(curBlock);
        curBlock = endBlock;
        node.entity = new Register(node.type, "%t" + varCnt);
        varCnt++;
        Phi p = new Phi((Register) node.entity, node.type);
        p.addList(node.trueBranch.entity, trueBlock.label.label);
        p.addList(node.falseBranch.entity, falseBlock.label.label);
        curBlock.addInst(p);
    }

    @Override
    public void visit(ThisPtrExpr node) {
        node.entity = new Register("%this1");
    }

    @Override
    public void visit(UnaryArithExpr node) {
        node.expr.accept(this);
        Register res = new Register(node.type, "%t" + varCnt);
//        entityMap.put(res, "%t" + varCnt);
        varCnt++;
        if (node.op == NEG) {
            Binary n = new Binary("-");
            n.dest = res;
            n.setLhs(0);
            n.setRhs(node.expr.entity);
            node.entity = res;
            curBlock.insts.add(n);
        } else if (node.op == BNOT) {
            Binary n = new Binary("^");
            n.dest = res;
            n.setRhs(-1);
            n.setLhs(node.expr.entity);
            node.entity = res;
            curBlock.insts.add(n);
        } else if (node.op == LINC || node.op == LDEC
                || node.op == RINC || node.op == RDEC) {
            Binary n = new Binary((node.op == LINC || node.op == RINC) ? "+" : "-");
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
        node.expr.accept(this);
        Register res = new Register(node.type, "%t" + varCnt);
//        entityMap.put(res, "%t" + varCnt);
        varCnt++;
        Binary n = new Binary("^");
        n.dest = res;
        n.setLhs(1);
        n.setRhs(node.expr.entity);
        node.entity = res;
        curBlock.insts.add(n);
    }

    @Override
    public void visit(VarExpr node) {
        Register res = new Register(node.type, "%t" + varCnt);
//        entityMap.put(res, "%t" + varCnt);
        varCnt++;
        boolean isg = globalVar.contains(node.varName);
        Load l = new Load(new IRType(node.type), new Register((isg ? "@" : "%") + node.varName), res);
        // the value of variable `i` is stored in the position that @i/%i points
        node.entity = res;
        curBlock.insts.add(l);
    }
}
