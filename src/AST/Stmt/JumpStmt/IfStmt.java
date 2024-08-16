package src.AST.Stmt.JumpStmt;

import src.AST.ASTVisitor;
import src.AST.__ASTVisitor;
import src.AST.Expr.Expr;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;

public class IfStmt extends Stmt {
    public Expr condition;
    public Stmt trueStmt, falseStmt;

    public IfStmt(Position p) {
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
