package edu.matc.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "Equipment")
@Table(name = "Equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter
    @Setter
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="UserId")
    @Getter
    @Setter private User hunter;

    @Column(name = "WeaponID")
    @Getter
    @Setter private int weaponID;
    @Column(name = "HeadID")
    @Getter
    @Setter private int headID;
    @Column(name = "ArmsID")
    @Getter
    @Setter private int armsID;
    @Column(name = "ChestID")
    @Getter
    @Setter private int chestID;
    @Column(name = "WaistID")
    @Getter
    @Setter private int waistID;
    @Column(name = "LegsID")
    @Getter
    @Setter private int legsID;

    public Equipment() {}

    public Equipment(int weaponID, int headID, int armsID, int chestID, int waistID, int legsID) {
        this.weaponID = weaponID;
        this.headID = headID;
        this.armsID = armsID;
        this.chestID = chestID;
        this.waistID = waistID;
        this.legsID = legsID;
    }

}
