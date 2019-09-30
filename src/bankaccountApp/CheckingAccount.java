package bankaccountApp;

public class CheckingAccount extends Account {
    //specific properties
    int cardNumber;
    int pin;

    //constructor to initialize checkingAccount
    public CheckingAccount(String name) {
        //must use super in case of extending from parent class
        super(name);
        System.out.println("It's a checking account");
    }
    //any specific methods
}
