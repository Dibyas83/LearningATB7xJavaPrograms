package ex_07062024;

import java.util.Scanner;



public class lab028 {
    public static void main(String[] args) {
        // factorial program
        Scanner sc=new Scanner(System.in);
        System.out.println("factorial no");
        int n=sc.nextInt();

        int fact=1;
        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
