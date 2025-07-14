package Oops;

import java.util.StringJoiner;

public class CityJoiner {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi");
        s1.add("Mumbai");
        s1.add("Chennai");
        StringJoiner s2 = new StringJoiner("-");
        s2.add("London");
        s2.add("Paris");
        s2.add("Berlin");
        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s2);
        merge1.merge(s1);
        System.out.println("(s1 merged to s2): " + merge1);
        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s1);
        merge2.merge(s2);
        System.out.println("(s2 merged to s1): " + merge2);
    }
}

