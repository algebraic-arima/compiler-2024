package src.AST.Stmt.LoopStmt;

import src.AST.__ASTVisitor;
import src.AST.Expr.Expr;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;

public class ForStmt extends Stmt {

    public Expr cond, update;
    public Stmt init, body;

    public ForStmt(Position p) {
        super(p);
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }

    @Override
    public <T> T accept(src.AST.ASTVisitor<T> v) {
        return v.visit(this);
    }
}
