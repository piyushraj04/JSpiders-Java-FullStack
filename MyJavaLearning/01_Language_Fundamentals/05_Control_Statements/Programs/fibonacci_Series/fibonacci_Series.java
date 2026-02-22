class fibonacci_Series
{
	public static void main(String [] args)
	{
		int n = 7;
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = fib1 + fib2 ;
		while(n>0)
		{
			System.out.println(fib1);
			fib1=fib2;
			fib2=fib3;
			fib3 = fib1+ fib2;
			n--;
		}
	}
}