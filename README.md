# 🎓 Student Marks Management System

A simple Maven-based Java EE web application that allows users to add and view student marks. Built using JSP, Servlets, JDBC, and MySQL.

---

## 📋 Features

- ➕ Add new student records (Name, Marks, etc.)
- 📄 View all student records in a formatted HTML table
- 💾 Data stored in MySQL database via JDBC
- 🔄 Page redirection after submission using Servlets

---

## 💻 Technologies Used

- ✅ Java EE (Servlet + JSP)
- ✅ MySQL (Database)
- ✅ Apache Tomcat (Server)
- ✅ Maven (Build Automation)
- ✅ JDBC (Database Connectivity)

CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    branch VARCHAR(100),
    marks INT,
    grade VARCHAR(2)
);


String url = "jdbc:mysql://localhost:3306/student_db";
String user = "root";
String password = "yourpassword";


---

## 🛠️ Setup Instructions

### 1. 📂 Clone the Repository
```bash
git clone https://github.com/your-username/student-marks-system.git
