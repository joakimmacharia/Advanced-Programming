package Lecture4_interfaces_abstract_classes;

import java.util.Calendar;

public class DepositTransaction extends BaseTransaction {

    public DepositTransaction(int amount, Calendar date) {
        super(amount, date);
    }

    @Override
    public void printTransactionDetails() {
        System.out.println("===== Deposit Transaction =====");
        System.out.println("Transaction ID: " + getTransactionID());
        System.out.println("Amount: " + getAmount());
        System.out.println("Date: " + getDate().getTime());
    }

    @Override
    public void apply(BankAccount ba) {

        double newBalance = ba.getBalance() + getAmount();

        ba.setBalance(newBalance);

        System.out.println("Deposit Successful");
        System.out.println("New Balance: " + ba.getBalance());
    }
}
       
