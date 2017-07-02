<%--
  Created by IntelliJ IDEA.
  User: zfl
  Date: 2017/7/1
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  request.setCharacterEncoding("UTF-8");
  response.setCharacterEncoding("UTF-8");
%>
<html>
  <head>
    <title>注册</title>
    <meta http-equiv="CONTENT-TYPE" content="text/html;charset=UTF-8">
  </head>
  <body>
  <form action="reg.servlet" method="get">
    姓名：<input type="text" name="name"><br>
    密码：<input type="password" name="pwd"><br>
    性别：<input type="radio" name="sex" value="male"> 男 <input type="radio" name="sex" value="female"> 女<br>
    爱好：<input type="radio" name="enjoy" value="1">1<br>
          <input type="radio" name="enjoy" value="2">2<br>
          <input type="radio" name="enjoy" value="3">3<br>
    <button type="submit">注册</button>
  </form>
  </body>
</html>
