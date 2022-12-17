// This program was completed by Zyad Khan for CIS-132-01 Lab #7 on 11/14/22
// The purpose of this program is to prompt the user for a date in mm/dd/yyyy format. The program will compute the corresponding day of the week and display the date and day back to the user.

import java.util.Scanner; // import the scanner method
public class Problem1 {
    public static void main(String[] args) {
        // Print out the purpose of the program to the user
        System.out.println("This program was completed by Zyad Khan for CIS-132-01 Lab #7 on 11/14/22");
        System.out.println("The purpose of this program is to prompt the user for a date in mm/dd/yyyy format. The program will compute the corresponding day of the week and display the date and day back to the user." );

        // Instantiate DayOfWeek class
        DayOfWeek week = new DayOfWeek();

        // Instantiate Scanner to read keyboard
        Scanner keyboard = new Scanner(System.in);

        // Create main loop
        while (true){
            // Display prompt
            System.out.println("Please enter in a date in mm/dd/yyyy format: ");
            // Test for user input and break out of loop if none
            if (!keyboard.hasNextLine()){
                break;
            }
            else{
                // variable date is the user inputted value
                String date = keyboard.nextLine();
                // Get user input line with getDayOfWeek method
                // Return formatted string
                System.out.println(week.getDayOfWeek(date));
            }

        }
        // Display exit statement
        System.out.println("Exiting now... Goodbye");
    }
}