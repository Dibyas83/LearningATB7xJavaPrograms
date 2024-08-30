package ex_07062024;

import java.util.Scanner;

public class lab023 {
    public static void main(String[] args) {
        //write a program name,age,salary-print it
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name");
        String name =sc.next();

        System.out.println("enter your age");
        int age=sc.nextInt();

        System.out.println("enter your salary");
        double salary = sc.nextDouble();

        System.out.println("your details are" +name);
        System.out.println("age is"+ age);
        System.out.println("salary is" + salary);

        sc.close();

    }



}