<%--
  Created by IntelliJ IDEA.
  User: lethethuy
  Date: 14/08/2023
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/TodoController/edit" method="post">
    <input type="text" name="id" readonly value="${todo.id}">
    <br>
    <textarea name="content" id="" cols="30" rows="10">${todo.content}</textarea>
    <br>
    <select name="status" >
        <option value="true" ${todo.status?'selected':''}>Da hoan thanh</option>
        <option value="true" ${todo.status?'selected':'selected'}>Chua hoan thanh</option>
    </select>
    <button type="submit">Update</button>
</form>
</body>
</html>
