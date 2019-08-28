<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Роман
  Date: 24.08.2019
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form:form>
    <div>
        <form:label path="email">Email</form:label>
        <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>
    </div>
    <div>
        <form:label path="password">Email</form:label>
        <form:password path="password"/>
    </div>

    <div>
        <form:label path="username">Username</form:label>
        <form:input path="username"/>
    </div>
    <div>
        <form:label path="age">Age</form:label>
        <form:input path="age"/>
    </div>
    <div>
        <form:label path="">Repeat password</form:label>
        <form:password path="repeat password"/>
    </div>
    <div>
        <input type="submit" value="Register">
    </div>
    <div>
        <a href="/login">Have an account?/a>
    </div>
</form:form>
</body>
</html>
