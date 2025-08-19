package Collection;

import java.util.*;
class HashTableEmployee {
 int id;
 String name;
 public HashTableEmployee(int id, String name) {
     this.id = id;
     this.name = name;
 }
 @Override
 public String toString() {
     return "HashTableEmployee{id=" + id + ", name='" + name + "'}";
 }
}
public class HashTableEmployeeDemo {
 public static void main(String[] args) {
     Hashtable<Integer, HashTableEmployee> hashTable = new Hashtable<>();
     hashTable.put(201, new HashTableEmployee(201, "David"));
     hashTable.put(203, new HashTableEmployee(203, "Frank"));
     hashTable.put(202, new HashTableEmployee(202, "Eve"));
     System.out.println("=== HashTable Example ===");
     for (Map.Entry<Integer, HashTableEmployee> entry : hashTable.entrySet()) {
         System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
     }
 }
}

