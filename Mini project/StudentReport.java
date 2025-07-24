package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport {
    public String findGrade(Student student) throws NullMarksArrayException, NullStudentObjectException, NullNameException {
        if (student == null) throw new NullStudentObjectException();
        if (student.getName() == null) throw new NullNameException();
        if (student.getMarks() == null) throw new NullMarksArrayException();
        int[] marks = student.getMarks();
        for (int mark : marks) {
            if (mark < 35) return "F";
        }
        int avg = 0;
        for (int mark : marks) {
            avg += mark;
        }
        avg = avg / marks.length;
        if (avg >= 80) return "A+";
        else if (avg >= 60) return "A";
        else if (avg >= 50) return "B";
        else if (avg >= 35) return "C";
        else return "F";
    }
}
