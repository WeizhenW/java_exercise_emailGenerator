package bankaccountApp;

public class BankAccountApp {
    public static void main(String[] args) {

        CheckingAccount check1 = new CheckingAccount("big bear", "112233", 100);
        CheckingAccount check2 = new CheckingAccount("small bear", "445566", 200);

        SavingAccount saving1 = new SavingAccount("teddy ted", "998877", 999);
        SavingAccount saving2 = new SavingAccount("sheep suzi", "665544", 222);


        check1.showInfo();
        System.out.println("***************************");
        check1.deposit(100);
        check1.showInfo();
        System.out.println("***************************");
        check1.withdraw(111);
        check1.showInfo();
        System.out.println("***************************");
        saving1.showInfo();
        System.out.println("***************************");
        saving1.deposit(222);
        saving1.showInfo();
        System.out.println("***************************");
        saving1.withdraw(333);
        saving1.showInfo();


    }
}
