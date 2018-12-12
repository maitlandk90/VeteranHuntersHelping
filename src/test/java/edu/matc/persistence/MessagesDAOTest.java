package edu.matc.persistence;

import edu.matc.entity.Messages;
import edu.matc.testutils.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessagesDAOTest {

    MessagesDAO messagesDAO;


    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleanMessagedb.sql");
        database.runSQL("insertMessagedb.sql");

        messagesDAO = new MessagesDAO();
    }

    @Test
    void getById() {
        Messages message = messagesDAO.getById(1);

        String thisMessage = "test test";

        assertEquals(thisMessage, message.getMessage());
    }

    @Test
    void insert() {
        Messages newMessage = new Messages(3,4,"This is a new message!");
        int newid = messagesDAO.insert(newMessage);
        Messages insertedMessage = messagesDAO.getById(newid);
        assertEquals(newid, insertedMessage.getId());

        Messages newMessage2 = new Messages(1,2,"and another one!");
        int newid2 = messagesDAO.insert(newMessage2);
        Messages insertedMessage2 = messagesDAO.getById(newid2);
        assertEquals(newid2, insertedMessage2.getId());
    }

    @Test
    void delete() {
        Messages deleteMessage = messagesDAO.getById(2);
        messagesDAO.delete(deleteMessage);
        Messages deletedMessage = messagesDAO.getById(2);
        assertNull(deletedMessage);
    }


}