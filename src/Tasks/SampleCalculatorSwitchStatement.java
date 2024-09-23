package Tasks;

public class SampleCalculatorSwitchStatement {
    public static void main(String[] args) {

        int num1 = 28;
        int num2 = 6;
       char code = '%';
        switch (code){

            case '+' :
                System.out.println(num1 + num2);
                break;
            case '-' :
                System.out.println(num1 - num2);
                break;
            case '*' :
                System.out.println(num1 * num2);
                break;
            case '/' :
                System.out.println(num1 / num2);
                break;
            case '%' :
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Anything left!");
                break;

        }
    }
}
