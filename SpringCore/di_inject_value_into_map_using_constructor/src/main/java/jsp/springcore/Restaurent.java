package jsp.springcore;

import java.util.Map;

public class Restaurent {
	String name;
	String location;
	Map<Integer,String> dish;
	public Restaurent(String name,String location,Map<Integer,String> dish)
	{
		this.name=name;
		this.location=location;
		this.dish=dish;
	}
	@Override
	public String toString() {
		return "Restaurent [name=" + name + ", location=" + location + ", dish=" + dish + "]";
	}
	

}
