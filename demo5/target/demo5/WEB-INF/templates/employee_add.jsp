<%--
  Created by IntelliJ IDEA.
  User: candk
  Date: 11/24/21
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
    <h2>add</h2>
    <form action="${pageContext.request.contextPath}/employee" method="POST">
        lastName: <input type="text" name="lastName"><br/>
        email: <input type="text" name="email"><br/>
        gender: <input type="radio" name="gender" value="1">male
        <input type="radio" name="gender" value="0">female<br/>
        <input type="submit" value="add">
    </form>
</body>
</html>
