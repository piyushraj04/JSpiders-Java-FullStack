import java.util.Scanner;

class SwapUsingBitwiseOpe
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the 1st No. : ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd No. : ");
		int b = sc.nextInt();
		System.out.println("The value before swap is : a = "+ a + " and b = "+b);
	
		a = a^b;  // 30+20=50 
		b = a^b;  // 50-20=30
		a = a^b;  // 50-30=20
		
		System.out.println("The value after swap is : a = "+ a + " and b = "+b);
		
	}
}