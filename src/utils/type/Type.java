package src.utils.type;

import src.parser.Mx;

import java.util.ArrayList;
import java.util.HashMap;

public class Type {
    public enum T {
        INT, BOOL, STRING, VOID, NULL, UNKNOWN, CLASS
    }

    public T atomType;
    public String typeName;
    public Integer dim;

    public Type() {
        atomType = T.UNKNOWN;
        typeName = null;
        dim = 0;
    }

    public Type(Mx.TypeContext ctx) {
        if (ctx == null) {
            atomType = T.UNKNOWN;
            typeName = null;
            dim = 0;
            return;
        }
        if (ctx.atomtype() != null) {
            String atstr = ctx.atomtype().getText();
            typeName = atstr;
            switch (atstr) {
                case "int" -> atomType = T.INT;
                case "bool" -> atomType = T.BOOL;
                case "string" -> atomType = T.STRING;
                case "void" -> atomType = T.VOID;
                default -> atomType = T.CLASS;
            }
        } else if (ctx.arraytype() != null) {
            Mx.ArraytypeContext at = ctx.arraytype();
            dim = (at.getChildCount() - 1) / 2;
            typeName = at.atomtype().getText();
            switch (typeName) {
                case "int" -> atomType = T.INT;
                case "bool" -> atomType = T.BOOL;
                case "string" -> atomType = T.STRING;
                case "void" -> atomType = T.VOID;
                default -> atomType = T.CLASS;
            }
        }
    }
}
