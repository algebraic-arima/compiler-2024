package src.AST.Def;

import src.AST.ASTVisitor;
import src.AST.Stmt.PolyStmt;
import src.utils.pos.Position;
import src.utils.type.Type;

public class FuncDef extends Def {
    public String funcName;
    public Type funcType;
    public PolyStmt funcBody;

    public FuncDef(Position p) {
        super(p);
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }

}