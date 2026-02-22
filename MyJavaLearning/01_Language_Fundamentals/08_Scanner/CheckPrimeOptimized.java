import java.util.Scanner;

class CheckPrimeOptimized
{
	public static boolean isPrime(int num)
		{
     		if(num<=1 || num==2)     //for 2 and negative numbers
			{
				return true;
			}
		
			for(int i = 2; i <= Math.sqrt(num); i++)
			{
				if(num%i==0)
				{
					return false;
				}
			}
			return true;
		}
	public static void main(String [] args)
	{
	    Scanner sc = new Scanner (System.in);	
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		System.out.println(isPrime(a));
	}
}