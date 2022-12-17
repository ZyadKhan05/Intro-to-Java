// This program was written by Zyad Khan for CIS-132-01 Problem 2 of Lab 4 on 10/10/22
// The purpose of the program is to input the user via the JOptionPane method for a test score.
// Then it validates the inputted score by using a if statement.
// The program then uses a boolean to test the remainder of the score by dividing by 10, and sets true for scores ending in 7,8,9
// Then it uses a switch statement to test the different cases for the test score by dividing by 10, and setting the single letter grade
// Then there is a conditional operator to test needsPlus and adds the proper sign to the grade letter string, which is then displayed along with the score that was entered.

import javax.swing.JOptionPane; // import JOptionPane
public class Problem2 {
    public static void main(String[] args) {
        // display the purpose of the program
        System.out.println("This program was written by Zyad Khan for CIS-132-01 Lab #4 on 10/3/22");
        System.out.println("This program will use JOptionPane to input the user for the score of a test. The program then calculates the test grade of the score. The test score will have a sign of either + or nothing, which is done by using a conditional operator to test a boolean needsPlus. Then the score that is inputted along with the letter grade for that score is displayed to the user.");

        String gradeLetter; // Define string gradeLetter
        boolean needsPlus; // Define boolean needsPlus

        // input use for the test score using JOptionPane
        int testScore = Integer.parseInt(JOptionPane.showInputDialog("What was the score of your test? "));

        // if statement to validate that the score is in the required range. If not, then display error and return
        if (testScore >= 0 && testScore <= 100){

        }
        else {
            System.out.printf("Error - Invalid test score. Please try again. ");
            return;
        }

        needsPlus = testScore%10 >= 7 ; // set the boolean tests the remainder by dividing the score by ten ending in 7,8,9

        // switch statement to set the value of a string to the single character that is the grade letter.
        // Because A and F never have a +, needsPlus is set to false.
        switch (testScore/10){
            case 10:
            case 9:
                needsPlus = false;
                gradeLetter = "A";
               break;
            case 8:
                gradeLetter = "B" ;
                break;
            case 7:
                gradeLetter = "C" ;
                break;
            case 6:
                gradeLetter = "D";
                break;
            default:
                needsPlus = false;
                gradeLetter = "F";
                break;
        }
        // uses a conditional operator to test needsPlus and adds either a + or an empty string to the grade letter.
        String testGrade = gradeLetter +  (needsPlus ? "+" : "")  ; //tests needsPlus and adds the proper sign to the grade letter

        //Displays the inputted score and the corresponding letter grade
        System.out.printf("The score of your test was %d%% which means your grade for this test is a %s." , testScore, testGrade);

    }

}