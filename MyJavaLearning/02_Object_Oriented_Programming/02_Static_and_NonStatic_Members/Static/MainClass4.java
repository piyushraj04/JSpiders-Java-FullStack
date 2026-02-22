class Delta
{
	static char ch= 'P';
	static int val = 20;
	
    void disp()
	{
		System.out.println("Executiong disp()...");
	}
	
	void push()
	{
		System.out.println("Executiong push()...");
	}
}

public class MainClass4
{
	public static void main(String[] args)
	{
	System.out.println(new Delta().ch);
	System.out.println(new Delta().val);
	new Delta().disp();
	new Delta().push();
	}
}