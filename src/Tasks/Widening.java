package Tasks;

public class Widening {

    public static void main(String[] args) {

        int a = 100;
        long b = a;   //implicit --> JVM ---> Valid
        long b1 = (long)b;  //Explicit --> jVM --> Valid but jvm doesn't show this.


    }
}
