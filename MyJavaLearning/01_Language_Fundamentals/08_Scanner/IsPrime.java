import java.util.Scanner;

class IsPrime
{
	public static void main(String [] args)
	{
		Scanner scn  = new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int num = scn.nextInt();
		
		int n = 1;
		
		int count = 0;
		
		while(n<=num/2)
		{
			if(num%n==0)
			{
				count++;
			}
			n++;
		}
		
		if(count==1)
		{
			System.out.println(num+" is the Prime Number");
		}
		else
		{
			System.out.println(num+" is not the Prime Number");
		}

		
		
	}
}