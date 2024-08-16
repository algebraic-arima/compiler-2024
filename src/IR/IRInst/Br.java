package src.IR.IRInst;

import src.IR.IRBlock;
import src.utils.Entity.Entity;

public class Br extends terminalInst {

    public Entity cond;
    public IRBlock trueBlock, falseBlock;

    public Br(Entity cond, IRBlock trueBlock, IRBlock falseBlock) {
        this.cond = cond;
        this.trueBlock = trueBlock;
        this.falseBlock = falseBlock;
    }

    @Override
    public String str() {
        return "";
    }
}
