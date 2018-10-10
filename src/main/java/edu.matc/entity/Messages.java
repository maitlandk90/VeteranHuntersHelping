package edu.matc.entity;

public class Messages {
    private int id;
    private String toUser;
    private String fromUser;
    private String message;

    public Messages(){}

    public Messages(String toUser, String fromUser, String message){
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

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
