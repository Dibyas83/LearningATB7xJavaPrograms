package ex_07062024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class lab8718aug {
    public static void main(String[] args) {
        List<Integer> marks=new ArrayList();//will only take integers
        marks.add(100);
        marks.add(99);
        marks.add(90);
        //marks.add("pramod");
        System.out.println(marks);

        Vector v=new Vector();//it is thread safe,synchronized-it will be time taking
        v.add("pramod");//one by one operation
        v.add("pp");//stored like array
        v.add("mm");
        System.out.println(v);
        //framework is a set of classes and interfaces which provide ready made architecture





    }
}
