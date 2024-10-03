package src.IR;

import src.IR.IRDef.*;
import src.IR.IRInst.*;

public interface IRVisitor {

    public void visit(IRProg node);

    public void visit(IRClassDef node);

    public void visit(IRFuncDef node);

    public void visit(IRGlobalVarDef node);

    public void visit(IRStrDef node);

    public void visit(IRBlock node);

    public void visit(Alloca node);

    public void visit(Binary node);

    public void visit(Br node);

    public void visit(Call node);

    public void visit(GetElePtr node);

    public void visit(Icmp node);

    public void visit(Jmp node);

    public void visit(Label node);

    public void visit(Load node);

    public void visit(Ret node);

    public void visit(Store node);


}
