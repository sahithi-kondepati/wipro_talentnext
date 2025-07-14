package Oops;

public class RepeatFrontChars {
    public static void main(String[] args) {
        String input = "Wipro";  
        int n = input.length();
        String firstTwo = input.length() >= 2 ? input.substring(0, 2) : input;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(firstTwo);
        }
        System.out.println("Result: " + result.toString());
    }
}
