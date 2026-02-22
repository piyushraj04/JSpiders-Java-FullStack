package org.jsp.OneToOneUni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByName {
       public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Person name : ");
    String pname= sc.nextLine();
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();
	Query q = man.createQuery("select p from Person p where p.name=?1");
	q.setParameter(1, pname);
	List<Person> lp = q.getResultList();
	if(lp.size()>0) {
		for(Person p : lp)
		{
			
			System.out.println(p);
			
		}
	}else {
		System.out.println("No Person Info found is I is invalid...");
	}
	
}

}
