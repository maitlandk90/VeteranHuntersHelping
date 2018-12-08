package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "Messages")
@Table(name = "Messages")
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "ToUser")
    private int toUser;

    @Column(name = "FromUser")
    private int fromUser;

    @Column(name = "Message")
    private String message;

    public Messages(){}

    public Messages(int toUser, int fromUser, String message){
        this.toUser = toUser;
        this.fromUser = fromUser;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getToUser() {
        return toUser;
    }

    public void setToUser(int toUser) { this.toUser = toUser; }

    public int getFromUser() {
        return fromUser;
    }

    public void setFromUser(int fromUser) {
        this.fromUser = fromUser;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
