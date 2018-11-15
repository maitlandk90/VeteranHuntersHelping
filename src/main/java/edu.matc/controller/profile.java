package edu.matc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/profile"}
)
public class profile extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getUserPrincipal().getName();
        if (user != null) {
            // user signed in
        } else if (req.getParameter("id") != null) {
            // id was passed for some profile
            // here's where i want to use req.getUserPrincipal().getName()
        } else {

        }
    }
}