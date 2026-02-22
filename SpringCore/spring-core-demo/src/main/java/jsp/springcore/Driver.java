package jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("myConfig.xml");
		//Person2 p = (Person2) factory.getBean("myPerson");
		
		Person2 p = factory.getBean("myPerson",Person2.class);
		System.out.println(p);
		
		
	}

}
