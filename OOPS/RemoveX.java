package Oops;

public class RemoveX {
    public static void main(String[] args) {
        String input = "xHix"; 
        if (input.startsWith("x")) {
            input = input.substring(1);
        }
        if (input.endsWith("x")) {
            input = input.substring(0, input.length() - 1);
        }
        System.out.println(input);
    }
}
