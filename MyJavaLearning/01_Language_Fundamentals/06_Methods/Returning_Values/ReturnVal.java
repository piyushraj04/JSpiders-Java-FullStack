// Tnis Program is written to practice the Return value in Methods

class ReturnVal
{
	static double disp()
	{
		return 4.678;
		disp();
		//System.out.println("The value which is getting returned by the disp() function is : "  );
	}
	
	public static void main(String [] args)
	{
		double val = disp();
		System.out.println(val);
		System.out.println("the value is : " + disp());
	}
}