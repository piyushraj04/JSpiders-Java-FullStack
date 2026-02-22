class Square5
{
	public static void main(String [] args)
	{
		int n = 5;
	    int val = 1;
		for(int i = 0; i < n; i++)
		{
			//int val = 1;
			for(int j = 0; j < n; j++)
			{
				 
				System.out.print(val+" ");
				val++;
			}
			val = 1;
			System.out.println();
			
		}
	}
}

/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/