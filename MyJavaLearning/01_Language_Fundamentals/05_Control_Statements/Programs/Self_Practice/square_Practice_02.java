class square_Practice_02
{
	public static void main(String [] args)
	{
		int n = 5;
		int val = 0;
		
		for(int i = 0; i < n ; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(i%2==0)
				{
					System.out.print(val + " ");
				}
				else
				{
					System.out.print(1 + " ");
				}
			}
			System.out.println();
		}
	}
}

/*
0 0 0 0 0
1 1 1 1 1
0 0 0 0 0
1 1 1 1 1
0 0 0 0 0
*/