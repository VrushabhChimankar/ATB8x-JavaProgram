package CollectionFramework2;

import java.util.Stack;

public class Lab_Stack {

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push("Java");
        s.push("Python");
        s.push("C#");

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s.peek());


    }
}
