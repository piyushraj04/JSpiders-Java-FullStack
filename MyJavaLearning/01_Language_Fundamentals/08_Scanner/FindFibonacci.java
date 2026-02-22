import java.util.Scanner;
class FindFibonacci
{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int fib1= 0;
		int fib2 = 1;
		int fib3 = fib1+fib2;
		while(num>0)
		{
			System.out.println(fib1);
			fib1 = fib2;
			fib2 = fib3;
			fib3 = fib1+fib2;
			num--;
		}
	}
}