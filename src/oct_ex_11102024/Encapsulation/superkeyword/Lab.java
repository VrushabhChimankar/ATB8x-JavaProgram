package oct_ex_11102024.Encapsulation.superkeyword;

import org.w3c.dom.ls.LSOutput;

public class Lab {

    public static void main(String[] args) {

        //Super keyword is used to call parent methods
        car c = new car();

    }

}


class car extends Vehile{

    public int max_speed = 200;

    void display(){

        System.out.println("Child");
    }

    car(){
        super(12);
        this.display(); //Child

        super.display(); //parent
        System.out.println(this.max_speed);
        System.out.println(super.max_speed);
        System.out.println("DC Car");
    }

}




class Vehile{

    protected int max_speed = 290;

    void display(){
        System.out.println("Parent");
    }


    Vehile(){
        System.out.println("DC Vehicle");
    }

    Vehile(int a ){
        System.out.println("PC Vehicle");
    }

    void message (){
        System.out.println("Hello Vehicle");
    }

    void message(int a ){
        System.out.println("Hello Vehicle");
    }
}
