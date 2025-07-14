package Oops;

import java.util.Optional;
class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}
class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}
public class OptionalCheck3 {
    public static void main(String[] args) {
        Employee emp = null;  
        try {
            Optional<Employee> optionalEmp = Optional.ofNullable(emp);
            Employee validEmp = optionalEmp.orElseThrow(() -> new InvalidEmployeeException("Invalid Employee Object"));
            System.out.println("Employee Name: " + validEmp.name);
        } catch (InvalidEmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

