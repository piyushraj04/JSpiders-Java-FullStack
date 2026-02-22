package jsp.springcore;

import org.springframework.stereotype.Component;

@Component
public class Ticket {

	public void bookTicket() {
		System.out.println("Ticket is confirmed");
	}
}
