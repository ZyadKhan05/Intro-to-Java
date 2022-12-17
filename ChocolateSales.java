// This class was written by Zyad Khan for CIS-132-01 Problem 1 of Lab 4 on 10/3/22
// The purpose of this class is to create the 5 necessary variables for the reciept. It creates a constructor which takes two parameters, state abbreviation and quantity of chocolate bars purchased.
// Then it uses the setters method for the two parameters, which uses a switch statement and an if statement in order to set the variables.
// Then it uses the getters method for all 5 necessary variables, which are used in the printReciept function, which displays the variables in a reciept format for the user to read.

public class ChocolateSales {

        static double constant = 2.99;
        String stateAbbreviation;
        double stateTaxRate;
        boolean isStateValid;
        int quantitySold, discountRate;

        // constructor that takes two parameters - state abbreviation and quantity of chocolate bars purchased
        public ChocolateSales(String initStateAbbreviation, int initQuantitySold){
            stateAbbreviation = initStateAbbreviation;
            quantitySold = initQuantitySold;
        }

    // setters for stateAbbreviation and quantitySold
    public void setStateAbbreviation(String state){
        stateAbbreviation = state;
        isStateValid = false;
        stateAbbreviation = state.toUpperCase();
        switch (stateAbbreviation) {
            case "MD":
                stateTaxRate = 0.06;
                isStateValid = true;
                break;
            default:

        }
        }

    public void setQuantitySold(int quantity){
        quantitySold = quantity;
        if (quantitySold <= 10){
            discountRate = 0;
        }
        else if (quantitySold >= 11 && quantitySold <= 20 ) {
            discountRate = 5;
        }
        else if (quantitySold > 20 && quantitySold <= 40) {
            discountRate = 10;
        }
        else if (quantitySold >= 41 && quantitySold <= 75) {
            discountRate = 15;
        }
        else if (quantitySold >= 76) {
            discountRate = 20;
        }

    }

    // Getters for all 5 variables
        public static double getConstant(){
            return constant;
        }
        public String getStateAbbreviation(){
            return stateAbbreviation;
        }
        public double getStateTaxRate(){
            return stateTaxRate;
        }
        public boolean isStateValid(){
            return isStateValid;
        }
        public int getQuantitySold(){
            return quantitySold;
        }
        public int getDiscountRate(){
            return discountRate;
        }

    // printReceipt Method

    public void printReceipt(){
        String string1 = String.format("%d @ %.2f each ", quantitySold, constant);
        String string2 = String.format("Discount @ %d%%", discountRate);
        String string3 = String.format("Subtotal");
        String string4 = String.format("%s Sales tax @ %.1f%%", stateAbbreviation, (stateTaxRate*100.0));
        String string5 = String.format("Total");
        System.out.printf("\n%-20s%10.2f", string1, (quantitySold*constant));
        System.out.printf("\n%-20s%10.2f", string2, (constant*quantitySold)*(discountRate/100.0));
        System.out.printf("\n%-20s%10.2f", string3, (constant*quantitySold)-((constant*quantitySold)*(discountRate/100.0)));
        System.out.printf("\n%-20s%10.2f", string4,(stateTaxRate)*((constant*quantitySold)-((constant*quantitySold)*(discountRate/100.0)))) ;
        System.out.printf("\n%-20s%10.2f", string5,((constant*quantitySold)-((constant*quantitySold)*(discountRate/100.0)))-((stateTaxRate)*((constant*quantitySold)-((constant*quantitySold)*(discountRate/100.0)))));

    }
}
