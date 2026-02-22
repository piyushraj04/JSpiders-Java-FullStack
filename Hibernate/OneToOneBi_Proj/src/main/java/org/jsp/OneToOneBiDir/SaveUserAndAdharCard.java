package org.jsp.OneToOneBiDir;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUserAndAdharCard {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		
		User u = new User();
		u.setName("Piyush");
		u.setPhone(7979919112l);
		
		AdharCard card = new AdharCard();
		card.setNumber(702132758577l);
		card.setAddress("Sitamarhi,Bihar");
		
		card.setUser(u);
		u.setCard(card);
		
		man.persist(u);
		
		tran.commit();
		
	}

}
