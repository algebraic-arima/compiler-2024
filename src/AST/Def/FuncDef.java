package src.AST.Def;

import src.AST.ASTVisitor;
import src.AST.Stmt.BlockStmt;
import src.utils.pos.Position;
import src.utils.type.Type;

import java.util.HashMap;

public class FuncDef extends Def {
    public String funcName;
    public Type funcType;
    public HashMap<String,Type> funcParams;
    public BlockStmt funcBody;

    public FuncDef(Position p) {
        super(p);
        funcParams = new HashMap<>();
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

}