class ja
{
	public static void main(String [] args)
	{
		int n = 5;
	    char ch = 'a';
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
			
		}
	}
}

/*
if int ch = 'a';
then
97 97 97 97 97
98 98 98 98 98
99 99 99 99 99
100 100 100 100 100
101 101 101 101 101
*/
/*
if char ch = 'a';
then
a a a a a
b b b b b
c c c c c
d d d d d
e e e e e
*/
