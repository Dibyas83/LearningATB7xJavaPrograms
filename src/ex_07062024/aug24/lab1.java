package ex_07062024.aug24;

import java.util.ArrayList;
import java.util.LinkedList;

public class lab1 {
    public static void main(String[] args) {
        //arraylist elements changes places in memory if new element comes in middle or deleted
        //linked list stores the next and previous references consumes more memory ?(doubly linked),not shifting so easy for manipulation (insert,delete) slow in accessing the elements

        //allow duplicates,variable size(load factor)and type in linklst
        //vector array list with thread safety
        LinkedList er=new LinkedList();
        er.add("node 1");
        er.add("node 2");
        er.add("node 2");
        er.add("node 4");
        System.out.println(er);

        ArrayList err=new ArrayList();
        err.add("node 1");
        err.add("node 2");
        err.add("node 2");
        err.add("node 4");
        System.out.println(err);

    }
}
