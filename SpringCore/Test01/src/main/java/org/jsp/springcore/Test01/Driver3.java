package org.jsp.springcore.Test01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver3 {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("myConfig3.xml");
		Bank b = factory.getBean("myBank",Bank.class);
		System.out.println(b);
	}

}
