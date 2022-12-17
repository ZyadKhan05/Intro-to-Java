// This program was written by Zyad Khan for CIS-132-01 Problem 3 of Lab 1 on 8/31/22
// This program will display the Area of a rectangle using the following variables
// length= 3.14
// width= 8

public class Problem3 {
    public static void main(String[] args)
    {
        System.out.print("This program will display values for the dimensions of a rectangle and then calculate its area.\n");
        int width;
            width = 8;

        double length, area;
            length = 3.14;
            area = length * width;

        System.out.print("The length of a rectangle is " + length + " meters and the width is " + width + " meters. The area of the rectangle is " + area + " meters.");

    }
}
