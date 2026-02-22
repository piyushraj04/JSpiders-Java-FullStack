package org.jsp.merchantapp;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.merchantproductapp.dao.MerchantDao;
import org.jsp.merchantproductapp.dao.ProductDao;

public class MerchantProductController {
	static ProductDao pdao = new ProductDao();
	static MerchantDao mdao = new MerchantDao();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("1. Save Merchant");
		System.out.println("2. Update Merchant");
		System.out.println("3. Find Merchant by Id");
		System.out.println("4. Verify Merchant by Email");
		System.out.println("5. Verify Merchant by Phone and Password");
		
		System.out.println("6. Add Product");
		System.out.println("7. Update Product");
		System.out.println("8. Find Products by Merchant id");
		System.out.println("9. Find products by brand");
		System.out.println("10. Find products by Category");
		System.out.println("Enter Your choice??");
		
		int choice = sc.nextInt();
		switch (choice) {
		case 1:saveMerchant();
			break;
		case 2:updateMerchant();
			break;
		case 3:findMerchantById();
			break;
		case 4:verifyMerchantByEmailAndPassword();
			break;
		case 5:verifyMerchantByPhoneAndPassword();
			break;
		case 6:addProduct();
			break;
		case 7:updateProduct();
			break;
		case 8:findProductByMerchantId();
			break;
			
			
		default:
			break;
		}
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("dev");
		System.out.println(fac);
	}
	
	private static void findProductByMerchantId() {
		System.out.println("Enter Merchant id ??");
		int mid = sc.nextInt();
		
		List<Product> lpdb = pdao.findProductByMerchantId(mid);
		if(lpdb.size() > 0)
		{
			for(Product product : lpdb)
			{
				System.out.println(product);
			}
		}
		else {
			System.out.println("No Product info found since Merchant id is Invalid!");
		}
	}

	private static void updateProduct() {
		// TODO Auto-generated method stub
		
	}

	private static void addProduct() {
		System.out.println("Enter Merchant id to find Merchant");
		int mid = sc.nextInt();
		
		System.out.println("Enter the Product info ----name, brand, category, cost");
		Product p = new Product();
		p.setName(sc.next());
		p.setBrand(sc.next());
		p.setCategory(sc.next());
		p.setCost(sc.nextDouble());
		Product pdb = pdao.addProduct(mid, p);
		if(pdb != null)
		{
			System.out.println("Product is added to the Merchant with an id " + pdb.getId());
		}
		else {
			System.out.println("Unable to add the product since mod is invalid!!");
		}
	}

	private static void verifyMerchantByPhoneAndPassword() {
		// TODO Auto-generated method stub
		
	}

	private static void verifyMerchantByEmailAndPassword() {
		System.out.println("Enter Email??");
		String em = sc.next();
		System.out.println("Enter Password??");
		String pw = sc.next();
		
		Merchant mdb = mdao.verifyMerchantByEmailAndPassword(em, pw);
		if(mdb != null)
		{
			System.out.println("Merchant is verified!");
		}
		else {
			System.out.println("Merchant is not Verified!!");
		}
	}

	private static void findMerchantById() {
		System.out.println("Enter Merchant id to find??");
		int mid = sc.nextInt();
		Merchant mdb = mdao.findMerchantById(mid);
		if(mdb != null)
		{
			System.out.println(mdb);
		}
		else {
			System.out.println("Merchant info not found since Merchant id is invalid!!");
		}
	}

	private static void updateMerchant() {
		System.out.println("Enter Merchant Info to Update... id, name, phone, gst, email, password");
		Merchant m = new Merchant();
		m.setId(sc.nextInt());
		m.setName(sc.next());
		m.setPhone(sc.nextLong());
		m.setGst_num(sc.next());
		m.setEmai(sc.next());
		m.setPassword(sc.next());
		Merchant mdb = mdao.updateMerchant(m);
		if(mdb != null)
		{
			System.out.println("Merchant info is updated!!");
		}
		else {
			System.out.println("Merchant info is not updated!");
		}
	}
	private static void saveMerchant() {
		System.out.println("Enter Merchant info ---- name, phone, gst, email, password");
		String name = sc.next();
		long ph = sc.nextLong();
		String gst = sc.next();
		String email = sc.next();
		String password = sc.next();
		
		Merchant m = new Merchant();
		m.setName(name);
		m.setPhone(ph);
		m.setGst_num(gst);
		m.setEmai(email);
		m.setPassword(password);
		
		ProductDao pdao = new ProductDao();
		MerchantDao mdao = new MerchantDao();
		Merchant mdb = mdao.saveMerchant(m);
		System.out.println("Merchant is saved with an id " + mdb.getId());
	}
}
