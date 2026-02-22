class Program2
{
	static double test()
	{
		return 2.5;
	}
		
	public static void main(String [] args)
	{
	        double val = test();
			System.out.println("Program starts");
			System.out.println("Returned value is :" + test());
			System.out.println("Returned value is :" + val);
			System.out.println("Program ends");
	}
}