package edu.matc.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "Waists")
@Table(name = "Waists")
public class Waists {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter
    @Setter
    private int id;

    @Column(name = "name")
    @Getter
    @Setter private String name;

    public Waists(){}

    public Waists(String name) {
        this.name = name;
    }


}
