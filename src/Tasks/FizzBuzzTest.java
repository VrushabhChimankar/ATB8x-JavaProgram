package Tasks;

public class FizzBuzzTest {

    public static void main(String[] args) {

        //print numbers from 0 to 100
        // for multiple of 3 and 5 print = FizzBuzz
        //for multiple pof 3 print = Fizz
        //for multiple of 5 print = Buzz


        for (int i = 0; i <=100; i++) {

            if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");

            } else{
                System.out.println(i);

            }


        }




    }



}
