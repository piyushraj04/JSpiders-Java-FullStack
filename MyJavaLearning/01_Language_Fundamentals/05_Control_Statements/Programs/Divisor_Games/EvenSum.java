class EvenSum
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 5;
		int sum = 0;
		while(a<=b)
		{
			if(a%2==0)
			{
				sum+=a;
			}
			a++;
		}
		System.out.println(sum);
	}
}
