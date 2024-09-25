package sept_ex_25092024;

public class Lab55 {
    public static void main(String[] args) {

        //Continue keyword is used to skip the next statement
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i==5){
                continue;

            }
            System.out.println(i);
        }

    }
}
