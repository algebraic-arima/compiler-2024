package src.IR.IRDef;

import src.IR.IRBlock;
import src.utils.IRType.IRType;

import java.util.ArrayList;
import java.util.HashSet;

public class IRFuncDef extends IRDef{

    public IRType retType;
    public String name;
    public ArrayList<IRType> paramTypes;
    public ArrayList<String> paramNames;
    public IRBlock entry;
    public HashSet<IRBlock> blocks;

    public IRFuncDef(String name) {
        retType = new IRType();
        this.name = name;
        paramTypes = new ArrayList<>();
        entry = new IRBlock("entry");
        blocks = new HashSet<>();
    }


    @Override
    public String str() {
        return "";
    }
}
