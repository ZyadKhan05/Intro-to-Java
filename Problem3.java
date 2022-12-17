// This program was written by Zyad Khan for CIS-132-01 Problem 3 of Lab 2 on 9/12/22
// The purpose of the program will use input dialog boxes to input the user for the radius and height of a cone and calculate the volume.

import javax.swing.JOptionPane;
public class Problem3 {
        public static void main(String[] args) {
            System.out.println("This program was written by Zyad Khan for CIS-132-01 Lab #2 on 9/14/22");
            System.out.println("This program will use input dialog boxes to input the user for the radius and height of a cone and calculate the volume of the cone. ");

            String rad, h;
            double radius, height, volume;


            rad = JOptionPane.showInputDialog("What is the radius of the cone in meters? ");
            radius = Double.parseDouble(rad);

            h = JOptionPane.showInputDialog("What is the height  of the cone in meters? ");
            height = Double.parseDouble(h);

            volume = (Math.PI *  Math.pow(radius, 2) * height)/(3.0) ;

            System.out.printf("When the radius of a cone is %.2f meter(s) and the height of the same cone is %.2f meter(s), then the volume of this cone would be %.2f meters cubed.",
                    radius, height, volume);


        }
}
