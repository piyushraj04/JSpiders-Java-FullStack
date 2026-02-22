package org.jsp.jpanew;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateMerchant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Merchant id to Update : ");
		int mid  = sc.nextInt();
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev"); // method will check the persistence unit
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		Merchant m = man.find(Merchant.class, mid);
		if(m!=null) {
			m.setName("Mayank Karn");
			m.setPhone(8271009827l);
			m.setGst_num("ABCD1234");
			m.setEmail("mayank@gmail.com");
			m.setPassword("1111111111");
			tran.commit();
		}
		else {
			System.err.println("Unable to update since mid is not valid");
		}
		sc.close();
	}

}
