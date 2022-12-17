// This program was written by Zyad Khan for CIS-132-01 Problem 1 of Lab 3 on 9/19/22
// The purpose of the program is to use constructors and mutators to display the information of the three repair jobs: Name, Date, Mechanic, and Cost, using the accessor methods


public class Problem1 {
    public static void main(String[] args) {
        // display the purpose of the program
        System.out.println("This program was written by Zyad Khan for CIS-132-01 Lab #3 on 9/19/22");
        System.out.println("This program will use constructors and mutators to display the information of the three repair jobs: Name, Date, Mechanic, and Cost," +
                "then the program will print the information using the accessor methods");

        // Set the variables for Repair1 using the empty constructor and setters method
        Repair repair1 = new Repair();
                repair1.setRepairName("Oil Change");
                repair1.setRepairDate("9/21/22");
                repair1.setMechanicName("Rob");
                repair1.setRepairCost(39.95);

        // set the variables for Repair2 using the constructor with the attributes
        Repair repair2 = new Repair("Rotate Tires", "9/21/22", "Matt", 59.95);

        // set the variables for Repair3 using the constructor with the attributes
        Repair repair3 = new Repair("Wheel Alignment", "9/21/22", "Rose", 79.95);

        // Display the information for all three repairs using getters
        System.out.println("\nRepair #1 Name: " + repair1.getRepairName() + "\nRepair #1 Date: " + repair1.getRepairDate() + "\nRepair #1 Mechanic: " + repair1.getMechanicName() + "\nRepair #1 Cost: $" + repair1.getRepairCost() );
        System.out.println("\nRepair #2 Name: " + repair2.getRepairName() + "\nRepair #2 Date: " + repair2.getRepairDate() + "\nRepair #2 Mechanic: " + repair2.getMechanicName() + "\nRepair #2 Cost: $" + repair2.getRepairCost() );
        System.out.println("\nRepair #3 Name: " + repair3.getRepairName() + "\nRepair #3 Date: " + repair3.getRepairDate() + "\nRepair #3 Mechanic: " + repair3.getMechanicName() + "\nRepair #3 Cost: $" + repair3.getRepairCost() );
    }
}