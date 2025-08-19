package Collection;

import java.util.*;
import java.util.function.Predicate;
public class PerfectSquare {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0,1,4,9,15,16,20,25,30,36);
        Predicate<Integer> isPerfectSquare =
                n -> Math.sqrt(n) == (int)Math.sqrt(n);
        numbers.stream().filter(isPerfectSquare).forEach(System.out::println);
    }
}

