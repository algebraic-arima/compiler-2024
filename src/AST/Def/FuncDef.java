package src.AST.Def;

import src.AST.ASTVisitor;
import src.AST.__ASTVisitor;
import src.AST.Stmt.BlockStmt;
import src.utils.pos.Position;
import src.utils.type.Type;

import java.util.LinkedHashMap;

public class FuncDef extends Def {
    public String funcName;
    public Type retType;
    public LinkedHashMap<String, Type> funcParams;
    public BlockStmt funcBody;

    public FuncDef(Position p) {
        super(p);
        funcParams = new LinkedHashMap<>();
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }

    @Override
    public <T> T accept(ASTVisitor<T> v) {
        return v.visit(this);
    }

}