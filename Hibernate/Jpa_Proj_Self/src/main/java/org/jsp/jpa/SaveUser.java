package org.jsp.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure(); //Load
		SessionFactory sef = conf.buildSessionFactory(); //validate
		Session ses = sef.openSession();
		Transaction tran = ses.getTransaction();
		tran.begin();
		User u = new User();
		u.setId(2);
		u.setName("keshav");
		u.setPhone(79779152L);
		u.setEmail("keshavraj@gmail.com");
		ses.saveOrUpdate(u);
		tran.commit();
		
	}

}
