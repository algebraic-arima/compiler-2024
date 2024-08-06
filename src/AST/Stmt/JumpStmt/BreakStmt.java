package src.AST.Stmt.JumpStmt;

import src.AST.ASTVisitor;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;

public class BreakStmt extends Stmt{

    public BreakStmt(Position p) {
        super(p);
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
