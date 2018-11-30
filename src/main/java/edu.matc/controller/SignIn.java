package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/signIn"}
)
public class SignIn extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("Username") != null && req.getParameter("Username") != "") {
            String userName = req.getParameter("Username");
            if (req.getParameter("Password") != null && req.getParameter("Password") != "" ) {
                String password = req.getParameter("Password");
                UserDao checkForUser = new UserDao();
                User userLoggingIn = checkForUser.getUserByUserName(userName);
                if (userLoggingIn.getPassword().equals(password)) {
                    HttpSession userSession = req.getSession(true);
                    userSession.setAttribute("userProfile", userLoggingIn);
                    RequestDispatcher dispatcher = req.getRequestDispatcher("/profile");
                    dispatcher.forward(req, resp);
                } else {
                    forwardWithErrorMessage(req, resp, "Incorrect Password");
                }
            } else {
                forwardWithErrorMessage(req, resp, "Please Enter a Password");
            }
        } else {
            forwardWithErrorMessage(req, resp, "Please Enter a Username");
        }
    }

    private void forwardWithErrorMessage(HttpServletRequest req, HttpServletResponse resp, String errorMessage) throws ServletException, IOException {
        req.setAttribute("signInErrorMessage", errorMessage);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/signIn.jsp");
        dispatcher.forward(req, resp);
    }
}