class Example2_addition
{
	static double Substraction(double a,double b)
	{
		double Substraction = a - b;
		return Substraction;
	}
	
	static double addition(double a,double b)
	{
		double sum = a + b;
		return sum;
	}
	
	public static void main(String [] args)
	{
		System.out.println("Sum is : " + addition(10,58));
		System.out.println("Sum is : " + Substraction(10,58));
		
		//System.out.println("Sum of " + a + " + " + "is : " + addition(10,58));
		//System.out.println("Substraction of " + a + " - " + "is : " + Substraction(9,8));
	}
}