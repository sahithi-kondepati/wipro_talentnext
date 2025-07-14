package Oops;

public class RepeatLastN {
    public static void main(String[] args) {
        String input = "Wipro";
        int n = 3;
        String lastN = input.substring(input.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastN);
        }
        System.out.println(result.toString()); 
    }
}

