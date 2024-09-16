package ex_07062024;

public class lab036 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        final int[] ages=new int[4];//array of 4 elements all default 0 mis created with fixed length fixes arrays length not elements
        final float pi=3.14f;
        System.out.println(pi);
        //max length depends on var type 4 byte =32 -1=32, 2^31
        int age[]=new int[4];
        age[2]=42;
        System.out.println(age[2]);

        ages[2]=44;
        System.out.println(ages[2]);
        //functions stored in stack
    }
}
