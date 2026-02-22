package org.hib.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCFG {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure(); //Load
		SessionFactory sef = conf.buildSessionFactory(); //validate
		System.out.println(sef);
	}

}
