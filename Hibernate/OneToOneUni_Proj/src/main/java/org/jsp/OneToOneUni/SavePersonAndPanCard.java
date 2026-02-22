package org.jsp.OneToOneUni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAndPanCard {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();//to persist the Entity information
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		
		Person p = new Person();
		p.setName("Piyush");
		p.setPhone(7979919112l);
		p.setPinCode(843320);
		
		PanCard card = new PanCard();
		card.setNumber("ABC1234");
		card.setPinCode(843320);
		
		p.setCard(card);
		man.persist(p);
		man.persist(card);
		tran.commit();
		
	}

}
