class SumOfdivisibleBy3
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 10;
		int sum = 0;
		while(a<=b)
		{
			if(a%3==0)
			{
				 sum+=a;
			}
			a++;
		}
		System.out.println(sum);
	}
}
