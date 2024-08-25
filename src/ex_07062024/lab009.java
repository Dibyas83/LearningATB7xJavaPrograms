package ex_07062024;

public class lab009 {
    public static void main(String[] args) {
        int val =300;
        long ph_no=9844223433L;
        float pi=3.14F;
        float x=val+pi;
        byte m=10;
        byte bi = (byte)val;
        // invalid explicit casting narrowingw
        // type casting 44 will comeout
        int n = (int)m;
        System.out.println(x);
        System.out.println(bi);
        System.out.println(n);
        // src and dst conv
    }
}
