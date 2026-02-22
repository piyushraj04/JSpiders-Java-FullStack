class Helper
{
	static int a = 55;
	int b = 6;
	
	static void test()
	{
		System.out.println("Executing test()....");
	}
	
	void disp()
	{
		System.out.println("Executing disp()");
	}
}

public class MainClass7_Mix
{
	public static void main(String[] args)
	{
		
		Helper h =  new Helper();
		System.out.println(Helper.a);
		//System.out.println(new Helper().b);
		System.out.println(h.b);
		
		Helper.test();
		//new Helper().disp();
		h.disp();
	}
}