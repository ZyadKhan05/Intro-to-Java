//This program was completed by Zyad Khan for CIS-132-01 Lab #8 on 12/7/22
// The purpose of this program is to have the user input a compressed sentence, convert it to an uncompressed sentence, and display the result

import java.util.Scanner; // import the scanner method
public class Problem2 {
    public static void main(String[] args) {

        // Print out the purpose of the program to the user
        System.out.println("This program was completed by Zyad Khan for CIS-132-01 Lab #8 on 11");
        System.out.println("The purpose of this program is to have the user input a compressed sentence, convert it to an uncompressed sentence, and display the result.");


        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = true;


            // Declare string for the compressed sentence
            String compressedSentence;
            // Prompt user to enter in compressed sentence
            System.out.println("Enter in a compressed sentence consisting solely of alphabetic characters and six punctuation characters: !?.,;: ");

        if (isValid) {

        while (keyboard.hasNextLine()) {
            // Use scanner to read keyboard
            compressedSentence = keyboard.nextLine();

            // If any whitespace is found, display an error message and prompt for user input again
            if (compressedSentence.indexOf(" ") > 0) {
                System.out.println("The input entered contained whitespace. Please try again");
            }
            // Use the String method split to split the input line into an array of strings
            String[] splitSentence = compressedSentence.split("[!?.,;:]");
            // Check to make sure none of the strings in the array have a zero length
            for (String word : splitSentence) {
                if (word.length() == 0) {
                    System.out.println("Error, the input entered in had a character with Zero length .Please try again.");
                    isValid = false;
                    break;
                }
                if (word.matches("[a-zA-z]+") || word.matches("[!?.,;:]")) {
                    word = word;
                } else {
                    System.out.println("The input entered contained unacceptable character(s). Please try again");
                    isValid = false;
                    break;
                }

            }
            // Initialize boolean to create the flag to capitalize the first letter output for each member of the String array
            boolean startSentence = true;
            char c = ' ';
            // Initialize int size which is set to the length of the user's input string
            int size = compressedSentence.length();
            // Initialize int count to count how many characters of the input String have been output
            int count = 0;

            // For loop that sorts through the split sentence array
            for (int i = 0; i < splitSentence.length; i++) {
                // If it's not the first string in the array print out a space character
                if (i != 0) {
                    System.out.print(" ");
                }
                // Call expandWords method
                int returnValue = expandWords(splitSentence[i], startSentence);

                //Display if there is an error
                if (returnValue > -1) {
                    returnValue += count;
                    System.out.printf("\nInvalid character at position: " + returnValue);
                    isValid = false;
                    break;

                }
                else {
                    count += splitSentence[i].length();
                }

                // If count < size, then there are still characters to be process
                if (count < size) {
                    System.out.print(compressedSentence.charAt(count));
                    c = compressedSentence.charAt(count);
                    count++;
                }
                // Check if the punctuation is a starting character
                if (c == '.' || c == '?' || c == '!') {
                    startSentence = true;
                } else startSentence = false;

            }

        }
            // After the loop terminated, output a new line after processing all of input.
            System.out.println();
            System.out.println("Enter in a compressed sentence consisting solely of alphabetic characters and six punctuation characters: !?.,;: ");
            isValid = true;

        }
            // Displays when user exits program with ctrl D
            System.out.println("Exiting now... Goodbye");

        }



    // Initialize static class method expandWords
    private static int expandWords(String words, boolean startSentence) {
        for (int i = 0; i < words.length(); i++) {
            // Extract the char from the string using the string method charAt()
            char character = words.charAt(i);
            // Checks that this character is alphabetic
            if (!Character.isLetter(character)) {
                // If not it immediately exits the method by returning the index of this invalid character
                return i;

            }
            // If this is the first character, startSentence is true
            else if (i == 0 && startSentence) {
                // It converts this character to uppercase
                System.out.print(Character.toUpperCase(character));
            }
            else if (Character.isUpperCase(character)) {
                System.out.print(" " + Character.toLowerCase(character));
            }
            // Otherwise it converts to lowercase
            else {
                System.out.print(character);
            }
        }
        return -1;
    }

}