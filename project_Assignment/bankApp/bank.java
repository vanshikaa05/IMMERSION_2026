package bankApp;

import java.util.ArrayList;

public class bank {

    private ArrayList<bankAccount> accounts;

    public bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(bankAccount account) {
        accounts.add(account);
    }

    public bankAccount searchAccount(int accountNo)
            throws AccountNotFoundException {

        for(bankAccount account : accounts) {

            if(account.getAccountNumber() == accountNo) {
                return account;
            }
        }

        throw new AccountNotFoundException(
                "Account Not Found");
    }

    public void viewBalance(int accountNo)
            throws AccountNotFoundException {

        bankAccount account =
                searchAccount(accountNo);

        System.out.println(
                "Current Balance : Rs."
                + account.getBalance());
    }

    public void transferAmount(int sender,
                               int receiver,
                               double amount)
            throws AccountNotFoundException,
                   InsufficientBalanceException {

        bankAccount senderAcc =
                searchAccount(sender);

        bankAccount receiverAcc =
                searchAccount(receiver);

        senderAcc.withdraw(amount);

        receiverAcc.deposit(amount);

        Transaction t =
                new Transaction(sender,
                                receiver,
                                amount);

        t.displayTransaction();

        System.out.println(
                "\nTransfer Successful");
    }

    public void displayAllAccounts() {

        for(bankAccount account : accounts) {
            account.displayDetails();
        }
    }
}