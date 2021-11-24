<%--
  Created by IntelliJ IDEA.
  User: candk
  Date: 11/24/21
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test rest</title>
</head>
<body>
<h2>test rest</h2>
<a href="${pageContext.request.contextPath}/user">get user</a><br/>
<a href="${pageContext.request.contextPath}/user/1">get user by id</a><br/>
<form action="${pageContext.request.contextPath}/user" method="post">
    <input type="hidden" name="_method" value="put">
    username:<input type="text" name="username" /><br/>
    password:<input type="password" name="password" /><br/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
