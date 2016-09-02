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

@WebServlet("")
public class Index extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/pages/index.jsp");
                dispatcher.forward(request, response);

        ArrayList<NewsItem> newsList = new ArrayList<>();

        //hardcoded news items temporary

        request.setAttribute("item-1", new NewsItem(1, "The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 19, 2016", "../../images/news-300.jpg)",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add(2, new NewsItem(2, "The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 19, 2016", "../../images/news-300.jpg)",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add(3, new NewsItem(3, "The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 19, 2016", "../../images/news-300.jpg)",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add(4, new NewsItem(4, "The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 19, 2016", "../../images/news-300.jpg)",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add(5, new NewsItem(5, "The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 19, 2016", "../../images/news-300.jpg)",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add(6, new NewsItem(6, "The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 19, 2016", "../../images/news-300.jpg)",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));
        newsList.add(7, new NewsItem(7, "The New Mercedes-Maybach Is the 6-Meter-Long Car of Your Dreams",
                "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "Its meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.\n" +
                        "\n" + "Tonight in Carmel, Calif., Mercedes-Benz unveiled the latest of its Maybach line: the Vision Mercedes-Maybach 6. " +
                        "The gullwing 2+2 concept has a low, sleek hood, a massive touchscreen inside, and an all-electric powertrain. " +
                        "It's meant to show what a Mercedes-Benz car could look like, and do, in 10 or 15 years' time.",
                "August 19, 2016", "../../images/news-300.jpg)",
                "http://www.bloomberg.com/news/articles/2016-08-19/the-mercedes-maybach-vision-6-concept-unveiled-at-pebble-beach"));

        // transmit news list to JSP (VIEW) via Attributes of http request
        request.setAttribute("newsItems", newsList);
    }
}