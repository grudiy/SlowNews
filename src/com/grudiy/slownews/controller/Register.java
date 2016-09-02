package com.grudiy.slownews.controller;

import com.grudiy.slownews.model.User;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/register")
public class Register extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/pages/register.jsp");
                dispatcher.forward(request, response);
        //hardcoded temporary
        User user1 = new User("andrei", "asdf@ukr.net", "123");
        User user2 = new User("vladimir", "vv82@asdf.com", "432");
        User user3 = new User("alexander", "lex@gmail.com", "aksjdfh878");
        // create dummy users
        Map<String, Object> usermap = new HashMap<>();
        usermap.put("user-andrei", user1);
        usermap.put("user-vladimir", user2);
        usermap.put("user-alexander", user3);
        //send data to GlobalStorage
        //GlobalStorage.addToMap(request.getRequestURI(), usermap); - DORABOTAT!!!
    }
}
