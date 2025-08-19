package Collection;

import java.util.*;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Function<List<Integer>, Integer> sumFunction =
                list -> list.stream().mapToInt(Integer::intValue).sum();
        int sum = sumFunction.apply(numbers);
        System.out.println("Sum = " + sum);
    }
}

