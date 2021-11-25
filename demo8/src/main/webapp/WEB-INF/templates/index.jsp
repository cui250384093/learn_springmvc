<%--
  Created by IntelliJ IDEA.
  User: candk
  Date: 11/24/21
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Index</h2>

<form action="${pageContext.request.contextPath}/testRequestBody" method="post">
    username: <input type="text" name="username"><br/>
    password: <input type="password" name="password"><br/>
    <input type="submit" value="submit"><br/>
</form>

<form action="${pageContext.request.contextPath}/testRequestEntity" method="post">
    username: <input type="text" name="username"><br/>
    password: <input type="password" name="password"><br/>
    <input type="submit" value="submit"><br/>
</form>

<a href="${pageContext.request.contextPath}/testInterceptor">testInterceptor</a><br/>
</body>
</html>
