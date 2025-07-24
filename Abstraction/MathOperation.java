package Abstraction;

public class MathOperation {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }
            double average = sum / 5.0;
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Enter exactly 5 integers.");
        }
    }
}

