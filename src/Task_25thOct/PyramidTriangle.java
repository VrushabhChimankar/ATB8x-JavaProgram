package Task_25thOct;

public class PyramidTriangle {

    public static void main(String[] args) {

        //for the number of rows
        int n = 5;

        //Outer loop for each row
        for (int i = 0; i < n; i++) {

            //inner for loop for printing spaces
            for (int j = 0; j < n - i -1; j++) {

                System.out.print(" ");
            }

            //for loop for printing stars
            for (int j = 0; j < 2 * i + 1 ; j++) {

                System.out.print("*");
            }
            //for next line

            System.out.println();

        }


    }

}
