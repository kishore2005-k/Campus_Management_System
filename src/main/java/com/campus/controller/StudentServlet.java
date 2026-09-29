package com.campus.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.campus.service.StudentService;

@WebServlet ("/students")
public class StudentServlet extends HttpServlet {
    private final StudentService studentService= new StudentService();

    @Override 
    public void doGet(HttpServletRequest request,HttpServletResponse responce)
            throws IOException{
        responce.setContentType("text/html");
        PrintWriter out = responce.getWriter();
        
        out.println("<html>");
        out.println("<head><title>List of Students</title></head>");
        out.println("<body>");

        out.println("<h1>All students</h1>");
        out.println("<ul>");
        for (String student : StudentService.getAllStudents()) {
            out.println("<li>" + student + "</li>");
        }
        out.println("</ul>");
        out.println("<a href=\"/student.html\">Add Student</a>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override 
    public void doPost(HttpServletRequest request,HttpServletResponse responce)
            throws IOException{
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        StudentService.addStudent(name, course);
        responce.sendRedirect("/students");
    }

}
