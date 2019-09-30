package bankaccountApp;

//create abstract class - no object will be created on this class
public abstract class Account implements IBaseRate {
    //basic properties
    String name = "peppa pig";
    String sSN;

    double accountBalance;
    int accountNumber;
    double interestRate;

    //constructor at abstract class - take in common properties
    public Account(String name, String sSN, double initialDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.accountBalance = initialDeposit;
        System.out.println("New account name: " + this.name + "\nSSN is " + this.sSN + "\nbalance is $" + accountBalance);

    }

    //basic methods
    public int setAccountNumber() {
        return accountNumber;
    }
    public double deposit(int amount) {
        accountBalance += amount;
        return accountBalance;

    }

    public double withdraw(int amount) {
        accountBalance -= amount;
        return accountBalance;
    }

    public void transfer() {

    }

    public String showInfo() {
        return "Account balance is " + accountBalance;
    }




}
