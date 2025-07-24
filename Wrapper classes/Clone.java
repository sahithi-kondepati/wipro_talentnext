package Wrapperclass;

class Employee implements Cloneable {
    int id;
    String name;
    String department;
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();  
    }
    public void printDetails(String label) {
        System.out.println(label + " -> ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}
public class Clone {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(101, "Alice", "HR");
            Employee emp2 = emp1.clone();
            emp1.name = "Alicia";
            emp1.department = "Finance";
            emp1.printDetails("Original Employee");
            emp2.printDetails("Cloned Employee");
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}

