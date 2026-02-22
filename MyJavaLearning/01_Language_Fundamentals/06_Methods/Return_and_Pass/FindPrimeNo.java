class FindPrimeNo
{
	static boolean FindPrimeNumber(int num)
	{
		int a = 1;
		int count = 0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				count++;
			}
			a++;
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String [] args)
	{
		for(int a = 1; a <= 100; a++)
		{
			boolean status = FindPrimeNumber(a);
			if(status == true)
			{
				System.out.println(a);
			}
		}

	}
}