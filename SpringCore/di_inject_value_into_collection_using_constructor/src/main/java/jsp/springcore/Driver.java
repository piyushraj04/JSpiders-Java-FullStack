package jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("myConfig.xml");
		College college = factory.getBean("myCollege",College.class);
		System.out.println(college);
	}

}
