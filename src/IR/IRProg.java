package src.IR;


import src.IR.IRDef.IRDef;

import java.util.ArrayList;

public class IRProg extends IRNode{
    public ArrayList<IRDef> defs;

    public IRProg(){
        defs = new ArrayList<>();
    }

    @Override
    public String str() {
        return "";
    }
}
