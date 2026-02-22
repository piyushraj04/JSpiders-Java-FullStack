import java.util.Scanner;

class ExChar
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner (System.in);
		System.out.println("enter the Character : ");
		char ch = scn.next().charAt(0);
System.out.println("the 1st character is : " + ch);		
	}
}