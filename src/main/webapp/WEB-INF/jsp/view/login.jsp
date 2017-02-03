<%--
  Created by IntelliJ IDEA.
  User: nan
  Date: 17-2-3
  Time: 下午4:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Support</title>
</head>
<body>
    <h2>Login</h2>
    you must log in to access the customer support site.<br /><br />
    <%
        if(((Boolean)request.getAttribute("loginFailed")))
        {
    %>
    <b>The username or password you entered are not correct. Please try
        again.</b><br /><br />
    <%
        }
    %>
    <form method="POST" action="<c:url value="/login" />">
        Username<br />
        <input type="text" name="username" /><br /><br />
        Password<br />
        <input type="password" name="password" /><br /><br />
        <input type="submit" value="Log In" />
    </form>
</body>
</html>
