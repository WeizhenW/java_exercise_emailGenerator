package bankaccountApp;

public class CheckingAccount extends Account {
    //specific properties
    int cardNumber;
    int cardPIN;

    //constructor to initialize checkingAccount
    public CheckingAccount(String name, String sSN, double initialDeposit) {
        //must use super in case of extending from parent class
        super(name, sSN, initialDeposit);
        System.out.println("It's a checking account");
    }
    //any specific methods
}
