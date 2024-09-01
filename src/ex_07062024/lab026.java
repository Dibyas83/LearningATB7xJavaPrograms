package ex_07062024;
//lab107
public class lab026 {
    public static void main(String[] args) {
        //for (start,condition for termination,inc or dec)

        for(int i=1;i<=10;++i){
            System.out.println("hi"+i);
        }
        for (int i=10;i>0;i--){
            System.out.println(i);
        }
        //float byte int,short,long allowed
        for(byte i=0;i<10.67;i++){
            System.out.println(i);
        }
        for (char c='a';c<='z';c++){
            System.out.println(c);

        }
        int i=10;
        for (;i>0;i--) {
            if (i == 5) {
                System.out.println("pramod");//if true condition
            } else {
                System.out.println("end");// if false condition
            }
            if(i==2){
                break;
            }
        }
        for (i=60;i>0;i=i-3) {
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println("even ->"  +i);
                continue;
            }
            System.out.println("odd ->" +i);

        }
            }
        }



