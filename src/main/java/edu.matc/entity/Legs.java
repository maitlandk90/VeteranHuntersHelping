package edu.matc.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "Legs")
@Table(name = "Legs")
public class Legs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter
    @Setter
    private int id;

    @Column(name = "Name")
    @Getter
    @Setter private String name;


}
