package com.eversontcc.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	@SuppressWarnings("deprecation")
	public static SessionFactory buildSessionFactory() {
		try {
			
			Configuration cfg =  new Configuration().configure("META-INF/hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	/*  try{
         Configuration cfg = new Configuration();
                       cfg.configure("hibernate.cfg.xml");
 
        return cfg.buildSessionFactory();
 
       }catch(Throwable b){
 
            System.out.println("Não deu \n" + b);
            throw new ExceptionInInitializerError();
       }
   }*/

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
