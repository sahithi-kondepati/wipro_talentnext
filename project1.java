public class project1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter an employee id");
            return;
        }

        String empId = args[0];
        boolean found = false;

        String[][] employees = {
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman", "01/01/2000", "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };

        for (String[] emp : employees) {
            if (emp[0].equals(empId)) {
                found = true;
                String[] desgData = getDesignationAndDA(emp[3]);
                int basic = Integer.parseInt(emp[5]);
                int hra = Integer.parseInt(emp[6]);
                int it = Integer.parseInt(emp[7]);
                int da = Integer.parseInt(desgData[1]);
                int salary = basic + hra + da - it;

                System.out.println("Emp No. Emp Name Department Designation Salary");
                System.out.printf("%s     %s     %s     %s     %d\n",
                    emp[0], emp[1], emp[4], desgData[0], salary);
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + empId);
        }
    }

    public static String[] getDesignationAndDA(String code) {
        switch (code) {
            case "e": return new String[]{"Engineer", "20000"};
            case "c": return new String[]{"Consultant", "32000"};
            case "k": return new String[]{"Clerk", "12000"};
            case "r": return new String[]{"Receptionist", "15000"};
            case "m": return new String[]{"Manager", "40000"};
            default: return new String[]{"", "0"};
        }
    }
}

