<%--
  Created by IntelliJ IDEA.
  User: zfl
  Date: 2017/7/5
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <title>Sign On</title>
</head>
<body>
<form action="login.action" method="get">
    PNM: <input type="text" name="pnm" value="zfl"><br>
    PWD: <input type="password" name="pwd" value="zfl"><br>
    <button type="submit">Login</button>
</form>
</body>
</html>
