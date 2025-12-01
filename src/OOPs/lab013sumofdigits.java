package OOPs;

public class lab013sumofdigits {
    public static void main(String[] args) {
        int input = 3453;
        int sum= 0;
        while(input > 0){
            sum = sum + input%10;
            input = input/10;
        }
        System.out.println(sum);

    }
}


