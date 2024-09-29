package src.IR.IRInst;

import src.IR.IRVisitor;
import src.utils.Entity.*;

public class MV extends IRInst {

    Entity src;

    public MV(Entity src, Register dest) {
        this.src = src;
        this.dest = dest;
    }

    @Override
    public void print() {

    }

    @Override
    public void accept(IRVisitor visitor) {

    }
}
