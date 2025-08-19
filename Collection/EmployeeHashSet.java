package Collection;

import java.util.HashSet;
import java.util.Iterator;
public class EmployeeHashSet {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();
        employees.add("Alice");
        employees.add("Bob");
        employees.add("Charlie");
        Iterator<String> iterator = employees.iterator();
        System.out.println("Employees:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

