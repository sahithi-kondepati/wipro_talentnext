package Collection;

import java.util.*;
import java.util.stream.*;
public class PrimeNumbersLambda {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100) + 1);
        }
        System.out.println("ArrayList: " + al);
        System.out.println("Prime Numbers:");
        al.stream()
          .filter(PrimeNumbersLambda::isPrime) 
          .forEach(n -> System.out.print(n + " "));
    }
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .allMatch(i -> n % i != 0);
    }
}

