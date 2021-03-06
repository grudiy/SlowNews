<%--
  Author: grudiy
  Date: 19.08.2016
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="../../style.css" type="text/css" rel="stylesheet">
</head>
<body>
<c:set var="authLogin" scope="session" value="${authLogin}"/>

<div class="sidebar">
    <div class="logo"><a href="/"><img src="../../images/green-RSS-40.png"></a></div>
    <%--<div class="welcomeuser"> Hello, <%=request.getAttribute("authLogin")%></div>${authLogin}--%>

    <c:if test="${authLogin != null}" >
        <div class="subtitle"> Hello, <c:out value="${authLogin}"/> </div>
    </c:if>

    <ul class="menu-list">
        <li class="menu-item"><a href="/">Home</a></li>
        <li class="menu-item"><a href="/archive">My Archive</a></li>
        <li class="menu-item"><a href="/login">Login</a></li>
        <li class="menu-item"><a href="/register">Register</a></li>
    </ul>

    <div class="adminpanel">
        <h3 class="subtitle"> Admin Pannel </h3>
        <ul class="menu-list">
            <li class="menu-item"><a href="/showusers">Show users</a></li>
        </ul>
    </div>

</div>
</body>
</html>
