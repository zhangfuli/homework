
<%--
  Created by IntelliJ IDEA.
  User: zfl
  Date: 2017/7/2
  Time: 9:05
  To change this template use File | Settings | File Templates.
--%>



<%@ page import="java.util.List" %>
<%@ page import="com.kms.model.Role" %>



<%--
  <%@   %>   指令语法
  <%@ page  %> page指令
  language = "java"   --嵌入到jsp文件的程序语言是java      默认是java可以省略
  contentType="text/html;charset=UTF-8" 告诉IE处理数据的方法
  pageEncoding本页面的字符集
  import 导包
 --%>
<%--放java类级代码  全局--%>
<%!
  int global = 10;
%>


<%--下面是放在一个方法里的--%>
<%--放java片段代码--%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <%
      List<Role>  lrs = null;
      Object o = request.getAttribute("lrs");
      if(o!=null){
        lrs = (List<Role>) o;
      }
      request.setAttribute("role", lrs.get(0));
    %>
    <table>
      <tr>
        <th>id</th>
        <th>depname</th>
        <th>loc</th>
      </tr>
      <%
        for(int i = 0; i < lrs.size(); i++){
          Role r = lrs.get(i);
          %>
            <tr>
              <td><%= r.getDepno()%></td>
              <td><%= r.getDepname()%></td>
              <td><%= r.getLoc()%></td>
            </tr>
          <%
        }
      %>
      <tr>
        <td></td>
      </tr>

    </table>


    <p>EL表达式</p>
    <table>
      <tr>
        <th>id</th>
        <th>depname</th>
        <th>loc</th>
      </tr>
      <tr>
        <td>${requestScope.role.depno}</td>
        <td>${requestScope.role.depname}</td>
        <td>${requestScope.role.loc}</td>
      </tr>
    </table>

    <!--
      Test内放的内容
      基本的逻辑运算
      判断一个对象是否为null   XXX == null
      判断为空     empty  XXX
    -->




  </body>
</html>

