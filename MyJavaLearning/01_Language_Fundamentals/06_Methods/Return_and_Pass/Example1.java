class Example1
{
	
	static boolean verify(int a)
	{
		if(a%2==0)
		{
			return true ;
		}
		else
		{
			return false ;
		}
	}
	
	public static void main(String [] args)
	{
		System.out.println("Status : " + verify(10));
		System.out.println("Status : " + verify(9));
	}
}