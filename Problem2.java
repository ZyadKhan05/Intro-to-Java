// This program was written by Zyad Khan for CIS-132-01 Problem 2 of Lab 3 on 9/19/22
// The purpose of this program is to use the scanner method to input the user for base and height of a triangle. It will then return the height (inputted), base (inputted), and area of the triangle.

import java.util.Scanner; // import the scanner class
public class Problem2 {
    public static void main(String[] args) {
        // Display the author and purpose of the program
        System.out.println("This program was written by Zyad Khan for CIS-132-01 Lab #3 on 9/19/22");
        System.out.println("This program will ask the user to input the base and height of a triangle using the scanner class. It will then display the area along with the user inputted base and height. ");
        // Created scanner tool and calling it keyboard
        Scanner keyboard = new Scanner(System.in);

        Triangle triangle1 = new Triangle(0,0);
            System.out.println("What is the base of your triangle? "); // user inputs the base
                triangle1.setBase(keyboard.nextDouble());
            System.out.println("What is the height of your triangle? "); // user inputs the height
                triangle1.setHeight(keyboard.nextDouble());

        // Displaying the inputted variables (base and height) and the calculated area of a triangle using the getters method
        System.out.println("\nThe base of the triangle is " + triangle1.getBase()+ " and the height of the triangle is " + triangle1.getHeight());
        System.out.println("\nThe area of the triangle is " + triangle1.calcArea());
    }
}