package Task_27092024;

public class PrintFirstFiveEvenNumbers {

    public static void main(String[] args) {

       // Create a Java program that prints the first 5 even numbers using a do-while loop.

       byte i = 0;
       do {
           i++;
           if (i%2==0){
               System.out.println("First five even numbers: " + i);
           }
       } while (i<=10);

    }
}
