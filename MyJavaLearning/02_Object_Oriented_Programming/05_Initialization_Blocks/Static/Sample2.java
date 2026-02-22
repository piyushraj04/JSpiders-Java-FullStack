class Sample2
{
	static int x;
	static double y;
	static String z;
	
	static
	{
		x = 10;
	}
	static 
	{
		y = 45.66;
	}
	static 
	{
		z = "Java";
	}
	
	public static void main(String[ ] args)
	{
		System.out.println(Sample2.x);
		System.out.println(Sample2.y);
		System.out.println(Sample2.z);
	}
}