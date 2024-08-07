package src.AST.Expr;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Objects;

public class BoolLiteralExpr extends Expr {
    public boolean value;

    public BoolLiteralExpr(boolean v) {
        value = v;
    }

    public BoolLiteralExpr(TerminalNode node) {
        value = Objects.equals(node.getText(), "true");
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
