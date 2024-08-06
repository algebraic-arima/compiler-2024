package src.AST.Stmt.JumpStmt;

import src.AST.ASTVisitor;
import src.AST.Expr.Expr;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;

public class IfStmt extends Stmt {
    Expr condition;
    Stmt trueStmt, falseStmt;

    public IfStmt(Position p, Expr c, Stmt t, Stmt f) {
        super(p);
        condition = c;
        trueStmt = t;
        falseStmt = f;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
