package org.jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory = new AnnotationConfigApplicationContext(myConfig.class);
		Laptop lap = factory.getBean("laptop",Laptop.class);
		System.out.println(lap);
	}
}
