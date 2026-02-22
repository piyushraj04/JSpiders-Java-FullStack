class Program3
{
		static void test(double arg)  //Formal Argument
		{
			System.out.println("value Passed is : " + arg);
		}
		
		static void help(boolean bool)  //Formal Argument
		{
			System.out.println("value Passed is : " + bool);
		}
	public static void main(String [] args)
	{
	
			System.out.println("Program starts");
			
			test(4.5);   //Actual Argument
			
			help(true);   //Actual Argument
			
			System.out.println("Program ends");
	}
}