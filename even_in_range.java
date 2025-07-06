package java_fundamentals;
import java.util.Scanner;
public class even_in_range {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=23;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
