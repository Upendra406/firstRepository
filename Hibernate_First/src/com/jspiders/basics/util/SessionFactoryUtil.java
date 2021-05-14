package com.jspiders.basics.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
	private static SessionFactory sessionFactory=null;

	private SessionFactoryUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure();
			 sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
		
	}

}
