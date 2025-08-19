package Collection;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
class EmpRecord {
    int id;
    String name;
    EmpRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
public class VectorEmployeeDemo {
    public static void main(String[] args) {
        Vector<EmpRecord> empVector = new Vector<>();
        empVector.add(new EmpRecord(1, "Sahithi"));
        empVector.add(new EmpRecord(2, "Nikhitha"));
        empVector.add(new EmpRecord(3, "Prasad"));
        System.out.println("Using Iterator:");
        Iterator<EmpRecord> itr = empVector.iterator();
        while (itr.hasNext()) {
            itr.next().display();
        }
        System.out.println("\nUsing Enumeration:");
        Enumeration<EmpRecord> e = empVector.elements();
        while (e.hasMoreElements()) {
            e.nextElement().display();
        }
    }
}

