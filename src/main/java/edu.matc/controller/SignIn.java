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
//        HttpSession existingSession = req.getSession(false);
//        if ( existingSession != null ) {
//            req.setAttribute("existingSessionErrorMessage", "You are already signed in, please sign out first.");
//            RequestDispatcher dispatcher = req.getRequestDispatcher("/signIn.jsp");
//            dispatcher.forward(req, resp);
//        }

        if (req.getParameter("Username") != null && req.getParameter("Username") != "") {
            String userName = req.getParameter("Username");
            if (req.getParameter("Password") != null && req.getParameter("Password") != "" ) {
                String password = req.getParameter("Password");
                UserDao checkForUser = new UserDao();
                User userLoggingIn = checkForUser.getUserByUserName(userName);

                if (userLoggingIn.getPassword().equals(password)) {
                    HttpSession userSession = req.getSession(true);
                    userSession.setAttribute("signedInUser", userLoggingIn);
                    //req.setAttribute("userProfilePage", userLoggingIn);
                    RequestDispatcher dispatcher = req.getRequestDispatcher("/profile.jsp" + "?id=" + userLoggingIn.getId());
                    dispatcher.forward(req, resp);
                } else {
                    forwardWithErrorMessage(req, resp, "Incorrect Password");
//                    req.setAttribute("signInErrorMessage", "Incorrect Password");
//                    RequestDispatcher dispatcher = req.getRequestDispatcher("/signIn.jsp");
//                    dispatcher.forward(req, resp);
                }
            } else {
                forwardWithErrorMessage(req, resp, "Please Enter a Password");
//                req.setAttribute("signInErrorMessage", "Please Enter a Password");
//                RequestDispatcher dispatcher = req.getRequestDispatcher("/signIn.jsp");
//                dispatcher.forward(req, resp);
            }
        } else {
            forwardWithErrorMessage(req, resp, "Please Enter a Username");
//            req.setAttribute("signInErrorMessage", "Please Enter a Username");
//            RequestDispatcher dispatcher = req.getRequestDispatcher("/signIn.jsp");
//            dispatcher.forward(req, resp);
        }
    }

    private void forwardWithErrorMessage(HttpServletRequest req, HttpServletResponse resp, String errorMessage) throws ServletException, IOException {
        req.setAttribute("signInErrorMessage", errorMessage);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/signIn.jsp");
        dispatcher.forward(req, resp);
    }
}