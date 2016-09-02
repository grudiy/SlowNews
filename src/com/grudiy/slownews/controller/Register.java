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
    }
}