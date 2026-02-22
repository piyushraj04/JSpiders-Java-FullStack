class Alpha
{
	static char ch= 'P';
	static int val = 20;
	
	static void disp()
	{
		System.out.println("Executiong disp()...");
	}
	
	static void push()
	{
		System.out.println("Executiong push()...");
	}
}

public class MainClass3
{
	public static void main(String[] args)
	{
		System.out.println(Alpha.ch);
	System.out.println(Alpha.val);
	Alpha.disp();
	Alpha.push();
	}
}