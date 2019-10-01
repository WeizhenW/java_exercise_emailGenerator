package bankaccountApp;

import utilities.CSV;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) throws FileNotFoundException {

        List<Account> accountsList = new LinkedList<>();

        String fileName = "C:\\Users\\weizhen.wang\\Downloads\\NewBankAccounts.csv";

        List<String[]> allAccounts = CSV.readCSV(fileName);

        for(String[] account : allAccounts) {
            String name = account[0];
            String sSN = account[1];
            String accountType = account[2];
            double initialDeposit = Double.parseDouble(account[3]);

            if(accountType.equals("Savings")) {
                accountsList.add(new SavingAccount(name, sSN, initialDeposit));
            } else if (accountType.equals("Checking")) {
                accountsList.add(new CheckingAccount(name, sSN, initialDeposit));
            } else {
                System.out.println("Error with reading file");
            }
        }

        for(Account account : accountsList) {
            System.out.println(account.name + " " + account.accountNumber + " " + account.accountBalance);
        }

    }
}
