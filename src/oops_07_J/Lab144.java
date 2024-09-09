package src.oops_07_J;

public class Lab144 {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        sbi.printdetails();

        System.out.println("-----");

        BankAccount hdfc = new BankAccount("HDFC", "HDFC001");
        hdfc.printdetails();

        BankAccount icici = new BankAccount("ICICI", "ICICI001");
        icici.bankCode = "ICICI005"; //Update value of bankCode
        icici.printdetails();
    }
}
