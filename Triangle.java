// This program was written by Zyad Khan for CIS-132-01 Problem 2 of Lab 3 on 9/19/22
// The purpose of this class is to set the constructor to the 2 instance variables. Then the class will use setters methods and getters methods to set the variable and allow it to be called in the Problem2 program.
// The class also sets the calcArea class which uses the user inputted base and height of the triangle to calculate the area of the triangle. .

public class Triangle extends Problem2{

    private double base;
    private double height;


    public Triangle(double initBase, double initHeight){
        base = initBase;
        height = initHeight;
    }

    //setters
    public void setBase(Double initBase){
        base = initBase;
    }
    public void setHeight(Double initHeight){
        height = initHeight ;
    }


    //getters
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    // Calc Area Method
    public double calcArea(){
        return (0.5) * base * height;
    }

}
