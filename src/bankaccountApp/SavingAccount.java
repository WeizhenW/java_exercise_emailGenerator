package bankaccountApp;

public class SavingAccount extends Account {

    //specific properties
    int safetyBoxId;
    int safetyBoxCode;
    static int safetyBoxIndex = 100;

    //constructor to initialize savingAccount
    public SavingAccount(String name, String sSN, double initialDeposit) {
        super(name, sSN, initialDeposit);
        accountNumber = "1" + super.accountNumber;

        //safety box
        safetyBoxIndex ++;
        setSafetyBox();

    }
    //any specific methods
    @Override
    void setRate() {
        interestRate = getRate() - 0.25;
    }
    private void setSafetyBox() {
        this.safetyBoxId = safetyBoxIndex;
        this.safetyBoxCode = (int) (Math.random() * Math.pow(10, 4));
    }
    public void showInfo() {
        System.out.println("Saving account");
        super.showInfo();
        System.out.println("safety box id is " + safetyBoxId +
                "\nsafety box code is " + safetyBoxCode +
                "\nInterest rate is " + interestRate);
    }

}
