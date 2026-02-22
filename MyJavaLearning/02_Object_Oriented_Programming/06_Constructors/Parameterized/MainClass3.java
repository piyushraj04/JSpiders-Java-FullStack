class Player
{
	String name ;
	int jerseyNumber ;
	Player(String arg1,int arg2)
	{
		name = arg1;
		jerseyNumber = arg2;
	}
	
}

public class j
{
	public static void main(String [] args)
	{
		Player p1 = new Player("Rohit",45);
		System.out.println(p1.name);
		System.out.println(p1.jerseyNumber);
		
		Player p2 = new Player("Gill",77);
		System.out.println(p2.name);
		System.out.println(p2.jerseyNumber);
		
		Player p3 = new Player("Sachin",10);
		System.out.println(p3.name);
		System.out.println(p3.jerseyNumber);
		
	}
}
