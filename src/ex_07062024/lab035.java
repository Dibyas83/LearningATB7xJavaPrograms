package ex_07062024;

import java.util.Scanner;

public class lab035 {
    public static void main(String[] args) {
        int[] marks={3,8,6};
        System.out.println(marks.length);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        marks[0] = sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for (int i=0;i<marks.length;i++) {
            System.out.println(i);//prints serial
            System.out.println(i +" -> "+ marks[i]);
        }

    }
}
