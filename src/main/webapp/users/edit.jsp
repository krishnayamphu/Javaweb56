<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp"%>
    <title>User Details</title>
</head>
<body>
<%@include file="nav.jsp"%>
<form action="user-edit" method="post">
    <c:if test="${success!=''}">
        <p>${success}</p>
    </c:if>
    <input type="hidden" name="id" value="${user.id}">
    <input type="text" name="username" placeholder="Username" value="${user.username}" required>
    <br><br>
    <input type="password" name="password" placeholder="Password" value="${user.password}" required>
    <br><br>
    <button type="submit">Update</button>
</form>
</body>
</html>
