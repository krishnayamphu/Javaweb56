<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/23/2022
  Time: 5:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String bookname= (String) request.getAttribute("book");
%>
<p>Book Name: <%= bookname %></p>
</body>
</html>
