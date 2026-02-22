package jsp.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Triangle implements Shape {
	@Override
	public void sides() {
		System.out.println("3 sides");
	}
	

}
