<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.grudiy.slownews.controller.GlobalStorage" %>
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
            <%=GlobalStorage.getFromMapByKey(request.getRequestURI()) // for map of maps
                    // OLD version
             //get all data from GlobalStorage (where it was placed by controller
                // This was for just HashMap<String, Object>
                //for (Map.Entry<String, Object> entry : getHashmap().entrySet()) {
                //    out.println  ("<li>" + "[" + entry.getKey() + "] = "
                //            + entry.getValue() + "</li>");
               // }
            %>
        </ul>
    </div>
</div>
<body>

