package src.AST.Expr;

import org.antlr.v4.runtime.tree.TerminalNode;
import src.AST.ASTVisitor;
import src.AST.__ASTVisitor;
import src.utils.pos.Position;
import src.utils.type.Type;

public class StringLiteralExpr extends Expr {
    public String value;

    public StringLiteralExpr(Position p, String v, Type t) {
        super(p);
        type = t;
        value = v;
    }

    public StringLiteralExpr(TerminalNode node) {
        value = node.getText();
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
