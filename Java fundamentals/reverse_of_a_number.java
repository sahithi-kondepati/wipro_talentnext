package java_fundamentals;
import java.util.Scanner;
public class reverse_of_a_number {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;
        while (num > 0) {
            int rem = num % 10;
            reversed=reversed*10+rem;
            num = num / 10;
        }
        System.out.println(reversed);
    }
}
