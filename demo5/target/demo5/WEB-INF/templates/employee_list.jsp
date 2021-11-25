<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: candk
  Date: 11/24/21
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>employee info</title>
</head>
<body>
    <table id="dataTable">
        <tr>
            <th colspan="5">Employee Info</th>
        </tr>
        <tr>
            <th>id</th>
            <th>lastName</th>
            <th>email</th>
            <th>gender</th>
            <th>options (<a href="${pageContext.request.contextPath}/add">add</a>)</th>
        </tr>
        <c:forEach items="${employeeList}" var="employee" >
            <tr>
                <td>${employee.id}</td>
                <td>${employee.lastName}</td>
                <td>${employee.email}</td>
                <td>${employee.gender}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/employee/${employee.id}">delete</a>
                    <a href="${pageContext.request.contextPath}/employee/${employee.id}">update</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <form method="post">
        <input type="hidden" name="_method" value="post" />
    </form>

    <script type="text/javascript" src="<c:url value="/static/js/vue.js"/>"></script>
    <script type="text/javascript">
        var vue = new vue({
            el:"#dataTable",
            methods: {

            }
        })
    </script>
</body>
</html>
