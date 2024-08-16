package src.AST.Stmt.JumpStmt;

import src.AST.ASTVisitor;
import src.AST.__ASTVisitor;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;

public class ContinueStmt extends Stmt {

    public ContinueStmt(Position p) {
        super(p);
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
