package com.fouter.hello;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.fouter.domain.Customer;

public class Demo {
	@Test
	//保存客户
	public void fun1(){
		Configuration configuration=new Configuration().configure();
		
		SessionFactory sFactory=configuration.buildSessionFactory();
		
		Session session=sFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Customer customer=new Customer();
		
		customer.setCust_name("小明");
		
		customer.setCust_source("市场运营");
		
		session.save(customer);
		
		transaction.commit();
		
		session.close();
	}
}
