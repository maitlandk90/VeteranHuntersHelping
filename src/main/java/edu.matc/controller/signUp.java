package edu.matc.controller;


import edu.matc.entity.Equipment;
import edu.matc.entity.User;
import edu.matc.persistence.EquipmentDao;
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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();
        EquipmentDao armorSet = new EquipmentDao();

        if (req.getParameter("Username") != null && req.getParameter("Username") != "") {
            String userName = req.getParameter("Username");
            if (req.getParameter("Password") != null && req.getParameter("Password") != "" ) {
                String password = req.getParameter("Password");
                if (req.getParameter("RePassword") != null && req.getParameter("RePassword") != "") {
                    String repassword = req.getParameter("RePassword");
                    if (password.equals(repassword)) {
                        String rank = "Novice";
                        User newUser = new User(userName, password, rank);
                        Equipment newArmorSet = new Equipment(1,1,1,1,1,1);
                        newUser.setArmorSet(newArmorSet);
                        newArmorSet.setHunter(newUser);
                        userDao.insert(newUser);
                        armorSet.insert(newArmorSet);
                        req.setAttribute("signUpSuccessMessage", "Sign In to begin Hunting!");
                        RequestDispatcher dispatcher = req.getRequestDispatcher("/signIn.jsp");
                        dispatcher.forward(req, resp);
                    } else {
                        forwardWithErrorMessage(req, resp, "Passwords did not match");
                    }
                } else {
                    forwardWithErrorMessage(req, resp, "Please fill out form fully(Missing password re-enter)");
                }
            } else {
                forwardWithErrorMessage(req, resp, "Please fill out form fully(Missing password)");
            }
        } else {
            forwardWithErrorMessage(req, resp, "Please fill out form fully(Missing username)");
        }
    }

    public void forwardWithErrorMessage(HttpServletRequest req, HttpServletResponse resp, String msg) throws ServletException, IOException  {
        req.setAttribute("signUpErrorMessage", msg);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/signUp.jsp");
        dispatcher.forward(req, resp);
    }

}