// This class was started by Richard Gibbs for CIS-132 Lab #5 on 10/17/22
// This class was completed by Zyad Khan for CIS-132 Lab #5 on 10/17/22
// This class is used to get a number from keyboard input
// The input number can be an integer or a decimal
// The input can optionally be restricted to minimum and/or maximum values
// The various methods do not return until a user has entered a valid number or closed keyboard input with ctrl+D

import java.util.Scanner;

public class GetNumberFromKeyboard {
    // Because an int can be stored in a double without loss of precision, values are stored in doubles
    // The values are the value entered by user and the limits on the user input

    // boolean flags and values for upper and lower limits
    private boolean hasUpperLimit;
    private boolean hasLowerLimit;
    private double upperLimit;
    private double lowerLimit;

    // result flag and entered value
    // flag set true if user entered valid value
    // flag set false if user cancelled input via ctrl+D
    private boolean hasValue;
    private double value;

    // flag set when integer input requested, clear for a double input
    private boolean getIntMode;

    // reference to Scanner instance
    private Scanner keyboard;

    // Main processing routine
    // returns value of flag hasValue
    private boolean getValue() {
        //set hasValue to false
        hasValue = false;
        //pretest loop
        while (keyboard.hasNext()) {
            if (getIntMode) {
                if (keyboard.hasNextInt()) {
                    value = keyboard.nextInt();
                    hasValue = true;
                }
                else {
                //if invalid input, display an error message
                    System.out.println("Error. Inputted variable was not a valid integer. Try Again");
                }
            }
            else {
                if (keyboard.hasNextDouble()) {
                    value = keyboard.nextDouble();
                    hasValue = true;
                }
                else {
                //if invalid input, display an error message
                    System.out.println("Error. Inputted variable was not a valid number. Try Again ");
                }
            }

            if (hasValue){
                if (hasUpperLimit) {
                    //if the value is greater than the upper limit
                    if (value > upperLimit) {
                    //if input is invalid, display an error message
                        System.out.println("Error. Inputted variable was not a valid number. Try again.");
                        hasValue = false;
           }
                }
            }
            if (hasValue) {
                if (hasLowerLimit) {
                    //if value is lower than the lower limit
                    if (value < lowerLimit) {
                    //if input is invalid, display an error message
                        System.out.println("Error. Inputted variable was not a valid number. Try again.");
                    hasValue = false;
                    }
                }
            }
            //Flush out the remaining user input
            keyboard.nextLine();
            //If value meets the upper and lower limit requirement, exit loop
            if (hasValue) {
                break;
            }
            System.out.println("Please try again");
        }


        return hasValue;
    } // end of getValue()


    // no-arg constructor creates the Scanner for the keyboard
    public GetNumberFromKeyboard()
    {
        keyboard = new Scanner(System.in);
    }


    // public methods to get an input from user
    // there are 8 methods
    // 4 to get an integer getIntegerXXX
    // 4 to get a double getNumberXXX
    // where XXX is
    // InRange - specify a range of values, i.e. upper limit >= return number >= lower limit (limit order doesn't matter)
    // LowerLimit - specify lower limit on returned value, i.e. return number >= lower limit
    // UpperLimit - specify upper limit on returned value, i.e. return number <= upper limit
    // blank - no restriction on number
    public boolean getIntegerInRange(int limit1, int limit2)
    {
        hasLowerLimit = hasUpperLimit = true;
        if (limit1 < limit2)
        {
            lowerLimit = limit1;
            upperLimit = limit2;
        }
        else {
            lowerLimit = limit2;
            upperLimit = limit1;
        }
        hasLowerLimit = hasUpperLimit = getIntMode = true;

        return getValue();
    }

    public boolean getIntegerLowerLimit(int limit)
    {
        lowerLimit = limit;
        hasLowerLimit = getIntMode = true;
        hasUpperLimit = false;

        return getValue();
    }

    public boolean getIntegerUpperLimit(int limit)
    {
        upperLimit = limit;
        hasUpperLimit = getIntMode = true;
        hasLowerLimit = false;

        return getValue();
    }

    public boolean getInteger()
    {
        getIntMode = true;
        hasUpperLimit = hasLowerLimit = false;

        return getValue();
    }

    public boolean getNumberInRange(double limit1, double limit2)
    {
        hasLowerLimit = hasUpperLimit = true;
        if (limit1 < limit2)
        {
            lowerLimit = limit1;
            upperLimit = limit2;
        }
        else {
            lowerLimit = limit2;
            upperLimit = limit1;
        }
        hasLowerLimit = hasUpperLimit = true;
        getIntMode = false;

        return getValue();
    }

    public boolean getNumberLowerLimit(double limit)
    {
        lowerLimit = limit;
        hasLowerLimit = true;
        getIntMode = hasUpperLimit = false;

        return getValue();
    }

    public boolean getNumberUpperLimit(double limit)
    {
        upperLimit = limit;
        hasUpperLimit = true;
        getIntMode = hasLowerLimit = false;

        return getValue();
    }

    public boolean getNumber()
    {

        getIntMode = hasUpperLimit = hasLowerLimit = false;

        return getValue();
    }

    // 3 methods to test whether instance has a value and whether it's integer or double
    public boolean hasValue() { return hasValue; }
    public boolean hasIntValue() { return hasValue && getIntMode; }
    public boolean hasDoubleValue() { return hasValue && !getIntMode; }

    // methods to get returned value as int or double
    public int getIntValue() { return (int)value; }
    public double getDoubleValue() { return value; }
}