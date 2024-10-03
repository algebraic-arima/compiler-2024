package src.IR.IRInst;

import src.IR.IRVisitor;
import src.utils.Entity.*;

public class Move extends IRInst {

    public Entity src;

    public Move(Entity src, Register dest) {
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
