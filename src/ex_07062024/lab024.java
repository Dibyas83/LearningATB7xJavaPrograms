package ex_07062024;

import java.util.Scanner;

public class lab024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int no = sc.nextInt();

        if (no > 0) {
            System.out.println("positive");
        } else if (no < 0) {
            System.out.println("negetive");
        } else {
            System.out.println("zero");
        }
    }
}

