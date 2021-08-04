package org.perscholas.assignments.bank;

public class Main {
    public static void main(String[] args) {
        // create a checking account
        Customer cust1 = new Customer("Bob", 500L);
        Checking checking1 = new Checking(1000, cust1);
        System.out.println(checking1.getBalance());
        checking1.deposit(100);
        System.out.println(checking1.getBalance());
        checking1.withdraw(200);
        System.out.println(checking1.getBalance());
        Savings savings1 = new Savings(20000L, cust1, 1);
        System.out.println(savings1.getBalance());
        savings1.addInterest();
        System.out.println(savings1.getBalance());

    }
}
