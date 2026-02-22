package org.jsp.hib_Proj;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCfg {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure(); //Load
		SessionFactory sef = conf.buildSessionFactory(); //validate
		System.out.println(sef);
	}

}
