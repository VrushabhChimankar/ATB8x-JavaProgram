package sept_ex_16092024;

public class Lab017_Relational_Operators {
    public static void main(String[] args) {

        //Relational Operators ---> Always returns boolean value i.e. true or false

        // >, <, >=, <=, ==, !=

        byte a = 10;
        byte b = 20;
        boolean c = a > b;
        System.out.println(c); //false
        boolean d = a < b; //true
        System.out.println(d);

        byte age = 19;
        byte age1 = 19;
        boolean result = age > age1; //false
        System.out.println(result);
        boolean result1 = age >= age1; //true two condition we have > or equals to
        System.out.println(result1);

    }
}
