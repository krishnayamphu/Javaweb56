<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/24/2022
  Time: 5:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User login</title>
</head>
<body>

<form action="auth" method="post">
    <input type="text" name="username" required>
    <br><br>
    <input type="password" name="password" required>
    <br><br>
    <button>Login</button>
</form>
</body>
</html>
