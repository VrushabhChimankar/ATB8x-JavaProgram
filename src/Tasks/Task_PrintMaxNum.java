package Tasks;

public class Task_PrintMaxNum {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 45;

        int max_number = (a>b) ? (a>c ? a : b) : (b > c ? b : c);
        System.out.println(max_number);

    }
}
