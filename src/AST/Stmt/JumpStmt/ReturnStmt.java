package src.AST.Stmt.JumpStmt;

import src.AST.__ASTVisitor;
import src.AST.Expr.Expr;
import src.AST.Stmt.Stmt;
import src.utils.pos.Position;

public class ReturnStmt extends Stmt {
//    public Type returnType;
    public Expr retExpr;

    public ReturnStmt(Position p) {
        super(p);
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
