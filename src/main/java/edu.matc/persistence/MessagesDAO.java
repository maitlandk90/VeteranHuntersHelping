package edu.matc.persistence;

import edu.matc.entity.Messages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class MessagesDAO {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    public List<Messages> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Messages> query = builder.createQuery( Messages.class );
        Root<Messages> root = query.from(Messages.class);
        List<Messages> messages = session.createQuery( query ).getResultList();

        logger.debug("The list of messages " + messages);
        session.close();

        return messages;
    }

    public Messages getById(int id) {
        Session session = sessionFactory.openSession();
        Messages messageSet = session.get( Messages.class, id );
        logger.debug("The message by id " + messageSet);
        session.close();
        return messageSet;
    }

    public int insert(Messages message) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(message);
        logger.debug("New Message Inserted " + message);
        transaction.commit();
        session.close();
        return id;
    }

    public void delete(Messages message) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(message);
        transaction.commit();
        session.close();
    }

    public void saveOrUpdate(Messages message) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(message);
        transaction.commit();
        session.close();
    }

}
