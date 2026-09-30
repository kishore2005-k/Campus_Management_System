package com.campus.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.campus.services.StudentService;

@WebServlet ("/students")
public class StudentServlet extends HttpServlet {
    private final StudentService studentService= new StudentService();

    @Override 
    public void doGet(HttpServletRequest request,HttpServletResponse responce)
            throws IOException, ServletException{
                var students = studentService.getStudents();
                request.setAttribute("students", students);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/Student.jsp");
                dispatcher.forward(request, responce);
       
    }

    @Override 
    public void doPost(HttpServletRequest request,HttpServletResponse responce)
            throws IOException{
        String name = request.getParameter("name");
        String department = request.getParameter("department");
        String ageParam = request.getParameter("age");
        int age = Integer.parseInt(ageParam);
        studentService.addStudent(name, department, age);
        responce.sendRedirect("/students");
    }

}