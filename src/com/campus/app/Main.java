package com.campus.app; 

import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.Studentservice;

public class Main
   {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //input from user
        System.out.println("Enter student id");
        int studenrid=sc.nextInt();
        System.out.println("Enter student name"); 
        String studentname=sc.next();
        System.out.println("Enter student age");
        int age=sc.nextInt();
        System.out.println("Enter student department");
        String department=sc.next();
        System.out.println("number of subjects");
        int n=sc.nextInt();
        int[] marks=new int[n];
        System.out.println("Enter marks of"+n+"subjects");
        for(int i=0;i<n;i++){
            System.out.println("Enter marks of subject"+(i+1));
            marks[i]=sc.nextInt();
            sc.nextLine();
        }
        Student student=new Student(studenrid, studentname, age, department, marks);
        student.displaystudentInfo(true);
        Student.displayStudentCount();
        Studentservice studentservice=new Studentservice();
        studentservice.displayReportCard(student);
        sc.close();
    }
   }