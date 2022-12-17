// This program was written by Zyad Khan for CIS-132 Lab #5 on 10/26/22
// The purpose of this program is to take known variables in order to compute and display loan amortization.
// The program uses the print writer class in order to take the strings and compute them into a text file called "LoanAmortization.txt"

import java.awt.print.PrinterAbortException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

public class Problem2 {
    private static PrintWriter outputFile;
    public static void main(String[] args) throws IOException { // uses throws IOExecption for the PrintWriter class
        // Display the purpose of the program
        System.out.println("The purpose of this program is to take known variables in order to compute and display loan amortization");
        System.out.println("The program uses the print writer class in order to take the strings and compute them into a text file called LoanAmortization.txt");

        // initializes given values
        double principal = 17135.45;
        double apr = 2.99;
        int numPayments = 60;

        outputFile = new PrintWriter("LoanAmortization.txt"); // create the output file LoanAmortization.txt
        printAmortization(principal, apr, numPayments); // calling the method printAmortization
        outputFile.close(); // closes the LoanAmortization file after the output is written to the document
    }

    // Private method that calculates the principal, balance, interest, and monthly rate
    private static void printAmortization(double principal, double apr, int numPayments) {
        double monthlyRate = (apr / 1200); // calculation of the monthly rate
        double monthlyPayment = (principal * monthlyRate) / (1 - Math.pow(1 + (monthlyRate), (numPayments * -1))); // calculation of the monthly payment
        double payment = Math.round(monthlyPayment * 100) / (100.0);
        String printPrincipal = String.format("Principal: %,.2f", principal);
        output(printPrincipal);
        String printAPR = String.format("APR: %.2f%%", apr);
        output(printAPR);
        String printNumPayments = String.format("Number of payments: %d", numPayments);
        output(printNumPayments);
        String printMonthlyPayments = String.format("Monthly Payment: %.2f\n", monthlyPayment);
        output(printMonthlyPayments);

        double balance = principal, interest;
        String header = String.format("Num.     Balance      Int.     Prin.");
        output(header);
        String lastPayment = "";
        for (int i = 1; i <= numPayments; i++) { // Implementation of for loop for the calculation of each line
            interest = Math.round((monthlyRate * balance) * 100) / (100.0);
            if (i < numPayments) {
                principal = payment - interest;
                balance = Math.round((balance - principal) * 100) / (100.0);
            } else {
                principal = balance;
                lastPayment = String.format("Last payment is %.2f", (balance+ interest));
                balance = Math.round((balance - balance) * 100) / (100.0);
            }
            String line = String.format("%4d%,12.2f%10.2f%10.2f", i, balance,interest,principal); // output for principal, APR, number of payments, and monthly payments
            output(line);
            if (i < numPayments){
            }
            else{
                output(lastPayment); // output last payment
            }
        }
    }
    private static void output(String line){
        System.out.println(line); // display the string line, which has all of the strings combined, into the console
        outputFile.println(line);// outputs the string line, which has all of the strings combined, into the LoanAmortization.txt file

    }
}

