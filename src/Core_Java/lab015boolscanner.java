package Core_Java;

import java.util.Scanner;//lab084,85,86
public class lab015boolscanner {
    public static void main(String[] args) {
        boolean are_you_married = true;
        boolean are_you_jobless = true;
        System.out.println(are_you_married);


        boolean b=!true;
        if(b) {
            System.out.println("b is true");
        }else{
            System.out.println("b is false");
        }
        boolean a=true;
        a=!a;
        if(2+2>=4) {
            System.out.println("code be executed");
        }else {
            System.out.println("code not be executed");
        }
        int num=11;
        if (num % 2 == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        Scanner sc=new Scanner(System.in); //object of the scanner Class
        System.out.println("Enter the no");
        int user_input = sc.nextInt();
        System.out.println(user_input);

        if(user_input%2==0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}

