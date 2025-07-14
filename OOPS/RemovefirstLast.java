package Oops;

public class RemovefirstLast {
    public static void main(String[] args) {
        String input = "Suman"; 
        if (input.length() > 2) {
            String result = input.substring(1, input.length() - 1);
            System.out.println(result);
        } else {
            System.out.println("Invalid input");
        }
    }
}

