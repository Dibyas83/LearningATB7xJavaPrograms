package ex_07062024.aug24;

import java.util.Stack;

public class lab2 {
    public static void main(String[] args) {
        //vector,Stack-legacy class
        Stack s=new Stack();
        s.add("pp");
        s.add("ppl");
        s.add("pj");
        s.add("pk");
        s.push("ph");
        s.push("pf");


        System.out.println(s);//it is LIFO,removes pk first
        //it peek(looking or searching)_pop(remove),push(insert),search as added function +vectoor functions
        //it is heterogenous
        System.out.println(s.peek());//last one
        System.out.println(s.pop());//used in library,cannot remove from middle

    }
}
