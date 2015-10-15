/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pc.lib.dao.imp;

import static com.mx.teknei.pc.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pc.lib.dao.GenericDao;
import com.mx.teknei.pc.lib.db.exception.UnableToSaveException;
import java.lang.reflect.ParameterizedType;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author HAENCISO
 */
public class GenericDaoImp<Entity, K extends Serializable> implements GenericDao<Entity, K> {

    public Class<Entity> domainClass = getDomainClass();
    private Session session;

    protected Class getDomainClass() {
        if (domainClass == null) {
            ParameterizedType thisType = (ParameterizedType) getClass()
                    .getGenericSuperclass();
            domainClass = (Class) thisType.getActualTypeArguments()[0];
        }
        return domainClass;
    }

    private Session getHibernateTemplate() {
        session = getSessionFactory().openSession();
        session.beginTransaction();
        return session;
    }

    @Override
    public void add(Entity t) {
        try {
            getHibernateTemplate().save(t);
            session.getTransaction().commit();
        } catch (HibernateException e) {
           System.out.println(e.getMessage());
            throw new UnableToSaveException(e);
        }finally{
            session.close();
        }
    }

    @Override
    public void update(Entity t) {
        try {
            getHibernateTemplate().update(t);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            throw new UnableToSaveException(e);
        }finally{
            session.close();
        }
    }

    @Override
    public Entity find(K id) {
        Entity returnValue = (Entity) getHibernateTemplate().load(domainClass, id);
        session.getTransaction().commit();
        return returnValue;
    }

    @Override
    public void erase(Entity t) {
        getHibernateTemplate().delete(t);
        session.getTransaction().commit();
    }

}
