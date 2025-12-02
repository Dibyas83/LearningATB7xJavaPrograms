package Core_Java;

import java.awt.*;
import java.util.Scanner;

public class lab016elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1= sc.nextInt();

        String ui = sc.next();
        System.out.println();

        System.out.println("enter the num2");
        int num2= sc.nextInt();

        if(num1>num2){
            System.out.println(num1);
        }else if(num2>num1) {
            System.out.println(num2);
        }else {
            System.out.println(ui);
        }


    }
}
