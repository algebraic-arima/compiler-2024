package src.IR.IRDef;

import src.utils.IRType.IRType;
import src.utils.type.Type;

public class IRGlobalVarDef extends IRDef {

    public IRType irType;
    public String name;
    public long value;

    public IRGlobalVarDef() {
        irType = new IRType();
        name = "";
    }

    public IRGlobalVarDef(Type type, String name) {
        irType = new IRType(type);
        this.name = name;
    }

    @Override
    public void print() {
        System.out.print(name + " = dso_local global " + irType.typeName + " " + value + "\n");
    }
}
