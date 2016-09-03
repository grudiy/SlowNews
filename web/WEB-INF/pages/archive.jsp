<%@ page import="com.grudiy.slownews.model.NewsItem" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
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

<div class ="content">
  <h1>Archive of My News</h1>

  <ul class="news-list">
    <%
      List<NewsItem> archiveList = (ArrayList<NewsItem>) request.getAttribute("archiveItems");
      for (NewsItem archiveItem:archiveList){
    %>

    <li class ="news-list-item">
      <div class="news-item">
        <div class="news-item-image-container">
          <div class="news-item-action">
            <div class ="news-archive-favorited" title="Delete from archive"></div>
          </div>
          <div class="news-item-image">
            <a href="<%=archiveItem.getLink()%>"><img src="<%=archiveItem.getImageURL()%>" title="<%=archiveItem.getTitle()%>"></a>
          </div>
        </div>
        <div class="news-item-text">
          <div class = "news-item-title">
            <h2><a href="<%=archiveItem.getLink()%>"><%=archiveItem.getTitle()%></a></h2>
          </div>
          <div class="news-item-date"><%=archiveItem.getDate()%></div>
          <%=archiveItem.getSummary()%>
        </div>
      </div>
    </li>
    <%}%>
  </ul>

</div>
</body>
</html>
