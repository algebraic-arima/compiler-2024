package src.ASM;

import src.ASM.ASMDef.ASMBlock;
import src.ASM.ASMDef.ASMFuncDef;
import src.IR.IRDef.*;
import src.IR.IRInst.*;
import src.IR.IRProg;
import src.IR.IRVisitor;

import java.util.ArrayList;

public class ASMBuilder implements IRVisitor {

    public ASMProg prog;
    public ASMFuncDef curFunc;
    public ASMBlock curBlock;
    public ArrayList<IRClassDef> classDefs;

    public ASMBuilder(IRProg prog) {
        classDefs = new ArrayList<>(prog.classDefs);
    }

    @Override
    public void visit(IRProg node) {
        node.funcDefs.forEach(x -> x.accept(this));
        node.gVarDefs.forEach(x -> x.accept(this));
        node.strDef.accept(this);
    }

    @Override
    public void visit(IRClassDef node) {

    }

    @Override
    public void visit(IRFuncDef node) {

    }

    @Override
    public void visit(IRGlobalVarDef node) {

    }

    @Override
    public void visit(IRStrDef node) {

    }

    @Override
    public void visit(IRBlock node) {

    }

    @Override
    public void visit(Alloca node) {

    }

    @Override
    public void visit(Binary node) {

    }

    @Override
    public void visit(Br node) {

    }

    @Override
    public void visit(Call node) {

    }

    @Override
    public void visit(GetElePtr node) {

    }

    @Override
    public void visit(Icmp node) {

    }

    @Override
    public void visit(Jmp node) {

    }

    @Override
    public void visit(Label node) {

    }

    @Override
    public void visit(Load node) {

    }

    @Override
    public void visit(Phi node) {

    }

    @Override
    public void visit(Ret node) {

    }

    @Override
    public void visit(Select node) {

    }

    @Override
    public void visit(Store node) {

    }

}
