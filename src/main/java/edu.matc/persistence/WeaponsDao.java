package edu.matc.persistence;

import edu.matc.entity.Weapons;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class WeaponsDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    public List<Weapons> getAll() {

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Weapons> query = builder.createQuery( Weapons.class );
        Root<Weapons> root = query.from(Weapons.class);
        List<Weapons> weaponsList = session.createQuery( query ).getResultList();

        logger.debug("The list of weapons " + weaponsList);
        session.close();

        return weaponsList;
    }

    public Weapons getById(int id) {
        Session session = sessionFactory.openSession();
        Weapons armorSet = session.get( Weapons.class, id );
        session.close();
        return armorSet;
    }

    public int insert(Weapons weapons) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(weapons);
        transaction.commit();
        session.close();
        return id;
    }

    public void delete(Weapons weapons) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(weapons);
        transaction.commit();
        session.close();
    }

    public void saveOrUpdate(Weapons weapons) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(weapons);
        transaction.commit();
        session.close();
    }
}
