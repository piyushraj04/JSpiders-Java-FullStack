package jsp.springcore;

import org.springframework.stereotype.Component;

@Component
public class Google implements Mobile {
	@Override
	public void ring() {
		System.out.println("Mobile is ringing...!!!");
	}
	

}
