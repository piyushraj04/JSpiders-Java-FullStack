class Laptop
{
	String wallpaper = "Alia.jpeg";
}
public class ShallowCopies
{
	public static void main(String [] args)
	{
	Laptop p1 = new Laptop();
	Laptop p2 = p1;
	
	
	System.out.println(p1.wallpaper);
	System.out.println(p2.wallpaper);
	
	p1.wallpaper = "Hrithik.jpeg";
	
	System.out.println(p1.wallpaper);
	System.out.println(p2.wallpaper);
	
	p2.wallpaper = "karina.jpeg";
	System.out.println(p1.wallpaper);
	}
}