package Collection;

import java.util.*;
class TreeMapEmployee {
 int id;
 String name;
 public TreeMapEmployee(int id, String name) {
     this.id = id;
     this.name = name;
 }
 @Override
 public String toString() {
     return "TreeMapEmployee{id=" + id + ", name='" + name + "'}";
 }
}
public class TreeMapEmployeeDemo {
 public static void main(String[] args) {
     TreeMap<Integer, TreeMapEmployee> treeMap = new TreeMap<>();
     treeMap.put(101, new TreeMapEmployee(101, "Alice"));
     treeMap.put(103, new TreeMapEmployee(103, "Charlie"));
     treeMap.put(102, new TreeMapEmployee(102, "Bob"));
     System.out.println("=== TreeMap Example ===");
     for (Map.Entry<Integer, TreeMapEmployee> entry : treeMap.entrySet()) {
         System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
     }
 }
}

