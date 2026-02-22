package jsp.springcore;

import java.util.List;

public class Company {
	String name;
	String location;
	List<String>employee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getEmployee() {
		return employee;
	}
	public void setEmployee(List<String> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", employee=" + employee + "]";
	}
	

}
