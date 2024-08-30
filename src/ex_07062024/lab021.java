package ex_07062024;

import java.util.Scanner;

public class lab021 {
    public static void main(String[] args) {
        //vowel

        Scanner sc=new Scanner(System.in);
        System.out.println("vowel or not");
        char user_input=sc.next().charAt(0);

        switch (user_input) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("it is consonant");

        }
        int itemcode= 004;
        switch (itemcode) {
            case 001, 002, 003:
                System.out.println("it is electronics item");
                break;
            case 004, 005, 007:
                System.out.println("it is mechanical");
                break;
            default:
                System.out.println("none");
        }
        int item= 001;

        switch (item){
            case 001 -> System.out.println("it is laptop");
            case 002 -> System.out.println("it is desktop");
            case 003 -> System.out.println("it is mobile");
            default -> System.out.println("hello");


        }

    }
}
