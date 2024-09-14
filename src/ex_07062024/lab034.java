package ex_07062024;

import java.util.Scanner;

public class lab034 {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=55;
        marks[1]=80;
        marks[2]=91;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        System.out.println("Enter marks");
        System.out.println("Enter marks");

        marks[0] = sc.nextInt();
        System.out.println("Enter marks");
        marks[1]=sc.nextInt();
        System.out.println("Enter marks");
        marks[2]=sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}
