package ex_07062024;

public class lab011 {
    public static void main(String[] args) {
        String name="pramod";//in SCP
        name="dutta";
        String nam ="amit";
        String nam2=name.concat(nam);//new string or memory
        String name2=new String("pramod");//stored in heap
        String name3=new String("pramod");//stored in heap
        char c=nam.charAt(3);
        nam=nam.concat("kumar");
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(nam2);
        System.out.println(name2==name3);//different string
        System.out.println(name2.equals(name3));//content equals
        System.out.println(nam);
        System.out.println(c);
    }
}
