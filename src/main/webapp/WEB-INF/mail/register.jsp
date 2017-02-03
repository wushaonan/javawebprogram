<%--
  Created by IntelliJ IDEA.
  User: nan
  Date: 17-1-20
  Time: 上午10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/register" method="post">
    用户名：<input type="text" name="username"><br/>
    密码：<input type="password" name="password"><br/>
    邮箱：<input type="text" name="email"><br/>
    <input type="submit" value="注册">
</form>
</body>
</html>
