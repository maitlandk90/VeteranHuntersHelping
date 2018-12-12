package edu.matc.controller;

import edu.matc.entity.*;
import edu.matc.persistence.EntityDAO;
import edu.matc.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/edit"}
)
public class edit extends HttpServlet {

    EntityDAO armDao = new EntityDAO(Arms.class);
    EntityDAO chestDao = new EntityDAO(Chests.class);
    EntityDAO headDao = new EntityDAO(Heads.class);
    EntityDAO legDao = new EntityDAO(Legs.class);
    EntityDAO waistDao = new EntityDAO(Waists.class);
    EntityDAO weaponDao = new EntityDAO(Weapons.class);
    UserDao getUser = new UserDao();


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("id") != null) {
            int id = Integer.parseInt(req.getParameter("id"));

            List<Arms> allArms = armDao.getAll();
            List<Chests> allChests = chestDao.getAll();
            List<Heads> allHeads = headDao.getAll();
            List<Legs> allLegs = legDao.getAll();
            List<Waists> allWaists = waistDao.getAll();
            List<Weapons> allWeapons = weaponDao.getAll();

            User user = getUser.getById(id);

            req.setAttribute("allArms", allArms);
            req.setAttribute("allChests", allChests);
            req.setAttribute("allHeads", allHeads);
            req.setAttribute("allLegs", allLegs);
            req.setAttribute("allWaists", allWaists);
            req.setAttribute("allWeapons", allWeapons);
            req.setAttribute("editUser", user);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/profile-edit.jsp");
            dispatcher.forward(req, resp);


        }

    }

}
