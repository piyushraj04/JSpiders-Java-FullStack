class Bike
{
	int cc;
	
	double price;
	
	void drive()
	{
		System.out.println("driving in "+cc);
	}
	
	void clean()
	{
		System.out.println("clean is "+ price);
	}
}

public class MainClass4
{
	public static void main(String[] args)
	{
		Bike b1 = new Bike();
		
		b1.cc = 400;
		b1.price = 3.2;
		b1.drive();
		b1.clean();
		
		Bike  b2 = new Bike();
		b2.cc = 350;
		b2.price = 2.37;
		b2.drive();
		b2.clean();
		
	}
}
