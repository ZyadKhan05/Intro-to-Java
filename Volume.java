// This class was completed by Zyad Khan for CIS-132-01 Lab #6 on 10/31/22

public class Volume {

        // get the volume for the Sphere
        public static double getVolume (double radius){
            return (4.0/3.0)* Math.PI * Math.pow(radius,3);
        }
        // get the volume for the Cylinder
        public static double getVolume (double radius, double height){
            return Math.PI * Math.pow(radius,2) * height;
        }
        // get the volume for the Rectangular Prism
        public static double getVolume (double length, double width, double height){
            return length * width * height;
        }


}


