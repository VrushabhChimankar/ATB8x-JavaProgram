package sept_ex_23092024;

public class Lab032 {
    public static void main(String[] args) {

        //Switch case
        //Here all days will print because we have not added break keyword here.
        int day = 1;
        switch (day){
            case 1 :
                System.out.println("Monday");
            case 2 :
                System.out.println("Tuesday");
            case 3 :
                System.out.println("Wednesday");
            case 4 :
                System.out.println("Thursday");
            case 5 :
                System.out.println("Friday");
            case 6 :
                System.out.println("Saturday");
            case 7 :
                System.out.println("Sunday");
            default:;
                System.out.println("No days are matching");
        }
    }
}
