package src.utils.IRType;

import src.utils.type.Type;

public class IRType {
    public String typeName;
    public int size = 0;// bit

    public void print() {
        System.out.print(typeName);
    }

    public IRType() {
        typeName = "void";
        size = -1;
    }

    public IRType(Type t) {
        if (t.dim >= 1) {
            typeName = "ptr";
            size = 32;
        } else {
            switch (t.atomType) {
                case INT:
                    typeName = "i32";
                    size = 32;
                    break;
                case BOOL:
                    typeName = "i1";
                    size = 1;
                    break;
                case STRING:
                    typeName = "ptr";
                    size = 32;
                    break;
                case VOID:
                    typeName = "void";
                    size = -1;
                    break;
                case CLASS:
                    typeName = "ptr"; // as a parameter
                    size = 32;
                    break;
            }
        }
    }

    public IRType(String s){
        switch (s) {
            case "int":
                typeName = "i32";
                size = 32;
                break;
            case "bool":
                typeName = "i1";
                size = 1;
                break;
            case "string":
                typeName = "ptr";
                size = 32;
                break;
            case "void":
                typeName = "void";
                size = -1;
                break;
            default:
                typeName = "%Class-" + s;// on how to interpret a ptr
                size = 0;
                break;
        }
    }

    public IRType setType(Type.T atomType) {
        switch (atomType) {
            case INT:
                typeName = "i32";
                size = 32;
                break;
            case BOOL:
                typeName = "i1";
                size = 1;
                break;
            case STRING:
                typeName = "ptr";
                size = 32;
                break;
            case VOID:
                typeName = "void";
                size = -1;
                break;
        }
        return this;
    }
}
