<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp"%>
    <title>New User</title>
</head>
<body>
<%@include file="nav.jsp"%>
<form action="register" method="post">
    <c:if test="${success!=''}">
        <p>${success}</p>
    </c:if>
    <input type="text" name="username" placeholder="Username" required>
    <br><br>
    <input type="password" name="password" placeholder="Password" required>
    <br><br>
    <button type="submit">Register</button>
</form>
</body>
</html>
