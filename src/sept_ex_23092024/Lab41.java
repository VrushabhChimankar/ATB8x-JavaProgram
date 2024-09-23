package sept_ex_23092024;

public class Lab41 {

    public static void main(String[] args) {

       char ch = 'C';
       switch (ch){
           case 'A' + 1:
               System.out.println("A");
               break;
           case 'A':
                   System.out.println("B");
                   break;
           case  'A' + 2:
                       System.out.println("C");
                       break;
           default:
               System.out.println("Anything");
               break;

       }


        }
    }

