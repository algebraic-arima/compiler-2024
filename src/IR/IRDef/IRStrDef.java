package src.IR.IRDef;

import java.util.LinkedHashMap;
import java.util.Map;

public class IRStrDef extends IRDef {

    public LinkedHashMap<String, Integer> strMap;

    public IRStrDef() {
        strMap = new LinkedHashMap<>();
    }

    public String getString(String s) {
        if (!strMap.containsKey((s))) {
            return null;
        } else {
            return "@constStr-" + (strMap.get(s));
        }
    }

    public void push(String s) {
        if (strMap.containsKey((s))) {
            return;
        } else {
            strMap.put(s, strMap.size());
        }
    }

    @Override
    public void print() {
        for (Map.Entry<String, Integer> e : strMap.entrySet()) {
            System.out.print("@constStr-");
            System.out.print(e.getValue());
            System.out.print(" = private unnamed_addr constant [");
            System.out.print(e.getKey().length() + 1);
            System.out.print(" x i8] c\"");
            String s = e.getKey();
            s = s.replace("\\", "\\\\");
            s = s.replace("\"", "\\22");
            s = s.replace("\n", "\\0A");
            System.out.print(s);
            System.out.print("\\00\"\n");
        }
    }
}
