package Collection;

import java.util.*;
import java.util.function.Consumer;
public class ReverseWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("java","world","hello","program"));
        Consumer<List<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String rev = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, rev);
            }
        };
        reverseWords.accept(words);
        System.out.println("Reversed Words: " + words);
    }
}

