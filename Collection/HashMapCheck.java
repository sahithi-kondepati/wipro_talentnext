package Collection;

import java.util.*;
public class HashMapCheck {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");
        System.out.println("Contains key 'India'? " + map.containsKey("India"));
        System.out.println("Contains value 'Tokyo'? " + map.containsValue("Tokyo"));
        System.out.println("\nIterating using Iterator:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

