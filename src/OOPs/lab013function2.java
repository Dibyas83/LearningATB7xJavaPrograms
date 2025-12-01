package OOPs;

public class lab013function2 {
    public int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum; // The 'return' keyword sends a value back
    }

    // This method takes two numbers and prints their sum without returning a value
    public void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
    // To use the method, you need to create an object of the class first

    public static void main(String[] args) {
        lab013function2 myObj = new lab013function2(); // Create an object of the class

        int result = myObj.addNumbers(10, 5); // Call the method and store the result
        System.out.println("Result from addNumbers: " + result); // Output: Result from addNumbers: 15

        myObj.printSum(20, 7); // Call the method to print the sum directly
        // Output: The sum is: 27
    }
}

