package sept_ex_16092024;

public class Lab_022_QNA {
    public static void main(String[] args) {

        byte a = 20;
       // boolean b = !(a > 30 || a < 20); //true
       // boolean b = !(a > 20 || a < 10);   //true
        boolean b = !(a > 10 || a < 5);
        System.out.println(b);
    }
}
