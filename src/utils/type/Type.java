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
        atomType = determineAtomType(str);
        dim = d;
    }

    // for single type
    public Type(String str) {
        typeName = str;
        atomType = determineAtomType(str);
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
            typeName = ctx.singletype().getText();
            atomType = determineAtomType(typeName);
            dim = 0;
        } else if (ctx.arraytype() != null) {
            Mx.ArraytypeContext at = ctx.arraytype();
            dim = (at.getChildCount() - 1) / 2;
            typeName = at.singletype().getText();
            atomType = determineAtomType(typeName);
        }
    }

    private T determineAtomType(String str) {
        if (Objects.equals(str, "null")) {
            return T.NULL;
        }
        switch (str) {
            case "int":
                return T.INT;
            case "bool":
                return T.BOOL;
            case "string":
                return T.STRING;
            case "void":
                return T.VOID;
            default:
                return T.CLASS;
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

    public boolean isClass() {
        return atomType == T.CLASS && dim == 0;
    }

    public boolean isArray() {
        return dim > 0;
    }

    public boolean isNull() {
        return atomType == T.NULL;
    }

    public boolean isVoid() {
        return atomType == T.VOID;
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
