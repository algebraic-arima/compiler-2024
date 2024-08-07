package src.AST.Def;

import src.AST.ASTVisitor;
import src.AST.Stmt.PolyStmt;
import src.utils.pos.Position;

public class Constructor extends Def{
    public String className;
    public PolyStmt funcBody;

    public Constructor(Position p){
        super(p);
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
