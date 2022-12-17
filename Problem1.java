//This program was completed by Zyad Khan for CIS-132-01 Lab #8 on 11/30/22
// The purpose of this program is to create an application that asks the user to enter a 10-character telephone number in the format XXX-XXX-XXXX.
// Then the application should convert the input into an all numeric number and display the user’s input and numeric number

import java.util.Scanner; // import the scanner method
public class Problem1 {
    public static void main(String[] args) {
        // Print out the purpose of the program to the user
        System.out.println("This program was completed by Zyad Khan for CIS-132-01 Lab #8 on 11/30/22");
        System.out.println("The purpose of this program is to is to create an application that asks the user to enter a 10-character telephone number in the format XXX-XXX-XXXX. ");
        System.out.println("Then the application should convert the input into an all numeric number and display the user’s input and numeric number.");

        // Declare string for the phone number
        String telephoneNumber;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Create a boolean set to true
        boolean run = true;

        while (run) {
            boolean isValid;
            // Prompt the user to enter a number in the form of XXX-XXX-XXXX
            System.out.println("Enter in a 12-character phone number in the format XXX-XXX-XXXX: ");
            // Use scanner to read keyboard
            if (keyboard.hasNextLine()) {
                telephoneNumber = keyboard.nextLine();
                isValid = true;
            } else {
                System.out.println("Exiting now... Goodbye");
                run = false;
                return;
            }

            // Validate the user's input is a 12 character String
            if (telephoneNumber.length() == 12) {
                telephoneNumber = telephoneNumber;
            }
            else if (telephoneNumber.length() > 12) {
                System.out.println("The input was too long. Please try again");
                isValid = false;
            } else {
                System.out.println("The input was not long enough. Please try again");
                isValid = false;
            }

            // Convert the string into a char array
            char[] charArray = telephoneNumber.toCharArray();



            if (isValid) {
                // Write a for loop to check that each character in the array corresponds to the format XXX-XXX-XXXX where X is either a digit or alphabetic character
                for (int i = 0; i < charArray.length; i++) {
                    // If the number does not have the dashes in the proper location, prompt for number
                    if (charArray[3] != '-' || charArray[7] != '-') {
                        System.out.println("The input had formatting error involving the dashes. Please try again");
                        isValid = false;
                        break;
                    }
                    else {
                        // If the character is alphabetic
                        if (Character.isAlphabetic(charArray[i]) && Character.isLetter(charArray[i])) {
                            if ((charArray[i] >= 'a' && charArray[i] <= 'z')) {
                                charArray[i] = Character.toUpperCase(charArray[i]);
                            }
                            if (charArray[i] >= 'W') {
                                charArray[i] = '9';
                            } else if (charArray[i] >= 'T') {
                                charArray[i] = '8';
                            } else if (charArray[i] >= 'P') {
                                charArray[i] = '7';
                            } else if (charArray[i] >= 'M') {
                                charArray[i] = '6';
                            } else if (charArray[i] >= 'J') {
                                charArray[i] = '5';
                            } else if (charArray[i] >= 'G') {
                                charArray[i] = '4';
                            } else if (charArray[i] >= 'D') {
                                charArray[i] = '3';
                            } else {
                                charArray[i] = '2';
                            }
                        }


                        // Check if the character is a digit
                        else if (Character.isDigit(charArray[i])) {
                            charArray[i] = charArray[i];
                        }
                        // Check if the character is a dash in the correct placement
                        else if (i == 3 || i == 7 && charArray[i] == '-'){
                             charArray[i] = charArray[i];
                        }
                        // Else give error
                        else{
                            System.out.println("The input had invalid characters. Please try again");
                            isValid = false;
                            break;
                        }
                    }
                }
                if (isValid) {
                    // Display the user's input and numeric number
                    System.out.println(telephoneNumber + " is " + new String(charArray));
                }
            }

        }
    }
}