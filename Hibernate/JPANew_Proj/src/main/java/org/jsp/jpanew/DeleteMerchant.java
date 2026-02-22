package org.jsp.jpanew;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteMerchant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Merchant id to delete : ");
		int mid  = sc.nextInt();
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev"); // method will check the persistence unit
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		Merchant m = man.find(Merchant.class, mid);
		if(m!=null) {
			man.remove(m);
			tran.commit();
		}
		else {
			System.err.println("Unable to delete sice id is invalid");
		}
		sc.close();
	}

}
