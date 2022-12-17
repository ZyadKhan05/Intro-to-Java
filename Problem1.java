// This program was written by Richard Gibbs for CIS-132-01 Lab #5 on 10/17/22.
// This program was completed by Zyad Khan for CIS-132-01 Lab #5 on 10/24/22
// The purpose of this program is to test the class GetNumberFromKeyboard

public class Problem1 {
    public static void main(String[] args) {

        // Display purpose of program
        System.out.println("This program tests the class GetNumberFromKeyboard.");
        System.out.println("It call all 8 methods of GetNumberFromKeyboard that can get a value");

        // Create instance of GetNumberFromKeyboard
        GetNumberFromKeyboard getNum = new GetNumberFromKeyboard();

        // Prompt user to enter any number
        //
        System.out.println("\nInput any number");
        if (!getNum.getNumber())
        {
            System.out.println("User cancelled input");
            return;
        }
        System.out.println("Got "+ getNum.getDoubleValue());

        // Prompt user to enter any integer
        System.out.println("\nInput any integer");
        if (!getNum.getInteger())
        {
            System.out.println("User cancelled input");
            return;
        }
        System.out.println("Got "+ getNum.getIntValue());

        // Prompt user to enter any number in range 0 to 100
        System.out.println("\nInput number in range 0 to 100");
        if (!getNum.getNumberInRange(0,100))
        {
            System.out.println("User cancelled input");
            return;
        }
        System.out.println("Got "+ getNum.getDoubleValue());

        // Prompt user to enter any integer in range 0 to 100
        System.out.println("\nInput integer in range 0 to 100");
        if (!getNum.getIntegerInRange(0,100))
        {
            System.out.println("User cancelled input");
            return;
        }
        System.out.println("Got "+ getNum.getIntValue());

        // Prompt user to enter any number >= 50
        System.out.println("\nInput number >= 50");
        if (!getNum.getNumberLowerLimit(50))
        {
            System.out.println("User cancelled input");
            return;
        }
        System.out.println("Got "+ getNum.getDoubleValue());

        // Prompt user to enter any integer >= 50
        System.out.println("\nInput integer >= 50");
        if (!getNum.getIntegerLowerLimit(50))
        {
            System.out.println("User cancelled input");
            return;
        }
        System.out.println("Got "+ getNum.getIntValue());

        // Prompt user to enter any number <= 20
        System.out.println("\nInput number <= 20");
        if (!getNum.getNumberUpperLimit(20))
        {
            System.out.println("User cancelled input");
            return;
        }
        System.out.println("Got "+ getNum.getDoubleValue());

        // Prompt user to enter any integer <= 20
        System.out.println("\nInput integer <= 20");
        if (!getNum.getIntegerUpperLimit(20))
        {
            System.out.println("User cancelled input");
            return;
        }
        System.out.println("Got "+ getNum.getIntValue());
    }
}
