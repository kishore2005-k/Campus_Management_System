package com.campus.service;

import com.campus.model.Student;

public class Studentservice {
    // method to calculate total marks of a student
    public int calculateTotal(Student student) {
        if (student.getMarks() == null) {
            return 0;
        }
        int total = 0;
        for (int mark : student.getMarks()) {
            total += mark;
        }
        return total;
    }

    // calculate average marks of a student
    public double calculateAverage(Student student) {
        if (student.getMarks() == null || student.getMarks().length == 0) {
            return 0.0;
        }
        int total = calculateTotal(student);
        return (double) total / student.getMarks().length;
    }

    // find maximum marks of a student
    public int findMaximum(Student student) {
        if (student.getMarks() == null || student.getMarks().length == 0) {
            return 0;
        }
        int max = student.getMarks()[0];
        for (int mark : student.getMarks()) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    // find minimum marks of a student
    public int findMinimum(Student student) {
        if (student.getMarks() == null || student.getMarks().length == 0) {
            return 0;
        }
        int min = student.getMarks()[0];
        for (int mark : student.getMarks()) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    // grade based on marks
    public char grade(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 'F';
        }
        int average = (int) calculateAverage(student);
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // pass or fail
    public String passOrFail(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return "Fail";
        }
        int average = (int) calculateAverage(student);
        if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // display report card
    public void displayReportCard(Student student) {
        System.out.println("Student Name: " + student.getStudentname());
        System.out.println("Student ID: " + student.getStudentid());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Total Marks: " + calculateTotal(student));
        System.out.println("Average Marks: " + calculateAverage(student));
        System.out.println("Maximum Marks: " + findMaximum(student));
        System.out.println("Minimum Marks: " + findMinimum(student));
        System.out.println("Grade: " + grade(student));
        System.out.println("Result: " + passOrFail(student));
    }
}