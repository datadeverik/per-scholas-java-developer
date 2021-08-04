package org.perscholas.assignments.bank;

public class Savings extends Account {
    int interestPercent;
    public Savings(long balance, Customer accountOwner, int interestPercent) {
        super(balance, accountOwner);
        this.interestPercent = interestPercent;
    }

    public void addInterest() {
        double interestToPay = (double) this.balance / 100 * this.interestPercent;
        this.balance = this.balance + (long) interestToPay;
    }
}
