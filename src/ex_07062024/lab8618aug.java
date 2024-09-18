package ex_07062024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class lab8618aug {
    public static void main(String[] args) {


       // int[] a=new int[4];
       //a[0]=1;
       //a[1]=2;
       //a[2]=3;
       //a[3]=4;
      //for (int i=0;i<a.length;i++){
         //   if (a[i]==4){
           //     System.out.println("found 4");
            //}
        //}
        List arr=new ArrayList();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        arr.add(4);
        Collections.sort(arr);//collections is a class
        System.out.println(arr.contains(3));
        System.out.println(arr);

        List shoppping_list=List.of("milk","bread","butter","cheese");
        shoppping_list.add("banana");
        System.out.println(shoppping_list);
        System.out.println(shoppping_list.size());
        //shoppping_list.add("banana");

        //Iterating over elements
        Iterator<String> its= ArrayList.iterator();
        while (its.hasNext()){
            System.out.println(its.next());
        }


    }
}
