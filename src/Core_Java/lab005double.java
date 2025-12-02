package Core_Java;

public class lab005double {
    public static void main(String[] args) {
        //calc
        double a = 10;
        double b = 34;
        double sum = a+b;
        double sub = a-b;
        double mul = a*b;
        double div = a/b; // double is used for precision
        String username = "John";
        double messageCount = 5;

        System.out.printf("Sum is %f\n",sum); //Prints a formatted string, using special placeholders (like %s for a string or %d for an integer) to substitute values from other arguments.
        // Best for: Formatting output, aligning text, and inserting multiple variables into a single string.
        System.out.printf("Hello, %s! You have %f messages.%n", username, messageCount);


        //System.out.printf("Sub is %d\n",sub);
        System.out.printf("Sub is %f\n",sub); // f for float and double
        System.out.printf("mul is %f\n",mul);
        System.out.printf("div is %f\n",div);
        System.out.println(div);
    }
}
