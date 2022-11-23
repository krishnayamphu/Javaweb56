<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String user= (String) session.getAttribute("user");
    if(user==null){
        response.sendRedirect("login.jsp");
    }
%>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<form action="logout.jsp">
    <button>Logout</button>
</form>
<h1>Hello Admin</h1>
<p>Do some Administration task here...</p>
</body>
</html>
