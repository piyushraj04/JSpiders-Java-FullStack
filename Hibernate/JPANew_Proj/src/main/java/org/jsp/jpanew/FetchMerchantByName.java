package org.jsp.jpanew;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FetchMerchantByName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String nm = sc.nextLine();
		
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev"); // method will check the persistence unit
		EntityManager man = fac.createEntityManager();
		Query q = man.createQuery("select m from Merchant m where m.name=?1");
		q.setParameter(1, nm);
		List<Merchant> lm = q.getResultList();
		if(lm.size()>0) {
			for (Merchant merchant : lm) {
				System.out.println(merchant);
				
			}
		}
		else {
			System.out.println("No Merchant Info is found since name is invalid");
		}
	}

}
