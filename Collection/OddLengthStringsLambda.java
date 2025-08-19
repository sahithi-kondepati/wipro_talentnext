package Collection;

import java.util.*;

public class OddLengthStringsLambda {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList(
                "apple", "banana", "cherry", "date", "grape",
                "lemon", "mango", "orange", "pear", "kiwi"
        ));
        System.out.println("Strings with Odd Length:");
        al.stream()
          .filter(s -> s.length() % 2 != 0)
          .forEach(s -> System.out.println(s));
    }
}

