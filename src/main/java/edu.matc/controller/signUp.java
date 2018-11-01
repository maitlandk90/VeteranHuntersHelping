package edu.matc.controller;


import edu.matc.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/signUp"}
)
public class signUp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = req.getParameter("Username");
        String password = req.getParameter("Password");
        String repassword = req.getParameter("RePassword");
        String rank = "Novice";

        UserDao userDao = new UserDao();

        if (userName != null) {
            if (repassword != null && password == repassword ) {
                RequestDispatcher dispatcher = req.getRequestDispatcher("/signIn.jsp");
                dispatcher.forward(req, resp);
            }
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/signUp.jsp");
            dispatcher.forward(req, resp);
        }

    }
}