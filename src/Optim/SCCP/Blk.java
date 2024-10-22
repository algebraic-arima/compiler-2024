package src.Optim.SCCP;

import src.IR.IRDef.IRBlock;

public class Blk extends SCCPNode {
    public boolean exec = false;
    public IRBlock blk;

    public Blk(IRBlock b) {
        blk = b;
    }
}
