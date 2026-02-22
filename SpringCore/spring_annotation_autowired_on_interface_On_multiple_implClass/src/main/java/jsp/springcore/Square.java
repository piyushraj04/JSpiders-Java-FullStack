package jsp.springcore;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {
	@Override
	public void sides() {
		System.out.println("4 sides");
	}
	

}
