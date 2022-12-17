// This program was completed by Zyad Khan for CIS-132-01 Lab #6 on 10/31/22
// The purpose of this program is to utilize overloaded methods along with the Volume class in order to calculate:
// 1) The volume of a sphere
// 2) The volume of a Rectangular Prism
// 3) The volume of a Cylinder
// by using a menu system

import java.util.Scanner; // import the scanner method
public class Problem1 {
    public static Scanner keyboard = new Scanner(System.in); // create the scanner method as a public static, which can be used globally

    public static void main(String[] args) {

        // Display Purpose
        System.out.println("The purpose of this program is to utilize overloaded methods along with the Volume class in order to calculate: " +
                "1) The volume of a sphere, 2) The volume of a Rectangular Prism, or 3) The volume of a Cylinder by using a menu system. ");


        // initialize variables
        double radius;
        double length;
        double width;
        double height;
        int menuChoice = 0;
        boolean stayInMainLoop = false;

        // Post test loop
        do {
            // Menu
            System.out.println("\nPlease select a menu option from 1-4.");
            System.out.println("1. Calculate the volume of a Sphere");
            System.out.println("2. Calculate the volume of a Rectangular Prism");
            System.out.println("3. Calculate the volume of a Cylinder");
            System.out.println("4. Quit\n");
            System.out.print("Enter your choice (1-4) : ");

            // Check to see if the user inputted a valid menu option input
            menuChoice = 0;
            while (keyboard.hasNext()){
                if (keyboard.hasNextInt()) {
                    menuChoice = keyboard.nextInt();
                }
                keyboard.nextLine();
                if(menuChoice >= 1 && menuChoice <= 4){
                    break;
                }
                System.out.println("Input Invalid. Please try again...");
            }

            stayInMainLoop = false;
            // Switch statement
            switch (menuChoice) {
                case 1:
                    System.out.println("Enter in the radius of your Sphere:");
                    radius = getPositiveDouble();
                    if (radius > 0) {
                        double volume = Volume.getVolume(radius);
                        System.out.printf("The volume of the Sphere is %.4f\n", volume);
                        stayInMainLoop = true;
                    }
                    break;
                case 2:
                    System.out.println("Enter in the length of your Rectangular Prism: ");
                    length = getPositiveDouble();
                    if (length > 0) {
                        System.out.println("Enter in the width of your Rectangular Prism: ");
                        width = getPositiveDouble();
                        if (width > 0) {
                            System.out.println("Enter in the height of your Rectangular Prism: ");
                            height = getPositiveDouble();
                            if (height > 0) {
                                double volume = Volume.getVolume(length, width, height);
                                System.out.printf("The volume of the Rectangular Prism is %.4f. \n", volume);
                                stayInMainLoop = true;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter in the radius of your Cylinder: ");
                    radius = getPositiveDouble();
                    if (radius > 0) {
                        System.out.println("Enter in the height of your Cylinder: ");
                        height = getPositiveDouble();
                        if (height > 0) {
                            double volume = Volume.getVolume(radius, height);
                            System.out.printf("The volume of the Cylinder is %.4f\n", volume);
                            stayInMainLoop = true;
                        }
                    }
                    break;
            }
            } while (stayInMainLoop);
        System.out.println("Exiting now... Goodbye");
    }
    // Method to test if the user inputted a positive and real double for the formulas
    private static double getPositiveDouble(){
        double value = 0;
        while (keyboard.hasNext()){
            if (keyboard.hasNextDouble()) {
                value = keyboard.nextDouble();
                if (value > 0) {
                    keyboard.nextLine();
                    return value;
                }
                else {
                    System.out.println("Error. Please Try Again...");
                }
            }
            else {
                System.out.println("Error. Please Try Again...");
                keyboard.next();
                }
        }
        return 0;
   }
}
















