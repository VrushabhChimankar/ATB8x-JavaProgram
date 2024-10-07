package oct_ex_08102024_Overloading;

public class MainFunctions {

    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        int result = m.add(5,10);
        System.out.println(result);

       String name = m.add("Vrushabh","Chimankar");
        System.out.println(name);

        double addALl = m.add(13.3,23.3,32);
        System.out.println(addALl);
    }
}
