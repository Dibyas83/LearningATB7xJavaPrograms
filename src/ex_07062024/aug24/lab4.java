package ex_07062024.aug24;

import java.util.*;

public class lab4 {
    public static void main(String[] args) {
        //set no duplicates
        //map is key/value pairs
        Set hd=new HashSet();
        hd.add("apple");//implimentation ,stored no order random,asfgdhf is stored as asf
        hd.add("orange");//implimentation ,stored no order random,asfgdhf is stored as asf
        hd.add("melon");//implimentation ,stored no order random,asfgdhf is stored as asf
        hd.add("mang");
        System.out.println(hd);
        System.out.println("...................");

        Set lhs=new LinkedHashSet();
        lhs.add("grape");//order maintained
        lhs.add("chicko");//order maintained
        lhs.add("peer");//order maintained
        lhs.add("green");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("peer"));
        System.out.println(lhs.size());

        System.out.println("................");



        Set ts=new TreeSet();
        ts.add("cane");//auto sort using black and red tree,based on first letter
        ts.add("coco");//auto sort using black and red tree,based on first letter
        ts.add("papita");//auto sort using black and red tree,based on first letter
        //ts.add(null);
        System.out.println(ts);
        //sorting with null not allowed
        for (Object s:ts){//normal loop not allowed
            System.out.println(s);

        }
        System.out.println("..............");
        Iterator it=ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
