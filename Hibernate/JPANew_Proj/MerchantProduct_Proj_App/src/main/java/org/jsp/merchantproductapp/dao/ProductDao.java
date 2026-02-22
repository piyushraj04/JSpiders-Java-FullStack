package org.jsp.merchantproductapp.dao;

import java.util.List;

import javax.persistence.*;
import org.jsp.merchantapp.*;

public class ProductDao {
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
	EntityManager man = fac.createEntityManager();

	public Product addProduct(int mid, Product p) {
		EntityTransaction tran = man.getTransaction();
		tran.begin();
		Merchant mdb = man.find(Merchant.class, mid);
		if(mdb != null)
		{
			p.setMerchant(mdb);
			mdb.getProducts().add(p);
			man.persist(p);
			tran.commit();
			return p;
		}
		else {
			return null;
		}
	}

	public List<Product> findProductByMerchantId(int mid) {
		Query q = man.createQuery("select m.products from Merchant m where m.id=?1");
		q.setParameter(1, mid);
		List<Product> lp= q.getResultList();
		return lp;
	}
}
