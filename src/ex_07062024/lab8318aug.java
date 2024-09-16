package ex_07062024;

public class lab8318aug {
    public static void main(String[] args)throws Exception {
        bank SBI=new bank( "INR",100);
//        bank ICICI =new bank( "INR",10);
//        Integer total=SBI.add(ICICI);
//        System.out.println(total);
        bank jpmorgan=new bank("INR",111);
        Integer totalnew =SBI.add(jpmorgan);
        System.out.println(totalnew);
    }
}
