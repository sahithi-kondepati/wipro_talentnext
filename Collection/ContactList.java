package Collection;

import java.util.*;

public class ContactList {
    HashMap<String, Integer> contacts = new HashMap<>();
    public void addContact(String name, int phoneNumber) {
        contacts.put(name, phoneNumber);
    }
    public boolean checkKey(String name) {
        return contacts.containsKey(name);
    }
    public boolean checkValue(int phoneNumber) {
        return contacts.containsValue(phoneNumber);
    }
    public void displayContacts() {
        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();
        System.out.println("Contact List:");
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        ContactList cl = new ContactList();
        cl.addContact("Alice", 987654321);
        cl.addContact("Bob", 912345678);
        System.out.println("Check key 'Alice': " + cl.checkKey("Alice"));
        System.out.println("Check value 912345678: " + cl.checkValue(912345678));
        cl.displayContacts();
    }
}

