<%@ page import="com.grudiy.slownews.model.User" %>
<%@ page import="com.grudiy.slownews.model.UserStorage" %><%--
  Author: grudiy
  Date: 19.08.2016
--%>
<%@ include file="sidebar.jsp" %>
<html>
  <head>
    <title>Register - SlowNews</title>
  </head>
  <body>

  <div class="container">
    <h1>Register</h1>
    <form method="post">
      <input type="text" name="name" class="input-text input-top" placeholder="Full name" value="">
      <input type="email" name="email" class="input-text input-middle" placeholder="Email" required="" value="">
      <input type="password" name="password" class="input-text input-bottom" placeholder="Password" onmousedown="this.placeholder='8 characters min';" required="">
      <input type="submit" class="button" value="Create my account">
    </form>

    <%
      User registeredUser = new User(UserStorage.getUsers().size() + 1, request.getParameter("name"), request.getParameter("email"), request.getParameter("password"), true); //created user objec
      request.setAttribute("registeredUser", registeredUser); // object transmitted to servlet
    %>

    <div class="form-footer">
      <a href="/login">Existing user? Login</a><br>
    </div>
  </div>
  </body>
</html>
