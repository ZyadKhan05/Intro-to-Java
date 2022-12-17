// This program was written by Zyad Khan for CIS-132-01 Problem 1 of Lab 2 on 9/12/22
// This program will ask the user for mailing information and display the information in a specific mailing label format

import java.util.Scanner; // imports the Scanner class
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("This program was written by Zyad Khan for CIS-132-01 Lab #2 on 9/14/22");
        System.out.println("This program will ask the user for mailing information and display the information in the mailing label format");

        String fname;    //String to contain the first name
        String lname;    //String to contain the last name
        String address;  //String to contain address
        String city;     //String to hold the city
        String state;    //String to hold state
        String zip;         // Zip code

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter in your First Name:  ");
        fname = keyboard.nextLine();

        System.out.println("Enter in your Last Name:  ");
        lname = keyboard.nextLine();

        System.out.println("Enter in your Address:  ");
        address = keyboard.nextLine();

        System.out.println("Enter in your city:  ");
        city = keyboard.nextLine();

        System.out.println("Enter in your State:  ");
        state = keyboard.nextLine();

        System.out.println("Enter in your Zip Code:  ");
        zip = keyboard.nextLine();


        //Display the Mailing Label
        System.out.printf("%S", fname + " " + lname + "\n" ) ;
        System.out.printf("%S", address + "\n" ) ;
        System.out.printf("%S", city + ", " + state + "\t" + zip ) ;

    }
}
