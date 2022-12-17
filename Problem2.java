// This program was completed by Zyad Khan for CIS-132-01 Lab #6 on 11/9/22
// The purpose of this program is to use the two classes in Household.java in order to display two instances of the Household class

public class Problem2 {
    public static void main(String[] args) {
        // Display purpose to console
        System.out.println("The purpose of this program is to use the two classes in Household.java in order to display two instances of the Household class.  ");

        // Initiate the sampleData instance for the Household class
        Household sampleData = new Household("Gibbs", "1601 Washington Road", "Westminster", "Maryland", 21157 );
        //Initiate the sampleCopy instance for the Household class
        Household sampleCopy = new Household("Gibbs", "1601 Washington Road", "Westminster", "Maryland", 21157 );

        // call setPet method to set the pet variables
        sampleData.setPet("Rosie", Household.PetType.DOG, Household.PetColor.YELLOW );
        sampleCopy.setPet("Teddy", Household.PetType.DOG, Household.PetColor.BLACK);

        // Calls the toString method for the sampleData instance
        sampleData.toString();
        // Calls the toString method for the sampleCopy instance
        sampleCopy.toString();

        // Print out the sampleData instance
        System.out.println(sampleData);
        // Print out the sampleCopy instance
        System.out.println(sampleCopy);


    }
}
