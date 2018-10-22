package edu.matc.persistence;

import edu.matc.entity.Equipment;
import edu.matc.entity.User;
import edu.matc.entity.Weapons;
import edu.matc.testutils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EquipmentDaoTest {

    EquipmentDao equipmentDao;
    WeaponsDao weaponsDao;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        database.runSQL("insertdb.sql");

        equipmentDao = new EquipmentDao();
        weaponsDao = new WeaponsDao();
    }

    @Test
    void getByIdSuccess() {
        Equipment armorSet = equipmentDao.getById(1);

        Weapons weapon = weaponsDao.getById(armorSet.getWeaponID());

        assertEquals("Xeno Insect Glaive", weapon.getName());
    }

    @Test
    void getAllSuccess() {
        List<Equipment> equipmentList = equipmentDao.getAll();
        assertEquals(4, equipmentList.size());
    }

    @Test
    void insertSuccess() {
        User newHunter = new User("Alaina", "sillygirl", "novice");
        Equipment newEquipment = new Equipment(1,1,1,1,1,1);
        newEquipment.setHunter(newHunter);
        newHunter.setArmorSet(newEquipment);


        UserDao userDao = new UserDao();
        userDao.insert(newHunter);

        equipmentDao.insert(newEquipment);

        newEquipment = equipmentDao.getById(5);
        Weapons weapon = weaponsDao.getById(newEquipment.getWeaponID());

        assertEquals("Iron SnS", weapon.getName());
    }

    @Test
    void deleteSuccess() {
        Equipment armorSetToDelete = equipmentDao.getById(2);
        equipmentDao.delete(armorSetToDelete);

        Equipment deletedArmorSet = equipmentDao.getById(2);

        assertNull(deletedArmorSet);
    }

    @Test
    void updateSuccess() {
        Equipment armorSetUpdate = equipmentDao.getById(4);

        armorSetUpdate.setHeadID(3);
        armorSetUpdate.setChestID(3);
        armorSetUpdate.setArmsID(3);
        armorSetUpdate.setWaistID(3);
        armorSetUpdate.setLegsID(3);

        equipmentDao.saveOrUpdate(armorSetUpdate);

        Equipment armorSetAfterUpdate = equipmentDao.getById(4);

        assertEquals(armorSetUpdate.getChestID(), armorSetAfterUpdate.getChestID());
        assertEquals(armorSetUpdate.getArmsID(), armorSetAfterUpdate.getArmsID());
        assertEquals(armorSetUpdate.getLegsID(), armorSetAfterUpdate.getLegsID());
    }
}
