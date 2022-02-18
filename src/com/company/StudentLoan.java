package com.company;

public class StudentLoan extends Loan {

    private boolean isDeferred;

    public StudentLoan(String name, double amount, double rate, int months, boolean isDef) {
        super(name, amount, rate, months);
        isDeferred = isDef;
    }

    public boolean getIsDeferred() {
        return isDeferred;
    }

    public void setDeferred(boolean Deferred) {
        isDeferred = Deferred;
    }

    @Override
    public void calculateMonthlyPayment() {
        if (isDeferred)
            setMonthlyPayment(0);
        else
            super.calculateMonthlyPayment();
    }

    @Override
    public String toString() {
        return super.toString() + "Is Deferred= " + isDeferred;


    }
}