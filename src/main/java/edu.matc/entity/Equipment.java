package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "Equipment")
@Table(name = "Equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;
    @Column(name = "WeaponID")
    private int weaponID;
    @Column(name = "HeadID")
    private int headID;
    @Column(name = "ArmsID")
    private int armsID;
    @Column(name = "ChestID")
    private int chestID;
    @Column(name = "WaistID")
    private int waistID;
    @Column(name = "LegsID")
    private int legsID;


    public Equipment() {}

    public Equipment(int weaponID, int headID, int armsID, int chestID, int waistID, int legsID) {
        this.weaponID = weaponID;
        this.headID = headID;
        this.armsID = armsID;
        this.chestID = chestID;
        this.waistID = waistID;
        this.legsID = legsID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeaponID() {
        return weaponID;
    }

    public void setWeaponID(int weaponID) {
        this.weaponID = weaponID;
    }

    public int getHeadID() {
        return headID;
    }

    public void setHeadID(int headID) {
        this.headID = headID;
    }

    public int getArmsID() {
        return armsID;
    }

    public void setArmsID(int armsID) {
        this.armsID = armsID;
    }

    public int getChestID() {
        return chestID;
    }

    public void setChestID(int chestID) {
        this.chestID = chestID;
    }

    public int getWaistID() {
        return waistID;
    }

    public void setWaistID(int waistID) {
        this.waistID = waistID;
    }

    public int getLegsID() {
        return legsID;
    }

    public void setLegsID(int legsID) {
        this.legsID = legsID;
    }

}
