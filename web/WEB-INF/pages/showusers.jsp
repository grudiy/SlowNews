<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="other.GlobalStorage" %>
<%@ page import="com.grudiy.slownews.model.User" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.grudiy.slownews.model.UserStorage" %>
<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 29.08.2016
  Time: 20:40
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="sidebar.jsp" %>
<html>
<head>
    <title>SlowNews Admin - Users</title>
</head>

<div class="container">
    <h1>Registered Users</h1>
    <div class = "users-list">
        <ul class = "users-list-item">
           <%
               Map<Integer, User> usersMap = (Map<Integer, User>) request.getAttribute("allUsersFromStorage");
               for (Map.Entry<Integer, User> entry : usersMap.entrySet()) { %>
            <li><%=entry.getValue().getId() + " | " + entry.getValue().getFullName() + " | " + entry.getValue().getEmail() + " | " + entry.getValue().getPassword() + " | " + entry.getValue().getActivated()%></li>
        <%}
        %>
        </ul>

    </div>
</div>
<body>

