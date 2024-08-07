package src.AST.Stmt.LoopStmt;

import src.AST.ASTVisitor;
import src.AST.Expr.RowExpr;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;

public class ForStmt extends Stmt {

    public RowExpr init, cond, update;
    public Stmt body;

    public ForStmt(Position p) {
        super(p);
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
