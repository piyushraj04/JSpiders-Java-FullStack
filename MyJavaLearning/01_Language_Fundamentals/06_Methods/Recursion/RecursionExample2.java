class RecursionExample2
{
	static void display(int a)
	{
		System.out.println(a);
		
		if(a>1)
		{
			a--;
			display(a);
		}
	}
	public static void main(String [] args)
	{
		display(5);
	}
}