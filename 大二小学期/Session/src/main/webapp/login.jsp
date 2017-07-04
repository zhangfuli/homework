<%--
  Created by IntelliJ IDEA.
  User: zfl
  Date: 2017/7/3
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

<form action="/login.servlet" method="post">
    pnm <input type="text" name="pnm" value="zfl"><br>
    pwd <input type="text" name="pwd" value="zfl"><br>
    验证码:
    <input type="text" name="sid">
    <img src="sid.servlet" alt="无验证码"  id="myImg">
    <a href="javascript:reloading()">看不清</a><br>
    <input type="submit" value="注册">
</form>
</body>
<script>
    function reloading() {
        var img = document.getElementById("myImg");
        img.src = "sid.servlet?abc="+Math.random();
    }
</script>
</html>
