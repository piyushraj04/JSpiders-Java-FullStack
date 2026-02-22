class Sample
{
	static int x;
	static double y;
	static char z;
	
	static
	{
		x = 10;
		y = 1.356;
		z = 'J';
	}
	
	public static void main(String[ ] args)
	{
		System.out.println(Sample.x);
		System.out.println(Sample.y);
		System.out.println(Sample.z);
	}
}