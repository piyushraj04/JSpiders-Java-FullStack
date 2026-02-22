package org.jsp.jpanew;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMerchant {

	public static void main(String[] args) {
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev"); // method will check the persistence unit
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		
		Merchant m = new Merchant();
		
		/*
		m.setName("Piyush Raj");
		m.setPhone(7979919112l);
		m.setGst_num("GST1234@123");
		m.setEmail("piyush004.raj@gmail.com");
		m.setPassword("123456789");
		*/
		/*
		m.setName("Mayank Karn");
		m.setPhone(8271009827l);
		m.setGst_num("ABCD1234");
		m.setEmail("mayanl@gmail.com");
		m.setPassword("1111111111");
		*/
		
		m.setName("Mayank");
		m.setPhone(9546669366l);
		m.setGst_num("ABCD@33214");
		m.setEmail("MayankK@gmail.com");
		m.setPassword("1111111111");
		
		man.persist(m);
		
		tran.commit();
		
		
		
	}
}
