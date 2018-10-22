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
        urlPatterns = {"/searchHunters"}
)
public class searchHunter extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String searchTerm;


        UserDao userDao = new UserDao();

        if (req.getParameter("searchTerm") != null ||
                !req.getParameter("searchTerm").equals("")) {
            searchTerm = req.getParameter("searchTerm");
            req.setAttribute("hunters", userDao.getUsersByUserName(searchTerm));
        } else {
            req.setAttribute("hunters", userDao.getAll());
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/searchHunters.jsp");
        dispatcher.forward(req, resp);

    }

}
