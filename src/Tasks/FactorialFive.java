package Tasks;

public class FactorialFive {
    public static void main(String[] args) {

        int number = 5;
        int facto = 1;

        for (int i = 1; i <= number; i++) {
            facto *= i; // Multiply factorial by i
        }

        System.out.println("Factorial of " + number + " is: " + facto);

    }
}
