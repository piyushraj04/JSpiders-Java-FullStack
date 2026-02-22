package org.jsp.manyToManyBi_Proj;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FIndBatchByBatch_Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter batch_Code: ");
		String bCode = sc.nextLine();
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
//		Batch b = new Batch();
		Query q = man.createQuery("select b from Batch b where b.batch_Code=?1");
		
		q.setParameter(1, bCode);
		
		try {
			Batch p = (Batch) q.getSingleResult();
			System.out.println(p);
		}
		catch(NoResultException e) {
			System.out.println("No Batch info is found since batch_Code is invalid...");
		}
		finally {
			sc.close();
		}
	}

}
