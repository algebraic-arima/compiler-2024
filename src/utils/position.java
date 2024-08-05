package position;

import org.antlr.v4.runtime.ParserRuleContext;

public class Position {
    public int row, column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public Position(ParserRuleContext ctx) {
        this.row = ctx.getStart().getLine();
        this.column = ctx.getStart().getCharPositionInLine();
    }

    public String toString() {
        return "(" + row + ", " + column + ")";
    }
}