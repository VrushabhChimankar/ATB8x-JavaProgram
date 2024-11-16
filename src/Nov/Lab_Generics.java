package Nov;

public class Lab_Generics {
    public static void main(String[] args) {


        temp(12);
        temp("Vrushabh");
        temp(true);
       //T --> reference it can be anything
        

    }

    public static <T> void temp(T a ){
        System.out.println(a);
    }
}
