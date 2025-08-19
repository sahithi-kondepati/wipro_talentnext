package Collection;

import java.util.*;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties states = new Properties();
        states.setProperty("India", "Delhi");
        states.setProperty("Japan", "Tokyo");
        states.setProperty("USA", "Washington");
        Enumeration<?> e = states.propertyNames();
        System.out.println("States and Capitals:");
        while (e.hasMoreElements()) {
            String country = (String) e.nextElement();
            String capital = states.getProperty(country);
            System.out.println(country + " -> " + capital);
        }
    }
}

