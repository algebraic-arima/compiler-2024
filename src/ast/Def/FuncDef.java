package src.AST.Def;

import src.AST.BaseASTNode;

public class FuncDef extends Def {
    public BaseASTNode funcName;
    public BaseASTNode funcType;
    public BaseASTNode funcBody;

    public FuncDef() {
        super();
    }
}