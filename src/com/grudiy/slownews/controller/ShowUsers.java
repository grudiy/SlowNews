package com.grudiy.slownews.controller;

import com.grudiy.slownews.model.User;
import com.grudiy.slownews.model.UserStorage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Owner on 29.08.2016.
 */
@WebServlet("/showusers")
public class ShowUsers extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        //dummy data
        UserStorage.addToMap(1, new User(1, "Andrei First", "aaa-1@ukr.net", "123", true));
        UserStorage.addToMap(2, new User(2, "Andrei Second", "aaa-2@gmail.com", "321", true));

        // send data via attributes of http request to JSP
        request.setAttribute("allUsersFromStorage", UserStorage.getUsers());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/pages/showusers.jsp");
        dispatcher.forward(request, response);
    }
}
