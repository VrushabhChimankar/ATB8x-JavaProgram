package Oct_Interface;

interface A {

    int a = 10;
   default void m1() {}
    default void m2() {}


}

interface B extends A{

    default void m3(){}
    default void m4(){}
}

class InterfaceDemo implements B{

    @Override
    public void m1(){

        System.out.println("This is m1");
    }
    @Override
    public  void m2(){
        System.out.println("This is m2");
    }
    @Override
    public  void  m3(){
        System.out.println("This is m3");
    }
    @Override
    public void m4(){
        System.out.println("This is m4");
    }
    public void B(){
        System.out.println("This is B");
    }
    public void A(){
        System.out.println("This is A");
    }

    public static void main(String[] args) {


        InterfaceDemo obj = new InterfaceDemo();

        obj.A();
        obj.B();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}

