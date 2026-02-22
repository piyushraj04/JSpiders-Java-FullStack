class Program2
{
		static void test(char ch)  //Formal Argument
		{
			System.out.println("value is : " + ch);
		}
		
	public static void main(String [] args)
	{
	
			System.out.println("Program starts");
			test('J');   //Actual Argument
			test('Q');   //Actual Argument
			test('P');   //Actual Argument
			System.out.println("Program ends");
	}
}