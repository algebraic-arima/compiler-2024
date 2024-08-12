package src.AST.Expr;

import org.antlr.v4.runtime.tree.TerminalNode;
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
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
