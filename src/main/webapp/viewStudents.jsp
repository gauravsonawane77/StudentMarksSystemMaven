
<%@ page import="java.sql.*" %>
<html>
<head><title>Student List</title></head>
<body>
<h2>All Students</h2>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Marks</th></tr>

<%
    ResultSet rs = (ResultSet) request.getAttribute("students");
    while (rs != null && rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("name") %></td>
        <td><%= rs.getInt("marks") %></td>
    </tr>
<%
    }
%>
</table>
</body>
</html>
