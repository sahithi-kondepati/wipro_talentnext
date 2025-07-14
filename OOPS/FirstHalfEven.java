package Oops;

public class FirstHalfEven {
    public static void main(String[] args) {
        String input = "TomCat"; 
        if (input.length() % 2 == 0) {
            String result = input.substring(0, input.length() / 2);
            System.out.println(result);
        } else {
            System.out.println("null");
        }
    }
}

