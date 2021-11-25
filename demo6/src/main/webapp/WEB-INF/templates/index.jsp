<html>
<body>
<h2>Index</h2>
</body>
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

<a href="${pageContext.request.contextPath}/testResponse">testResponse</a><br/>
<a href="${pageContext.request.contextPath}/testResponseBody">testResponseBody</a><br/>
<a href="${pageContext.request.contextPath}/testResponseUser">testResponseUser</a><br/>
<a href="${pageContext.request.contextPath}/testResponseEntity">testResponseEntity</a><br/>
<a href="${pageContext.request.contextPath}/file">file</a><br/>


</html>
