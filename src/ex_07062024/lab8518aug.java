package ex_07062024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class lab8518aug {
    public static void main(String[] args) {
        //collection(Interface)-list,set,queue,map(interfaces)
        //list-arraylist,linkedlist,stack,vector
       // List mylist = new ArrayList();//Dynamic dispatch
        ArrayList mylist2 = new ArrayList();//stored continuosly ,no size
        //Collection mylist3 = new ArrayList();
        mylist2.add("pramod");
        mylist2.add("pram");
        mylist2.add("proo");
        mylist2.add("pr");
        mylist2.add(123);
        mylist2.add(true);
        mylist2.add("pram");
        mylist2.remove("pramod");
        System.out.println(mylist2);
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("pram"));
        System.out.println(mylist2.contains("amit"));//boolean
        System.out.println(mylist2.get(2));
        String s1 = (String) mylist2.get(1);
        System.out.println(s1);
        //mylist2.clear();
        //System.out.println(mylist2);
        //System.out.println(mylist2.isEmpty());

        System.out.println("..........");
        for (int i = 0; i < mylist2.size(); i++) {
            System.out.println(mylist2.get(i));

        }

        System.out.println("........");
        //enhanced for loop
        for (Object o: mylist2){
            System.out.println(o);
        }




    }
}
