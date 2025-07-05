package wipro_talentnext;

import java.util.Scanner;

public class check_last_digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n1=sc.nextInt();
		System.out.print("Enter a number: ");
		int n2=sc.nextInt();
		int rem1=n1%10;
		int rem2=n2%10;
		if(rem1 == rem2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
