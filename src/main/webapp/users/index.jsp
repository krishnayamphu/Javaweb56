<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="head.jsp"%>
    <title>Users</title>
</head>
<body>
<%@include file="nav.jsp"%>
<table>
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Password</th>
        <th>Action</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>
                <div class="action-group">
                    <a href="user-edit?id=${user.id}">Edit</a>
                    <button onclick="showDialog()">Delete</button>
                </div>

                <div id="overlay" class="card-overlay">
                    <div class="card">
                        <div class="card-body">
                            <p>Are you sure delete this item?</p>
                        </div>
                        <div class="card-footer">
                            <form action="users" method="post">
                                <input type="hidden" name="id" value="${user.id}">
                                <button type="submit">Confirm</button>
                                <button onclick="closeDialog()" type="button">Cancel</button>
                            </form>
                        </div>

                    </div>
                </div>

            </td>
        </tr>
    </c:forEach>
</table>



<script>
    function showDialog(){
        document.getElementById("overlay").style.display="flex";
    }
    function closeDialog(){
        document.getElementById("overlay").style.display="none";
    }
</script>
</body>
</html>
