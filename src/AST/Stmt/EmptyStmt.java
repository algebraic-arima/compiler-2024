package src.AST.Stmt;

import src.AST.ASTVisitor;
import src.utils.pos.Position;

public class EmptyStmt extends Stmt {
    public EmptyStmt(Position p) {
        super(p);
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
