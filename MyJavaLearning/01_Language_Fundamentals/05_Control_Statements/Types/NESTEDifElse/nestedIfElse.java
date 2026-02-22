class nestedIfElse
{
	public static void main(String [] args)
	{
		int a = 6 ;
		if(a % 2 == 0)
		{
			if(a < 10)
			{
				System.out.println("Paani Puri");
			}
			else 
			{
				System.out.println("Bhel Puri");
			}
		}
		
		else
		{
			if(a < 10)
			{
				System.out.println("Masala Puri");
			}
			else
			{
				System.out.println("Dahi Puri");
			}
		}
	}
}