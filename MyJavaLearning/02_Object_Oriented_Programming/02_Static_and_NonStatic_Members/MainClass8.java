class Utility
{
	static double x = 55.66;
	char y = 'r';
	
	static void play()
	{
		System.out.println("Executing play()....");
	}
	
	void help()
	{
		System.out.println("Executing help()");
	}
}

public class MainClass8
{
	public static void main(String[] args)
	{
		
		Utility u =  new Utility();
		
		System.out.println(Utility.x);
	
		System.out.println(u.y);
		
		Utility.play();
	
		u.help();
	}
}