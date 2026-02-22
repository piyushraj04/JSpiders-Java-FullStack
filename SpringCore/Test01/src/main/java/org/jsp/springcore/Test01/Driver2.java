package org.jsp.springcore.Test01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver2 {
	public static void main(String[] args) {
		BeanFactory factory =  new ClassPathXmlApplicationContext("myConfig2.xml");
		Order or = factory.getBean("myOrder",Order.class);
		System.out.println(or);
		
	}

}
