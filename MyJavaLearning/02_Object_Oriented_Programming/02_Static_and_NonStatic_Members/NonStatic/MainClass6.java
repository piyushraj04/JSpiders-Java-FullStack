class Beta
{
	char ch = 'P';
	boolean bool = true;
	
    void read()
	{
		System.out.println("Executiong read()...");
	}
	
	void write()
	{
		System.out.println("Executiong write()...");
	}
}

public class MainClass6
{
	public static void main(String[] args)
	{
		Beta ex = new Beta();
		System.out.println(ex.ch);
		System.out.println(ex.bool);
		ex.read();
		ex.write();
		
	}
}