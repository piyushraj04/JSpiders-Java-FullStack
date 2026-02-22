package org.jsp.manyToManyBi_Proj;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindBatchById {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int bid = sc.nextInt();
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		Batch b = man.find(Batch.class, bid);
		if(b!=null) {
			System.out.println(b);
		}else {
			System.err.println("no found since bid is invalid");
		}
		sc.close();
			
	}

}
