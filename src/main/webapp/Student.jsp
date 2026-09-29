%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List of Students</title>
</head>
<body>
    <h1>Campus Management System</h1>
    <ul>
        % for(String student : students) { %
            <li><%= student %></li>
        % } %
    </ul>
    <br/>
    <a href="/student.html">Add Student</a>
</body>
</html>