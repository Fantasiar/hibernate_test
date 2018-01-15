package com.fouter.hello;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.fouter.domain.Customer;

public class Demo {
	@Test
	//����ͻ�
	public void fun1(){
		Configuration configuration=new Configuration().configure();
		
		SessionFactory sFactory=configuration.buildSessionFactory();
		
		Session session=sFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Customer customer=new Customer();
		
		customer.setCust_name("С��");
		
		customer.setCust_source("�г���Ӫ");
		
		session.save(customer);
		
		transaction.commit();
		
		session.close();
	}
}
