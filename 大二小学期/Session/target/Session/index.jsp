<%@ page import="com.kms.model.Person" %><%--
  Created by IntelliJ IDEA.
  User: zfl
  Date: 2017/7/3
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <meta http-equiv="refresh" content="5">
</head>
<body>
    <a href="/loginIndex.jsp">登陆</a>
    <a href="/login.jsp">注册</a><br>

    <%
        if(session.getAttribute("person")!=null){
            Person person = (Person)session.getAttribute("person");
         %>
            <p>您好，<%= person.getPnm()  %></p>
            <a href="/out.servlet">退出</a>

        <%
        }else{
        %>
            <p>为空</p>
        <%
        }

    %>

    <iframe src="/message"></iframe>
    <iframe src="Message.jsp"></iframe>


</body>
</html>
