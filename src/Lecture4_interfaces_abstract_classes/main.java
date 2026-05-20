package Lecture4_interfaces_abstract_classes;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        DepositTransaction deposit =
                new DepositTransaction(500, Calendar.getInstance());

        WithdrawalTransaction withdrawal =
                new WithdrawalTransaction(300, Calendar.getInstance());

        deposit.printTransactionDetails();
        deposit.apply(account);

        System.out.println();

        withdrawal.printTransactionDetails();
        withdrawal.apply(account);
    }
}
