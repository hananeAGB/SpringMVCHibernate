/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensat.dao;

import com.ensat.model.Utilisateur;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public class UserDao implements IntDao{
//private static final Logger logger = (Logger) LoggerFactory.getLogger(UserDao.class);

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void addUser(Utilisateur user) {
       Session session = this.sessionFactory.getCurrentSession();
		session.save(user);
  //      logger.info("Person saved successfully, Person Details="+user);
    }
 
   
//    @Override
//    public void deleteUser(String userId) {
//        Utilisateur user = (Utilisateur) sessionFactory.getCurrentSession().load(Utilisateur.class, userId);
//        if (null != user) {
//            this.sessionFactory.getCurrentSession().delete(user);
//        }
// 
//    }
// 
//    public Utilisateur getUser(int userId) {
//        return (Utilisateur) sessionFactory.getCurrentSession().get(Utilisateur.class, userId);
//    }
// 
//    @Override
//    public boolean saveOrUpdateUser(Utilisateur user) {
//        sessionFactory.getCurrentSession().update(user);
//        return true;
//    }
//
//    @Override
//        @SuppressWarnings("unchecked")
//    public List<Utilisateur> getAllelements() {
//        return sessionFactory.getCurrentSession().createQuery("from Utilisateur").list();
//    }
//
//    @Override
//    public Utilisateur listUserById(String userId) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
