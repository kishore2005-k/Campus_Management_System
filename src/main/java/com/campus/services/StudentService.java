package com.campus.services;

import java.util.List;
import java.util.ArrayList;

public class StudentService {
    private static final List<String> students = new ArrayList<>();

    //get student
    public StudentService(){
        students.add("101.Bill-java");
        students.add("102.John-python");
        students.add("103.Jane-c++");

    }

    public List<String> getStudents() {
        return students;
    }

    //add student
    public void addStudent(String name, String course) {
        students.add(String.valueOf(students.size() + 101) + "." + name + "-" + course);
    }
}
