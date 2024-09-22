package ex_07062024.aug24;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class lab8 {
    public static void main(String[] args) {
        Hashtable<String,Integer> ht1= new Hashtable<>();
        //map,no null,synchronused,legacy
        ht1.put("j",8);
        ht1.put("u",87);
        ht1.put("o",80);

        Enumeration<String> e=ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(ht1.get(e.nextElement()));

        }
    }
}
