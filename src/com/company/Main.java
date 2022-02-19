package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main myobj = new Main();
        ArrayList<Loan> AL = new ArrayList<>();
        int a;
        while (true) {
            System.out.println(
                    "\n 1-Add Loan" +
                            "\n 2-Delete Loan" +
                            "\n 3-Calculate Monthly Payments" +
                            "\n 4-Print Loans" +
                            "\n 5-Exit" +
                            "\nEnter Choice:  ");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    myobj.addLoan(AL);
                    break;
                case 2:
                    myobj.deleteLoan(AL);
                    break;
                case 3:
                    myobj.calculateMonthlyLoanPayment(AL);
                    break;
                case 4:
                    myobj.printLoans(AL);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Error: Please enter valid input\n");
                    break;
            }

        }
    }
        public void addLoan (ArrayList<Loan> AL) {
            boolean isDeferred;

            System.out.println("Enter Loan Type (1-Student, 2-Auto)");
            int typeLoan;
            typeLoan = sc.nextInt();

            System.out.println("Customer Name:");
            String Name;
            Name = sc.next();

            System.out.println("Loan Amount:");
            int loanAmount;
            loanAmount = sc.nextInt();

            System.out.println("Loan Interest Rate:");
            int interestRate;
            interestRate = sc.nextInt();

            System.out.println("Number of Monthly Payments :");
            int numberOfMonthlyPayments;
            numberOfMonthlyPayments = sc.nextInt();

            if (typeLoan == 1) {
                sc.nextLine();
                System.out.println("Is Loan Deferred? (Y/N):");
                String isDef = sc.nextLine();
                if (isDef.equalsIgnoreCase("Y")) {
                    isDeferred = true;
                } else
                    isDeferred = false;
                StudentLoan mySL = new StudentLoan(Name, loanAmount, interestRate, numberOfMonthlyPayments, isDeferred);
                AL.add(mySL);
            } else if (typeLoan == 2) {
                System.out.println("Enter Down Payment");
                double downPayment = sc.nextDouble();
                AutoLoan myAL = new AutoLoan(Name, loanAmount, interestRate, numberOfMonthlyPayments, downPayment);
                AL.add(myAL);

            }
        }
        public void deleteLoan (ArrayList < Loan > AL) {
            String name;
            System.out.println("Customer Name:");
            name = sc.nextLine();
            for (int i = 0; i < AL.size(); i++) {
                if (AL.get(i).getCustomerName().equalsIgnoreCase(name)) {
                    AL.remove(i);
                    Loan.decreaseNumberOfLoans();
                }
            }
        }
        public void calculateMonthlyLoanPayment (ArrayList < Loan > AL) {
            for (int i = 0; i < AL.size(); i++) {
                System.out.println(AL.get(i));
            }
        }
        public void printLoans (ArrayList < Loan > AL) {
            for (int i = 0; i < AL.size(); i++) {
                System.out.println(AL.get(i));
            }
        }
    }




