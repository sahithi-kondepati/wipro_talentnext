package Collection;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Grapes");
        ArrayList<String> reversed = new ArrayList<>(set);
        Collections.reverse(reversed);
        System.out.println("Reversed TreeSet:");
        for (String s : reversed) {
            System.out.println(s);
        }
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\nContains 'Apple'? " + set.contains("Apple"));
        System.out.println("Contains 'Orange'? " + set.contains("Orange"));
    }
}

