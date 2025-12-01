package Core_Java;

public class Lab001basic {
    public static void main(String[] args) {
        System.out.println("Hello world pramod");
        float rad1 = 0.00000000000005678f;
        double rad2 = 0.00000000000005678;
        System.out.println(rad1);
        System.out.println(rad2);
        char string = 'u';
        char num_string = '5';
        char num = 5;
        System.out.println(string);
        System.out.println(num_string);
        System.out.println(num);
        // Group Declarations
        int age, height;
        char letter, alpha;
        double radium, area;

        int age1 = 10, height1 = 5;
        double radius = 2.34, area1 = 4.55;

        String name = new String("Aman");
        int[] marks2 = new int[3];
        marks2[0] = 97;
        marks2[1] = 97;
        marks2[2] = 97;
        // ! , &&, ||, ^ = not, and, or, xor

        //Concatenation
        String name1 = new String("Aman");
        String description = new String("is a good boy.");

        String sentence=name1 + " " + description;
        System.out.println(sentence);
        System.out.println(name1.charAt(2));
        System.out.println(sentence.charAt(5)); // nothing
        System.out.println(sentence.charAt(7));



        // single comment
        //explanation
        /** multiple comment
         * documentation purpose
         */
    }
}
