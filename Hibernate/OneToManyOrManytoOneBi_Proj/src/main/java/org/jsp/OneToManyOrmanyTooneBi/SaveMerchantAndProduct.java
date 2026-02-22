package org.jsp.OneToManyOrmanyTooneBi;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMerchantAndProduct {
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		EntityManager man = fac.createEntityManager();
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		
		Merchant merchant = new Merchant();
		merchant.setName("Piyush");
		merchant.setPhone(7979919112l);
		merchant.setGst_Num("ABC@123");
		merchant.setEmail("piyush004.raj@gmail.com");
		merchant.setPassword("123456");
		
		
		
		Product p1 = new Product();
		p1.setName("TV");
		p1.setBrand("Sony");
		p1.setCategory("Electronics");
		p1.setCost(30000.0);
		p1.setMerchant(merchant);
		
		Product p2 = new Product();
		p2.setName("Fan");
		p2.setBrand("Usha");
		p2.setCategory("Electrical");
		p2.setCost(3000.0);
		p2.setMerchant(merchant);
		
		Product p3 = new Product();
		p3.setName("Mobile");
		p3.setBrand("Google");
		p3.setCategory("Electronics");
		p3.setCost(55000.0);
		p3.setMerchant(merchant);
		
		merchant.setProducts(Arrays.asList(p1,p2,p3));
		man.persist(merchant);
		
		/* avoided by cascade , we can  use in any one class but merchant is best suitable
		 * man.persist(p1); man.persist(p2); man.persist(p3); // is imp if cascade is in product but if in merchant then only time persist is required
		 */
		
		tran.commit();
	}

}
