<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jstl</title>
</head>
<body>
<c:out value="${book}"/>
<c:set var="maxSpeed" value="200" scope="request"/>

<p>Maximum Bike Speed Limit is: ${maxSpeed}</p>

<c:if test="${maxSpeed>=200}">
    <p>You reached maximum speed limit</p>
</c:if>
<hr>

<c:set var="gender" value="female" scope="request"/>

<c:choose>
    <c:when test="${gender=='male'}">
        <p>You are boy</p>
    </c:when>
    <c:otherwise>
        <p>You are girl</p>
    </c:otherwise>
</c:choose>

<hr>
<c:forEach var="i" begin="1" end="5">
    <p>Hello world ${i}</p>
</c:forEach>
<hr>

<c:forEach var="e" items="${employees}">
    <p>${e}</p>
</c:forEach>
<hr>
<%
    ArrayList<String> emps= (ArrayList<String>) request.getAttribute("employees");
    for(String e:emps) {
    %>
<p><%= e %></p>
<%
    }
%>
</body>
</html>
