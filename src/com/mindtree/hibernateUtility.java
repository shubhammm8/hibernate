package com.mindtree;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class hibernateUtility {

	  private static final SessionFactory sessionFactory = buildSessionFactory();
	  
	    private static SessionFactory buildSessionFactory() {
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	            Configuration configuration = new Configuration();
	            configuration.configure("hibernate.cfg.xml");
	            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
	                    .applySettings(configuration.getProperties())
	                    .buildServiceRegistry();
	            System.out.println("session factory done-----------------------------------------------------------------------------------");
	            return configuration.buildSessionFactory(serviceRegistry);
	        } catch (Throwable ex) {
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	 
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	
	
	
}
