package Collection;

import java.util.ArrayList;
import java.util.Iterator;
public class StringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        printAll(list);
    }
    public static void printAll(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        System.out.println("Elements in ArrayList:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

