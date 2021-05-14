package com.jspiders.basics.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.jspiders.basics.dto.MobileDTO;
import com.jspiders.basics.util.SessionFactoryUtil;

public class MobileDAO {
	
	public void saveMobileDetails(MobileDTO mobileDTO) {
		
		// db logic
//		Configuration cfg = new Configuration();
//		cfg.configure();
//		cfg.addAnnotatedClass(MobileDTO.class);
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(mobileDTO);
		transaction.commit();
	}
	
	
 	public MobileDTO getMobileDetailsByModel(String model) {
		
//		Configuration cfg = new Configuration();
//		cfg.configure();
//		cfg.addAnnotatedClass(MobileDTO.class);
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		//Transaction transaction = session.beginTransaction();
		
		MobileDTO mobileDTO= null;
		try {
	         mobileDTO=(MobileDTO)session.get(MobileDTO.class ,model);
		}catch(HibernateException e) {
			System.out.println(e.toString());
		}
		return mobileDTO;
	} 

}
