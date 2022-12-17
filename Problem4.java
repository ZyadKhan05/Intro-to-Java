// This program was written by Zyad Khan for CIS-132-01 Problem 4 of Lab 2 on 9/14/22
// This program will ask the user for an integer for the distance in meters and then the time in seconds in order to display the meters/second and then calculate the miles/hour

import java.util.Scanner; // imports the Scanner class
public class Problem4 {
    public static void main(String[] args) {
        System.out.println("This program was written by Zyad Khan for CIS-132-01 Lab #2 on 9/14/22");
        System.out.println("This program will input the user for a distance in meters and the time in seconds, and then display the rate in both meters/second and miles per hour ");

        int meters;
        double seconds, mps, mph;
        final double conversion_rate;


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter in the distance in meters:  ");
        meters = keyboard.nextInt();

        System.out.println("Please enter in the time in seconds: ");
        seconds = keyboard.nextDouble();

        conversion_rate = ((1 / 0.3048) / 5280) / (1.0/ 3600.0);

        mps = meters/seconds ; // speed in meters per second
        mph = mps * conversion_rate ; // speed in miles per hour

        System.out.printf("The distance in meters is " + meters + "\n");
        System.out.printf("The time is %.2f seconds \n" , seconds);
        System.out.printf("The speed in meters per second is %.1f meters per second \n", mps);
        System.out.printf("The conversion rate of is 1 m/s = %.4f mph\n", conversion_rate) ;
        System.out.printf("The speed in miles per hour is %.1f miles per hour \n", mph);

    }
}
