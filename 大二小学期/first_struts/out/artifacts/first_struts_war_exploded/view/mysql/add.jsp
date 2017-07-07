<%--
  Created by IntelliJ IDEA.
  User: zfl
  Date: 2017/7/6
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <title>添加</title>
    <meta http-equiv="Content-Type" charset="UTF-8">
</head>
<body>
    <form action="sql_add.action" method="get">
        name: <input type="text" name="rnm" value="测试"><br>
        <button type="submit">提交</button>
    </form>
</body>
</html>
