package org.jsp.OneToManyUni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDepartmentAndEmployee {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		Department dept = new Department();
		dept.setName("Training");
		dept.setLocation("BTM");
		
		Employee emp = new Employee();
		emp.setName("Piyush");
		emp.setDesg("Trainer");
		emp.setSalary(50000.0);
		emp.setPhone(7979919112l);
		
		Employee emp2 = new Employee();
		emp2.setName("Mayank");
		emp2.setDesg("Trainer");
		emp2.setSalary(80000.0);
		emp2.setPhone(8271009827l);
		
		Employee emp3 = new Employee();
		emp3.setName("Keshav");
		emp3.setDesg("Trainer");
		emp3.setSalary(75000.0);
		emp3.setPhone(954662959l);
		
		Employee emp4 = new Employee();
		emp4.setName("Gagan");
		emp4.setDesg("Trainer");
		emp4.setSalary(25000.0);
		emp4.setPhone(8544006252l);
		
		/*
		 * List<Employee> lemps = new ArrayList<Employee>(); lemps.add(emp);
		 * lemps.add(emp2); lemps.add(emp3); lemps.add(emp4);
		 * 
		 * dept.setEmps(lemps);
		 */
		//
		dept.setEmps(Arrays.asList(emp,emp2,emp3,emp4));
		man.persist(dept);
		
		
		tran.commit();
		
	}

}
