package Collection;

import java.util.*;
import java.util.function.Consumer;
public class OddEvenCheck {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Consumer<Integer> checkOddEven = n -> {
            if (n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };
        numbers.forEach(checkOddEven);
    }
}

