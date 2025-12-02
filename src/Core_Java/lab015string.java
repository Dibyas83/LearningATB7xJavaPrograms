package Core_Java;

public class lab015string {
    public static void main(String[] args) {

        int q = 3;
        int q2 = 32;
        String sd = "asd"; //immumatable. creates a string literal, which is stored in a special memory area called
        // the String Constant Pool (SCP)
        sd="rty";
        String sd2 = new String("asd");//creates a String object using the new keyword, which is
        // stored in the general heap memory (outside the SCP)
        System.out.println(sd+sd2+q+q2);
        System.out.println(sd+sd2+(q+q2));

        char c = sd.charAt(0);
        String c2 = sd2.concat(sd);
        System.out.println(c2);
        System.out.println(c2.indexOf('r'));
        System.out.println(c2.length());


    }
}
