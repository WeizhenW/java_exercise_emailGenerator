package bankaccountApp;

//create abstract class - no object will be created on this class
public abstract class Account implements IBaseRate {
    //basic properties
    String name = "peppa pig";
    String sSN;

    double accountBalance;

    //5 digits unique sequential number
    static int index = 10000;
    String accountNumber;

    double interestRate;

    //constructor at abstract class - take in common properties
    public Account(String name, String sSN, double initialDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.accountBalance = initialDeposit;

        //set account number
        index ++;
        this.accountNumber = setAccountNumber();
        //set rate
        setRate();
    }

    //basic methods

    //forcing the implementation of the abstract method
    abstract void setRate();

    //setAccountNumber method
    private String setAccountNumber() {
        //get last two digits of ssn
        String lastTwoOfSSN = sSN.substring(sSN.length()-2);
        //get 5 digits unique sequential number
        int uniqueID = index;
        //get 3 digits random number
        //cast to int from double
        int randomNumber = (int) (Math.random()*1000);
        return lastTwoOfSSN + uniqueID + randomNumber;
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

    public void showInfo() {
        System.out.println(
                "Name: " + name +
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + accountBalance
                );
    }




}
