package ex_07062024;

public class lab032 {
    public static void main(String[] args) {

        for(int i=0;i<5;i++) {
            greet();//calling of function
            greet2();
            System.out.println("...................");
            function_type3("Amit");
            System.out.println("...................");
            int sum_result =function_type4(4,5);
            System.out.println(sum_result);

        }
        //String dos = greet(); //dos won't give result greet is unassignable
        String dos2=function_type2();//will give result
        System.out.println(dos2);

    }
        //without parameter and return type
        static void greet(){// no return
            System.out.println("hi,how are you?");

        }//without parameter and return type
        static void greet2(){
            System.out.println("khana khaya kya");
        }//without para with return type
        static String function_type2(){
        return "pramod";
        }
        // with parameters(Sting name)we can call this func_type 3,not assign like using in def and  without return types
         static void function_type3(String name){
             System.out.println("with para no return");
             System.out.println("You have shared ->" + name);
         }
         //with parameters and with return type
         static int function_type4(int a,int b){
         return  a+b;
         }
    }

