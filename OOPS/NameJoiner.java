package Oops;

import java.util.ArrayList;
import java.util.StringJoiner;

public class NameJoiner {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sahithi");
        names.add("Nikhitha");
        names.add("Sarayu");
        names.add("Prasad");
        StringJoiner joiner = new StringJoiner(",", "{", "}");
        names.forEach(joiner::add);
        System.out.println("Joined Names: " + joiner.toString());
    }
}

