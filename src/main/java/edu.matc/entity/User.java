package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "User")
@Table(name = "user")
public class User {
    private String username;
    private String password;
    private String rank;
    private int Equipment;

    private int id;


    public User() {

    }

    public User(String username, String password, String rank, int equipment) {
        this.username = username;
        this.password = password;
        this.rank = rank;
        this.equipment = equipment;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getEquipment() {
        return Equipment;
    }

    public void setEquipment(int equipment) {
        Equipment = equipment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}