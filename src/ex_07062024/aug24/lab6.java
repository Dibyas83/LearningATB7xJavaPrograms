package ex_07062024.aug24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class lab6 {
    public static void main(String[] args) {
        //map key/value pairs
        //unique keys,one null
        Map m1=new HashMap();
        m1.put("name","pramod");
        m1.put("rollno",132);
        m1.put("phno",13298797);
        System.out.println(m1);

        Map mt1=new TreeMap();
        mt1.put("name","pramod");
        mt1.put("rollino",132);
        mt1.put("phnuo",13298797);
        System.out.println(mt1);

        Map ml1=new LinkedHashMap();
        ml1.put("nalme","pramod");
        ml1.put("rollnio",132);
        ml1.put("pkhno",13298797);
        System.out.println(ml1);



    }
}
