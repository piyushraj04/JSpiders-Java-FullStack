package org.jsp.manyToManyBi_Proj;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBatchAndStudentInfo {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		
		Batch b = new Batch();
		b.setBatch_Code("JavaB1");
		b.setSubject("Java");
		b.setTrainer("Pawan");
		
		
		Batch b2 = new Batch();
		b2.setBatch_Code("WebB2");
		b2.setSubject("Web Tech");
		b2.setTrainer("Akishay");
		
		
		Student s1 = new Student();
		s1.setName("Piyush");
		s1.setPhone(7979919112l);
		s1.setPerc(79.86);
		
		
		Student s2 = new Student();
		s2.setName("Raj");
		s2.setPhone(7979925112l);
		s2.setPerc(80.86);
		
		
		Student s3 = new Student();
		s3.setName("Mayank");
		s3.setPhone(827919112l);
		s3.setPerc(89.86);
		
		
		//Uni
		b.setStudents(Arrays.asList(s1,s2,s3));
		b2.setStudents(Arrays.asList(s1,s2,s3));
		
		
		//Bi
		s1.setBatches(Arrays.asList(b));
		s2.setBatches(Arrays.asList(b,b2));
		s3.setBatches(Arrays.asList(b,b2 ));
		
		man.persist(b);
		man.persist(b2);
		tran.commit();
	}

}
