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
    <title>add</title>
</head>
<body>
<form action="/TodoController/add" method="post">
    <label for="content">Content:</label>
    <textarea name="content" id="content" cols="30" rows="10"></textarea>
    <select name="status" id="">
        <option value="true" ${todo.status?'selected':''}>Da hoan thanh</option>
        <option value="false" ${todo.status?'':'selected'}>Chua hoan thanh</option>
    </select>
    <button type="submit">Add</button>

</form>

</body>
</html>
