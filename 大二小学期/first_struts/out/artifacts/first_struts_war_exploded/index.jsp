<%--
  Created by IntelliJ IDEA.
  User: zfl
  Date: 2017/7/5
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <title>index</title>
</head>
<body>
    <c:if test="false">true</c:if><br>
    This is First Struts<br>
    <a href="view/hl.action">HelloWorld</a><br>
    <a href="view/login.jsp">Login</a><br>
    <a href="/helloexactionsupport.action">helloexactionsupport</a><br><br>

    动态方法
    <a href="mysql/role!add.action">AddRole</a>
    <a href="mysql/role!update.action">UpdateRole</a>  <!--  !后跟方法名 --><br>

    通配符
    <a href="mysql/role_add.action">AddRole</a>
    <a href="mysql/role_update.action">UpdateRole</a>  <!--  role_方法名  -->
    <a href="mysql/role_delete.action">AddRole</a>
    <a href="mysql/role_list.action">UpdateRole</a><br>

    form提交
    <a href="mysql/rf?rid=123&&rnm=aa">form</a><br>

    数据库操作
    <a href="mysql/sql_list.action">查询</a>

</body>
</html>
