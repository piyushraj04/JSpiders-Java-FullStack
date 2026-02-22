package jsp.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person2 {
	@Value(value="1")
	int id;
	@Value("Piyush")
	String name;
	@Value("22")
	int age;
	@Override
	public String toString() {
		return "Person2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
