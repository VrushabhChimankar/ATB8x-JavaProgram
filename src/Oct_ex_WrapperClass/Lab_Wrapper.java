package Oct_ex_WrapperClass;

public class Lab_Wrapper {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a;
        System.out.println(b); //Unboxing --> int --> Integer

        String number = "10";
        Integer c = Integer.valueOf(number);
        System.out.println(a); //

    }
}
