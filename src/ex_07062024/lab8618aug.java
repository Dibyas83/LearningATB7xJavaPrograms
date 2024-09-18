package ex_07062024;

import java.util.*;

public class lab8618aug {
    public static void main(String[] args) {
        List arr = new ArrayList();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        arr.add(4);
        Collections.sort(arr);//collections is a class
        Collections.sort(arr, Comparator.reverseOrder());
        System.out.println(arr.contains(3));
        System.out.println(arr);

        List shoppping = List.of("milk", "bread", "butter", "cheese");
        //shoppping.add("banana");
        System.out.println(shoppping);
        System.out.println(shoppping.size());
    }


}










