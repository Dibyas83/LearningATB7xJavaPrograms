package Core_Java;

public class lab008boolandfinal {
    public static void main(String[] args) {
        final double pie = 3.14; // val cant be changed inside this func
        int a= +10;
        int lambo = +10;
        //lambo-operand, val=unary plus, = operator
        double no = 55;
        double no2 = 15;
        double remainder = no%no2;
        float fo = 126.8763e2F;// in ML
        String nul = null;
        System.out.println(remainder);
        a+=10;//a=a+10
        a-=10;//a=a-10
        a/=10;//a=a/10
        System.out.println(a);
        a*=10;//a=a*10
        System.out.println(a);
        int d=21;
        int e=22;
        int sum=d+e;//operand d,e,operator=,
        boolean f=(10>=10);//or gate
        boolean h=true;
        System.out.println(!h);
        System.out.println(!(10>20));
        System.out.println(!!!!(30>60));
        System.out.println(10==10);
        System.out.println(10>=10);
        System.out.println(10<=10);
        System.out.println(10>10);
        System.out.println(10<10);
        System.out.println(f);
        System.out.println(pie);
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        int i = 5;  // Binary: 0101
        int o = 3;  // Binary: 0011
        //int z = i||o;//cannot be applied to int
        int z = i|o;
        int g = i&o;

        i |= o; // Equivalent to a = a | b;
        i &= o; // Equivalent to a = a & b;
        /*
        *        0101 (a)
   |             0011 (b)
   --            -----
                 0111 (result)
                 *
                 * int a = 10; // Binary: 1010
                   int b = 6;  // Binary: 0110

                   a &= b;     // Equivalent to a = a & b
            //   1010 (a)
            // & 0110 (b)
            // ------
            //   0010 (result is 2 in decimal)

                  0101 (5)
                ^ 0011 (3)
                  -------
                  0110 (6)
                  * a ^= b, the value of a becomes 6.
        * */
        System.out.println(i);
        System.out.println(g);
        System.out.println(z);
        //variable <<= number_of_positions;
        //variable = variable << number_of_positions;
        int r = 5; // Binary: 00000101
        r <<= 2;   // This is equivalent to a = a << 2;
        // 5 << 2 results in 20 (Binary: 00010100)
        // So, 'a' now holds the value 20.
        System.out.println(r);



        // ternary operator ?:
        // assignment operator /= %= & +  ^=  |= <<=  >>=
    }   //a/=b, a=a/b
        //a%=b, a=a%b
        //a^=b, a=a^b
        //a|=b, a=a|b or
}
