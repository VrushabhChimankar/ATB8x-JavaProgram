package Tasks;

public class Narrowing {
    public static void main(String[] args) {

        long a = 20123456786l;
        //int b = result; //Invalid implicit casting

        int result1 = (int)a; //invalid explicit casting
        System.out.println(result1);


    }
}
