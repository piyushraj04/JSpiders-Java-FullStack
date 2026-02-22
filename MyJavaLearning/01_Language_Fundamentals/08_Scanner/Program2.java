import java.util.Scanner;
class Program2
{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the age : ");
		int age = scn.nextInt();
		System.out.println("enter the cgpa : ");
		double cgpa = scn.nextDouble();
		System.out.println("enter the status of single : (true/false) ");
		boolean single = scn.nextBoolean();
		System.out.println("age is : " + age);
		System.out.println("cgpa is : " + cgpa);
		System.out.println("single : " + single);
		
	}
}