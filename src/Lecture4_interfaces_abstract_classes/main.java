package Lecture4_interfaces_abstract_classes;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount(500);

        WithdrawalTransaction wt =
                new WithdrawalTransaction(
                        1000,
                        Calendar.getInstance()
                );

        // Testing normal apply()
        try {

            wt.apply(ba);

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }

        System.out.println();

        // Testing overloaded apply()
        wt.apply(ba, true);
    }
}
