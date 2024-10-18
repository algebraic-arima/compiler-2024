package src.IR.IRInst;

import src.IR.IRVisitor;
import src.utils.Entity.*;

import java.util.HashSet;

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


    @Override
    public HashSet<String> getUse() {
        return null;
    }

    @Override
    public String getDef() {
        return null;
    }
}
