/*
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
*/

class square_Practice_04_Victory_01
{
	public static void main(String [] args)
	{
		int n = 5;
		int val = 1;
		
		for(int i = 0; i < n ; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(i%2==0)
				{
					if(j%2==0)
					{
						System.out.print(1 + " ");
					}
					else
					{
						System.out.print(0 + " ");
					}
					
				}
				else
				{
					if(i%2!=0)
					{
						if(j%2==0)
						{
							System.out.print(0 + " ");
						}
						else
						{
							System.out.print(1 + " ");
						}
					}
				}
			}
			System.out.println();
		}
	}
}