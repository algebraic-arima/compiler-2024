package src.IR.IRDef;

import src.IR.IRBlock;
import src.utils.IRType.IRType;

import java.util.ArrayList;
import java.util.HashSet;

public class IRFuncDef extends IRDef{


    public IRType retType;
    public String name;
    public ArrayList<IRType> paramTypes;
    public IRBlock entry;
    public HashSet<IRBlock> blocks;


    @Override
    public String str() {
        return "";
    }
}
