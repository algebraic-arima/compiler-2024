package src.AST.Expr;

import src.utils.pos.Position;
import src.utils.type.Type;

import java.util.ArrayList;

public class NewArrayExpr extends Expr {
    public Type type;
    public int dim;
    public ArrayList<Expr> len;

    public NewArrayExpr(Position p) {
        super(p);
        len = new ArrayList<>();
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
