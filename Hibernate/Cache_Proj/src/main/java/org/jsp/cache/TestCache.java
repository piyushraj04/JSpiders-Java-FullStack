package org.jsp.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCache {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man1 = fac.createEntityManager();
		EntityManager man2 = fac.createEntityManager();
		 man1.find(User.class,1);
		 man1.find(User.class,1);
		 man2.find(User.class,1);
		 man2.find(User.class,1);
		 
		 //two times hit if property of second level cache is "False"
		 //o/w only one time...(Persistence.xml->property->second_level_cache
	}

}
