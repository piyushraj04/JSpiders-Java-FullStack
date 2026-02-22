class FindCountOfDivisors1
{
	public static void main(String [] args)
	{
		int num = 12;
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
		System.out.println(count);
	}
}