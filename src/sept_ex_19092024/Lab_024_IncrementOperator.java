package sept_ex_19092024;

public class Lab_024_IncrementOperator {
    public static void main(String[] args) {

        //Post & pre increment
        //post increment : print first then increment
        //Pre increment : first increment then print
        byte a = 10;
        System.out.println(a++);
        System.out.println(a);

        byte b = 20;
        System.out.println(++b);
        System.out.println(b);
    }
}
