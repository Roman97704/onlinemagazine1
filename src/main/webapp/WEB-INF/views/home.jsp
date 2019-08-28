<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Роман
  Date: 25.08.2019
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<table>
<tr>
    <th>Id</th>
    <th>Username</th>
    <th>Email</th>
    <th>Password</th>
    <th>RepeatPassword</th>
    <th>Age</th>
</tr>
<c:forEach var="u" items="${userList}">
<tr>
    <td>${u.id}</td>
    <td>${u.username}</td>
    <td>${u.email}</td>
    <td>${u.password}</td>
    <td>${u.repeatPassword}</td>
    <td>${u.age}</td>
</tr>
</c:forEach>
</table>
<div>
    <a href="/home/1">1</a>
    <a href="/home/2">2</a>
    <a href="/home/3">3</a>
</div>
</body>
</html>
