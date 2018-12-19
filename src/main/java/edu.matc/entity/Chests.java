package edu.matc.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "Chests")
@Table(name = "Chests")
public class Chests {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter
    @Setter
    private int id;

    @Column(name = "name")
    @Getter
    @Setter private String name;

}
