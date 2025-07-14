package Oops;

public class RemoveStarAndAdj {
    public static void main(String[] args) {
        String input = "ab*cd"; 
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i > 0 && i < input.length() - 1 && input.charAt(i) == '*') {
                i++; 
            } else if ((i == 0 || input.charAt(i - 1) != '*') &&
                       (i == input.length() - 1 || input.charAt(i + 1) != '*') &&
                       input.charAt(i) != '*') {
                result.append(input.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}

