package src.IR.IRDef;

import src.utils.IRType.IRType;

public class IRGlobalVarDef extends IRDef {

    public IRType irType;
    public String name;
    public IRFuncDef init;

    public IRGlobalVarDef() {
        irType = new IRType();
        name = "";
        init = new IRFuncDef();
    }

    @Override
    public String str() {
        return "";
    }
}
