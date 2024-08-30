package ex_07062024;

import java.util.Scanner;

public class lab019 {
    public static void main(String[] args) {
        //switch for multiple condition  no boolean,cases/values,variables,break
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7,Tell what day it is");
        int day=sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("no idea");
                break;

        }
        System.out.println(".......outside the switch loop......");
    }
}
