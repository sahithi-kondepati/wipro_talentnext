package Wrapperclass;

import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (1–255): ");
        int num = sc.nextInt();
        if (num < 1 || num > 255) {
            System.out.println("Invalid input! Number must be between 1 and 255.");
            return;
        }
        String binaryStr = Integer.toBinaryString(num);
        String padded = String.format("%8s", binaryStr).replace(' ', '0');
        System.out.println(padded);
    }
}

