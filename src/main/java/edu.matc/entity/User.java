package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 *
 */
@Entity(name = "User")
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "UserName")
    private String username;
    @Column(name = "Password")
    private String password;
    @Column(name = "Rank")
    private String rank;

    @OneToOne(mappedBy = "hunter", fetch = FetchType.LAZY)
    private Equipment armorSet;

    public Equipment getArmorSet() {
        return armorSet;
    }

    public void setArmorSet(Equipment armorSet) {
        this.armorSet = armorSet;
    }

    public User() {

    }

    public User(String username, String password, String rank) {
        this.username = username;
        this.password = password;
        this.rank = rank;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}