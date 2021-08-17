package org.perscholas.lectures.w6.d1.concurr.bankexample;
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Withdraw w = new Withdraw(bank);
        Thread t1 = new Thread(w, "withdraw Thread");
        t1.setPriority(Thread.MIN_PRIORITY);  // but don't set priority in the real world
        t1.start();

        Deposit c = new Deposit(bank);
        Thread t2 = new Thread(c, "Deposite Thread");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        try {
            t1.join();
            t2.join();
            System.out.println("Main done executing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}