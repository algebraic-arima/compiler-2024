package src.IR.IRDef;

import src.utils.IRType.IRType;

public class IRGlobalVarDef extends IRDef {

    public IRType irType;
    public String name;
    public long value;

    public IRGlobalVarDef() {
        irType = new IRType();
        name = "";
    }

    @Override
    public String str() {
        return "";
    }
}
