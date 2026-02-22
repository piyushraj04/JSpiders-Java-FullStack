class FindSumOfDivisors1
{
	public static void main(String [] args)
	{
		int num = 12;
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
		System.out.println(sum);
	}
}