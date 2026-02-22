package jsp.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	BeanFactory factory = new ClassPathXmlApplicationContext("myConfig");
	Car car = beanFactory.getBean("myXar")

}
