package com.leaf.school.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDAO{	
	
     
    @Autowired
    private SessionFactory sessionFactory;
 
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
 

}
