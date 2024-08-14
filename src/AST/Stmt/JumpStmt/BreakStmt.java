package src.AST.Stmt.JumpStmt;

import src.AST.__ASTVisitor;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;

public class BreakStmt extends Stmt{

    public BreakStmt(Position p) {
        super(p);
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
