package Oct_ex_WrapperClass;

public class Exception {
    public static void main(String[] args) {

        //Arithmetic Exception
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("End the arithmetic exception");

        //NullPointerException

        try {
            String s = null;
            s.trim();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("Ent the null exception");

        //ArrayIndexOutOfBoundException
        try {
            int a[] = new int[5];
            a[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("End the array exception");

    }

}