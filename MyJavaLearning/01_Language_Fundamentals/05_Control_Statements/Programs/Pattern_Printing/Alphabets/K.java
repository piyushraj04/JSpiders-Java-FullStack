class K
{
	public static void main(String [] args)
	{
		int n = 5;
		for (int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if( (j==n-(n-1)) || (i+j==n-1 && j >= n/2) || (i==j && j>=2))
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
	}
}