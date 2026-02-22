class Example3_Square_cube
{
	static int Square(int n)
	{
		int sq = n*n;
		return sq;
	}
	
		static int cube(int n)
	{
		int cu = n*n*n;
		return cu;
	}
	
	public static void main(String [] args)
	{
		int num = 55;
		for(int a = 1; a <= num ; a++)
		{
		System.out.println(" the Square of " + a + " is : " + Square(a) + " and " + " the cube is : " + cube(a));
			
		}

	}
}