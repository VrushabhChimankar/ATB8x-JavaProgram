package oct_ex_16102024.StaticKeyword;

public class Lab78 {

    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        new A();
    }
}

class A{
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("SIB");

    }}
