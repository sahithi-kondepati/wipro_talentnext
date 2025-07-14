package Oops;

public class AlternateMerge {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        StringBuilder result = new StringBuilder();
        int len = Math.max(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (i < a.length()) result.append(a.charAt(i));
            if (i < b.length()) result.append(b.charAt(i));
        }
        System.out.println(result.toString());  
    }
}
