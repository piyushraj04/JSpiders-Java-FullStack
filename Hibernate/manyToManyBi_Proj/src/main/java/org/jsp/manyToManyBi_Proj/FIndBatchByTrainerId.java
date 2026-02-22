package org.jsp.manyToManyBi_Proj;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FIndBatchByTrainerId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter trainer name: ");
		String trainer = sc.nextLine();
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		Query q = man.createQuery("select b from Batch b where b.trainer=?1");
		
		q.setParameter(1, trainer);
		
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
