package org.jsp.jpanew;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateMerchantByMerge {
	public static void main(String[] args) {
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev"); // method will check the persistence unit
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		
		Merchant m = new Merchant();
		m.setId(5);
		m.setName("Purshottam");
		m.setPhone(8544006274l);
		m.setGst_num("GSTD@321");
		m.setEmail("purshottam@gmail.com");
		m.setPassword("444444444");
		
		man.merge(m);
		tran.commit();
		
	}

}
