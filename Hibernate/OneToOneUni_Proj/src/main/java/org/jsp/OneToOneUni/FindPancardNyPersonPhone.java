package org.jsp.OneToOneUni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPancardNyPersonPhone {
       public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Person phone : ");
	long pPh = sc.nextLong();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	Query q = man.createQuery("select p from Person p where p.phone=?1");
    q.setParameter(1, pPh);	
	try {
		Person p = (Person) q.getSingleResult();
		System.out.println(p);
	} catch (NoResultException e) {
		System.err.println("No person info found since phone is invalid");
	}
	
}

}
