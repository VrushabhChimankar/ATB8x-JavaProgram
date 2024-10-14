package oct_ex_11102024.Encapsulation;

public class Lab075 {

    public static void main(String[] args) {

        HDFCBank h = new HDFCBank("Vrushabh", 2000);

        System.out.println(h.name);
        System.out.println(h.balance);

        boolean is_admin = true;
        HDFCBank a = new HDFCBank("Admin", 2000);
        a.setBalance(20000,true);
        System.out.println(a.getName());
    }
}
