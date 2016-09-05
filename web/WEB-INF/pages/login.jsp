<%--
  Author: grudiy
  Date: 19.08.2016
--%>
<%@ include file="sidebar.jsp" %>
<html>
<head>
    <title>Login - SlowNews</title>
</head>
<body>
<div class="container">
    <h1>Login</h1>
    <form method="post">
        <input type="email" name="login" class="input-text input-top" placeholder="Email" required="" value="">
        <input type="password" name="password" class="input-text input-bottom" placeholder="Password" required="">
        <input type="submit" class="button" value="Login">
    </form>
    <div class="form-footer">
        <a href="/register">New user? Sign up</a><br>
    </div>
</div>
</body>
</html>
