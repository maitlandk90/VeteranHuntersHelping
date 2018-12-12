package edu.matc.controller;

import edu.matc.entity.Equipment;
import edu.matc.entity.User;
import edu.matc.persistence.EntityDAO;
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
        urlPatterns = {"/update"}
)
public class update extends HttpServlet {

    UserDao userDao = new UserDao();
    EquipmentDao equipmentDAO = new EquipmentDao();


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getUserPrincipal().getName();
        if (userName != null) {
            User userProfile = userDao.getUserByUserName(userName);

            int weaponID = Integer.parseInt(req.getParameter("updateWeapon"));
            int headID = Integer.parseInt(req.getParameter("updateHead"));
            int armID = Integer.parseInt(req.getParameter("updateArm"));
            int chestID = Integer.parseInt(req.getParameter("updateChest"));
            int waistID = Integer.parseInt(req.getParameter("updateWaist"));
            int legId = Integer.parseInt(req.getParameter("updateLeg"));

            Equipment updateEquipment = userProfile.getArmorSet();
            updateEquipment.setWeaponID(weaponID);
            updateEquipment.setHeadID(headID);
            updateEquipment.setArmsID(armID);
            updateEquipment.setChestID(chestID);
            updateEquipment.setWaistID(waistID);
            updateEquipment.setLegsID(legId);

            equipmentDAO.saveOrUpdate(updateEquipment);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/profile");
            dispatcher.forward(req, resp);

//            User newHunter = new User("Alaina", "sillygirl", "novice");
//            Equipment newEquipment = new Equipment(1,1,1,1,1,1);
//            newEquipment.setHunter(newHunter);
//            newHunter.setArmorSet(newEquipment);
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/profile");
            dispatcher.forward(req, resp);
        }
    }
}
