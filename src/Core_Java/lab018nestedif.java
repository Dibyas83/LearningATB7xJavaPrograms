package Core_Java;

public class lab018nestedif {
    public static void main(String[] args) {
        if (false){
            System.out.println("1");
            if (true){
                System.out.println("2");
                if (true){
                    System.out.println("3");
                }
            }

        }
        if (false) {
            System.out.println("12");
        }if (true) {
            System.out.println("22");
        }if (true){
            System.out.println("32");
        }


        if (true){
            System.out.println("11");
            if (true){
                System.out.println("22");
                if (true){
                    System.out.println("33");
                }
            }
        }
    }

}

