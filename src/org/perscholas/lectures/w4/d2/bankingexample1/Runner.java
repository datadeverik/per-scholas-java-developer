package org.perscholas.lectures.w4.d2.bankingexample1;

public class Runner {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SavingAccount sa = new SavingAccount(100.0, 10.0, "$", 8.3, 8.5);
        sa.setDeposite(200.0);

        System.out.println(sa.getCurrenrbalance());

        sa.setWithdrow(125.0);
        System.out.println(sa.getCurrenrbalance());

    }
}