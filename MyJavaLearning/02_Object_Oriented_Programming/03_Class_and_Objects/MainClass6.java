class Laptop
{
	int ram;
	String model;
	
	void processor()
	{
		System.out.println(model +" is good");
	}
	void game()
	{
		System.out.println(ram + " is a gaming pc");
	}
}

public class MainClass6
{
	public static void main(String [] args)
	{
		Laptop l1  = new Laptop();
		l1.ram = 8;
		l1.model = "HP15s";
		l1.processor();
		l1.game();
		
		Laptop l2  = new Laptop();
		l2.ram = 16;
		l2.model = "Acer";
		l2.processor();
		l2.game();
	}
}