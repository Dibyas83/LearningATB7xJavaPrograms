package ex_07062024;

import java.util.Scanner;

public class lab025 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no1");
        int no1= sc.nextInt();
        System.out.println("enter no2");
        int no2= sc.nextInt();
        System.out.println("enter no3");
        int no3= sc.nextInt();

        if (no1>no2 && no1>no3){
            System.out.println("no1 is max");
        } else if (no2>no1 && no2>no3) {
            System.out.println("no2");
        }else {
            System.out.println("no3");

        }

        char ch='a';
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println("v");
        }else {
            System.out.println("c");

        }


    }
}
