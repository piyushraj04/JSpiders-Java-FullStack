package jsp.springCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("myConfig.xml");
		Employee e = factory.getBean("myEmployee",Employee.class);
		System.out.println(e);
	}

}
