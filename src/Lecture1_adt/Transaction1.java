package Lecture1_adt;

import java.util.Calendar;

/**
 * This Lecture1_adt.TransactionInterface Class violates several ADT design principles:
 * 1. Representation Independence: --- Changes in representation of the data may require external code to alter access
 * 2. Preservation of Invariants: --- Any external client code can alter the internal values
 */
public class Transaction1 {
    // private 
    private int amount;
    private Calendar date;

    public Transaction1(int amount, Calendar date) {
       if(amount<0){
           throw new illegalArgumentException("amount cannot be negative);
       }
        this.amount = amount;
        this.date = (Calendar) date.clone();
    }
    public int getAmount() {
        return amount;
}
    public void setAmount(int amount){
        if(amount<0){
            throw new illegalArgumentException("Amount cannot be negative")
                }
        this.amount= amount;
    }
    public Calender getDate(){
        return (Calender) date.clone();

        publicvoid setDate( Calender date) {
            this.date = ( Calender) date.clone();
    }
}
