package Collection;

import java.util.*;

public class ReverseStringsLambda {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList(
                "apple", "banana", "cherry", "date", "grape",
                "lemon", "mango", "orange", "pear", "kiwi"
        ));
        System.out.println("Original List: " + al);
        System.out.println("Strings in Reverse Order:");
        al.stream()
          .sorted(Comparator.reverseOrder()) 
          .forEach(s -> System.out.println(s));
    }
}
