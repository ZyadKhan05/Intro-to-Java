// This program was written by Zyad Khan for CIS-132-01 Problem 4 of Lab 1 on 8/31/22
// This program will display the volume of a sphere when the radius is defined.
// radius = 1.23 cm

public class Problem4 {
    public static void main(String[] args) {
        System.out.print("This program will calculate the volume of a sphere if the radius of the sphere is 1.23 cm.\n");
        double radius, pi, volume;
            radius = 1.23;
            pi = Math.PI;
            volume = (4.0/3.0) * pi * Math.pow(radius, 3);

        System.out.print("If the radius of a sphere is: " + radius + " cm, then the volume of the sphere: " + volume + " cm.");

    }
}

