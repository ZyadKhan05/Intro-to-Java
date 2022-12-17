// This program was written by Zyad Khan for CIS-132-01 Problem 2 of Lab 2 on 9/12/22
// The purpose of this program is to use scanner to ask the user for the radius and height of a cylinder and then calculate the volume of that cylinder

import java.util.Scanner; // imports the Scanner class
public class Problem2 {
    public static void main(String[] args) {
        System.out.println("This program was written by Zyad Khan for CIS-132-01 Lab #2 on 9/14/22");
        System.out.println("This program will ask the user for the radius and height of a cylinder and then calculate the volume of that cylinder");

        double radius ;
        double height;
        double volume;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the radius of your cylinder in meters:  ");
        radius = keyboard.nextDouble();

        System.out.println("What is the height of your cylinder in meters:  ");
        height = keyboard.nextDouble();

        volume = Math.PI * Math.pow(radius,2) * height ;

        //System.out.printf("The volume of the cylinder that has a radius of " + radius + " meters and a height of " + height + " meters is "+ "%.2f\n", volume);
    System.out.printf("When the radius of a cylinder is %.2f meter(s) and the height is %.2f meter(s), then the volume of the cylinder would be %.2f meters cubed.",
            radius, height, volume);
    }
}
