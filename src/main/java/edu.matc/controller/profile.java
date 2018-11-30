package edu.matc.controller;

import edu.matc.entity.Equipment;
import edu.matc.entity.*;
import edu.matc.persistence.EntityDAO;
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
        urlPatterns = {"/profile"}
)
public class profile extends HttpServlet {

    EntityDAO armDao = new EntityDAO(Arms.class);
    EntityDAO chestDao = new EntityDAO(Chests.class);
    EntityDAO headDao = new EntityDAO(Heads.class);
    EntityDAO legDao = new EntityDAO(Legs.class);
    EntityDAO waistDao = new EntityDAO(Waists.class);
    EntityDAO weaponDao = new EntityDAO(Weapons.class);

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getUserPrincipal().getName();
        if (req.getParameter("id") != null) {
            // id was passed for some profile
            int id = Integer.parseInt(req.getParameter("id"));
            UserDao checkForUser = new UserDao();
            User userProfile = checkForUser.getById(id);
            setEquipmentAndUser(userProfile, req);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/profile.jsp");
            dispatcher.forward(req, resp);
        } else if (userName != null) {
            // here's where i want to use req.getUserPrincipal().getName()
            // user signed in
            UserDao checkForUser = new UserDao();
            User userProfile = checkForUser.getUserByUserName(userName);
            setEquipmentAndUser(userProfile, req);
            req.setAttribute("sameUser", true);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/profile.jsp");
            dispatcher.forward(req, resp);
        } else {

        }

    }

    private void setEquipmentAndUser(User user, HttpServletRequest req) {
        Equipment userSet = user.getArmorSet();

        Arms userArm = (Arms)armDao.getById(userSet.getArmsID());
        Chests userChest = (Chests) chestDao.getById(userSet.getChestID());
        Heads userHead = (Heads)headDao.getById(userSet.getHeadID());
        Legs userLeg = (Legs)legDao.getById(userSet.getLegsID());
        Waists userWaist = (Waists) waistDao.getById(userSet.getWaistID());
        Weapons userWeapon = (Weapons) weaponDao.getById(userSet.getWeaponID());

        req.setAttribute("userArm", userArm);
        req.setAttribute("userChest", userChest);
        req.setAttribute("userHead", userHead);
        req.setAttribute("userLeg", userLeg);
        req.setAttribute("userWaist", userWaist);
        req.setAttribute("userWeapon", userWeapon);
        req.setAttribute("userProfile", user);
    }

}