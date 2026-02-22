package org.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("myConfig.xml");;
		Student s = factory.getBean("myConfig",Student.class);
		System.out.println(s.getId());
	}

}
