package edu.farmingdale.csc325_agency;

public class StaffEmployee extends StaffMember{
    
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  TODO 2: Sets up this staff employee with the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    // TODO 3: complete the implementation of toString to return information 
    //          about a staff employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return "Name: " + this.name + "\nAddess: " + this.address + "\nPhone: " + this.phone +
                "\nSocial Security Number: " + this.socialSecurityNumber + "\nPaid: " + this.payRate 
                + "\n+ + + + + + + + + + + + + + + + + + + + + + + + +";
    }

    //-----------------------------------------------------------------
    // TODO 4:  Returns the pay rate for this staff employee.
    //-----------------------------------------------------------------
    public double pay()
    {
       return this.payRate;
    }
}
