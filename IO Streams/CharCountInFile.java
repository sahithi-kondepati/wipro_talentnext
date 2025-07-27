package io;
import java.io.*;
import java.util.Scanner;
public class CharCountInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        System.out.print("Enter the character to be counted: ");
        char ch = scanner.nextLine().toLowerCase().charAt(0);
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = reader.read()) != -1) {
                if (Character.toLowerCase((char) c) == ch) {
                    count++;
                }
            }
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + ch + "'.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
