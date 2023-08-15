<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: lethethuy
  Date: 14/08/2023
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<h1>Danh sach cong viec</h1>
<td><a href="/TodoController/add">Add</a></td>
<table border="10" cellspacing="10" cellpadding="10">
    <thead>
    <tr>
        <th>STT</th>
        <th>Content</th>
        <th>Status</th>
        <th colspan="2">Action</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="l" varStatus="item" >
        <tr>
            <td>${item.count}</td>
            <td>${l.content}</td>
            <td>${l.status?"Complete":"Pending"}</td>
            <td><a href="<%=request.getContextPath()%>/TodoController/edit/${l.id}">Edit</a></td>
            <td><a onclick="return confirm('do you want to delete this task ? ')" href="<%=request.getContextPath()%>/TodoController/delete/${l.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
