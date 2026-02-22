class Circle
{
	int radius;
	Circle(int arg)
	{
		radius = arg;
	}
}

public class MainClass2
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(10);
		System.out.println(c1.radius);
		
		Circle c2 = new Circle(25);
		System.out.println(c2.radius);
		
		Circle c3 = new Circle(6);
		System.out.println(c3.radius);
	}
}