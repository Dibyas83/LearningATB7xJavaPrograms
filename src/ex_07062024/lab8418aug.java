package ex_07062024;

import java.util.Scanner;

public class lab8418aug {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        if (name.equalsIgnoreCase("pramod")){
            try {
                throw new Exception("not allowed");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("allowed");
        }
        Scanner bc =new Scanner(System.in);
        System.out.println("Enter your no");
        int x =bc.nextInt();
        if (x==0){
            try {
                throw new ArithmeticException("Enter non zero no");
            } catch (ArithmeticException e) {
                throw new RuntimeException(e);
            }
            //instead of jvm showing error i have made a error showing system
        }
        int a=10/x;
        System.out.println(a);

    }
}
