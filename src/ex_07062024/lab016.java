package ex_07062024;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class lab016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1= sc.nextInt();

        System.out.println("enter the num2");
        int num2= sc.nextInt();

        if(num1>num2){
            System.out.println(num1);
        }else if(num2>num1) {
            System.out.println(num2);
        }else {
            System.out.println("equal");
        }


    }
}
