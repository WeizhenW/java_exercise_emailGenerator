package bankaccountApp;

//create abstract class - no object will be created on this class
public abstract class Account implements IBaseRate {
    //basic properties
    String name;
    String accountType;
    int initialDeposit;
    int accountBalance;
    int accountNumber;
    float interestRate;

    //constructor
//    public Account(String name, String accountType, int initialDeposit) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.accountType = accountType;
//        this.accountBalance = initialDeposit;
//    }

    //basic methods
    public int setAccountNumber() {
        return accountNumber;
    }
    public int deposit(int amount) {
        accountBalance += amount;
        return accountBalance;

    }

    public int withdraw(int amount) {
        accountBalance -= amount;
        return accountBalance;
    }

    public void transfer() {

    }

    public String showInfo() {
        return "Account balance is " + accountBalance;
    }




}
