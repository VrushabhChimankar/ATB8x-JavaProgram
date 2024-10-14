package oct_ex_11102024.Encapsulation;

public class HDFCBank {

  protected String name;
  protected long balance;

    public HDFCBank(String name, long balance){

        this.name = name;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance(){
        return balance;
    }

    public void setBalance(long balance, boolean isAdmin){

        if(isAdmin) {
            this.balance = balance;
            System.out.println("You are allowed");
        }
        else{
            System.out.println("Not allowed");

        }
    }
}
