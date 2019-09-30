package bankaccountApp;

public class SavingAccount extends Account {

    //specific properties
    int safetyBoxId;
    int code;

    //constructor to initialize savingAccount
    public SavingAccount(String name, String sSN, double initialDeposit) {
        super(name, sSN, initialDeposit);
        System.out.println("It's a saving account");
    }
    //any specific methods

}
