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
    <title>SlowNews - the Best News Reader</title>
  </head>
  <body>

  <div class = "content">
    <h1>Latest news</h1>
    <ul class="news-list">
  <%
         List<NewsItem> newsList = (ArrayList<NewsItem>) request.getAttribute("newsItems");
          for (NewsItem newsItem:newsList){
  %>

      <li class ="news-list-item">
        <div class="news-item">
          <div class="news-item-image-container">
            <div class="news-item-action">
              <div class ="news-item-favorites" title="Add to archive"></div>
            </div>
            <div class="news-item-image">
                <a href="<%=newsItem.getLink()%>"><img src="<%=newsItem.getImageURL()%>" title=<%=newsItem.getTitle()%>"></a>
            </div>
          </div>
          <div class="news-item-text">
              <div class = "news-item-title">
                  <h2><a href="<%=newsItem.getLink()%>"><%=newsItem.getTitle()%></a></h2>
              </div>
              <div class="news-item-date"><%=newsItem.getDate()%></div>
              <%=newsItem.getSummary()%>
          </div>
        </div>
      </li>
        <%}%>
    </ul>
  </div>

  </body>
</html>