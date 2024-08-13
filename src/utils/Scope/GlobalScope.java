package src.utils.Scope;

import src.utils.error.MultipleDefinitions;
import src.utils.error.UndefinedIdentifier;
import src.utils.error.error;
import src.utils.pos.Position;
import src.utils.type.ClassType;
import src.utils.type.FuncType;
import src.utils.type.Type;

import java.util.HashMap;

public class GlobalScope extends Scope {


    public HashMap<String, ClassType> ClassList;

    public GlobalScope() {
        super();
        ClassList = new HashMap<>();
        FuncType print = new FuncType(new Type("void"));
        print.args.put("str", new Type("string"));
        FuncList.put("print", print);
        FuncList.put("println", print);

        FuncType printint = new FuncType(new Type("void"));
        printint.args.put("n", new Type("int"));
        FuncList.put("printInt", printint);
        FuncList.put("printlnInt", printint);

        FuncType getstring = new FuncType(new Type("string"));
        FuncList.put("getString", getstring);

        FuncType tostring = new FuncType(new Type("string"));
        tostring.args.put("i", new Type("int"));
        FuncList.put("toString", tostring);

        FuncType getInt = new FuncType(new Type("int"));
        FuncList.put("getInt", getInt);


        ClassType stringclass = new ClassType();
        FuncType lenfunc = new FuncType(new Type("int"));
        stringclass.methods.put("length", new FuncType(new Type("int")));
        stringclass.methods.put("parseInt", new FuncType(new Type("int")));

        FuncType substringfunc = new FuncType(new Type("string"));
        substringfunc.args.put("left", new Type("int"));
        substringfunc.args.put("right", new Type("int"));
        stringclass.methods.put("substring", substringfunc);

        FuncType ordfunc = new FuncType(new Type("int"));
        ordfunc.args.put("pos", new Type("int"));
        stringclass.methods.put("ord", ordfunc);

        ClassList.put("string", stringclass);

    }

    public void addClass(String name, ClassType t, Position p) {
        if (ClassList.containsKey(name)) {
            throw new MultipleDefinitions(p);
        }
        ClassList.put(name, t);
    }

    public ClassType getClass(String name) {
        if (ClassList.containsKey(name)) return ClassList.get(name);
        return null;
    }

    public void addMemberFunc(String className, String funcName, FuncType t, Position p) {
        if (!ClassList.containsKey(className)) {
//            throw new error("No such class: " + className, p);
            throw new UndefinedIdentifier(p);
        }
        if (ClassList.get(className).methods.containsKey(funcName)) {
            throw new MultipleDefinitions(p);
        }
        ClassList.get(className).methods.put(funcName, t);
    }

    public void addMemberVar(String className, String varName, Type t, Position p) {
        if (!ClassList.containsKey(className)) {
//            throw new error("No such class: " + className, p);
            throw new UndefinedIdentifier(p);
        }
        if (ClassList.get(className).fields.containsKey(varName)) {
            throw new MultipleDefinitions(p);
        }
        ClassList.get(className).fields.put(varName, t);
    }
}
