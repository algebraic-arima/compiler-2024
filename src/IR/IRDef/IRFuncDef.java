package src.IR.IRDef;

import src.IR.IRBlock;
import src.utils.IRType.IRType;
import src.IR.IRInst.Alloca;

import java.util.ArrayList;

public class IRFuncDef extends IRDef {

    public IRType retType;
    public String name;
    public ArrayList<IRType> paramTypes;
    public ArrayList<String> paramNames;
    public IRBlock regCollector;
    public ArrayList<IRBlock> blocks;

    public IRFuncDef(String name) {
        retType = new IRType();
        this.name = name;
        paramTypes = new ArrayList<>();
        paramNames = new ArrayList<>();
        blocks = new ArrayList<>();
        regCollector = new IRBlock("entry");
    }

    public void addBlock(IRBlock e) {
        blocks.add(e);
    }

    public void addAlloca(Alloca a){
        regCollector.addInst(a);
    }


    public void print() {
        System.out.print("\ndefine dso_local " + retType.typeName + " " + name + "(");
        for (int i = 0; i < paramNames.size(); ++i) {
            paramTypes.get(i).print();
            System.out.print(" " + paramNames.get(i));
            if (i != paramNames.size() - 1)
                System.out.print(", ");
        }
        System.out.print(") {\n");
        blocks.forEach(IRBlock::print);
        System.out.print("}\n");
    }
}
