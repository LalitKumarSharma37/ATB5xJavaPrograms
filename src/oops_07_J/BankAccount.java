package src.oops_07_J;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;

    BankAccount(){
        bankName = "SBI";
        bankCode = "SBI001";
        System.out.println("Default C");
    }

    BankAccount(String bName, String bCode){
        //this = hdfc
        this.bankName = bName;  //If we not use this keyword then default value will be assigned
        this.bankCode = bCode;
        System.out.println("Parameterized C");
    }

    void printdetails(){
        System.out.println("BankName -> " +bankName);
        System.out.println("Balance -> " +balance);
        System.out.println("Bank Code -> " +bankCode);
    }

}
