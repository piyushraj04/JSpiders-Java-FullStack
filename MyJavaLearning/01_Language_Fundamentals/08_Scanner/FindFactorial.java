import java.util.Scanner;

class FindFactorial
{
	public static void main(String [] args)
	{
		Scanner scn  = new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int num = scn.nextInt();		
		int fact = 1;
		while(num>=1)	
		{			
		fact = fact*num;
		num--;			
		}
		System.out.println("factorial is : " + fact);
	}
}