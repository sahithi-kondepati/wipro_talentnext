package Collection;

import java.util.*;
import java.util.function.Predicate;
class EmployeeSalary {
    int id;
    String name;
    int salary;
    public EmployeeSalary(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class EmployeeSalaryCheck {
    public static void main(String[] args) {
        List<EmployeeSalary> employees = Arrays.asList(
            new EmployeeSalary(1, "Ravi", 8000),
            new EmployeeSalary(2, "Priya", 12000),
            new EmployeeSalary(3, "Amit", 9500),
            new EmployeeSalary(4, "Sneha", 15000),
            new EmployeeSalary(5, "Kiran", 5000)
        );
        Predicate<EmployeeSalary> lowSalary = e -> e.salary < 10000;
        employees.stream().filter(lowSalary)
                 .forEach(e -> System.out.println(e.name));
    }
}
