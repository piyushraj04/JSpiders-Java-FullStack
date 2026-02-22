package jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory = new AnnotationConfigApplicationContext(MyConfig.class);
		Person p = factory.getBean("person",Person.class);
		System.out.println(p);
	}
	
}
