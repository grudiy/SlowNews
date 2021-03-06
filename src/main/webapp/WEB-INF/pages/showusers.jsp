<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <div class="users-list">
        <ul class="users-list-item">
            <c:forEach items="${allUsersFromStorage}" var="map"  >
                <li>${map.value.id} | ${map.value.fullName} | ${map.value.email} | ${map.value.password} |
                 ${map.value.activated}</li>
            </c:forEach>
        </ul>
    </div>
</div>
<body>

