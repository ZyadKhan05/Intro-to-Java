// This program was completed by Zyad Khan for CIS-132-01 Lab #6 on 11/9/22
// The purpose of this class is to use a inner class and copy constructors for the classes in order to
// set the toString method that will display the results.

// Household class
public class Household {
    // Initialize variables
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;
    // Initialize the Pet class frominner pet class
    private Pet pet;

    // Enum class for PetType
    public enum PetType {
        NONE, DOG, CAT, BIRD, RABBIT, HAMSTER, FISH, LYNX
    }
    // Enum class for PetColor
    public enum PetColor {
        NONE, BLACK, WHITE, BROWN, RED, ORANGE, GOLD, BLUE, GREEN, YELLOW
    }

    // Getters
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public int getZip(){
        return zip;
    }

    // Setters
    public void setName(String n){
        name  = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setCity(String c){
        city = c;
    }
    public void setState(String s) {
        state = s;
    }
    public void setZip(int z){
        zip = z;
    }

    // setPet class
    public void setPet(String name, PetType type, PetColor color){
        pet = new Pet(name, type, color);
    }

    // removePet method
    public void removePet(String name, PetType type, PetColor color){
       pet = new Pet(null, null,null);
   }

    // No-arg Constructor
    public Household(){

    }
    // Constructor with the first five fields
    public Household(String n, String a, String c, String s, int z){
        name = n;
        address = a;
        city = c;
        state = s;
        zip = z;
    }
    // Copy constructor
    public Household(Household household2){
        name = household2.name;
        address = household2.address;
        city = household2.city;
        state = household2.state;
        zip = household2.zip;

    }


    // Household class toString method
    public String toString() {
        String str;
        if (!hasPet()) {
            str = String.format("Name: %s \n"+
                                "Address: %s \n" +
                                "City: %s \n"  +
                                "State: %s \n" +
                                "Zip: %d \n"+
                                "Pet: none\n" +
                                "Pet Color: none\n" +
                                "Pet Name: none\n",
                                name, address, city,state, zip);

            return str;
        }
        else{
            str = String.format("Name: %s \n"+
                                "Address: %s \n" +
                                "City: %s \n"  +
                                "State: %s \n" +
                                "Zip: %d \n" +
                                "%s",
                                name, address, city,state, zip, pet.toString());
            return str; // return the string
        }
    }

    // hasPet method
    public boolean hasPet(){
        return pet != null;
    }


    // Inner Pet Class
    private class Pet {
        // Initialize variables
        private String name;
        // Initialize enum variable
        private PetType type;
        // Initialize enum variable
        private PetColor color;

        // Constructor with parameters for the three fields
        public Pet(String n, PetType t, PetColor c) {
            name = n;
            type = t;
            color = c;
        }

        // Copy Constructor
        public Pet(Pet pet2){
            name = pet2.name;
            type = pet2.type;
            color = pet2.color;
        }

        // toString method for Pet information
        public String toString() {
            String str;
            str = String.format("Pet: %s\n"+
                                "Pet Color: %s\n" +
                                "Pet Name: %s\n",
                                type.toString().toLowerCase(), color.toString().toLowerCase(), name);
            return str;
            }
        }



}
