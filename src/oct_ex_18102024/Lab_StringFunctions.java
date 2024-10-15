package oct_ex_18102024;

public class Lab_StringFunctions {
    public static void main(String[] args) {

        String s = "Hello";
        String s1 = "Hello";
        System.out.println(s == s1); //true

        String name = new String("vrushabh");
        String name1 = new String("vrushabh");
        System.out.println(name == name1); //False


        System.out.println(s.equals(s1));
        System.out.println(name.equals(name1));

        //== checks for location in the variable
        //equals == check the value
    }
}
