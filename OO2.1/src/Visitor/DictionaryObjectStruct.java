package Visitor;

import java.util.ArrayList;
import java.util.List;


public class DictionaryObjectStruct {

    public static List<Dict> getList(){
        List<Dict> list = new ArrayList<Dict>();
        list.add(new EnglishDictionary());
        return list;
    }
}
