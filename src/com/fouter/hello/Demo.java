package com.fouter.hello;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.fouter.domain.Customer;
import com.fouter.utils.HibernateUtils;
import com.sun.org.apache.xerces.internal.impl.dv.ValidatedInfo;

public class Demo {
	@Test
	//±£´æ¿Í»§
	public void fun1(){
		Session session=HibernateUtils.openSession();
		
		Transaction transaction=session.beginTransaction();
		
	//	Query query=session.createQuery("from Customer where cust_id= :aaa and cust_name= :bbb");
		
		Query query=session.createQuery("from Customer");
		
		List<Customer> list=query.list();
		
		System.out.println(list);
		
		transaction.commit();
		
		session.close();
	}
	
}
