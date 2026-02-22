package jsp.springcore;

public class Person {
	Mobile mobile;
	
	public Person(Mobile mobile) {
		super();
		this.mobile = mobile;
	}

	public void use() {
		System.out.println("Person is using mobile");
		mobile.ring();
	}

	@Override
	public String toString() {
		return "Person [mobile=" + mobile + "]";
	}
	
	

}
