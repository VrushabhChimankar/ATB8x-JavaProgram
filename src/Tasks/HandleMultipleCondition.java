package Tasks;

public class HandleMultipleCondition {

    public static void main(String[] args) {

        //score >= 90 -> A,
        //score >=  85 -> A,
        //score >= 70 -> A,

        int score = 85;

        if(score>=90){
            System.out.println("A");
        }
        else if (score>=80 && score>=89){
            System.out.println("B");
        } else if (score>=70 && score>=79){

            System.out.println("C");
        }

    }
}
