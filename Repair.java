// This program was written by Zyad Khan for CIS-132-01 Repair Class for Problem 1 on Lab 3 on 9/19/22
// The purpose of the class is to use two different constructors to set the private instance variables.
// The class also uses both the setters and getters method. The setters method is used to set the value of the instance variable, while the getters method gets the value of the instance variable.



public class Repair extends Problem1 {

    private String repairName ;
    private String repairDate ;
    private String mechanicName ;
    private double repairCost ;

    // Constructor 1
    public  Repair(){

    }

    // Constructor 2
    public Repair(String Name, String Date, String Mechanic, Double Cost) {
        repairName = Name ;
        repairDate = Date;
        mechanicName = Mechanic;
        repairCost = Cost;
    }

    // setters and getters
    public void setRepairName(String name){
        repairName = name;
    }

    public void setRepairDate(String date){
        repairDate = date;
    }

    public void setMechanicName(String mechanic){
        mechanicName = mechanic;
    }

    public void setRepairCost(Double cost){
        repairCost = cost;
    }

    public String getRepairName()
    {
        return repairName;
    }

    public String getRepairDate()
    {
        return repairDate;
    }

    public String getMechanicName()
    {
        return mechanicName;
    }

    public double getRepairCost()
    {
        return repairCost;
    }



}


