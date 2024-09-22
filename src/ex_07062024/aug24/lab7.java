package ex_07062024.aug24;

import java.util.HashMap;
import java.util.Map;

public class lab7 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();//key-string,value-int
        map.put("id",6);
        map.put("roll no",670);
        map.put("id2",64);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue("6"));
        System.out.println(map.keySet());
        System.out.println(map.get("id2"));
        System.out.println("......................");
        //iterater doesnot spport
        for (Map.Entry<String,Integer> item:map.entrySet()){//entry set pick keys and gets value
            System.out.println(item.getKey() + "->" + item.getValue());
        }
    }
}
