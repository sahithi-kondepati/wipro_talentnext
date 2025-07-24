package Abstraction;

import java.util.Scanner;
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}
public class StudentAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = new String[2];
        int[][] marks = new int[2][3];

        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter name of student " + (i + 1) + ":");
                students[i] = sc.nextLine();

                System.out.println("Enter marks of 3 subjects:");
                for (int j = 0; j < 3; j++) {
                    String input = sc.nextLine();
                    int mark = Integer.parseInt(input);
                    if (mark < 0 || mark > 100) {
                        throw new InvalidMarksException("Mark out of range (0-100): " + mark);
                    }
                    marks[i][j] = mark;
                }
            }

            for (int i = 0; i < 2; i++) {
                int total = marks[i][0] + marks[i][1] + marks[i][2];
                double avg = total / 3.0;
                System.out.println(students[i] + "'s average = " + avg);
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter only integers for marks.");
        } catch (InvalidMarksException e) {
            System.out.println("InvalidMarksException: " + e.getMessage());
        }
    }
}

