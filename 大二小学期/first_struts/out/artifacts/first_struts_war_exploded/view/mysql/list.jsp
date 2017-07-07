<%@ page import="java.util.List" %>
<%@ page import="com.mysql.model.Role" %><%--
  Created by IntelliJ IDEA.
  User: zfl
  Date: 2017/7/6
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <title>List</title>
</head>
<body>
<table border="1">
    <thead>
        <th>depno</th>
        <th>depname</th>
        <th>loc</th>
        <th>操作</th>
    </thead>
    <tbody>
        <s:iterator  value="#request.deps" var="dep">
            <tr>
                <td><s:property value='#dep.depno'/></td>
                <td><s:property value='#dep.depname'/></td>
                <td><s:property value='#dep.loc'/></td>
                <td>
                        ${ dep.depno }
                    <a href="">编辑</a>
                    <a href="">删除</a>
                </td>
            </tr>
        </s:iterator>
    </tbody>
</table>

</body>
</html>
