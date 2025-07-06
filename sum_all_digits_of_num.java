package java_fundamentals;
import java.util.Scanner;
public class sum_all_digits_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

