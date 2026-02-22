class Example
{
	 int num = 50;
	 double val = 5.34;
	
    void disp()
	{
		System.out.println("Executiong disp()...");
	}
	
	void send()
	{
		System.out.println("Executiong send()...");
	}
}

public class MainClass5
{
	public static void main(String[] args)
	{
		Example ex = new Example();
		System.out.println(ex.num);
		System.out.println(ex.val);
		ex.disp();
		ex.send();
		
	}
}