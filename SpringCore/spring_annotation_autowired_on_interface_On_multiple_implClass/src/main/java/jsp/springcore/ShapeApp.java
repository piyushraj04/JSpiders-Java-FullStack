package jsp.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class ShapeApp {
	@Autowired
	@Qualifier(value="square")
	Shape shape;
	public void display() {
		shape.sides();
	}

}
