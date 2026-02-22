class Square7
{
	public static void main(String [] args)
	{
		int n = 5;
	    int val = 5;
		for(int i = 0; i < n; i++)
		{
			//int val = 1;
			for(int j = 0; j < n; j++)
			{
				 
				System.out.print(val+" ");
				val--;
			}
			val = 5;
			System.out.println();
			
		}
	}
}

/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/