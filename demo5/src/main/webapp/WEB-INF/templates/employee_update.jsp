<%--
  Created by IntelliJ IDEA.
  User: candk
  Date: 11/24/21
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Update</title>
</head>
<body>
  <h2>Employee update</h2>
  <form action="${pageContext.request.contextPath}/employee" method="POST">
      <input type="hidden" name="_method" value="put">
      <input type="hidden" name="id" value="${employee.id}">
      lastName: <input type="text" name="lastName" value="${employee.lastName}"><br/>
      email: <input type="text" name="email" value="${employee.email}"><br/>
      gender: <input type="radio" name="gender" value="1">male
      <input type="radio" name="gender" value="0">female<br/>
      <input type="submit" value="update">
  </form>
</body>
</html>
