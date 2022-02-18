package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //  ArrayList
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


    }
    public void addLoan(){
        System.out.println("Enter Loan Type (1-Student, 2-Auto)");
        int typeLoan; typeLoan = sc.nextInt();

        System.out.println("Customer Name:");
        String Name;   Name = sc.next();

        System.out.println("Loan Amount:");
        int loanAmount; loanAmount = sc.nextInt();

        System.out.println("Loan Interest Rate:");
        int interestRate;  interestRate = sc.nextInt();

        System.out.println("Monthly Payment:");
        int monthlyPayment; monthlyPayment = sc.nextInt();

        /*if auto
                prompt downpayment
                        read in downpayment
        create object with  name loanAmount interest , monthlypayments
                store object in arraylist
                */
    }
public void deleteLoan(){
  System.out.println("Customer Name:");
   String name; name = sc.next();
   //search where name
   //object found
   //remove from array
    }

public void calculateMonthlyLoanPayment(){
//transvere array
    //for loop
}
public void printLoans(){
//transvere array
    //for loop
}
}



