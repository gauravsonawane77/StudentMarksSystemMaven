
package com.project.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class StudentServlet extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "your_password";

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        int marks = Integer.parseInt(req.getParameter("marks"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            PreparedStatement ps = conn.prepareStatement("INSERT INTO students(name, marks) VALUES(?, ?)");
            ps.setString(1, name);
            ps.setInt(2, marks);
            ps.executeUpdate();

            conn.close();
            res.sendRedirect("success.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            res.getWriter().println("Database Error: " + e.getMessage());
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            req.setAttribute("students", rs);
            RequestDispatcher rd = req.getRequestDispatcher("viewStudents.jsp");
            rd.forward(req, res);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
