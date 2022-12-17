// This program was written by Zyad Khan for CIS-132 Lab #5 on 10/26/22
// The purpose of this program is to use the loan amortization output file from Problem 2 and verify the data with the project to confirm that it is correct.

import java.util.Scanner; // import the scanner method
import java.io.*; // import the java.io library including FileWriter, Throws, and the File class. This allows the program to retrieve the files

public class Problem3 {
    public static void main(String [] args) throws FileNotFoundException {
        // Display the purpose of the program
        System.out.println("The purpose of this program is to use the loan amortization output file from Problem 2 and verify the data with the project to confirm that it is correct.");

        // Declaration and initialization the variables
        boolean hasPrincipal = false;
        boolean hasNumberPayments = false;
        boolean hasMonthlyPayment = false;
        boolean hasFoundFirstLine = false;
        boolean hasLastPayment = false;

        double principal = 0 ;
        double monthlyPayment = 0;
        double lastPayment = 0;
        double accumulatedInterest = 0;
        double accumulatedPrincipal = 0;

        int numberPayments = 0;

        // Creates an input file to use from the LoanAmortization.txt file from Lab 2
        File SampleLoanAmortization = new File("LoanAmortization.txt");
        // Create Scanner from input file
        Scanner file = new Scanner (SampleLoanAmortization);

        // pre-test loop
        while (!hasFoundFirstLine && file.hasNext()) {
            if (!hasPrincipal) {
                if (file.hasNextDouble()) {
                    hasPrincipal = true;
                    principal = file.nextDouble(); // extracts the value for principal
                    System.out.println("The value for the principal that was extracted is " + principal);  // message displayed to report the value of principal
                } else {
                    file.next();
                }
            } else if (hasPrincipal && !hasNumberPayments) {
                if (file.hasNextInt()) {
                    hasNumberPayments = true;
                    numberPayments = file.nextInt(); // extracts the value for numberPayments
                    System.out.println("The number of payments extracted is " + numberPayments); // message displayed to report the value for the number of payments
                } else {
                    file.next();
                }

            } else if (hasNumberPayments && !hasMonthlyPayment) {
                if (file.hasNextDouble()) {
                    hasMonthlyPayment = true;
                    monthlyPayment = file.nextDouble(); // extracts the value for monthlyPayments
                    System.out.println("The amount for the monthly payment that was extracted is " + monthlyPayment); // message displayed to report the value for the value of the monthly payments
                } else {
                    file.next();
                }

            }
            // Skips over tokens until it reaches the first payment line, which is when it finds the next integer value.
            // When it is found, the value is not extracted, but the hasFoundFirstLine is set to true
            else {
                if (file.hasNextInt()) {
                    hasFoundFirstLine = true;
                } else {
                    file.next();
                }
            }
        }

        // parsing the payment lines
        for (int i = 1; i <= numberPayments; i++ ){
            file.nextInt();
            file.nextDouble();
            accumulatedInterest += file.nextDouble(); //extracting the accumulated Interest in adding all of the values of Interest
            accumulatedPrincipal += file.nextDouble(); //extracting the accumulated Principal by adding all of the values of Principal
        }
        // When loop has terminated, displays the total interest and total principal paid
        System.out.printf("The total interest paid is %.2f ", accumulatedInterest);
        System.out.printf("and the total principal paid is %.2f." ,accumulatedPrincipal);

        // pre-test loop for last payment
        while (!hasLastPayment && file.hasNext()) {
            if (file.hasNextDouble()) {
                lastPayment = file.nextDouble(); // extracts the value for the last Payments
                hasLastPayment = true;
                System.out.printf("\nThe last payment is %.2f. ", lastPayment); // displays the last payment amount
            }
            else {
                file.next();
            }
        }
        // if hasLastPayment is still false, displays an error message and exits
        if (!hasLastPayment){
            System.out.println("The Last Payment value is incorrect. Now exiting...");
            return;
        }
        // verifying the principal paid is correct
        System.out.printf("\nThe principal paid is %.2f.", principal-accumulatedPrincipal ); // displaying the principal paid

        // computes the total payments
        double totalPayments1 = accumulatedInterest + accumulatedPrincipal;
        double totalPayments2 = ((monthlyPayment)* (numberPayments-1)) + (lastPayment);
        double totalPayments = totalPayments1 - totalPayments2;

        System.out.printf("\nThe total payment is %.2f.", (totalPayments)); // displays the total payment
    }

}

