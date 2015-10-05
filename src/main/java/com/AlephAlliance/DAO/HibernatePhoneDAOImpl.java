package com.AlephAlliance.DAO;

import com.AlephAlliance.model.IPhone;
import org.apache.log4j.Logger;
import com.AlephAlliance.utils.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.transaction.Transaction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Vitalii on 08.09.2015.
 */
@Repository
public class HibernatePhoneDAOImpl implements PhoneDAO {

    private static final Logger LOG = Logger.getLogger(HibernatePhoneDAOImpl.class);
    @Autowired
    private EntityManagerFactory factory;

    public HibernatePhoneDAOImpl() {
    }

    public HibernatePhoneDAOImpl(EntityManagerFactory factory) {
        this.factory = factory;
    }

    public List<IPhone> getPhoneByParameters(IPhone phone) {

        if(phone.getModel() == null)
            phone.setModel("%");
        if(phone.getColor() == null)
            phone.setColor("%");
        if(phone.getMemory() == null)
            phone.setMemory("%");
        if(phone.getCondition() == null)
            phone.setCondition("%");

        System.out.println(phone);

        EntityManager manager = factory.createEntityManager();
        TypedQuery<IPhone> query = manager.createQuery("SELECT p FROM IPhone p WHERE p.color LIKE :color AND p.model like :model AND p.condition like :condition AND p.memory like :memory", IPhone.class)
                .setParameter("color", phone.getColor())
                .setParameter("model", phone.getModel())
                .setParameter("condition", phone.getCondition())
                .setParameter("memory", phone.getMemory());
//        TypedQuery<IPhone> query = manager.createQuery("SELECT p FROM IPhone p", IPhone.class);

        return query.getResultList();
    }

    public Integer saveIPhone(IPhone phone) {
        int result = -1;

        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try{
            transaction.begin();
            manager.persist(phone);
            manager.flush();
            result = 1;
            transaction.commit();
        }catch (Exception e){
            LOG.error(e);
            transaction.rollback();
        }

        return result;
    }

    public IPhone getPhoneById(long id) {
        EntityManager manager = factory.createEntityManager();
        TypedQuery<IPhone> query = manager.createQuery("SELECT p FROM IPhone p WHERE p.id = :id", IPhone.class).setParameter("id", id);
        return query.getSingleResult();
    }

}
