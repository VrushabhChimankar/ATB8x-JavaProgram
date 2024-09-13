package sept_ex_16092024;

public class Lab015_QNA {
    public static void main(String[] args) {

        String fname = "Vrushabh";
        String lname = "Chimankar";
        int a = 10;
        int b = 10;
        //Here if int is first then it will add the value.
        //If int is after string it will only concatenate value.
        System.out.println(fname+lname+a+b);
        System.out.println(fname+lname+(a+b));
        System.out.println(a+b+fname+lname);


    }
}
