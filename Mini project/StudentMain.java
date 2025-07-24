package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
import com.mile1.exception.*;

public class StudentMain {
    static Student[] data = new Student[4];
    static {
        data[0] = new Student("Sekar", new int[]{90, 90, 90}); // A+
        data[1] = new Student(null, new int[]{11, 22, 33});     // null name
        data[2] = null;                                         // null object
        data[3] = new Student("Manoj", null);                   // null marks
    }
    public static void main(String[] args) {
        StudentReport sr = new StudentReport();
        StudentService ss = new StudentService();
        for (Student s : data) {
            try {
                String grade = sr.findGrade(s); // ✅ Only this method
                System.out.println("Grade = " + grade);
            } catch (NullNameException e) {
                System.out.println(e);
            } catch (NullStudentObjectException e) {
                System.out.println(e);
            } catch (NullMarksArrayException e) {
                System.out.println(e);
            }
        }
        System.out.println("Number of Objects with Marks array as null = " + ss.findNumberOfNullMarksArray(data));
        System.out.println("Number of Objects with Name as null = " + ss.findNumberOfNullName(data));
        System.out.println("Number of Objects that are entirely null = " + ss.findNumberOfNullObjects(data));
    }
}
