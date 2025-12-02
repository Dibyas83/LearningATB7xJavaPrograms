package Core_Java;

public class lab004data_type {
    public static void main(String[] args) {
        byte age = 122;
        float pi = 3.14f;
        double pi_d = 3.148765857;
        char grade = 'a';
        char _123 ='n';
        char grade_kusum='b';
        String s3= "amit";
        int y =8; // decimal no sys, 8 is val or literal
        int age1 =98;
        int b = 0b010110; // binary
        // %s=sring
        // %c=char
        // %f=float
        System.out.println(age);
        System.out.println("your age is ->%d" + age1);
        System.out.println(pi);
        System.out.println(pi_d);
        System.out.println(grade);
        System.out.println(grade);
        System.out.println(_123);
        System.out.println(age1+age);
        System.out.println(age1+s3+age+y+s3+age1+y); //there string in between so int sum not possible
        System.out.println(age1+y);
    }
}
