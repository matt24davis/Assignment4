package com.company;

public class Loan {
    private String customerName;
    private int accountNumber;
    private double loanBalance;
    private double monthlyPayment;
    private double interestRate;
    private int numberOfMonthlyPayments;
    private static int numberOfLoans = 0;

    public Loan(String name, double amount, double rate, int months) {
        customerName = name;
        loanBalance = amount;
        interestRate = rate;
        numberOfMonthlyPayments = months;
        accountNumber = ++numberOfLoans;
    }

    public static int getNumberOfLoans() {
        return numberOfLoans;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(double loanBalance) {
        this.loanBalance = loanBalance;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getNumberOfMonthlyPayments() {
        return numberOfMonthlyPayments;
    }

    public void setNumberOfMonthlyPayments(int numberOfMonthlyPayments) {
        this.numberOfMonthlyPayments = numberOfMonthlyPayments;
    }

    public static void decreaseNumberOfLoans() {
        numberOfLoans--;
    }

    public void calculateMonthlyPayment() {
        monthlyPayment = interestRate * loanBalance / 1 - Math.pow(1 + interestRate, -numberOfMonthlyPayments);

    }

    @Override
    public String toString() {
        return "Loan{" +
                "customerName='" + customerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", loanBalance=" + loanBalance +
                ", monthlyPayment=" + monthlyPayment +
                ", interestRate=" + interestRate +
                ", numberOfMonthlyPayments=" + numberOfMonthlyPayments +
                '}';
    }
}