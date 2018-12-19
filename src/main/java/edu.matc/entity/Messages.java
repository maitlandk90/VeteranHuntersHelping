package edu.matc.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "Messages")
@Table(name = "Messages")
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter
    @Setter
    private int id;

    @Column(name = "ToUser")
    @Getter
    @Setter private int toUser;

    @Column(name = "FromUser")
    @Getter
    @Setter private int fromUser;

    @Column(name = "Message")
    @Getter
    @Setter private String message;

    public Messages(){}

    public Messages(int toUser, int fromUser, String message){
        this.toUser = toUser;
        this.fromUser = fromUser;
        this.message = message;
    }


}
