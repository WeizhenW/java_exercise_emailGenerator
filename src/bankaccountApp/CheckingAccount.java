package bankaccountApp;

public class CheckingAccount extends Account {
    //specific properties
    int cardNumber;
    int cardPIN;

    //constructor to initialize checkingAccount
    public CheckingAccount(String name, String sSN, double initialDeposit) {
        //must use super in case of extending from parent class
        super(name, sSN, initialDeposit);
        accountNumber = "2" + accountNumber;
//        System.out.println("It's a checking account");
//        System.out.println("account number: " + this.accountNumber);
    }

    //any specific methods
    public void showInfo() {
        //not overwriting
        super.showInfo();
        System.out.println("Checking account");
    }
}
