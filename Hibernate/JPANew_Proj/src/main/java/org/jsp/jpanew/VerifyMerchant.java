package org.jsp.jpanew;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class VerifyMerchant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone no. : ");
		long ph = sc.nextLong();
		System.out.println("Enter Password : ");
		String pw = sc.next();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev"); // method will check the persistence unit
		EntityManager man = fac.createEntityManager();
		Query q = man.createQuery("select m from Merchant m where m.phone=?1 and m.password=?2");
		q.setParameter(1, ph);
		q.setParameter(2, pw);
		sc.close();
		try {
			Merchant m = (Merchant) q.getSingleResult();
			//System.out.println(m);
			System.out.println("Merchant is verified...!!!");
		} catch (NoResultException e) {
			System.err.println("Merchant is not verified...!!!");
		}
		
		
	}

}
