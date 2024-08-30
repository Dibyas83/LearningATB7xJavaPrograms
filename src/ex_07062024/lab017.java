package ex_07062024;

import java.util.Scanner;

public class lab017 {
    public static void main(String[] args) {
        // grade calculator
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your score");
        int score= sc.nextInt();

           char grade='j';
        if (score>=90 && score<=100){
           grade='a';
        } else if (score>=80 && score<=89) {
            grade='b';
        } else if (score>=60 && score<=79) {
            grade='c';
        } else if (score>=40 && score<=59) {
            grade = 'd';
        } else if (score>=0 && score<=39) {
            grade='f';
        } else {

            System.out.println("god");

        }
        System.out.println("your grade is->"+grade);
        sc.close();



    }
}
