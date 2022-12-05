<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload Media</title>
    <style>
        *{
            font-family: Arial;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body{
            padding: 30px;
        }
        hr{
            margin: 15px 0;
        }
        .media-container{
            padding: 15px;
            display: flex;
        }
        .media-card{
            display: flex;
            flex-direction: column;
            justify-content: center;
            margin: 10px;
        }
        .media-card img{
            width: 110px;
            height: 110px;
            object-fit: cover;
            border-radius: 4px;
        }
        .media-action{
            display: flex;
            align-items: center;
            justify-content: space-between;
            margin-top: 5px;
        }
        .media-action a{
            text-decoration: none;
            font-size: 13px;
            border: 1px solid #ccc;
            padding: 2px 10px;
            border-radius: 2px;
            color:black;

        }
        .media-action button{
            padding-left: 5px;
            padding-right: 5px;
        }
    </style>
</head>
<body>

<form method="POST" enctype="multipart/form-data" action="media">
    File to upload:
    <input type="file" name="upfile">
   <button type="submit">Upload</button>
</form>
<hr>
<h4>All Media Files</h4>

<div class="media-container">
    <c:forEach var="item" items="${files}">
        <div class="media-card">
            <img src="uploads/${item}" alt="">
            <div class="media-action">
                <a href="uploads/${item}">View</a>
                <form action="media-del" method="post">
                    <input type="hidden" name="pic" value="${item}">
                    <button type="submit">Delete</button>
                </form>
            </div>
        </div>

    </c:forEach>

</div>
</body>
</html>
