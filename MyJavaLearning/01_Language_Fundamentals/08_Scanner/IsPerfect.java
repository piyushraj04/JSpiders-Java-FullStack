import java.util.Scanner;

class IsPerfect
{
	public static void main(String [] args)
	{
		Scanner scn  = new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int num = scn.nextInt();
		
		int n = 1;
		
		int sum = 0;
		
		while(n<=num/2)
		{
			if(num%n==0)
			{
				sum += n;
			}
			n++;
		}
		
		if(sum==num)
		{
			System.out.println(num+" is the Perfect Number");
		}
		else
		{
			System.out.println(num+" is not the Perfect Number");
		}

		
		
	}
}