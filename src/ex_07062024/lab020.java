package ex_07062024;

import java.util.Scanner;

public class lab020 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name");
        String brosername=sc.next();

        switch (brosername) {
            case "chrome":
                System.out.println("Start chrome");
                break;
            case "firefox":
                System.out.println("start firefox");
                break;
            case "edge":
                System.out.println("start edge");
                break;
            default:
                System.out.println("no idea");
                break;
        }
    }
}
