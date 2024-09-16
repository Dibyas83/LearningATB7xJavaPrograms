package ex_07062024;

import java.util.Scanner;

public class lab037 {
    public static void main(String[] args) {
        //wheree we take the user input of the 5 subjects avg of sub
        //input=float,scanner class

        Scanner sc=new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the marks of the subject 1");
        marks[0]=sc.nextFloat();
        System.out.println("Enter the marks of the subject 1");
        marks[1]=sc.nextFloat();
        System.out.println("Enter the marks of the subject 1");
        marks[2]=sc.nextFloat();
        float avg=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("Avg is ->"+avg);
    }
}
