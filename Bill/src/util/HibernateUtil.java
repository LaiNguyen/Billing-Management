/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;
import model.Persistence;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author admin
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static List executeSelectHQLQuery(String hql) {
        List resultList = new ArrayList<>();
        try {
            Session session = getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            resultList = (ArrayList) q.list();
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        
        return resultList;
    }
    
    public static int executeUpdateHQLQuery(String hql) throws HibernateException {
        int result = 0;
        try {
            Session session = getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            result = q.executeUpdate();
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException he) {
            he.printStackTrace();
            throw he;
        }

        return result;
    }
    
    public static int executeInsertHQLQuery(Persistence object) throws HibernateException {
        try {
            Session session = getSessionFactory().openSession();
            session.beginTransaction();
            int id = (int) session.save(object);
            session.getTransaction().commit();
            session.close();
            return id;
        } catch (HibernateException he) {
            he.printStackTrace();
            throw he;
        }
    }
}
