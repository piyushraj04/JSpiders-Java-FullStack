import java.util.Scanner;

class SwapUsingTempVar
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the 1st No. : ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd No. : ");
		int b = sc.nextInt();
		System.out.println("The value before swap is : a = "+ a + " and b = "+b);
	
		int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("The value after swap is : a = "+ a + " and b = "+b);
		
	}
}