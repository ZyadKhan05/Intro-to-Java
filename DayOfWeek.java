// This class was completed by Zyad Khan for CIS-132-01 Lab #7 on 11/14/22

// Import the scanner method
import java.util.Scanner;
// Create Java class called DayOfWeek
public class DayOfWeek {
    // Declare private static int array called daysInMonth using an initializer list
    private static int[] daysInMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    // Declare private static string array call daysOfWeek initialized with the days of the week with "Sunday" being index 0
    public static String[] daysOfWeek =
            {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                    "Friday", "Saturday", "Sunday"};

    // Initialize daysBeforeMonth array, will be initialized in the constructor
    public int[] daysBeforeMonth;

    // Constructor to create daysBeforeMonth as an array of 13 integers
    public DayOfWeek() {
        daysBeforeMonth = new int[13];
        for (int i = 2; i <= 12; i++) {
            daysBeforeMonth[i] = daysBeforeMonth[i - 1] + daysInMonth[i - 1];
        }
    }


    // Public method getDayOfWeek where date is the user's keyboard input
    public String getDayOfWeek(String date) {
        // Use scanner to split the input into 3 tokens separated by white space
        Scanner dateScanner = new Scanner(date);
        dateScanner.useDelimiter("/");
        // Initialize boolean hasDate to be equal to false
        boolean hasDate = false;

        // initialize date variables
        int month = 0;
        int day = 0;
        int year = 0;
        // Initialize boolean isLeapYear initially to false
        boolean isLeapYear = false;


        // get value from input scanner in Problem1 program and input into 3 date variables
        if (dateScanner.hasNextInt()) {
            month = dateScanner.nextInt();
        }
        if (dateScanner.hasNextInt()) {
            day = dateScanner.nextInt();
        }
        if (dateScanner.hasNextInt()) {
            year = dateScanner.nextInt();
            // if there are no additional values for the date variables, set hasDate to true
            if (!dateScanner.hasNext()) {
                hasDate = true;
            }
        }
        // if hasDate is not valid, return an error message
        if (!hasDate) {
            return "Error. The input was invalid";
        }
        // validate the month
        if (month < 1 || month > 12) {
            return "The value entered in for the variable month is invalid";
        }
        // validate the year
        if (year < 0) {
            // If the year value is invalid, display a string that is an error message to say the input was invalid.
            return "The value entered in for the variable year is invalid.";
        } else if (year < 100) {
            year += 2000;
        }
        // If the year value is invalid, display a string that is an error message to say the input was invalid.
        if (year < 1901 || year > 2099) {
            return "The year is invalid. Please input the year from 1901 to 2099";
        }
        // leap year test runs if year is valid
        isLeapYear = year % 4 == 0;

        // validate the day according to the number of days per month
        boolean isDayValid = day > 0 && day <= daysInMonth[month];
        // If the day is 2/29 and is a leap year, the boolean isDayValid is set to true as it will be considered a leap year day
        if (day == 29 && isLeapYear && month == 2) {
            isDayValid = true;
        }
        // If the day value is invalid, display a string that is an error message to say the input was invalid.
        if (!isDayValid) {
            return "The day is invalid. Please enter in a valid day";
        }
        // Compute the "year number" as the year - 1889
        int yearNumber = year - 1889;
        // Divide the result of year number by 4
        yearNumber += yearNumber / 4;

        // Computer "day number" by adding the appropriate value from daysBeforeMonth array and the input day
        int dayNumber = day + daysBeforeMonth[month];
        // If the input is a leap year and the month is greater than 2, increment the day number to account for 2/29
        if (isLeapYear && month > 2) {
            dayNumber += 1;
        }

        // The index that will be used in the daysOfWeek array found by adding "year number"  to the "day number"
        int index = yearNumber + dayNumber;
        // Find the remainder after division by 7.
        index = index % 7;

        // use String.format to format the date and day of week as specified at the start.
        String output = String.format("%s is a %s",date,daysOfWeek[index]);
        // Return this String
        return output;
    }
}