package ex_07062024;

public class lab8018aug {
    public static void main(String[] args) {
        extracted();
    }// exception passing ,error passing, jvm wont terminate main program
    private static void extracted() {
        extracted1();
    }//exception passed from child to parent until main func found

    private static void extracted1() {
        try {
            Integer[] i=new Integer[2];
            System.out.println(i[2]);//unchecked - array index out of bound
        } catch (Exception e) {
            System.out.println("ArrayIndexouttobound");
        }finally {
            //can write file .close,sc.close,sqlconnection.close
            System.out.println("end of program");
        }
    }
}
