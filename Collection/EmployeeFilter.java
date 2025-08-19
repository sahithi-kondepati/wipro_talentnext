package Collection;

import java.util.*;
import java.util.stream.Collectors;
class MyEmployee {
    int empNo;
    String name;
    int age;
    String location;
    public MyEmployee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }
    @Override
    public String toString() {
        return empNo + " - " + name + " - " + age + " - " + location;
    }
}
public class EmployeeFilter {
    public static void main(String[] args) {
        List<MyEmployee> employees = new ArrayList<>();
        employees.add(new MyEmployee(101, "Ravi", 25, "Pune"));
        employees.add(new MyEmployee(102, "Priya", 30, "Mumbai"));
        employees.add(new MyEmployee(103, "Amit", 28, "Pune"));
        employees.add(new MyEmployee(104, "Sneha", 26, "Delhi"));
        employees.add(new MyEmployee(105, "Kiran", 32, "Pune"));
        List<MyEmployee> puneEmployees = employees.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());
        System.out.println("Employees in Pune:");
        puneEmployees.forEach(System.out::println);
    }
}

