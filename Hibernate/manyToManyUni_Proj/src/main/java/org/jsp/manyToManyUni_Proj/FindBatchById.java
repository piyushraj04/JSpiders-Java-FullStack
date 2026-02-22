package org.jsp.manyToManyUni_Proj;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindBatchById {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		
	}

}
