package OOPs;

public class lab012calling_abstract extends lab013abstract {
    @Override
    void check(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        lab012calling_abstract obj = new lab012calling_abstract(); // Subclass object
        obj.check("GeeksforGeeks");
    }
}







