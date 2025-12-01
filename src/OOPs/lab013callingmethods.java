package OOPs;

public class lab013callingmethods {
    // User-Defined Method
    void hello() {
        System.out.println("This is a user-defined method.");

    }
    static void hello2() {    //Calling a Static Method
        System.out.println("Hello all");
    }

    public static void main(String[] args) {
        lab013callingmethods obj = new lab013callingmethods(); // Create object
        obj.hello();             // Call method

         //  Calling the Predefined Methods
         //Java provides many built-in methods via the Java Standard Library, like hashCode().

        lab013callingmethods obj2 = new lab013callingmethods();
        System.out.println(obj2.hashCode()); // Predefined method

        //Calling a Static Method
        //Static methods belong to the class, not the object. They can be called without creating an object.

        lab013callingmethods.hello2(); // Call static method directly
    }


}




//1. Predefined Method
//Predefined methods are the method that is already defined in the Java class libraries. It is
// also known as the standard library method or built-in method. For example, random() method
// which is present in the Math class and we can call it using the ClassName.methodName() as
// shown in the below example.
//
//Example:
//
//
//Math.random()    // returns random value
//Math.PI     // return pi value


// 2. User-defined Method
//The method written by the user or programmer is known as a user-defined method. These methods are
// modified according to the requirement.

//Example:

//sayHello         user define method created above in the article
//Greet()
//setName()
//-------------------------------------------------------------------

/*Different Ways to Create Java Method
There are two ways to create a method in Java:

1. Instance Method: Access the instance data using the object name. Declared inside a class.

Example:

// Instance Method
void method_name() {
    // instance method body
}
2. Static Method: Access the static data using class name. Declared inside class with static keyword.

Example:
// Static Method
static void method_name() {
    // static method body
}
}*/




