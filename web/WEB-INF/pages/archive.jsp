<%@ page import="com.grudiy.slownews.model.NewsItem" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Author: grudiy
  Date: 19.08.2016
--%>
<%@ include file="sidebar.jsp" %>
<html>
<head>
    <title>Archive of My News - SlowNews</title>
</head>
<body>

<div class="content">
    <h1>Archive of My News</h1>

    <ul class="news-list">
        <c:forEach items="${archiveItems}" var="newsMap">
            <li class="news-list-item">
                <div class="news-item">
                    <div class="news-item-image-container">
                        <div class="news-item-action">
                            <div class="news-archive-favorited" title="Remove from archive"></div>
                        </div>
                        <div class="news-item-image">
                            <a href="${newsMap.link}"><img src="${newsMap.imageURL}"
                                                           title="${newsMap.title}"></a>
                        </div>
                    </div>
                    <div class="news-item-text">
                        <div class="news-item-title">
                            <h2><a href="${newsMap.link}">${newsMap.title}</a></h2>
                        </div>
                        <div class="news-item-date">${newsMap.date}</div>
                            ${newsMap.summary}
                    </div>
                </div>
            </li>
        </c:forEach>
    </ul>

</div>
</body>
</html>
