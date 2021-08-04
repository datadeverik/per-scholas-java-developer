package org.perscholas.assignments.bank;

public class Account {
    long balance;
    Customer accountOwner;

    public Account(long balance, Customer accountOwner) {
        this.balance = balance;
        this.accountOwner = accountOwner;
    }

    public void deposit(long amt) {
        this.balance += amt;
    }

    public void withdraw(long amt) {
        this.balance -= amt;
    }

    public long getBalance() {
        return this.balance;
    }
}
