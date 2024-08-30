package ex_07062024;
// lab 100

public class lab022 {
    public static void main(String[] args) {
        char code ='A';
        int val =switch (code) {
            case 'A':
                yield 65;
            default:
                throw new IllegalStateException("fgdfgg");

        };
        System.out.println(val);

    }
}
