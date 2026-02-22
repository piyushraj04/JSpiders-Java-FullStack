class Mobile
{
	String model;
	
	double price;
	
	void call()
	{
		System.out.println("Calling in "+model);
	}
	
	void selfie()
	{
		System.out.println("Price is "+price);
	}
}

public class MainClass3
{
	public static void main(String[] args)
	{
		Mobile m1 = new Mobile();
		
		m1.model = "Iphone 16";
		m1.price = 1.5;
		m1.call();
		m1.selfie();
		
		Mobile m2 = new Mobile();
		m2.model = "S24 Ultra";
		m2.price = 2.5;
		m2.call();
		m2.selfie();
		
	}
}
