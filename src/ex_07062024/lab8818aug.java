package ex_07062024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab8818aug {
    public static void main(String[] args) {
        List<String> mm =new ArrayList<>();//will only take integers
        mm.add("hh");
        mm.add("yy");
        mm.add("tt");
        mm.add("pramod");

        System.out.println("add string:");
        for (int i = 0; i < mm.size(); i++) {
            System.out.println(mm.get(i));
        }
        for (String str : mm){
            System.out.println(str);
        }
        System.out.println("..............");

        Iterator<String> its=mm.iterator();
        while (its.hasNext()){
            System.out.println(its.next());
        }


    }
}
