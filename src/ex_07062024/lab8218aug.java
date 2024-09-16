package ex_07062024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab8218aug {
    public static void main(String[] args)throws FileNotFoundException {
        extracted();
        //throws ataches itself to the method signature rather than the vulnerable code
    }

    private static void extracted() throws FileNotFoundException ,NullPointerException,ArithmeticException{
        String path="C://a.txt";
        File file=new File(path);//if child say eeror parent must have
        FileReader filereader = new FileReader(file);
        int a=10/0;// arith error unchecked
    }//THROWS WORK WITH FULL METHOD
    //throws is followed by class
    //we can declare multiple exceptions ex- IOException,SQL Exception
    //if we dont know exception call the parent ,the bigger one i.e 'throws exception'
    //try catch protects peice of code ,throws full function protection
}
