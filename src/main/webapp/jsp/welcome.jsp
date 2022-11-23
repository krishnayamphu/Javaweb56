<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name= (String) request.getParameter("name");
%>
<h1>Welcome <%= name %></h1>
</body>
</html>
