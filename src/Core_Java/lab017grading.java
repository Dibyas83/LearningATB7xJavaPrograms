package Core_Java;

import java.util.Scanner;

public class lab017grading {
    public static void main(String[] args) {
        // grade calculator
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your score");
        int score= sc.nextInt();

           char grade='j';
        if (score>=90 && score<100){
           grade='a';
        } else if (score>=80 && score<=89) {
            grade='b';
        } else if (score>=60 && score<=79) {
            grade='c';
        } else if (score>=40 && score<=59) {
            grade = 'd';
        } else if (score>0 && score<=39) {
            grade='f';
        } else if(score<0 || score>100) {

            System.out.println("god like");

        }
        System.out.println("your grade is->"+grade);
        sc.close();



    }
}
