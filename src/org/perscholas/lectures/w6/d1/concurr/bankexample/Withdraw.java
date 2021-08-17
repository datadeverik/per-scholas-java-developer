package org.perscholas.lectures.w6.d1.concurr.bankexample;
public class Withdraw implements Runnable {
    private Bank bank;
    public Withdraw(Bank bank) {
        this.bank = bank;
    }
    public void withdrawalAmount(int amount) {
        System.out.println("trying to withdraw " + amount + " from balance " + bank.getBalance());
        synchronized (bank) {
            if (bank.getBalance() < amount) {
                try {
                    while (bank.getBalance() < amount) {
                        String message = "Account overdrawn.  Balance " + bank.getBalance() + " < Withdraw amount " + amount + "; waiting for deposit...";
                        System.out.println(message);
                        bank.wait();
                    }
                } catch (Exception e) {
                }
            }
            bank.subtractamount(amount);
            System.out.println("withdraw completed: Balance: " + bank.getBalance());
        }
        System.out.println("Witdraw Thread execution ended");
    }
    @Override
    public void run() {
        withdrawalAmount(5000);
    }
}