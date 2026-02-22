package org.jsp.jpanew;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindMerchant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id : ");
		int mid  = sc.nextInt();
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev"); // method will check the persistence unit
		EntityManager man = fac.createEntityManager();
		
		Merchant m=man.find(Merchant.class,mid);
		if(m!=null) {
			System.out.println(m);
		}
		else {
			System.err.println("No Merchant Info is Found Since mid is Invalid");
		}
		
		sc.close();
	}

}
