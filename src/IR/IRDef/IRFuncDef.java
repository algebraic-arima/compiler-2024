package src.IR.IRDef;

import src.IR.IRVisitor;
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
    public int regNum = 0;
    public int funcParamMax = 0;

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

    public void addAlloca(Alloca a) {
        regCollector.addInst(a);
    }

    @Override
    public void print(boolean p) {
        if (p) {
            System.out.print("\ndefine dso_local " + retType.typeName + " " + name + "(");
            for (int i = 0; i < paramNames.size(); ++i) {
                paramTypes.get(i).print();
                System.out.print(" " + paramNames.get(i));
                if (i != paramNames.size() - 1)
                    System.out.print(", ");
            }
            System.out.print(") {\n");

        }
        blocks.forEach(e -> {
            e.print(p);
        });
        blocks.forEach(e -> {
            regNum += e.regNum;
            if (e.funcParamMax > funcParamMax) {
                funcParamMax = e.funcParamMax;
            }
        });
        if (p) {
            System.out.print("}\n");
            System.out.print("; " + regNum + " * 4 stack memory used\n");
            System.out.print("; at most " + funcParamMax + " * 4 function parameters\n");
        }
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
