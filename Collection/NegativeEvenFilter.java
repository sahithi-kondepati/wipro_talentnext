package Collection;

import java.util.*;
import java.util.stream.Collectors;

public class NegativeEvenFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, -2, -3, -8, 5, -6, 12, -15);
        List<Integer> result = numbers.stream()
                                      .filter(n -> n < 0 && n % 2 == 0)
                                      .collect(Collectors.toList());
        System.out.println("Negative Even Numbers: " + result);
    }
}
