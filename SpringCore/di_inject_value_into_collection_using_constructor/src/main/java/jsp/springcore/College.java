package jsp.springcore;

import java.util.List;

public class College {
	
	String name;
	String location;
	List<String> department;
	public College(String name,String location,List department) {
		super();
		this.name=name;
		this.location=location;
		this.department=department;
	}
	
	
	@Override
	public String toString() {
		return "College [name=" + name + ", location=" + location + ", department=" + department + "]";
	}
	
	

}
