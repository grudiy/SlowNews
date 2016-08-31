package com.grudiy.slownews.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.System.out;

@WebServlet("/archive")
public class Archive extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/pages/archive.jsp");
                dispatcher.forward(request, response);
    }
}
