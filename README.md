
# Student Marks System (Maven JSP + Servlet + JDBC)

A Maven-based Java EE web application to add and view student marks using JSP, Servlet, and MySQL.

## 📦 Features
- Add student data via form.
- Store in MySQL using JDBC.
- View students in a table.

## 🧱 Technologies Used
- Java EE (Servlet + JSP)
- MySQL
- Maven
- Apache Tomcat

## 🛠️ Setup Instructions

### Database Setup
```sql
CREATE DATABASE student_db;
USE student_db;
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    marks INT
);
```

### To Run:
1. Import as Maven project in Eclipse/IntelliJ.
2. Add Tomcat server.
3. Deploy the WAR.
4. Visit: `http://localhost:8080/StudentMarksSystem/addStudent.jsp`
