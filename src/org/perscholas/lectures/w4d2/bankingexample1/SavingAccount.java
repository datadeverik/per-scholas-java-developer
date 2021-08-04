package org.perscholas.lectures.w4d2.bankingexample1;

public class SavingAccount {

    private double currenrbalance;
    private double interest;
    private static String currency;
    private static double tax;
    private static double salestax;

    public SavingAccount(double currenrbalance, double interest, String currency, double tax, double salestax) {

        this.currenrbalance = currenrbalance;
        this.interest = interest;
        this.currency = currency;
        this.tax = tax;
        this.salestax = salestax;
    }

    public SavingAccount()
    {

    }


    public void setWithdrow(double withdrawAmount)
    {
        this.currenrbalance = this.currenrbalance - withdrawAmount;
    }

    public void setDeposite(double amount)
    {
        this.currenrbalance = this.currenrbalance + amount;
    }

    public double getCurrenrbalance() {
        return currenrbalance;
    }
    public void setCurrenrbalance(double currenrbalance) {
        this.currenrbalance = currenrbalance;
    }
    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        this.interest = interest;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public double getSalestax() {
        return salestax;
    }
    public void setSalestax(double salestax) {
        this.salestax = salestax;
    }

}