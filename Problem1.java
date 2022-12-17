// This program was written by Zyad Khan for CIS-132-01 Problem 1 of Lab 4 on 10/5/22
// The purpose of the program is to input and validate the user's state abbreviation and quantity of chocolate purchased using scanner tool. Then calls the function to display the receipt for the chocolate.

import java.util.Scanner; // import scanner tool
public class Problem1 {
    public static void main(String[] args) {
        // display the purpose of the program
        System.out.println("This program was written by Zyad Khan for CIS-132-01 Lab #4 on 10/3/22");
        System.out.println("This program will use the scanner method to input the user's state abbreviation and chocolate bars purchased, which is then validated. Then the program calls the function to display display a receipt for the user. ");

        // Created scanner tool and calling it keyboard
        Scanner keyboard = new Scanner(System.in);

        ChocolateSales sale1 = new ChocolateSales( "a", 0);
            System.out.println("What is your two character state abbreviation? "); // user inputs the base
            sale1.setStateAbbreviation(keyboard.next());
            System.out.println("How many chocolate bars did you purchase? "); // user inputs the height
            sale1.setQuantitySold(keyboard.nextInt());
            if (sale1.quantitySold < 0){
                System.out.printf("Invalid amount of Chocolate bars. Please try again.");
                System.exit(0);
            }
            // call in the printReceipt function from the ChocolateSales class
        sale1.printReceipt();
    }
}
