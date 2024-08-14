package src.AST.Expr;

import src.AST.__ASTVisitor;
import src.utils.pos.Position;

import java.util.ArrayList;

public class NewArrayExpr extends Expr {
    public ArrayList<Expr> len;

    public NewArrayExpr(Position p) {
        super(p);
        len = new ArrayList<>();
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
