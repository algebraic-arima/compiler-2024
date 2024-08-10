package src.utils.type;

import src.parser.Mx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

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

    // for array type
    public Type(String str, int d) {
        typeName = str;
        if (Objects.equals(str, "null")) {
            atomType = T.NULL;
            return;
        }
        switch (str) {
            case "int" -> atomType = T.INT;
            case "bool" -> atomType = T.BOOL;
            case "string" -> atomType = T.STRING;
            case "void" -> atomType = T.VOID;
            default -> atomType = T.CLASS;
        }
        dim = d;
    }

    // for single type
    public Type(String str) {
        typeName = str;
        if (Objects.equals(str, "null")) {
            atomType = T.NULL;
            return;
        }
        switch (str) {
            case "int" -> atomType = T.INT;
            case "bool" -> atomType = T.BOOL;
            case "string" -> atomType = T.STRING;
            case "void" -> atomType = T.VOID;
            default -> atomType = T.CLASS;
        }
        dim = 0;
    }

    public Type(Mx.TypeContext ctx) {
        if (ctx == null) {
            atomType = T.UNKNOWN;
            typeName = null;
            dim = 0;
            return;
        }
        if (ctx.singletype() != null) {
            String str = ctx.singletype().getText();
            typeName = str;
            switch (str) {
                case "int" -> atomType = T.INT;
                case "bool" -> atomType = T.BOOL;
                case "string" -> atomType = T.STRING;
                case "void" -> atomType = T.VOID;
                default -> atomType = T.CLASS;
            }
            dim = 0;
        } else if (ctx.arraytype() != null) {
            Mx.ArraytypeContext at = ctx.arraytype();
            dim = (at.getChildCount() - 1) / 2;
            typeName = at.singletype().getText();
            switch (typeName) {
                case "int" -> atomType = T.INT;
                case "bool" -> atomType = T.BOOL;
                case "string" -> atomType = T.STRING;
                case "void" -> atomType = T.VOID;
                default -> atomType = T.CLASS;
            }
        }
    }

    public boolean isInt() {
        return atomType == T.INT && dim == 0;
    }

    public boolean isBool() {
        return atomType == T.BOOL && dim == 0;
    }

    public boolean isString() {
        return atomType == T.STRING && dim == 0;
    }

    public boolean hasClass() {
        return atomType == T.CLASS;
    }// for class type and its array type

    public boolean isArray() {
        return dim > 0;
    }

    public boolean isNull() {
        return atomType == T.NULL;
    }

    /// @equals compares atom types, class names and dimensions
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Type type = (Type) obj;
        return atomType == type.atomType &&
                Objects.equals(typeName, type.typeName) &&
                Objects.equals(dim, type.dim);
    }
}
