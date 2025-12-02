package Core_Java;

public class lab010increments {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // a=a+1
        System.out.println(a);
        System.out.println(b);

        int d = a++; //a= 11 then a=a+1
        System.out.println(a);
        System.out.printf("d%d%n",d);
        // exp=11,a=11
        int c=12;
        int a_post=15;
        System.out.println(a);

        System.out.println(c++);
        System.out.println(c);//13
        System.out.println(c++ + c); //13+14
        System.out.println(++c);
        System.out.println(a_post++);
        System.out.println(a_post);


        int m = 10;
        m += 3; // a=a+3
        System.out.println(m);

        m -= 3; // a=a+3
        System.out.println(m);
        String ii="-----------------------";
        System.out.println(ii);
        //--a,a--
        int yu = 11;
        System.out.println(++yu);
        System.out.println(++yu);
        System.out.println(++yu + yu++ + yu++ + yu); //14 14 15 16=59
        System.out.println(++yu + yu++ + yu++ + yu); //17 17 18 19=71
        System.out.println(++yu + yu++ + yu++ + yu);



    }
}
