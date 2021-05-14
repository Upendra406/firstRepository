package com.jspiders.basics.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.jspiders.basics.dto.MobileDTO;
import com.jspiders.basics.util.SessionFactoryUtil;

public class MobileHqlDao {
	
	public List<MobileDTO>getMobiles(){
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		String hql = "From MobileDTO";
		Query query = session.createQuery(hql);
		
		return query.list();
		
	}
	
	public List<MobileDTO>getMobileByModel(String model){
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		String hql = "From MobileDTO where model=:m";
		Query query = session.createQuery(hql);
		query.setParameter("m", model);
		return query.list();
	}

}
