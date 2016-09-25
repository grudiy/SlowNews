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

@WebServlet("/register")
public class Register extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/pages/register.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //add to storage user received from JSP registration form
        UserStorage.addToMap(UserStorage.getUsers().size() + 1, new User(UserStorage.getUsers().size() + 1,
                request.getParameter("name"), request.getParameter("email"), request.getParameter("password"), true));
        request.getRequestDispatcher("/WEB-INF/pages/registerresult.jsp").forward(request, response);
    }
}
