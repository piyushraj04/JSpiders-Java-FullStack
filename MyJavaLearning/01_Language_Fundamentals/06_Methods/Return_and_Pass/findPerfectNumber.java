class findPerfectNumber
{
	static boolean PerfectNo(int num)
	{

		int a = 1;
		int sum = 0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				sum+=a;
			}
			a++;
		}
		if(sum==num)
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
		int till = 100;
		for(int i = 1; i <= till; i++)
		{
			boolean status = PerfectNo(i);
			if(status == true)
			{
				System.out.println(i);
			}
		}
	}
}