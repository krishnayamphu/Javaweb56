<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String appname=(String) session.getAttribute("appname");
%>
<p>App Name: <%= appname %></p>
</body>
</html>
