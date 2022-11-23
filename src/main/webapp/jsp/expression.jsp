<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= LocalDateTime.now() %>
<%
    int maxSpeed=200;
%>

<p>Maximum bike speed: <%= maxSpeed %></p>
</body>
</html>
