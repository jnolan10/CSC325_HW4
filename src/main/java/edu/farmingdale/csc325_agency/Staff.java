package edu.farmingdale.csc325_agency;

public class Staff {
        public StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("Jonathan Nolan", "6424 Flushing Ave", "631-316-2713", "999-99-9999", 50000.1);
        staffList[1] = new StaffEmployee("Fred Johnson", "432 Park Ave", "800-888-8888", "999-99-9998", 40000.1); 
        staffList[2] = new StaffEmployee("Johnson Fred", "1 Handsome Ave", "631-342-1234", "999-99-9997", 30000.1);
        staffList[3] = new TempEmployee("Temp Dude", "123 Easy Street", "631-236-7345", "999-99-9996", 16.1);
        staffList[4] = new StaffEmployee("Trevor Patrick", "Patrick Street", "631-111-1111", "999-99-9995", 20000.1);
        staffList[5] = new Intern("Intern Man", "12 The Lane", "516-444-6421");
        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmployee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
