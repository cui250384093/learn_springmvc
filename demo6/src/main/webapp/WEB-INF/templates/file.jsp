<%--
  Created by IntelliJ IDEA.
  User: candk
  Date: 11/25/21
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File upload & download</title>
</head>
<body>
    <h2>File</h2>
    <a href="${pageContext.request.contextPath}/testDownload">testDownload</a><br/>
    <form action="${pageContext.request.contextPath}/testUpload" method="post" enctype="multipart/form-data">
        head: <input type="file" name="photo" /><br/>
        <input type="submit" value="upload" />
    </form><br/>
</body>
</html>
