class Factorial
{
	public static void main(String [] args)
	{
		int n = 5;
		int fact = 1;
		while(n>=1)
		{
			fact = fact*n;
			n--;
		}
		System.out.println("Factorial is : " + fact);
	}
}