package Core_Java;

public class printf_ {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        double salary = 55000.75;
        System.out.printf("%d * 2 + 1 mid old%n", age); // %d is only a format specifier or value replacer
        System.out.printf("yes %d mid old%n", age);

        // Basic usage
        System.out.printf("Name: %s, Age: %d%n", name, age);

        // Formatting a floating-point number to two decimal places
        System.out.printf("Salary: %.2f%n", salary);
        System.out.printf("Value: %d%n", 6);
        System.out.printf("Another value: %d%n", 10);

        // Specifying field width and alignment
        System.out.printf("%-10s %5d%n", "Item", 123); // Left-aligned string, right-aligned integer
    }
}
/*
* Format specifiers begin with a percent sign (%) and indicate the type of data to be inserted and its desired formatting. Common specifiers include:
%s: String
%d: Decimal (integer)
%f: Floating-point number
%c: Character
%b: Boolean
%o: Octal number
%x: Hexadecimal number
%%: Literal percent sign
* */