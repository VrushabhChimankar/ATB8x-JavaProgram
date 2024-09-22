package sept_ex_20092024;

public class Lab_032LogicBuilding {
    public static void main(String[] args) {

        //If the score is
        // 90 - 100 return A
        // 80 - 89 return B
        // 70 - 79 return C
        // 60 - 69 return D
        // Else grade F

        int score = 80;
        // char grade = F;
        if (score>=90 && score <=100){
            System.out.println("A");
        } else if (score>=80 && score<=89) {
            System.out.println("B");
        } else if (score>=70 && score<=79) {
            System.out.println("C");
        }  else if (score>=60 && score<=69) {
            System.out.println("D");
        }else if (score<=0 && score > 100) {
            System.out.println("Are you LOL!");
            System.out.println("O");
        } else {
            System.out.println("F");
        }


    }
}
