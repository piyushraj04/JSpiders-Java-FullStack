class MultipleDataTypes
{
		static void test(char ch,boolean bool,double arg)
		{
		
			System.out.println("Character :" + ch);
			System.out.println("Boolean :" + bool);
			System.out.println("Double :" + arg);
		}
		
	public static void main(String [] args)
	{
	
			System.out.println("Program starts");
			test('A',true,3.5);
			System.out.println("Program ends");
	}
}