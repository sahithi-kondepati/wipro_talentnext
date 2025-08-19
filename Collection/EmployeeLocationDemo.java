package Collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class EmployeeLocation {
    int id;
    String name;
    String location;
    double salary;
    public EmployeeLocation(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}
public class EmployeeLocationDemo {
    public static void main(String[] args) {
        List<EmployeeLocation> employees = Arrays.asList(
            new EmployeeLocation(101, "Ravi", "Pune", 50000),
            new EmployeeLocation(102, "Priya", "Mumbai", 60000),
            new EmployeeLocation(103, "Amit", "Delhi", 45000),
            new EmployeeLocation(104, "Sneha", "Pune", 70000),
            new EmployeeLocation(105, "Kiran", "Chennai", 40000)
        );
        Function<EmployeeLocation, String> getLocation = e -> e.location;
        List<String> locations = employees.stream()
                                          .map(getLocation)
                                          .collect(Collectors.toList());
        System.out.println("Locations: " + locations);
    }
}

