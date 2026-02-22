package org.jsp.OneToOneUni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByPhone {
       public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Person id : ");
	int cid = sc.nextInt();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	Query q = man.createQuery("select p from Person p where p.card.id=?1");
    q.setParameter(1, cid);	
	try {
		Person p = (Person) q.getSingleResult();
		System.out.println(p);
	} catch (NoResultException e) {
		System.err.println("No Person info found since pancard id is invalid");
	}
	
}

}
