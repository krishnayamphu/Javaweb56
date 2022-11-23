<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    int getMaxAge(){
        return 120;
    }
%>

<p>Human max age: <%= getMaxAge() %></p>
</body>
</html>
