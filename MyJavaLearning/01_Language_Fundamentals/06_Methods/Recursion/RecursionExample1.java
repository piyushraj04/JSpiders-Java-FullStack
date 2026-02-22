class RecursionExample1
{
	static void display(int a)
	{
		System.out.println(a);
		
		if(a<5)
		{
			a++;
			display(a);
		}
	}
	public static void main(String [] args)
	{
		display(1);
	}
}