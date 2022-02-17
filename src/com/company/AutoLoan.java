package com.company;

public class AutoLoan extends Loan {

    private double downPayment;


    public AutoLoan(String name,double amount, double rate , int months, double down )
    {
        super(name, amount, rate, months);
        downPayment = down;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    @Override
    public void calculateMonthlyPayment() {
        super.calculateMonthlyPayment();
    }

    @Override
    public String toString() {
        return "AutoLoan{" +
                "downPayment=" + downPayment +
                "} " + super.toString();
    }
}
