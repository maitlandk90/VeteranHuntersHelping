package edu.matc.persistence;

import edu.matc.entity.Equipment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class EquipmentDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    public List<Equipment> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Equipment> query = builder.createQuery( Equipment.class );
        Root<Equipment> root = query.from(Equipment.class);
        List<Equipment> armorSet = session.createQuery( query ).getResultList();

        logger.debug("The list of hunters equipment sets " + armorSet);
        session.close();

        return armorSet;
    }


    public Equipment getById(int id) {
        Session session = sessionFactory.openSession();
        Equipment armorSet = session.get( Equipment.class, id );
        session.close();
        return armorSet;
    }

    public int insert(Equipment armorSet) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(armorSet);
        transaction.commit();
        session.close();
        return id;
    }

    public void delete(Equipment armorSet) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(armorSet);
        transaction.commit();
        session.close();
    }

    public void saveOrUpdate(Equipment armorSet) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(armorSet);
        transaction.commit();
        session.close();
    }


}
