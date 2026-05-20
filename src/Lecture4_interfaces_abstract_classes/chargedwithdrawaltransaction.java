package Lecture4_interfaces_abstract_classes;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class ChargedWithdrawalTransaction
        extends WithdrawalTransaction {

    private final double withdrawalFee = 50;

    public ChargedWithdrawalTransaction(
            int amount,
            @NotNull Calendar date) {

        super(amount, date);
    }

    @Override
    public void apply(BankAccount ba) {

        double current_balance =
                ba.getBalance();

        double totalWithdrawal =
                getAmount() + withdrawalFee;

        if(current_balance >= totalWithdrawal){

            double new_balance =
                    current_balance - totalWithdrawal;

            ba.setBalance(new_balance);

            System.out.println(
                    "Withdrawal successful.");

            System.out.println(
                    "Transaction Fee: "
                            + withdrawalFee);

        } else {

            System.out.println(
                    "Insufficient balance.");
        }
    }

    @Override
    public void printTransactionDetails() {

        System.out.println(
                "Charged Withdrawal Transaction");
    }
}
