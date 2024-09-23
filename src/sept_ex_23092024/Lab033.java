package sept_ex_23092024;

public class Lab033 {
    public static void main(String[] args) {

        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge cases.

        String browser = "chrome";
        switch (browser){
            case "chrome" :
                   System.out.println("This is chrome browser");
                   break;
            case "firefox" :
                System.out.println("This is firefox browser");
                break;
            case "edge" :
                System.out.println("This is edge browser");
                break;
            default:
                System.out.println("No browser is matching");
                break;


        }
    }
}
