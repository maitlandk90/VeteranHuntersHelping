package edu.matc.controller;

import edu.matc.entity.Messages;
import edu.matc.entity.User;
import edu.matc.persistence.EntityDAO;
import edu.matc.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        urlPatterns = {"/messages"}
)
public class messages extends HttpServlet {

    EntityDAO messageDAO = new EntityDAO(Messages.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("id") != null) {
            // id was passed for some user messages
            ArrayList<Messages> userMessages = new ArrayList<Messages>();

            List<Messages> messageList = messageDAO.getByPropertyEqual("toUser", req.getParameter("id"));

            for (int i = 0; i < messageList.size(); i++) {
                userMessages.add(messageList.get(i));
            }
            req.setAttribute("userMessages", userMessages);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/messages.jsp");
            dispatcher.forward(req, resp);
        }
    }
}