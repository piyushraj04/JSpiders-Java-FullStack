class FactorialUsingRecursion
{
	static void findFactorial(int n,int fact)
	{
		fact = fact*n;
		
		if(n>1)
		{
			n--;
			findFactorial(n,fact);
		}
		else
		{
				System.out.println("Factorial : " + fact);
		}
	}
	public static void main(String [] args)
	{
		findFactorial(5,1);
	}
}