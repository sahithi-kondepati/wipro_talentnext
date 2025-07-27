package io;
import java.io.*;
import java.util.Scanner;
public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input file name: ");
        String inputFile = scanner.nextLine();
        System.out.print("Enter the output file name: ");
        String outputFile = scanner.nextLine();
        try (
            FileReader fr = new FileReader(inputFile);
            FileWriter fw = new FileWriter(outputFile)
        ) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            System.out.println("File is copied.");
        } catch (IOException e) {
            System.out.println("Error during file operation: " + e.getMessage());
        }
    }
}

