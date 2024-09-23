package sept_ex_23092024;

public class Lab36 {
    public static void main(String[] args) {


        int itemCode = 007;
        switch(itemCode) {
            case 001, 002, 003:
                System.out.println("This is electronic gadget");
                System.out.println("This is electronic gadget");
                System.out.println("This is electronic gadget");
                break;
            case 004, 005,007:
                System.out.println("This is not gadget");
                System.out.println("This is not gadget");
                System.out.println("This is not gadget");
                System.out.println("This is not gadget");
                break;
            default:
                System.out.println("None u r wrong");
                System.out.println("None u r wrong");
                break;


        }



    }
}
