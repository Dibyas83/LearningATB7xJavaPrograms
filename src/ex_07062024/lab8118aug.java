package ex_07062024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab8118aug {
    public static void main(String[] args){
        String path="C://a.txt";
        File file=new File(path);
        try {
            FileReader filereader = new FileReader(file);
        }catch (FileNotFoundException e){
            System.out.println("FNE");

        }catch (Exception e){
            System.out.println("E");
        }
    }

}
