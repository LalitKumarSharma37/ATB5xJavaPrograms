package src.oops_13_J.encapsulation;

public class ICICIBank {

    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    String name;
    long balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if (balance < 0) {
            this.balance = balance;
         } else {
         System.out.println("Not Allowed");
       }
    }
}
