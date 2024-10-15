package oct_ex_18102024;

import java.util.Locale;

public class String_Functions {
    public static void main(String[] args) {

        String name = "Vrushabah";
        //Length
        System.out.println("Name: " + name.length());
        //substring
        System.out.println("Name:" + name.substring(0,4));
        //uppercase
        System.out.println("Name: " + name.toUpperCase());
        //lowercase
        System.out.println("Name: " + name.toUpperCase());

        //charAt
        System.out.println(name.charAt(2));
        //indexOf
        System.out.println(name.indexOf(2));
        //contains
        System.out.println(name.contains("V"));
        //isEmpty
        System.out.println(name.isEmpty());

    }
}
