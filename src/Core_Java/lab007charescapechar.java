package Core_Java;

public class lab007charescapechar {
    public static void main(String[] args) throws InterruptedException {
        char c = '\n';
        char c1 = '\t';
        char c2 ='\b'; //backlash, deletes 1 char
        char c3 ='\r'; //backlash, deletes 1 word
        /*
        \': Represents a single quote character.
\": Represents a double quote character.
\\: Represents a backslash character itself.
\n: Represents a new line (line feed).
\r: Represents a carriage return.
\t: Represents a tab.
\b: Represents a backspace.
\f: Represents a form feed
        * Cursor repositioning: \r moves the cursor to the very beginning of the current line.
            Overwriting text: Any characters printed after \r will replace the characters starting from the beginning of the line.
            Dynamic output: It is commonly used to update information on the same line, such as a loading bar or a frame rate counter.
        * */
        System.out.print("Loading.........");
        Thread.sleep(1000);
        System.out.print("\rDone!          ");
        System.out.println("Done!" + "pram" + "k" + "dutta" + c3);
        System.out.println("Done!" + "pram" + c3 + "k" + '\t' + "dutta" ); // deletes all to right

        // Printing a string with double quotes inside
        System.out.println("He said, \"Hello, world!\"");

        // Printing a backslash
        System.out.println("This is a backslash: \\");

        // Using new line and tab
        System.out.println("Line 1\n\tLine 2 with a tab.");

        // Using a single quote
        System.out.println("It's a beautiful day.");

        char f ='y';
        char g ='e';
        char h ='s';
        char i ='i';
        char j ='r';
        char c11 ='$';
        System.out.println(c11);

        System.out.println(c);
        char c4 ='\u1F6A';
        System.out.println(c4);
        long ph_no =9779887897l;
        boolean is_married= true;
        char _123='N';
        double a=5;
        double Byte=2;
        double result =a%Byte; //modulus operator gives remainder

        System.out.println(ph_no);
        System.out.println(is_married);
        System.out.println(Byte);
        System.out.println(_123);
        System.out.println(a);
        System.out.println(result);
        System.out.println( f +g +h+c1+i+j+c2);
        System.out.println( f );
        System.out.println( f + c1);
        System.out.println( f + g );
    }
}
