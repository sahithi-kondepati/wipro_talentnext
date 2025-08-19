package Collection;

import java.util.ArrayList;
class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;
    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }
    public void getEmployeeDetails() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: ₹" + salary);
        System.out.println("----------------------------");
    }
}
class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();
    public boolean addEmployee(Employee e) {
        return list.add(e);
    }
    public boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }
    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay slip for employee ID " + empId + ": ₹" + e.salary;
            }
        }
        return "Employee not found!";
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Sahithi", "sahithi@example.com", "Female", 70000);
        Employee e2 = new Employee(102, "Nikhitha", "nikhitha@example.com", "Male", 60000);
        Employee e3 = new Employee(103, "Prasad", "prasad@example.com", "Male", 75000);
        EmployeeDB db = new EmployeeDB();
        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);
        System.out.println("All Employees:");
        e1.getEmployeeDetails();
        e2.getEmployeeDetails();
        e3.getEmployeeDetails();
        System.out.println("Deleting Employee with ID 102...");
        db.deleteEmployee(102);
        System.out.println(db.showPaySlip(101));
        System.out.println(db.showPaySlip(102));
    }
}

