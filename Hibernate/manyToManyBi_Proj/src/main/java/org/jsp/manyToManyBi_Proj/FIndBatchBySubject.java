package org.jsp.manyToManyBi_Proj;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FIndBatchBySubject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject: ");
		String sub = sc.nextLine();
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		Query q = man.createQuery("select b from Batch b where b.subject=?1");
		
		q.setParameter(1, sub);
		
		try {
			Batch p = (Batch) q.getSingleResult();
			System.out.println(p);
		}
		catch(NoResultException e) {
			System.out.println("No Batch info is found since Subject is invalid...");
		}
		finally {
			sc.close();
		}
	}

}
