package Core_Java;

public class lab009byte {
    public static void main(String[] args) {
        int val =300;
        long ph_no=9844223433L;
        float pi=3.14F;
        float x=val+pi;
        byte m=10;
        byte k = 127; // -127 to 127
        // k=k+1

        byte bi = (byte)val; // 300 is outside the byte range,byte type can only represent a range of 256.300%256 with a remainder of \(44\)
        //It is the smallest integer data type and is useful for saving memory in large arrays or for handling raw binary data like streams from files or the network. You can declare a byte variable using the keyword byte
        // invalid explicit casting narrowingw
        // type casting 44 will comeout
        int n = (int)m;
        System.out.println(x);
        System.out.println(bi);
        System.out.println(n);
        // src and dst conv
    }
}
