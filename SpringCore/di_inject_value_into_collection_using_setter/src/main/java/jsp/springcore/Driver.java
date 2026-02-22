package jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("myConfig.xml");
		Company c = factory.getBean("myCompany",Company.class);
		System.out.println(c);
	}

}
