package io;

import java.io.*;
import java.util.Date;
public class EmployeeSerialization {
    static class Employee implements Serializable {
        private String name;
        private Date dateOfBirth;
        private String department;
        private String designation;
        private double salary;
        public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.department = department;
            this.designation = designation;
            this.salary = salary;
        }
        public String toString() {
            return "Name: " + name +
                   "\nDOB: " + dateOfBirth +
                   "\nDepartment: " + department +
                   "\nDesignation: " + designation +
                   "\nSalary: " + salary;
        }
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Sahithi", new Date(104, 3, 15), "IT", "Developer", 75000.00);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
            oos.writeObject(emp);
            System.out.println("Object written to file.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
            Employee savedEmp = (Employee) ois.readObject();
            System.out.println("\nDeserialized Employee:");
            System.out.println(savedEmp);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}


