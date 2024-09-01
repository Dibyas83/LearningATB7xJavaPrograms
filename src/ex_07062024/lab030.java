package ex_07062024;

import java.util.Scanner;

public class lab030 {
    public static void main(String[] args) {
        //fizzbuzz program
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit");
        int n=sc.nextInt();

        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0) {
                System.out.println("Fizzbuzz");
            };
            if(i%3==0){//else if
                System.out.println("fizz");
            }
            if(i%5==0){
                System.out.println("buzz");
            }
        }
    }

}
