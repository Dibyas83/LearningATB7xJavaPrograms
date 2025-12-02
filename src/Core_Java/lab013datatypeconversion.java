package Core_Java;

public class lab013datatypeconversion {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
        int c = a + b; // byte + byte may be bigger container than byte
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B'; // char are also integers
        int c1 = a1 + b1; // AB ->char

        //String s1 = a1 + b1;
        String s1 = String.valueOf(a1 + b1); // AB ->char
        // AB ->char
        System.out.println(c1); //(65+66)
        System.out.println(s1); //(65+66)
        System.out.println('A' == 65);
        System.out.println('B' == 69);

        short v1 = 10;
        char v2 = 'A';
        //char h1 = v1 + v2;
        int h1 = v1 + v2; //asci value used
        System.out.println(h1);
        byte w = 10;
        int ur = w; //implicit casting
        int ur1 = (int)w; //explicit casting

        //narrrowing
        int y1 = 300;  //32bit 00000000000000000000000100101100=300
        //byte t1 = y1; invalid  implicit casting
        byte e21 = (byte)y1;//8 bit 00101100= 44

        long y11 = 9876543210l;  //32bit
        //byte t1 = y1; invalid  implicit casting
        short e211 = (short)y11;//16 bit
        System.out.println(e211);

        //byte	1	8
        //short	2	16
        //int	4	32
        //long	8	64
        //float	4	32
        //double8	64
        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST; // Implicti Narrowing - JVM
        int total_price = course+(int)GST; // Explit narrowing - REAL time - money loss
        System.out.println(total_price);

        float total_price2 = course+GST;
        System.out.println(total_price2);





    }

}
