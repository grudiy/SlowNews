package com.grudiy.slownews.controller;

import com.grudiy.slownews.model.NewsItem;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("")
public class Index extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        List<NewsItem> newsList = new ArrayList<>();

        //generate dummy news items
        newsList.add(new NewsItem(1, "111 The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 19, 2016", "../../images/news-300.jpg",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add( new NewsItem(2, "222 The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 20, 2016", "../../images/news-300.jpg",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add(new NewsItem(3, "333 The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 21, 2016", "../../images/news-300.jpg",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add(new NewsItem(4, "444 The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 22, 2016", "../../images/news-300.jpg",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add(new NewsItem(5, "555 The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 23, 2016", "../../images/news-300.jpg",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add(new NewsItem(6, "666 The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 19, 2016", "../../images/news-300.jpg",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add(new NewsItem(7, "777 The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 24, 2016", "../../images/news-300.jpg",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));

        // transmit news list to JSP (VIEW) via Attributes of http request
        request.setAttribute("newsItems", newsList);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/pages/index.jsp");
        dispatcher.forward(request, response);
    }
}