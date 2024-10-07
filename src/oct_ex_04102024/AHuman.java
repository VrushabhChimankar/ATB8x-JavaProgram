package oct_ex_04102024;

public class AHuman {
    String name = "Vrushabh";
    int age;
    int legs;

    AHuman(){
        System.out.println("Hi, I am default constructor");

    }

    AHuman(String name, int age, int legs){
        System.out.println("Hi, I am parameterized constructor");

        this.name = name;
        this.age = age;
        this.legs = legs;
    }

    }


