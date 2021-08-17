package org.perscholas.lectures.w6.d1.concurr.bankexample;
import java.util.concurrent.atomic.AtomicInteger;
public class Bank {
    private Integer balance = 1000;
    public Integer getBalance() {
        return balance;
    }
    public void addAmount(Integer amount) {
        balance = balance + amount;
    }

    public void subtractamount(Integer amount) {
        balance = balance - amount;
    }
}