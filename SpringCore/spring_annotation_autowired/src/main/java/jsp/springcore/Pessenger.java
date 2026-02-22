package jsp.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pessenger {
	
	@Autowired
	Ticket ticket;
	
	public void travel() {
		
		ticket.bookTicket();
		System.out.println("Pessenger is travelling...!!");
	}
	

}
