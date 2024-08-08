package src.AST.Expr;

import src.AST.ASTVisitor;
import src.utils.pos.Position;

import java.util.ArrayList;

public class FmtStrLiteralExpr extends Expr {
    public ArrayList<String> strs;
    public ArrayList<Expr> exprs;

    public FmtStrLiteralExpr(Position p) {
        super(p);
        strs = new ArrayList<>();
        exprs = new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}

