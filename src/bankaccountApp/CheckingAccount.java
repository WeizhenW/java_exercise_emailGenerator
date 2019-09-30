package bankaccountApp;

public class CheckingAccount extends Account {
    //specific properties
    long cardNumber;
    int cardPIN;

    //constructor to initialize checkingAccount
    public CheckingAccount(String name, String sSN, double initialDeposit) {
        //must use super in case of extending from parent class
        super(name, sSN, initialDeposit);

        setDebitCard();

    }

    //any specific methods
    private void setDebitCard() {
        cardNumber = (long) (Math.random() * Math.pow(10, 12));
        cardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

        public void showInfo() {

        //not overwriting
        super.showInfo();
        System.out.println("Checking account");
        System.out.println(
                "Card number: " + cardNumber +
                "\nPIN: " + cardPIN);
    }
}
