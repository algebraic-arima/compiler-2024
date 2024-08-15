package src.IR.IRDef;

import java.util.HashMap;

public class IRStrDef extends IRDef{

    public HashMap<String,Integer> strMap;

    public IRStrDef(){
        strMap = new HashMap<>();
    }

    public String push(String s){
        if(strMap.containsKey((s))){
            return null;
        }else {
            strMap.put(s, strMap.size());
            return "@constStr-" + (strMap.size() - 1);
        }
    }
    @Override
    public String str() {
        return "";
    }
}
