package edu.farmingdale.csc325_agency;

public class Agency {
        //-----------------------------------------------------------------
    //  Creates a staff of employees for a agency and pays them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Staff personnel = new Staff();
        
        //personnel.payday();
        
        for(int i = 0; i < personnel.staffList.length; i++)
        {
            System.out.println(personnel.staffList[i]);
        }
    }
}
