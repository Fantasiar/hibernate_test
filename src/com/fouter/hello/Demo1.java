package com.fouter.hello;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.fouter.domain.Customer;
import com.fouter.domain.LinkMan;
import com.fouter.utils.HibernateUtils;

public class Demo1 {
	@Test
	public void demo1() {
		
		Session session=HibernateUtils.getCurrentSession();
		
		Transaction transaction=session.beginTransaction();
		
		Customer customer=new Customer();
		
		customer.setCust_name("fouter");
		
		LinkMan lkm1=new LinkMan();
		
		lkm1.setLkm_name("jack");
		
		LinkMan lkm2=new LinkMan();
		
		lkm2.setLkm_name("tom");
		
		customer.getLinkMans().add(lkm1);
		
		customer.getLinkMans().add(lkm2);
		
		lkm1.setCustomer(customer);
		
		lkm2.setCustomer(customer);
		
		session.save(customer);
		
		session.save(lkm1);
		
		session.save(lkm2);
		
		transaction.commit();
		
	}
}
