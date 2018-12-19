package edu.matc.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 *
 */
@Entity(name = "User")
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter
    @Setter
    private int id;

    @Column(name = "UserName")
    @Getter
    @Setter private String username;
    @Column(name = "Password")
    @Getter
    @Setter private String password;
    @Column(name = "Rank")
    @Getter
    @Setter private String rank;

    @OneToOne(mappedBy = "hunter", fetch = FetchType.LAZY)
    @Getter
    @Setter
    private Equipment armorSet;

    public User() {

    }

    public User(String username, String password, String rank) {
        this.username = username;
        this.password = password;
        this.rank = rank;
    }

}