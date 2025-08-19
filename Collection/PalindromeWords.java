package Collection;

import java.util.*;
import java.util.function.Predicate;
public class PalindromeWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam", "java", "level", "hello", "noon", "world");
        Predicate<String> isPalindrome =
                word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
        words.stream().filter(isPalindrome).forEach(System.out::println);
    }
}

