package src.AST.Stmt;

import src.AST.__ASTVisitor;
import src.utils.pos.Position;

public class EmptyStmt extends Stmt {
    public EmptyStmt(Position p) {
        super(p);
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
