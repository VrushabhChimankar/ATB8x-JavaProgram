package sept_ex_19092024;

public class Lab_23_TypeCasting {
    public static void main(String[] args) {

        //Widening : It is notting but putting smaller basket value into the bigger one.
        //Narrowing : It is nothing but putting bigger basket value into the smaller one.

        //Widening concept
        byte a = 10;
        int b = a; //implicit jvm valid
        int b1 = (byte)b;  //explicit jvm valid
       // System.out.println(bi); //It is explicitly but jvm doesnt show.

        //Narrowing concept
        int course = 100;
        float GST = 18.45f;
        //int result = course+GST; //JVm do not allow this
        //Lets do this as explicitly it will do but loss of data will be there

        int result = course+(int)GST;
        System.out.println(result); //118 will be print & 0.45 will loose.



    }
}
