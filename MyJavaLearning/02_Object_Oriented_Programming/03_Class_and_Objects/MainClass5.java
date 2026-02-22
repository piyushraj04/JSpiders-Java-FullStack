class Player
{
	int jerseyNo;
	String name;
	
	void play()
	{
		System.out.println(name+" is a baller");
	}
	void position()
	{
		System.out.println(jerseyNo+ " a Captain");
	}
}

public class MainClass5
{
	public static void main(String [] args)
	{
		Player p1 = new Player();
		p1.jerseyNo = 7;
		p1.name = "Dhoni";
		p1.play();
		p1.position();
		
		Player p2 = new Player();
		p2.jerseyNo = 8;
		p2.name = "kohli";
		p2.position();
	}
}